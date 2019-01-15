package com.xiamuyao.pharmacy.bean.down;

import java.util.List;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/18
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class yaodianxinxidown {

    /**
     * OwnerClass : AccountManager
     * OPID : GetTeminalProfile
     * Token : dt97e398ca018c-6D30CDEEBC8310719E266D710C45974F-1539675744346
     * FromFlag : 2
     * Files : null
     * IsOK : true
     * ErrorCode : null
     * ErrorMessage :
     * Content : {"Teminal":{"TeminalName":"上海医药股份有限公司","TypeName":"渠道","Linkman":"","Phone":"","BusinessType":"","Address":"上海市黄浦区上海锦江国际购物中心商务写字楼北二门"},"UserProfile":{"UserBindId":"e5d57979-40b4-4683-a4b7-49d0df3a6d7f","BindId":"c039266","WeChatName":"","LastLogonDate":"2018-12-18T18:20:47.4568279+08:00","IsEnabled":1,"Mobile":"18945709505","TeminalUserName":"c039266"},"UserBind":[{"UserBindId":"29b6a27b-90a3-44af-89ea-cd72c84f92c2","BindId":"c492113","WeChatName":"","LastLogonDate":"2018-12-14T11:09:51.907","IsEnabled":1,"Mobile":"17799999999","TeminalUserName":"c492113"}]}
     */

    private String OwnerClass;
    private String OPID;
    private String Token;
    private int FromFlag;
    private Object Files;
    private boolean IsOK;
    private Object ErrorCode;
    private String ErrorMessage;
    private ContentBean Content;

    public String getOwnerClass() {
        return OwnerClass;
    }

    public void setOwnerClass(String OwnerClass) {
        this.OwnerClass = OwnerClass;
    }

    public String getOPID() {
        return OPID;
    }

    public void setOPID(String OPID) {
        this.OPID = OPID;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public int getFromFlag() {
        return FromFlag;
    }

    public void setFromFlag(int FromFlag) {
        this.FromFlag = FromFlag;
    }

    public Object getFiles() {
        return Files;
    }

    public void setFiles(Object Files) {
        this.Files = Files;
    }

    public boolean isIsOK() {
        return IsOK;
    }

    public void setIsOK(boolean IsOK) {
        this.IsOK = IsOK;
    }

    public Object getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(Object ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ContentBean getContent() {
        return Content;
    }

    public void setContent(ContentBean Content) {
        this.Content = Content;
    }

    public static class ContentBean {
        /**
         * Teminal : {"TeminalName":"上海医药股份有限公司","TypeName":"渠道","Linkman":"","Phone":"","BusinessType":"","Address":"上海市黄浦区上海锦江国际购物中心商务写字楼北二门"}
         * UserProfile : {"UserBindId":"e5d57979-40b4-4683-a4b7-49d0df3a6d7f","BindId":"c039266","WeChatName":"","LastLogonDate":"2018-12-18T18:20:47.4568279+08:00","IsEnabled":1,"Mobile":"18945709505","TeminalUserName":"c039266"}
         * UserBind : [{"UserBindId":"29b6a27b-90a3-44af-89ea-cd72c84f92c2","BindId":"c492113","WeChatName":"","LastLogonDate":"2018-12-14T11:09:51.907","IsEnabled":1,"Mobile":"17799999999","TeminalUserName":"c492113"}]
         */

        private TeminalBean Teminal;
        private UserProfileBean UserProfile;
        private List<UserBindBean> UserBind;

        public TeminalBean getTeminal() {
            return Teminal;
        }

        public void setTeminal(TeminalBean Teminal) {
            this.Teminal = Teminal;
        }

        public UserProfileBean getUserProfile() {
            return UserProfile;
        }

        public void setUserProfile(UserProfileBean UserProfile) {
            this.UserProfile = UserProfile;
        }

        public List<UserBindBean> getUserBind() {
            return UserBind;
        }

        public void setUserBind(List<UserBindBean> UserBind) {
            this.UserBind = UserBind;
        }

        public static class TeminalBean {
            /**
             * TeminalName : 上海医药股份有限公司
             * TypeName : 渠道
             * Linkman :
             * Phone :
             * BusinessType :
             * Address : 上海市黄浦区上海锦江国际购物中心商务写字楼北二门
             */

            private String TeminalName;
            private String TypeName;
            private String Linkman;
            private String Phone;
            private String BusinessType;
            private String Address;

            public String getTeminalName() {
                return TeminalName;
            }

            public void setTeminalName(String TeminalName) {
                this.TeminalName = TeminalName;
            }

            public String getTypeName() {
                return TypeName;
            }

            public void setTypeName(String TypeName) {
                this.TypeName = TypeName;
            }

            public String getLinkman() {
                return Linkman;
            }

            public void setLinkman(String Linkman) {
                this.Linkman = Linkman;
            }

            public String getPhone() {
                return Phone;
            }

            public void setPhone(String Phone) {
                this.Phone = Phone;
            }

            public String getBusinessType() {
                return BusinessType;
            }

            public void setBusinessType(String BusinessType) {
                this.BusinessType = BusinessType;
            }

            public String getAddress() {
                return Address;
            }

            public void setAddress(String Address) {
                this.Address = Address;
            }
        }

        public static class UserProfileBean {
            /**
             * UserBindId : e5d57979-40b4-4683-a4b7-49d0df3a6d7f
             * BindId : c039266
             * WeChatName :
             * LastLogonDate : 2018-12-18T18:20:47.4568279+08:00
             * IsEnabled : 1
             * Mobile : 18945709505
             * TeminalUserName : c039266
             */

            private String UserBindId;
            private String BindId;
            private String WeChatName;
            private String LastLogonDate;
            private int IsEnabled;
            private String Mobile;
            private String TeminalUserName;

            public String getUserBindId() {
                return UserBindId;
            }

            public void setUserBindId(String UserBindId) {
                this.UserBindId = UserBindId;
            }

            public String getBindId() {
                return BindId;
            }

            public void setBindId(String BindId) {
                this.BindId = BindId;
            }

            public String getWeChatName() {
                return WeChatName;
            }

            public void setWeChatName(String WeChatName) {
                this.WeChatName = WeChatName;
            }

            public String getLastLogonDate() {
                return LastLogonDate;
            }

            public void setLastLogonDate(String LastLogonDate) {
                this.LastLogonDate = LastLogonDate;
            }

            public int getIsEnabled() {
                return IsEnabled;
            }

            public void setIsEnabled(int IsEnabled) {
                this.IsEnabled = IsEnabled;
            }

            public String getMobile() {
                return Mobile;
            }

            public void setMobile(String Mobile) {
                this.Mobile = Mobile;
            }

            public String getTeminalUserName() {
                return TeminalUserName;
            }

            public void setTeminalUserName(String TeminalUserName) {
                this.TeminalUserName = TeminalUserName;
            }
        }

        public static class UserBindBean {
            /**
             * UserBindId : 29b6a27b-90a3-44af-89ea-cd72c84f92c2
             * BindId : c492113
             * WeChatName :
             * LastLogonDate : 2018-12-14T11:09:51.907
             * IsEnabled : 1
             * Mobile : 17799999999
             * TeminalUserName : c492113
             */

            private String UserBindId;
            private String BindId;
            private String WeChatName;
            private String LastLogonDate;
            private int IsEnabled;
            private String Mobile;
            private String TeminalUserName;

            public String getUserBindId() {
                return UserBindId;
            }

            public void setUserBindId(String UserBindId) {
                this.UserBindId = UserBindId;
            }

            public String getBindId() {
                return BindId;
            }

            public void setBindId(String BindId) {
                this.BindId = BindId;
            }

            public String getWeChatName() {
                return WeChatName;
            }

            public void setWeChatName(String WeChatName) {
                this.WeChatName = WeChatName;
            }

            public String getLastLogonDate() {
                return LastLogonDate;
            }

            public void setLastLogonDate(String LastLogonDate) {
                this.LastLogonDate = LastLogonDate;
            }

            public int getIsEnabled() {
                return IsEnabled;
            }

            public void setIsEnabled(int IsEnabled) {
                this.IsEnabled = IsEnabled;
            }

            public String getMobile() {
                return Mobile;
            }

            public void setMobile(String Mobile) {
                this.Mobile = Mobile;
            }

            public String getTeminalUserName() {
                return TeminalUserName;
            }

            public void setTeminalUserName(String TeminalUserName) {
                this.TeminalUserName = TeminalUserName;
            }
        }
    }
}
