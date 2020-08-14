package com.mango.puppetmodel.wechat;


/**
 * User
 *
 * @author: hehongzhen
 * @date: 2020/05/26
 */
public class User {

    // 微信内部ID
    public String field_username;

    // 微信号
    public String field_alias;

    // 备注名
    public String field_conRemark;

    // 昵称
    public String field_nickname;

    // 拼音首字母大写
    public String field_pyInitial;

    // 昵称全拼
    public String field_quanPin;

    // 备注名全拼
    public String field_conRemarkPYFull;

    // 备注名首字母大写
    public String field_conRemarkPYShort;

    // 将头像图片文件上传到我们自己服务器后的url地址
    public String icon_url;

    // 资源文件在本地的路径
    public String icon_file_url;

    // 用戶的tags，用,分割
    public String tags;

    // v1_string
    public String field_encryptUsername;

    // 性别 0 未设置 1 男 2 女
    public int gender;

    // 对应国内的市 例如 北京    对应国外国家名称 例如 阿富汗
    public String place;

    // 对应国内的区 例如 昌平    对应国外空字符
    public String area;

    // 签名
    public String signature;

    public String positionCode;

    //是否在黑名单 0 正常 1 在黑名单
    public int isInBlack;

}
