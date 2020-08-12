package com.app.firebaseapp.util;

import android.net.Uri;
import com.app.firebaseapp.Home;
import com.app.firebaseapp.R;

public class LinkUtil {

    public static String checkUniversalLink(Home activity){
        Uri data = activity.getIntent().getData();
        if(data != null) {
            String strData = data.toString();
            if (strData.startsWith(activity.getString(R.string.universalLink))) {
                LogUtil.loge("app opened by url clicked somewhere outside the app");
                LogUtil.loge("link: " + strData);
                return strData;
            }
        }
        return null;
    }
}
