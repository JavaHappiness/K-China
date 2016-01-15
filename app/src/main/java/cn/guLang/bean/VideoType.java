package cn.guLang.bean;

import java.util.List;

/**
 * class summary:
 * Created by JackHappiness
 * Data 2016/1/5
 * Version 1.0
 */
public class VideoType {

    /**
     * title : 分类首页
     * bigImgControl : 1
     * bigImg : [{"title":"2015体坛大事件","brief":"","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/30/1451458225684_775.jpg","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/tiyuyexinban/csmsxPAGE1446106070912387/breakingnews/datu/index.json","isAd":"","pcUrl":"","cid":"","category":"7","adid":"","cornerStr":"","cornerColour":"","sign":"","isShow":"","vca":"","order":"1"},{"title":"2015综艺红人榜","brief":"","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/30/1451446698549_73.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/30/1451446700982_530.jpg","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/zy2015/hrb/index.json","isAd":"","pcUrl":"","cid":"","category":"7","adid":"","cornerStr":"","cornerColour":"","sign":"","isShow":"","vca":"","order":"2"},{"title":"2016年贺岁档观影指南","brief":"","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/25/1451031961938_931.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/25/1451031961938_931.jpg","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/15hsd/rightlist/index.json","isAd":"","pcUrl":"","cid":"","category":"7","adid":"","cornerStr":"","cornerColour":"","sign":"","isShow":"","vca":"","order":"3"},{"title":"《春晚影像馆》记录春晚32年","brief":"","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/17/1447722695442_179.jpg","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/topic/cwyxgaa/shouye/index.json","isAd":"","pcUrl":"","cid":"","category":"7","adid":"","cornerStr":"","cornerColour":"","sign":"","isShow":"","vca":"","order":"4"}]
     * categoryList : [{"title":"新闻","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449508231_838.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/xinwen/shouye/index.json","cid":"","category":"7","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543296171_504.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543282541_669.png","order":"1"},{"title":"体育","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449546805_406.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/tiyuyexinban/sports/index.json","cid":"cid=00","category":"7","adid":"CN61","sign":"saishi","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543365970_740.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543363623_897.png","order":"2"},{"title":"综艺","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449521984_849.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/zongyi/shouye/index.json","cid":"cid=CN22","category":"7","adid":"CN22","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543385416_691.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543376798_349.png","order":"3"},{"title":"军事","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/12/1447317777269_859.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/js/shouye/index.json","cid":"","category":"7","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829089306_985.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829092051_28.png","order":"4"},{"title":"财经","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/12/1447295176135_926.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/cj/shouye/index.json","cid":"","category":"7","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829075548_698.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829077980_992.png","order":"5"},{"title":"法制","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/12/1447321726329_884.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/fz/shouye/index.json","cid":"","category":"7","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829056157_884.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829059959_147.png","order":"6"},{"title":"生活","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449533876_417.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/hengtuPAGE1445827023873932/shouye/index.json","cid":"","category":"7","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829012303_267.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829024218_114.png","order":"7"},{"title":"电影","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449558702_628.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/dianying/shouye/index.json","cid":"cid=CN07","category":"8","adid":"CN07","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828968985_294.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828971850_651.png","order":"8"},{"title":"电视剧","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449571705_810.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/dianshiju/shouye/index.json","cid":"cid=CN06","category":"8","adid":"CN06","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828956291_454.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828959378_970.png","order":"9"},{"title":"纪录片","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449589144_48.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/shutuPAGE1445827060282832/shouye/index.shtml","cid":"cid=CN08","category":"8","adid":"CN08","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828934375_614.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828940532_630.png","order":"10"},{"title":"动画片","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449605244_554.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/donghuap/shouye/index.json","cid":"cid=CN09","category":"8","adid":"CN09","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828913866_759.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828916784_323.png","order":"11"},{"title":"少儿","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449628383_946.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/qingshao/shouye/index.json","cid":"cid=CN27","category":"8","adid":"CN27","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828887284_240.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828890624_228.png","order":"12"},{"title":"科教","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449618809_462.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/kejiao/shouye/index.json","cid":"cid=CN26","category":"8","adid":"CN26","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828870958_587.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828868987_559.png","order":"13"},{"title":"爱西柚","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446434236432_138.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/aixiyou/shouye/index.json","cid":"aixiyou","category":"7","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828805364_594.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828803185_765.png","order":"14"},{"title":"公开课","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446466315840_485.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/gongkaike/index/index.json","cid":"cid=CNX1000","category":"8","adid":"CNX1000","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828792183_10.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449828788419_813.png","order":"15"},{"title":"原创","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449644521_613.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleierjiye/yuanchuang/shouye/index.json","cid":"cid=00","category":"7","adid":"CN61","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829154877_456.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829159510_840.png","order":"16"},{"title":"专题","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449654958_316.png","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/fenleishy/zhuanti/index.json","cid":"","category":"0","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829169653_505.png","padImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/11/1449829174326_293.png","order":"17"}]
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
        private String bigImgControl;
        /**
         * title : 2015体坛大事件
         * brief :
         * imgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/30/1451458225684_775.jpg
         * bigImgUrl :
         * listUrl : http://cbox.cntv.cn/json2015/fenleierjiye/tiyuyexinban/csmsxPAGE1446106070912387/breakingnews/datu/index.json
         * isAd :
         * pcUrl :
         * cid :
         * category : 7
         * adid :
         * cornerStr :
         * cornerColour :
         * sign :
         * isShow :
         * vca :
         * order : 1
         */

