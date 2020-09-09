package org.andresoviedo.app;

import android.os.Environment;

import java.io.File;

public class BaseConstants {

     public static final String HELVETICA_NEUE_LIGHT = "fonts/Helvetica_Neue_Light_0.otf";
    //public static final String HELVETICA_NEUE_LIGHT = "fonts/MyriadPro_LightSemiExt_0.otf";
    public static final String HELVETICA_NEUE_MEDIUM = "fonts/HelveticaNeue_Medium.otf";
    public static final String MYRIADPRO_LIGHTSEMIEXT = "fonts/MyriadPro_LightSemiExt_0.otf";
    public static final String MYRIADPRO_SEMI_BOLD = "fonts/MyriadBold.ttf";
    public static final String BEBAS_REGULAR = "fonts/Bebas_Regular.TTF";
    public static final String ROBORTO_BOLD_CONDENSED = "fonts/ROBOTO_BOLDCONDENSED.TTF";

    public static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    public static String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";

    public static final String APP_TYPE = "2";

    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";


    public static final String CALL_FROM = "callFrom";
    public static final String CALL_CONTACTS ="call_contacts";


    public static final int CATEGORY_REQUEST_CODE = 10;
    public static final int SUBCATEGORY_REQUEST_CODE = 11;
    public static final int REQUEST_CODE_FILE_CHOOSER = 505;
    public static final int REQUEST_CODE_SELECT_ADDRESS = 12;
    public static final String RESPONSE_SERVER_FAIL_CODE = "500";
    public static final String RESPONSE_SUCCESS_CODE = "200";
    public final static int MEDIA_AUDIO = 1;
    public final static int MEDIA_VIDEO = 2;
    public final static int MEDIA_IMAGE = 3;

    public static final String RESPONSE_LOGOUT_CODE = "401";
    public final static String DIR_NAME = "JOS";
    public final static String DIR_NAME_CROP = "cropped";

    public static final int OPEN_DIALOG_ACTIVITY = 1;//OPEN_CHAT_ACTIVITY=2;

    /*
 * Pass data in char refresh count
 * */
    public static String CALL_REFRESH_CHAT_BOX = "CALL_REFRESH_CHAT_BOX";
    public static String CALL_CHAT_BOX = "CALL_CHAT_BOX";

    public static final String QB_USER_ID = "qb_user_pass";
    public static final String QB_USER_FULL_NAME = "qb_user_full_name";
    public static final String QB_USER_PHOTO_URL = "qb_user_photo_url";
    public static final String QB_USER_STATUS = "qb_user_status";

    public static final String BLOCK_BY = "block_by";
    public static final String BLOCK_TO = "block_to";

    public final static int ZODIAC_PARAMETER_ID = 11;
    public final static int CHINESE_ANIMAL_PARAMETER_ID = 0;
    public final static float IMAGERATIO = 1.26f;
    public final static float PUBLICMOMIMAGERATIO = 0.7f;
    public final static int ALPHAANIMATIONTIME = 200;

    public static String STORAGE_DIRECTORY = Environment.getExternalStorageDirectory() + File.separator + ".jos";
    public static String CROP_IMAGE_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".Cropped";
    public static String CAPTURED_DIRECTORY_NAME = STORAGE_DIRECTORY + File.separator + ".Camera";
    public static String CONTEST_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".selfieContest";
    public static String PUBLIC_MOMENT_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".publicMoment";
    public static String CHAT_RECEIVE_AUDIO_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".receive" + File.separator + ".Audio";
    public static String CHAT_RECEIVE_IMAGE_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".receive" + File.separator + ".Image";
    public static String CHAT_SENT_AUDIO_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".sent" + File.separator + ".Audio";
    public static String CHAT_SENT_IMAGE_DIRECTORY = STORAGE_DIRECTORY + File.separator + ".sent" + File.separator + ".Image";

    public static final String PARAM_FROM_NOTIFICAION = "fromNotification";
    //End limit of search
    public static final int endLimit = 10;
    public static String language = "en";

    public enum DAY_OF_WEEK {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public enum CHAT_MSG_BEHAVIOUR {SENT, RECEIVED}

    public enum CHAT_MSG_TYPE {TEXT, IMAGE, AUDIO, VIDEO, THUMB}

    public enum MEDIA_STATUS {NOT_DOWNLOAD, DOWNLOADING, DOWNLOADED, NOT_UPLOAD, UPLOADING, UPLOADED}

    public final static String ACTION_DOWNLOAD_COMPLETED = "action_download_completed";
    public static final String PARAM_DOWNLOAD_OBJ = "downloadObj";

    public final static String DATABASEPATH = "/data/data/com.jos/databases/";
    public final static String DATABASENAME = "chat_database.sqlite";


    public interface NOTIFICATION_ID {

        public static int PASS_CONTECT_SERVICE_PENDING_INTENT_ID=999999;
    }

    public interface ACTION {
        public static String NEVER_KILL_SERVICE = "com.truiton.foregroundservice.action.YouWillNeverKillMe";
        public static String STARTFOREGROUND_ACTION = "com.truiton.foregroundservice.action.startforeground";

        public static String CALL_REFRESH_NOTI_COUNT_ACTION = "REFRESH_NOTI_COUNT_ACTION";
        public static String CALL_REFRESH_CHAT_UNREAD_ACTION = "REFRESH_CHAT_UNREAD_COUNT_ACTION";
        public static String CALL_REFRESH_CALL_UNREAD_ACTION = "REFRESH_CALL_UNREAD_COUNT_ACTION";
        public static String REFRESH_CONTACT_ACTION = "REFRESH_CONTACT_ACTION";
    }




