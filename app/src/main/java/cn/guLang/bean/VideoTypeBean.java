package cn.guLang.bean;

import java.util.List;

/**
 * class summary:
 * Created by JackHappiness
 * Data 2016/1/8
 * Version 1.0
 */
public class VideoTypeBean {

    /**
     * title : 点播分类页
     * filterType : 0
     * filterUrl : http://cbox.cntv.cn/json2015/fenleierjiye/xinwen/csmsxPAGE1446106065854280/cmssx/index.json
     * bigImg : [{"title":"《今日说法》 身边的盗卡人","brief":"","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217693363_275.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217697515_241.jpg","vsetType":"","vtype":"1","listUrl":"","vid":"13d701dfff47422883fbe6e919d32990","channelId":"","vsetId":"","vsetCid":"","vsetEm":"","shareUrl":"","pcUrl":"","categoryId":"","categoryUrl":"","categoryAid":"","cornerStr":"","cornerColour":"","columnSo":"","vsetPageid":"","isShow":"","order":"1"},{"title":"《一线》 琼瑶于正案之终审判决","brief":"","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217582473_235.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217586025_995.jpg","vsetType":"","vtype":"1","listUrl":"","vid":"6d8e3dd466b149668b2e844c27e2d062","channelId":"","vsetId":"","vsetCid":"","vsetEm":"","shareUrl":"","pcUrl":"","categoryId":"","categoryUrl":"","categoryAid":"","cornerStr":"","cornerColour":"","columnSo":"","vsetPageid":"","isShow":"","order":"2"}]
     * itemList : [{"title":"案件聚焦","adImgUrl":"","adBigImgUrl":"","isLanmu":"1","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/anjianzhuizong/index.json","moreUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/anjianzhuizongmore/index.json","isShow":"","order":"1"},{"title":"法制剧场","adImgUrl":"","adBigImgUrl":"","isLanmu":"1","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/lanmuju/index.json","moreUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/anqingzaxian/index.json","isShow":"","order":"2"},{"title":"普法教育","adImgUrl":"","adBigImgUrl":"","isLanmu":"1","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/pufaketang/index.json","moreUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/shengduduihua/index.json","isShow":"","order":"3"},{"title":"法律咨询","adImgUrl":"","adBigImgUrl":"","isLanmu":"1","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/cjlm1more/index.json","moreUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/fzlm1PAGE1447058023594271/index.json","isShow":"","order":"4"}]
     * rightList : [{"title":"《普法栏目剧》 20160107","brief":"金牌律师路第一季（大结局）","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217239038_809.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217236044_691.jpg","vsetType":"","vtype":"1","listUrl":"","vid":"3171aa6692034929af890409361f897e","channelId":"","vsetId":"","vsetCid":"","vsetEm":"","shareUrl":"","pcUrl":"","columnSo":"","vsetPageid":"","isShow":"","order":"1"},{"title":"《天网》 20160107","brief":"角落日记","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217414896_340.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217420519_41.jpg","vsetType":"","vtype":"1","listUrl":"","vid":"2e3bbaaba8134c9bb0ef2df0dc75362b","channelId":"","vsetId":"","vsetCid":"","vsetEm":"","shareUrl":"","pcUrl":"","columnSo":"","vsetPageid":"","isShow":"","order":"2"}]
     */

    private DataEntity data;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
        private String title;
        private String filterType;
        private String filterUrl;
        /**
         * title : 《今日说法》 身边的盗卡人
         * brief :
         * imgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217693363_275.jpg
         * bigImgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217697515_241.jpg
         * vsetType :
         * vtype : 1
         * listUrl :
         * vid : 13d701dfff47422883fbe6e919d32990
         * channelId :
         * vsetId :
         * vsetCid :
         * vsetEm :
         * shareUrl :
         * pcUrl :
         * categoryId :
         * categoryUrl :
         * categoryAid :
         * cornerStr :
         * cornerColour :
         * columnSo :
         * vsetPageid :
         * isShow :
         * order : 1
         */

