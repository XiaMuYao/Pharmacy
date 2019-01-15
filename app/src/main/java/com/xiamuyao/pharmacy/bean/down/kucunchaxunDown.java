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
public class kucunchaxunDown {

    /**
     * OwnerClass : ScanManager
     * OPID : StockQuery
     * Token : dtjfdafoenfkdla-7594932r9hfuhfh93yfihsaiuf329ufhkdshfw-1328025600
     * FromFlag : 1
     * Files : null
     * IsOK : true
     * ErrorCode : null
     * ErrorMessage :
     * Content : {"Product":{"Id":"a6bce1e7-5568-4594-b737-ec3672bd0b6c","ProductCode":"PR_1302","ProductName":"索磷布韦片(索华迪)","ProductUrl":"https://image.jianke.com/upload/prodimage/201803wm/2018330103131890.jpg","PackageType":"400mg*28s/瓶","ApprovalNumber":"H20170365","Manufacturer":"吉利德(Gilead)","Registration":"H20170365","Specification":"400mg*28s","ExpiredDate":"36个月","BoxSize":"10,30,50,80,100"},"Teminal":{"TeminalName":"华润广东医药-好邻居大药房","TypeName":"药房","Linkman":"","Phone":"","BusinessType":"","Address":""},"StockNumber":12,"Period":"2018年10月","Trend":[{"day":0,"inStock":0,"outStock":0},{"day":1,"inStock":0,"outStock":0},{"day":2,"inStock":0,"outStock":0},{"day":3,"inStock":0,"outStock":0},{"day":4,"inStock":0,"outStock":0},{"day":5,"inStock":0,"outStock":0},{"day":6,"inStock":0,"outStock":0},{"day":7,"inStock":0,"outStock":0},{"day":8,"inStock":0,"outStock":0},{"day":9,"inStock":0,"outStock":0},{"day":10,"inStock":0,"outStock":0},{"day":11,"inStock":0,"outStock":0},{"day":12,"inStock":0,"outStock":0},{"day":13,"inStock":0,"outStock":0},{"day":14,"inStock":0,"outStock":0},{"day":15,"inStock":0,"outStock":0},{"day":16,"inStock":0,"outStock":0},{"day":17,"inStock":0,"outStock":0},{"day":18,"inStock":2,"outStock":1},{"day":19,"inStock":0,"outStock":1},{"day":20,"inStock":0,"outStock":0},{"day":21,"inStock":0,"outStock":0},{"day":22,"inStock":0,"outStock":0},{"day":23,"inStock":0,"outStock":0},{"day":24,"inStock":0,"outStock":0},{"day":25,"inStock":0,"outStock":0},{"day":26,"inStock":0,"outStock":0},{"day":27,"inStock":0,"outStock":0},{"day":28,"inStock":0,"outStock":0},{"day":29,"inStock":0,"outStock":0},{"day":30,"inStock":0,"outStock":0},{"day":31,"inStock":0,"outStock":0}]}
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
         * Product : {"Id":"a6bce1e7-5568-4594-b737-ec3672bd0b6c","ProductCode":"PR_1302","ProductName":"索磷布韦片(索华迪)","ProductUrl":"https://image.jianke.com/upload/prodimage/201803wm/2018330103131890.jpg","PackageType":"400mg*28s/瓶","ApprovalNumber":"H20170365","Manufacturer":"吉利德(Gilead)","Registration":"H20170365","Specification":"400mg*28s","ExpiredDate":"36个月","BoxSize":"10,30,50,80,100"}
         * Teminal : {"TeminalName":"华润广东医药-好邻居大药房","TypeName":"药房","Linkman":"","Phone":"","BusinessType":"","Address":""}
         * StockNumber : 12
         * Period : 2018年10月
         * Trend : [{"day":0,"inStock":0,"outStock":0},{"day":1,"inStock":0,"outStock":0},{"day":2,"inStock":0,"outStock":0},{"day":3,"inStock":0,"outStock":0},{"day":4,"inStock":0,"outStock":0},{"day":5,"inStock":0,"outStock":0},{"day":6,"inStock":0,"outStock":0},{"day":7,"inStock":0,"outStock":0},{"day":8,"inStock":0,"outStock":0},{"day":9,"inStock":0,"outStock":0},{"day":10,"inStock":0,"outStock":0},{"day":11,"inStock":0,"outStock":0},{"day":12,"inStock":0,"outStock":0},{"day":13,"inStock":0,"outStock":0},{"day":14,"inStock":0,"outStock":0},{"day":15,"inStock":0,"outStock":0},{"day":16,"inStock":0,"outStock":0},{"day":17,"inStock":0,"outStock":0},{"day":18,"inStock":2,"outStock":1},{"day":19,"inStock":0,"outStock":1},{"day":20,"inStock":0,"outStock":0},{"day":21,"inStock":0,"outStock":0},{"day":22,"inStock":0,"outStock":0},{"day":23,"inStock":0,"outStock":0},{"day":24,"inStock":0,"outStock":0},{"day":25,"inStock":0,"outStock":0},{"day":26,"inStock":0,"outStock":0},{"day":27,"inStock":0,"outStock":0},{"day":28,"inStock":0,"outStock":0},{"day":29,"inStock":0,"outStock":0},{"day":30,"inStock":0,"outStock":0},{"day":31,"inStock":0,"outStock":0}]
         */

        private ProductBean Product;
        private TeminalBean Teminal;
        private int StockNumber;
        private String Period;
        private List<TrendBean> Trend;

        public ProductBean getProduct() {
            return Product;
        }

        public void setProduct(ProductBean Product) {
            this.Product = Product;
        }

        public TeminalBean getTeminal() {
            return Teminal;
        }

        public void setTeminal(TeminalBean Teminal) {
            this.Teminal = Teminal;
        }

        public int getStockNumber() {
            return StockNumber;
        }

        public void setStockNumber(int StockNumber) {
            this.StockNumber = StockNumber;
        }

        public String getPeriod() {
            return Period;
        }

        public void setPeriod(String Period) {
            this.Period = Period;
        }

        public List<TrendBean> getTrend() {
            return Trend;
        }

        public void setTrend(List<TrendBean> Trend) {
            this.Trend = Trend;
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

        public static class TeminalBean {
            /**
             * TeminalName : 华润广东医药-好邻居大药房
             * TypeName : 药房
             * Linkman :
             * Phone :
             * BusinessType :
             * Address :
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

        public static class TrendBean {
            /**
             * day : 0
             * inStock : 0
             * outStock : 0
             */

            private int day;
            private int inStock;
            private int outStock;

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getInStock() {
                return inStock;
            }

            public void setInStock(int inStock) {
                this.inStock = inStock;
            }

            public int getOutStock() {
                return outStock;
            }

            public void setOutStock(int outStock) {
                this.outStock = outStock;
            }
        }
    }
}
