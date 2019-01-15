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
public class churuUp {

    /**
     * OwnerClass : ScanManager
     * OPID : Scan
     * Token : dtjfdafoenfkdla-ed792968329433cc4ba491c40f4f910-1328025600
     * FromFlag : 2
     * Files : null
     * IsOK : false
     * ErrorCode : null
     * ErrorMessage :
     * Content : {"package_code":"0105391507144317429999","action":1,"user_name":"","teminal_id":"18945709505","teminal_type":2,"action_time":"","operator_name":"1200000000000000","teminal_ip":"","teminal_location_name":"","teminal_location_xy":"","product_id":"A6BCE1E7-5568-4594-B737-EC3672BD0B6C","package_type":""}
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
         * package_code : 0105391507144317429999
         * action : 1
         * user_name :
         * teminal_id : 18945709505
         * teminal_type : 2
         * action_time :
         * operator_name : 1200000000000000
         * teminal_ip :
         * teminal_location_name :
         * teminal_location_xy :
         * product_id : A6BCE1E7-5568-4594-B737-EC3672BD0B6C
         * package_type :
         */

        private String package_code="";
        private int action;
        private String user_name="";
        private String teminal_id="";
        private int teminal_type;
        private String action_time="";
        private String operator_name="";
        private String teminal_ip="";
        private String teminal_location_name="";
        private String teminal_location_xy="";
        private String product_id="";
        private String package_type="";

        public String getPackage_code() {
            return package_code;
        }

        public void setPackage_code(String package_code) {
            this.package_code = package_code;
        }

        public int getAction() {
            return action;
        }

        public void setAction(int action) {
            this.action = action;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
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

        public String getAction_time() {
            return action_time;
        }

        public void setAction_time(String action_time) {
            this.action_time = action_time;
        }

        public String getOperator_name() {
            return operator_name;
        }

        public void setOperator_name(String operator_name) {
            this.operator_name = operator_name;
        }

        public String getTeminal_ip() {
            return teminal_ip;
        }

        public void setTeminal_ip(String teminal_ip) {
            this.teminal_ip = teminal_ip;
        }

        public String getTeminal_location_name() {
            return teminal_location_name;
        }

        public void setTeminal_location_name(String teminal_location_name) {
            this.teminal_location_name = teminal_location_name;
        }

        public String getTeminal_location_xy() {
            return teminal_location_xy;
        }

        public void setTeminal_location_xy(String teminal_location_xy) {
            this.teminal_location_xy = teminal_location_xy;
        }

        public String getProduct_id() {
            return product_id;
        }

        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }

        public String getPackage_type() {
            return package_type;
        }

        public void setPackage_type(String package_type) {
            this.package_type = package_type;
        }
    }
}