        private List<BigImgEntity> bigImg;
        /**
         * title : 案件聚焦
         * adImgUrl :
         * adBigImgUrl :
         * isLanmu : 1
         * listUrl : http://cbox.cntv.cn/json2015/fenleierjiye/fz/anjianzhuizong/index.json
         * moreUrl : http://cbox.cntv.cn/json2015/fenleierjiye/fz/anjianzhuizongmore/index.json
         * isShow :
         * order : 1
         */

        private List<ItemListEntity> itemList;
        /**
         * title : 《普法栏目剧》 20160107
         * brief : 金牌律师路第一季（大结局）
         * imgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217239038_809.jpg
         * bigImgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/8/1452217236044_691.jpg
         * vsetType :
         * vtype : 1
         * listUrl :
         * vid : 3171aa6692034929af890409361f897e
         * channelId :
         * vsetId :
         * vsetCid :
         * vsetEm :
         * shareUrl :
         * pcUrl :
         * columnSo :
         * vsetPageid :
         * isShow :
         * order : 1
         */

        private List<RightListEntity> rightList;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setFilterType(String filterType) {
            this.filterType = filterType;
        }

        public void setFilterUrl(String filterUrl) {
            this.filterUrl = filterUrl;
        }

        public void setBigImg(List<BigImgEntity> bigImg) {
            this.bigImg = bigImg;
        }

        public void setItemList(List<ItemListEntity> itemList) {
            this.itemList = itemList;
        }

        public void setRightList(List<RightListEntity> rightList) {
            this.rightList = rightList;
        }

        public String getTitle() {
            return title;
        }

        public String getFilterType() {
            return filterType;
        }

        public String getFilterUrl() {
            return filterUrl;
        }

        public List<BigImgEntity> getBigImg() {
            return bigImg;
        }

        public List<ItemListEntity> getItemList() {
            return itemList;
        }

        public List<RightListEntity> getRightList() {
            return rightList;
        }


        public static class RightListEntity {
            private String title;
            private String brief;
            private String imgUrl;
            private String bigImgUrl;
            private String vsetType;
            private String vtype;
            private String listUrl;
            private String vid;
            private String channelId;
            private String vsetId;
            private String vsetCid;
            private String vsetEm;
            private String shareUrl;
            private String pcUrl;
            private String columnSo;
            private String vsetPageid;
            private String isShow;
            private String order;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setBrief(String brief) {
                this.brief = brief;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public void setBigImgUrl(String bigImgUrl) {
                this.bigImgUrl = bigImgUrl;
            }

            public void setVsetType(String vsetType) {
                this.vsetType = vsetType;
            }

            public void setVtype(String vtype) {
                this.vtype = vtype;
            }

            public void setListUrl(String listUrl) {
                this.listUrl = listUrl;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public void setVsetId(String vsetId) {
                this.vsetId = vsetId;
            }

            public void setVsetCid(String vsetCid) {
                this.vsetCid = vsetCid;
            }

            public void setVsetEm(String vsetEm) {
                this.vsetEm = vsetEm;
            }

            public void setShareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
            }

            public void setPcUrl(String pcUrl) {
                this.pcUrl = pcUrl;
            }

            public void setColumnSo(String columnSo) {
                this.columnSo = columnSo;
            }

            public void setVsetPageid(String vsetPageid) {
                this.vsetPageid = vsetPageid;
            }

            public void setIsShow(String isShow) {
                this.isShow = isShow;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public String getTitle() {
                return title;
            }

            public String getBrief() {
                return brief;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public String getBigImgUrl() {
                return bigImgUrl;
            }

            public String getVsetType() {
                return vsetType;
            }

            public String getVtype() {
                return vtype;
            }

            public String getListUrl() {
                return listUrl;
            }

            public String getVid() {
                return vid;
            }

            public String getChannelId() {
                return channelId;
            }

            public String getVsetId() {
                return vsetId;
            }

            public String getVsetCid() {
                return vsetCid;
            }

            public String getVsetEm() {
                return vsetEm;
            }

            public String getShareUrl() {
                return shareUrl;
            }

            public String getPcUrl() {
                return pcUrl;
            }

            public String getColumnSo() {
                return columnSo;
            }

            public String getVsetPageid() {
                return vsetPageid;
            }

            public String getIsShow() {
                return isShow;
            }

            public String getOrder() {
                return order;
            }
        }
    }
}
