package com.xiamuyao.pharmacy.bean.up;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/20
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class yaopinchaxunUP {


    /**
     * OwnerClass : ScanManager
     * OPID : SingleCodeQuery
     * Token : dtjfdafoenfkdla-7594932r9hfuhfh93yfihsaiuf329ufhkdshfw-1328025600
     * FromFlag : 2
     * Files : null
     * IsOK : false
     * ErrorCode : null
     * ErrorMessage :
     * Content : {"package_code":"CN0MGJN9LOC008528A0BA05","teminal_id":"obhQ10R3sZUZFItRvFxT-8IprmS8","teminal_type":2}
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
         * package_code : CN0MGJN9LOC008528A0BA05
         * teminal_id : obhQ10R3sZUZFItRvFxT-8IprmS8
         * teminal_type : 2
         */

        private String package_code;
        private String teminal_id;
        private int teminal_type;

        public String getPackage_code() {
            return package_code;
        }

        public void setPackage_code(String package_code) {
            this.package_code = package_code;
        }

        public String getTeminal_id() {
            return teminal_id;
        }

        public void setTeminal_id(String teminal_id) {
            this.teminal_id = teminal_id;
        }

        public int getTeminal_type() {
            return teminal_type;
        }

        public void setTeminal_type(int teminal_type) {
            this.teminal_type = teminal_type;
        }
    }
}