    public static class ChatMessageType {
        public final static String KEY_QB_MESSAGE_TYPE = "messageType";
        public final static String KEY_QB_SENDER_FULL_NAME = "senderFullname";
        public final static String QB_MESSAGE_TYPE_TEXT = "text";
        public final static String QB_MESSAGE_TYPE_CONTACT = "contact";
        public final static String QB_MESSAGE_TYPE_IMAGE = "image";
        public final static String QB_MESSAGE_TYPE_LOCATION = "location";
        public final static String QB_MESSAGE_TYPE_VIDEO = "video";
        public final static String QB_MESSAGE_TYPE_AUDIO = "audio";
    }

    public static final String CURRENT_CALL_ID = "current_caller_id";
    public static final String CURRENT_CALLER_TYPE = "current_caller_type";



    /**
     * Bundle Keys for fragment
     */

    public static final String USER_TYPE = "userType";
    public static final String USER_ID = "userId";
    public static final String PARTICIPANTS_LIST = "participantsList";
    public static final String GIFT_RECEIVER_ID = "giftReceiverID";
    public static final String FIRST_NAME = "firstName";
    public static final String MOMENT_ID = "momentID";
    public static final String IS_ALL_MOMENT = "isAllMoment";
    public static final String PAGE_INDEX = "pageIndex";
    public static final String PUBLIC_MOMENT = "publicMoment";
    public static final String MOMENT_LIST = "momentList";
    public static final String IS_FROM_OTHER_MOMENT = "isFromOtherMoment";
    public static final String PARTICIPATE_CUSTOMER_ID = "participateCustomerID";
    public static final String GENDER = "gender";
    public static final String RECEIVER = "receiver";
    public static final String SESSION_ID = "sessionId";
    public static final String RECEIVER_ID = "ReceiverId";
    public static final String RECEIVER_PHOTO = "ReceiverPhoto";
    public static final String RECEIVER_NAME = "ReceiverName";
    public static final String IS_FROM_INNER_FRAG = "isFromInner";
    public static final String SELECTED_ID = "selectedId";
    public static final String SELECTED_POINTS = "selectedPoints";
    public static final String HONGBOU = "mysteryHongbou";
    public static final String PROFILE = "mysteryHongbou";
    public static final String JOB_ID = "job_post_id";
    public static final String JOB_APPLY_ID = "job_apply_id";
    public static final String JOB_APPLIER_ID = "job_applier_id";
    public static final String JOB = "job";
    public static final String FIND_TYPE = "find_type";
    public static final String STATUS = "status";
    public static final String JOB_HISTORY = "isHistory";
    public static final String JOB_DETAIL = "jobdetail";
    public static final String CATEGORY = "category";
    public static final String SUBCATEGORY = "subcategory";
    public static final String IS_UPDATE = "isupdate";
    public static final String URL = "url";

    public static final String CAT_URL = "cat_url";
    public static final String SUB_CAT_URL = "sub_cat_url";
    public static final String CATEGORYLIST = "arl_subcategory_list";
    public static final String SUBCATEGORY_ID = "subcategory_id";
    public static final String CATEGORY_ID = "category_id";
    public static final String BUSINESS_DETAIL = "business_detail";
    public static final String BUSINESS_ID = "business_id";
    public static final String EMPLOYERID = "employerId";
    public static final String EMPLOYEEID = "employeeId";


    /* --------------------- payment selected card -----------*/
    public static final String SELECTED_PACKAGE = "Selected_Package";


    //constant
    public static final String USER_TYPE_EMPLOYEE = "employee";
    public static final String USER_TYPE_EMPLOYER = "employer";
    public static final String USER_TYPE_DEFAULT = "default";
    public static final String APPLIED_YES = "YES";
    public static final String APPLIED_NO = "NO";
    public static final String ACTIVATION_STATUS = "ACTIVE";
    public static final String PAYMENT_YES = "1";
    public static final String PAYMENT_NO = "0";
    public static final String FromMenu = "menu";
    public static final String USER_MODE_EMPLOYEE = "0";
    public static final String USER_MODE_EMPLOYER = "1";
    public static final String USER_MODE_AROUND_YOU = "2";
    public static final String GEO_ON = "on";
    public static final String GEO_OFF = "off";
    public static final String ISBUSINESSPOST = "1";
    public static final String MYBUSINESS = "mybusiness";
    public static final String NEARBY = "nearby";
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String BLOCK = "block";
    public static final String UNBLOCK = "unblock";
    public static final String PUBLIC = "public";
    public static final String PRIVATE = "private";
    public static final String ISJOBPOST = "0";


    public static final String ISEDIT = "isedit";

    /* notification type*/


    public static final String NOTIFICATION_TYPE = "type";
    public static final String NEW_JOB = "nj";
    public static final String NEW_JOB_APPLY = "na";
    public static final String ACCEPTED_BY_EMPLOYEE = "acj";
    public static final String APPREVE_BY_EMPLOYER = "aj";

    public static final String CANCEL_BY_EMPLOYEE = "jhr";
    public static final String CANCEL_BY_EMPLOYER = "jhe";
    public static final String COMMUNICATION = "communication";
    public static final String LOGOUT = "out";
    public static final String NEW_EEMPLOYEE = "nee";
    public static final String NEW_USER_ID = "user_id";

    /* ----------------- CAlling  ------------------*/
    public static final String Missed = "0";
    public static final String Received = "1";
    public static final String Audio = "0";
    public static final String Video = "1";


    public static final String QB_CALL_COUNT = "call_count";
    public static final String QB_CHAT_COUNT = "qb_chat_count";
    public static final String CURRENT_CHATROOM_ID = "current_chat_id";



}