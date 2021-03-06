package com.xiamuyao.pharmacy.bean.down;

import java.util.List;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/20
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class OutchaXuBean {
    /**
     * OwnerClass : ScanManager
     * OPID : OutStockQuery
     * Token : dtjfdafoenfkdla-7594932r9hfuhfh93yfihsaiuf329ufhkdshfw-1328025600
     * FromFlag : 1
     * Files : null
     * IsOK : true
     * ErrorCode : null
     * ErrorMessage :
     * Content : {"QueryPeriod":"2018年10月03日 - 2018年11月11日","Product":{"Id":"a6bce1e7-5568-4594-b737-ec3672bd0b6c","ProductCode":"PR_1302","ProductName":"索磷布韦片(索华迪)","ProductUrl":"https://image.jianke.com/upload/prodimage/201803wm/2018330103131890.jpg","PackageType":"400mg*28s/瓶","ApprovalNumber":"H20170365","Manufacturer":"吉利德(Gilead)","Registration":"H20170365","Specification":"400mg*28s","ExpiredDate":"36个月","BoxSize":"10,30,50,80,100"},"Tracker":[{"TrackerId":"00000000-0000-0000-0000-000000000000","PackageCode":"010539150714317421100299238","Action":"出库","TeminalName":"华润医药商业物流配送中心","TeminalType":"渠道","ActionTime":"2018-10-17T19:13:42.05","PatientOpenId":"","OperatorName":"c818686","IP":"","LocationName":"","LocationXy":""},{"TrackerId":"00000000-0000-0000-0000-000000000000","PackageCode":"010539150714317421100306727","Action":"出库","TeminalName":"华润医药商业物流配送中心","TeminalType":"渠道","ActionTime":"2018-10-17T19:14:04.787","PatientOpenId":"","OperatorName":"c818686","IP":"","LocationName":"","LocationXy":""},{"TrackerId":"00000000-0000-0000-0000-000000000000","PackageCode":"010539150714317421100331741","Action":"出库","TeminalName":"华润医药商业物流配送中心","TeminalType":"渠道","ActionTime":"2018-10-17T19:14:21.48","PatientOpenId":"","OperatorName":"c818686","IP":"","LocationName":"","LocationXy":""}],"OutNumber":"3"}
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
         * QueryPeriod : 2018年10月03日 - 2018年11月11日
         * Product : {"Id":"a6bce1e7-5568-4594-b737-ec3672bd0b6c","ProductCode":"PR_1302","ProductName":"索磷布韦片(索华迪)","ProductUrl":"https://image.jianke.com/upload/prodimage/201803wm/2018330103131890.jpg","PackageType":"400mg*28s/瓶","ApprovalNumber":"H20170365","Manufacturer":"吉利德(Gilead)","Registration":"H20170365","Specification":"400mg*28s","ExpiredDate":"36个月","BoxSize":"10,30,50,80,100"}
         * Tracker : [{"TrackerId":"00000000-0000-0000-0000-000000000000","PackageCode":"010539150714317421100299238","Action":"出库","TeminalName":"华润医药商业物流配送中心","TeminalType":"渠道","ActionTime":"2018-10-17T19:13:42.05","PatientOpenId":"","OperatorName":"c818686","IP":"","LocationName":"","LocationXy":""},{"TrackerId":"00000000-0000-0000-0000-000000000000","PackageCode":"010539150714317421100306727","Action":"出库","TeminalName":"华润医药商业物流配送中心","TeminalType":"渠道","ActionTime":"2018-10-17T19:14:04.787","PatientOpenId":"","OperatorName":"c818686","IP":"","LocationName":"","LocationXy":""},{"TrackerId":"00000000-0000-0000-0000-000000000000","PackageCode":"010539150714317421100331741","Action":"出库","TeminalName":"华润医药商业物流配送中心","TeminalType":"渠道","ActionTime":"2018-10-17T19:14:21.48","PatientOpenId":"","OperatorName":"c818686","IP":"","LocationName":"","LocationXy":""}]
         * OutNumber : 3
         */

        private String QueryPeriod;
        private ProductBean Product;
        private String OutNumber;
        private List<TrackerBean> Tracker;

        public String getQueryPeriod() {
            return QueryPeriod;
        }

        public void setQueryPeriod(String QueryPeriod) {
            this.QueryPeriod = QueryPeriod;
        }

        public ProductBean getProduct() {
            return Product;
        }

        public void setProduct(ProductBean Product) {
            this.Product = Product;
        }

        public String getOutNumber() {
            return OutNumber;
        }

        public void setOutNumber(String OutNumber) {
            this.OutNumber = OutNumber;
        }

        public List<TrackerBean> getTracker() {
            return Tracker;
        }

        public void setTracker(List<TrackerBean> Tracker) {
            this.Tracker = Tracker;
        }

        public static class ProductBean {
            /**
             * Id : a6bce1e7-5568-4594-b737-ec3672bd0b6c
             * ProductCode : PR_1302
             * ProductName : 索磷布韦片(索华迪)
             * ProductUrl : https://image.jianke.com/upload/prodimage/201803wm/2018330103131890.jpg
             * PackageType : 400mg*28s/瓶
             * ApprovalNumber : H20170365
             * Manufacturer : 吉利德(Gilead)
             * Registration : H20170365
             * Specification : 400mg*28s
             * ExpiredDate : 36个月
             * BoxSize : 10,30,50,80,100
             */

            private String Id;
            private String ProductCode;
            private String ProductName;
            private String ProductUrl;
            private String PackageType;
            private String ApprovalNumber;
            private String Manufacturer;
            private String Registration;
            private String Specification;
            private String ExpiredDate;
            private String BoxSize;

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getProductCode() {
                return ProductCode;
            }

            public void setProductCode(String ProductCode) {
                this.ProductCode = ProductCode;
            }

            public String getProductName() {
                return ProductName;
            }

            public void setProductName(String ProductName) {
                this.ProductName = ProductName;
            }

            public String getProductUrl() {
                return ProductUrl;
            }

            public void setProductUrl(String ProductUrl) {
                this.ProductUrl = ProductUrl;
            }

            public String getPackageType() {
                return PackageType;
            }

            public void setPackageType(String PackageType) {
                this.PackageType = PackageType;
            }

            public String getApprovalNumber() {
                return ApprovalNumber;
            }

            public void setApprovalNumber(String ApprovalNumber) {
                this.ApprovalNumber = ApprovalNumber;
            }

            public String getManufacturer() {
                return Manufacturer;
            }

            public void setManufacturer(String Manufacturer) {
                this.Manufacturer = Manufacturer;
            }

            public String getRegistration() {
                return Registration;
            }

            public void setRegistration(String Registration) {
                this.Registration = Registration;
            }

            public String getSpecification() {
                return Specification;
            }

            public void setSpecification(String Specification) {
                this.Specification = Specification;
            }

            public String getExpiredDate() {
                return ExpiredDate;
            }

            public void setExpiredDate(String ExpiredDate) {
                this.ExpiredDate = ExpiredDate;
            }

            public String getBoxSize() {
                return BoxSize;
            }

            public void setBoxSize(String BoxSize) {
                this.BoxSize = BoxSize;
            }
        }

        public static class TrackerBean {
            /**
             * TrackerId : 00000000-0000-0000-0000-000000000000
             * PackageCode : 010539150714317421100299238
             * Action : 出库
             * TeminalName : 华润医药商业物流配送中心
             * TeminalType : 渠道
             * ActionTime : 2018-10-17T19:13:42.05
             * PatientOpenId :
             * OperatorName : c818686
             * IP :
             * LocationName :
             * LocationXy :
             */

            private String TrackerId;
            private String PackageCode;
            private String Action;
            private String TeminalName;
            private String TeminalType;
            private String ActionTime;
            private String PatientOpenId;
            private String OperatorName;
            private String IP;
            private String LocationName;
            private String LocationXy;

            public String getTrackerId() {
                return TrackerId;
            }

            public void setTrackerId(String TrackerId) {
                this.TrackerId = TrackerId;
            }

            public String getPackageCode() {
                return PackageCode;
            }

            public void setPackageCode(String PackageCode) {
                this.PackageCode = PackageCode;
            }

            public String getAction() {
                return Action;
            }

            public void setAction(String Action) {
                this.Action = Action;
            }

            public String getTeminalName() {
                return TeminalName;
            }

            public void setTeminalName(String TeminalName) {
                this.TeminalName = TeminalName;
            }

            public String getTeminalType() {
                return TeminalType;
            }

            public void setTeminalType(String TeminalType) {
                this.TeminalType = TeminalType;
            }

            public String getActionTime() {
                return ActionTime;
            }

            public void setActionTime(String ActionTime) {
                this.ActionTime = ActionTime;
            }

            public String getPatientOpenId() {
                return PatientOpenId;
            }

            public void setPatientOpenId(String PatientOpenId) {
                this.PatientOpenId = PatientOpenId;
            }

            public String getOperatorName() {
                return OperatorName;
            }

            public void setOperatorName(String OperatorName) {
                this.OperatorName = OperatorName;
            }

            public String getIP() {
                return IP;
            }

            public void setIP(String IP) {
                this.IP = IP;
            }

            public String getLocationName() {
                return LocationName;
            }

            public void setLocationName(String LocationName) {
                this.LocationName = LocationName;
            }

            public String getLocationXy() {
                return LocationXy;
            }

            public void setLocationXy(String LocationXy) {
                this.LocationXy = LocationXy;
            }
        }
    }
}
