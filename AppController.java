package org.andresoviedo.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.StrictMode;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import org.andresoviedo.app.api.RequestCode;
import org.andresoviedo.app.helper.ConnectivityHelper;
import org.andresoviedo.app.model.AppOpenData;
import org.andresoviedo.app.util.Constants;
import org.andresoviedo.app.util.Utils;
import org.andresoviedo.dddmodel2.R;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Nikita on 10/4/2017.
 */

public class AppController extends Application {
    public static final String TAG = AppController.class
            .getSimpleName();



    private RequestQueue mRequestQueue;
    public static int[] screenWH;
    private int socketTimeout = 50000; //30 seconds
    private static AppController mInstance;
    public static AppOpenData mAppOpenData = new AppOpenData();

    @Override
    public void onCreate() {
        super.onCreate();

        //printHashKey();
        mInstance = this;

        if (Constants.Config.DEVELOPER_MODE && Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyDialog().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyDeath().build());
        }

        //screenWH = Utils.getInstance().getScreenWidthHeight(mInstance);
        //  setNotifications(true);

    }

    /* Return BaseApplication Context */
 /*   public static Context getAppContext() {
        return mInstance;
    }*/
    public static synchronized AppController getInstance() {
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
            mRequestQueue.getCache().clear();
        }

        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }

    public <T> void addToRequestQueue(Request<T> req) {
        req.setTag(TAG);
        getRequestQueue().add(req);
    }


    public <T> void setRequestTimeout(Request<T> req, RequestCode requestCode) {
        req.setTag(requestCode);
        req.setRetryPolicy(new DefaultRetryPolicy(
                socketTimeout,
                0,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }

    //Get application version
    public static int getAppVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager()
                    .getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            // should never happen
            throw new RuntimeException("Could not get package name: " + e);
        }
    }


    //Get Print Hash Key
    public void printHashKey() {
        // Add code to print out the key hash
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.simplyorder.android",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.e("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }

//    public void setNotifications(boolean enabled) {
//
//        PackageManager mPackageManager = getApplicationContext().getPackageManager();
//
//        mPackageManager.setComponentEnabledSetting(new ComponentName(getApplicationContext(), com.simplyorder.android.activity.PushNotificationService.class), enabled ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
//                : PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
////        Intent intent = new Intent(getApplicationContext(), com.simplyorder.android.activity.PushNotificationService.class);
////        if (enabled) {
////            getApplicationContext().startService(intent);
////        } else {
////            getApplicationContext().stopService(intent);
////        }
//    }


    // collect device and app information
    public void setAppOpenData() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        try {
            mAppOpenData.mPackageInfo = AppController.getInstance().getPackageManager().getPackageInfo(getPackageName(), 0);
            mAppOpenData.strCurrentVersion = mAppOpenData.getmPackageInfo().versionName;
            mAppOpenData.androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            mAppOpenData.setmBrand(Build.BRAND);
            mAppOpenData.setmModel(Build.MODEL);
            mAppOpenData.setmDeviceType(AppController.getInstance().getResources().getString(R.string.str_device_type));
            mAppOpenData.setmOsVersion(Build.VERSION.RELEASE);
            mAppOpenData.setmInterNetConnection(ConnectivityHelper.getNetworkClass(AppController.getInstance()));
            mAppOpenData.setStrCurrentVersion(mAppOpenData.strCurrentVersion);
            mAppOpenData.setmDeviceId(telephonyManager.getDeviceId());
        } catch (PackageManager.NameNotFoundException e1) {
            e1.printStackTrace();
        }

    }




}
