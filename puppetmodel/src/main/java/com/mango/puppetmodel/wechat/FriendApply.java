package com.mango.puppetmodel.wechat;

import android.database.Cursor;

public class FriendApply {

    public String wxid;
    public String nickname;
    public String headimgurl;

    public FriendApply(Cursor cursor) {
        wxid = cursor.getString(cursor.getColumnIndex("talker"));
        nickname = cursor.getString(cursor.getColumnIndex("displayName"));
        String content = cursor.getString(cursor.getColumnIndex("fmsgContent"));
        try {
            if (content.split("bigheadimgurl=\"").length>1){
                headimgurl=content.split("bigheadimgurl=\"")[1].split("\"")[0];
            }
        }catch (Exception e){
            headimgurl="";
        }
    }
}
