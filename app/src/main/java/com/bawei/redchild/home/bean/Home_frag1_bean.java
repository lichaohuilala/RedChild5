package com.bawei.redchild.home.bean;

import java.util.List;

/**
 * 类描述：
 * data:2017/5/18
 * author:高伟振(lenovo)
 */

public class Home_frag1_bean {

    private String api;
    private String code;
    private String msg;
    private String v;
    private int version;
    private List<DataBean> data;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Home_frag1_bean{" +
                "api='" + api + '\'' +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", v='" + v + '\'' +
                ", version=" + version +
                ", data=" + data +
                '}';
    }

    public static class DataBean {


        private int elementShowNumber;
        private int elementType;
        private String modelFullCode;
        private int modelFullId;
        private int modelId;
        private int pmodelFullId;
        private int sequence;
        private int pageId;
        private String pagename;
        private List<TagBean> tag;

        public int getElementShowNumber() {
            return elementShowNumber;
        }

        public void setElementShowNumber(int elementShowNumber) {
            this.elementShowNumber = elementShowNumber;
        }

        public int getElementType() {
            return elementType;
        }

        public void setElementType(int elementType) {
            this.elementType = elementType;
        }

        public String getModelFullCode() {
            return modelFullCode;
        }

        public void setModelFullCode(String modelFullCode) {
            this.modelFullCode = modelFullCode;
        }

        public int getModelFullId() {
            return modelFullId;
        }

        public void setModelFullId(int modelFullId) {
            this.modelFullId = modelFullId;
        }

        public int getModelId() {
            return modelId;
        }

        public void setModelId(int modelId) {
            this.modelId = modelId;
        }

        public int getPmodelFullId() {
            return pmodelFullId;
        }

        public void setPmodelFullId(int pmodelFullId) {
            this.pmodelFullId = pmodelFullId;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public int getPageId() {
            return pageId;
        }

        public void setPageId(int pageId) {
            this.pageId = pageId;
        }

        public String getPagename() {
            return pagename;
        }

        public void setPagename(String pagename) {
            this.pagename = pagename;
        }

        public List<TagBean> getTag() {
            return tag;
        }

        public void setTag(List<TagBean> tag) {
            this.tag = tag;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "elementShowNumber=" + elementShowNumber +
                    ", elementType=" + elementType +
                    ", modelFullCode='" + modelFullCode + '\'' +
                    ", modelFullId=" + modelFullId +
                    ", modelId=" + modelId +
                    ", pmodelFullId=" + pmodelFullId +
                    ", sequence=" + sequence +
                    ", pageId=" + pageId +
                    ", pagename='" + pagename + '\'' +
                    ", tag=" + tag +
                    '}';
        }

        public static class TagBean {
            /**
             * color :
             * elementDesc : lib.suning.com/api/app/babydiapers.json
             * elementName : 纸尿裤
             * elementType : 2
             * linkType : 4
             * linkUrl : http://m.suning.com/
             * modelFullId : 11728
             * picUrl : /uimg/cms/img/149239471389740086.png
             * productSpecialFlag : 1001
             * sequence : 1
             * templateFullId : 300452
             * trickPoint : 1413288001
             */

            private String color;
            private String elementDesc;
            private String elementName;
            private int elementType;
            private int linkType;
            private String linkUrl;
            private int modelFullId;
            private String picUrl;
            private String productSpecialFlag;
            private int sequence;
            private int templateFullId;
            private String trickPoint;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getElementDesc() {
                return elementDesc;
            }

            public void setElementDesc(String elementDesc) {
                this.elementDesc = elementDesc;
            }

            public String getElementName() {
                return elementName;
            }

            public void setElementName(String elementName) {
                this.elementName = elementName;
            }

            public int getElementType() {
                return elementType;
            }

            public void setElementType(int elementType) {
                this.elementType = elementType;
            }

            public int getLinkType() {
                return linkType;
            }

            public void setLinkType(int linkType) {
                this.linkType = linkType;
            }

            public String getLinkUrl() {
                return linkUrl;
            }

            public void setLinkUrl(String linkUrl) {
                this.linkUrl = linkUrl;
            }

            public int getModelFullId() {
                return modelFullId;
            }

            public void setModelFullId(int modelFullId) {
                this.modelFullId = modelFullId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getProductSpecialFlag() {
                return productSpecialFlag;
            }

            public void setProductSpecialFlag(String productSpecialFlag) {
                this.productSpecialFlag = productSpecialFlag;
            }

            public int getSequence() {
                return sequence;
            }

            public void setSequence(int sequence) {
                this.sequence = sequence;
            }

            public int getTemplateFullId() {
                return templateFullId;
            }

            public void setTemplateFullId(int templateFullId) {
                this.templateFullId = templateFullId;
            }

            public String getTrickPoint() {
                return trickPoint;
            }

            public void setTrickPoint(String trickPoint) {
                this.trickPoint = trickPoint;
            }

            @Override
            public String toString() {
                return "TagBean{" +
                        "color='" + color + '\'' +
                        ", elementDesc='" + elementDesc + '\'' +
                        ", elementName='" + elementName + '\'' +
                        ", elementType=" + elementType +
                        ", linkType=" + linkType +
                        ", linkUrl='" + linkUrl + '\'' +
                        ", modelFullId=" + modelFullId +
                        ", picUrl='" + picUrl + '\'' +
                        ", productSpecialFlag='" + productSpecialFlag + '\'' +
                        ", sequence=" + sequence +
                        ", templateFullId=" + templateFullId +
                        ", trickPoint='" + trickPoint + '\'' +
                        '}';
            }
        }
    }
}
