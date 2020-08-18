package com.mango.puppetmodel.wechat;

import android.database.Cursor;

public class FriendApply {

    public String wxid;
    public String nickname;
    public String headimgurl;
    public String chatroomusername;
    public String contentVerifyContent;
    public String fmsgContent;

    public FriendApply(Cursor cursor) {
        wxid = cursor.getString(cursor.getColumnIndex("talker"));
        nickname = cursor.getString(cursor.getColumnIndex("displayName"));
        contentVerifyContent = cursor.getString(cursor.getColumnIndex("contentVerifyContent"));
        fmsgContent = cursor.getString(cursor.getColumnIndex("fmsgContent"));
        try {
            if (fmsgContent.split("bigheadimgurl=\"").length > 1) {
                headimgurl = fmsgContent.split("bigheadimgurl=\"")[1].split("\"")[0];
            }
        } catch (Exception e) {
            headimgurl = "";
        }
        try {
            if (fmsgContent.split("chatroomusername=\"").length > 1) {
                chatroomusername = fmsgContent.split("chatroomusername=\"")[1].split("\"")[0];
            }
        } catch (Exception e) {
            chatroomusername = "";
        }
    }
}