        private List<BigImgEntity> bigImg;
        /**
         * title : 新闻
         * imgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449508231_838.png
         * bigImgUrl :
         * listUrl : http://cbox.cntv.cn/json2015/fenleierjiye/xinwen/shouye/index.json
         * cid :
         * category : 7
         * adid :
         * sign :
         * clickImgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543296171_504.png
         * padImgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/8/1449543282541_669.png
         * order : 1
         */

        private List<CategoryListEntity> categoryList;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setBigImgControl(String bigImgControl) {
            this.bigImgControl = bigImgControl;
        }

        public void setBigImg(List<BigImgEntity> bigImg) {
            this.bigImg = bigImg;
        }

        public void setCategoryList(List<CategoryListEntity> categoryList) {
            this.categoryList = categoryList;
        }

        public String getTitle() {
            return title;
        }

        public String getBigImgControl() {
            return bigImgControl;
        }

        public List<BigImgEntity> getBigImg() {
            return bigImg;
        }

        public List<CategoryListEntity> getCategoryList() {
            return categoryList;
        }

        public static class CategoryListEntity {
            private String title;
            private String imgUrl;
            private String bigImgUrl;
            private String listUrl;
            private String cid;
            private String category;
            private String adid;
            private String sign;
            private String clickImgUrl;
            private String padImgUrl;
            private String order;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public void setBigImgUrl(String bigImgUrl) {
                this.bigImgUrl = bigImgUrl;
            }

            public void setListUrl(String listUrl) {
                this.listUrl = listUrl;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public void setAdid(String adid) {
                this.adid = adid;
            }

            public void setSign(String sign) {
                this.sign = sign;
            }

            public void setClickImgUrl(String clickImgUrl) {
                this.clickImgUrl = clickImgUrl;
            }

            public void setPadImgUrl(String padImgUrl) {
                this.padImgUrl = padImgUrl;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public String getTitle() {
                return title;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public String getBigImgUrl() {
                return bigImgUrl;
            }

            public String getListUrl() {
                return listUrl;
            }

            public String getCid() {
                return cid;
            }

            public String getCategory() {
                return category;
            }

            public String getAdid() {
                return adid;
            }

            public String getSign() {
                return sign;
            }

            public String getClickImgUrl() {
                return clickImgUrl;
            }

            public String getPadImgUrl() {
                return padImgUrl;
            }

            public String getOrder() {
                return order;
            }
        }
    }
}
