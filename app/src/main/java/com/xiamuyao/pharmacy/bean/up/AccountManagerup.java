package com.xiamuyao.pharmacy.bean.up;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/17
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class AccountManagerup {

    /**
     * OwnerClass : AccountManagerup
     * OPID : AccountBind
     * Token : dt97e398ca018c-6D30CDEEBC8310719E266D710C45974F-1539675744346
     * FromFlag : 1
     * Files : null
     * IsOK : false
     * ErrorCode : null
     * ErrorMessage :
     * Content : {"username":"d122690","password":"9B379535A107E8F00BDF14A1E7857097-1538065485129","teminal_id":"obhQ10R3sZUZFItRvFxT-8IprmS83","wechat_name":null}
     */

    private String OwnerClass="";
    private String OPID="";
    private String Token="";
    private int FromFlag=0;
    private Object Files="";
    private boolean IsOK=false;
    private Object ErrorCode="";
    private String ErrorMessage="";
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
         * username : d122690
         * password : 9B379535A107E8F00BDF14A1E7857097-1538065485129
         * teminal_id : obhQ10R3sZUZFItRvFxT-8IprmS83
         * wechat_name : null
         */

        private String username="";
        private String password="";
        private String teminal_id="";
        private Object wechat_name="";

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getTeminal_id() {
            return teminal_id;
        }

        public void setTeminal_id(String teminal_id) {
            this.teminal_id = teminal_id;
        }

        public Object getWechat_name() {
            return wechat_name;
        }

        public void setWechat_name(Object wechat_name) {
            this.wechat_name = wechat_name;
        }
    }
}
