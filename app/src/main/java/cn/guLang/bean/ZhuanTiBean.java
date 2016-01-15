package cn.guLang.bean;

import java.util.List;

/**
 * class summary:专题实体类
 * Created by JackHappiness
 * Data 2016/1/9
 * Version 1.0
 */
public class ZhuanTiBean {

    /**
     * title : 专题列表分
     * categoryList : [{"title":"2016元旦荧屏欢乐送","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/29/1451381950091_175.jpg","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/hulianwangdahuiPAGE1451291568114676/rightlist/index.json","cid":"","category":"7","fontcolor":"","adid":"","sign":"","clickImgUrl":"","order":"1"},{"title":"一大波贺岁片来袭","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/25/1451030989997_791.jpg","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/15hsd/rightlist/index.json","cid":"","category":"7","fontcolor":"","adid":"","sign":"","clickImgUrl":"","order":"2"},{"title":"欢乐过圣诞","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/25/1451008551737_21.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/25/1451008554746_229.jpg","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/tiyuyexinbanPAGE1450849984897105/rightlist/index.json","cid":"","category":"7","fontcolor":"","adid":"","sign":"","clickImgUrl":"","order":"3"},{"title":"剧有料：戏说《芈月传》","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/14/1450082271264_606.jpg","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/tiyuyexinban/rightlist/index.json","cid":"","category":"7","fontcolor":"","adid":"","sign":"","clickImgUrl":"","order":"4"},{"title":"艾滋病日","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/1/1448936341112_593.jpg","bigImgUrl":"","listUrl":"http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/zongyi/rightlist/index.json","cid":"","category":"7","fontcolor":"","adid":"","sign":"","clickImgUrl":"","order":"5"},{"title":"春晚影像馆","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/16/1447649189166_550.jpg","bigImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/16/1447649195829_873.jpg","listUrl":"http://cbox.cntv.cn/json2015/topic/cwyxgaa/shouye/index.json","cid":"","category":"7","fontcolor":"","adid":"","sign":"","clickImgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/16/1447649192718_199.jpg","order":"6"},{"title":"纪念抗战胜利70周年","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446448539432_610.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/70zhounian/index/index.json","cid":"cid=00","category":"6","fontcolor":"255 0 0","adid":"","sign":"","clickImgUrl":"","order":"7"},{"title":"寻找最美孝心少年","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446797649889_320.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/zuimeixiaoxinshaonian/zmxxsn/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"8"},{"title":"最美人物发布厅","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449135681_138.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/zuimeirenwufabuting/zmrwfbt/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 225","adid":"","sign":"","clickImgUrl":"","order":"9"},{"title":"纪录片《东方主战场》","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446444624496_104.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/70zhounianPAGE1440640666096365/index/index.json","cid":"cid=00","category":"6","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"10"},{"title":"欢乐过国庆","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449893952_4.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015gqj/2015yscwnew/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"11"},{"title":"感恩有您，老师","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446797801381_830.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/jiaoshi/big/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"12"},{"title":"开学啦","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446797877840_573.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015backtoschool/big/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"13"},{"title":"毕业季","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447126895986_466.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/biyeji/2015byjdt/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"14"},{"title":"完美暑期","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446797944135_618.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/wanmeishuqi/wanmeishuqinew/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"15"},{"title":"嗨玩儿童节","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447125773451_915.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015ertongjie/2015ertongjiedatu/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"16"},{"title":"端午节","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447126643135_25.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015duanwu/2015duanwu/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"17"},{"title":"五一C视界","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447125475221_770.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/201551wuyi/201551new/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"18"},{"title":"父爱如山","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447126448264_243.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015fatherzq/2015fathernew/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"19"},{"title":"我的长辈","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447136453147_350.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/aixiyou/aixiyouzhuantiweihuqu/2015zhangbei/2015ertongjiedatu/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"20"},{"title":"行走天地间","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447127262315_352.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/jilupian/jilupianzhuantiweihuqu/xztdj/tj/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"21"},{"title":"感恩母亲节","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447125676308_880.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015motherzq/2015mothernew/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"22"},{"title":"神剧现形记","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447136096916_610.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/aixiyou/shenjuxianxingji/shenjuxianxingji/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"23"},{"title":"防震减灾","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447125855526_427.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/fzjz/2015/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"24"},{"title":"刘翔宣布退役","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447125306647_241.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/liuxiangtf/liuxiangtfnew/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"25"},{"title":"第五届北京国际电影节","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447125198435_637.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015bjiff/2015bjiff/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"26"},{"title":"动漫人物过愚人节","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/10/1447124967231_431.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/dmrwyrj/2015yrj/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"27"},{"title":"\u201c高颜值\u201d电视剧称霸2015荧屏","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446798266184_362.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/dianshiju/zhuantiweihuqu/gaoyanzhi2015/gaoyanzhi2015/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"28"},{"title":"国漫崛起","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446798876321_20.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/localcomic/localcomic/index.json","cid":"cid=00","category":"5","fontcolor":"","adid":"","sign":"","clickImgUrl":"","order":"29"},{"title":"我的美丽乡愁","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446798599836_107.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/aixiyou/aixiyouzhuantiweihuqu/xiangchou/main/index.json","cid":"cid=00","category":"5","fontcolor":"46 139 87","adid":"","sign":"","clickImgUrl":"","order":"30"},{"title":"暑期标配剧","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/6/1446799172485_494.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015shuqibiaop/2015summerdrama/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"31"},{"title":"网络众筹《黄河大合唱》","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446444721637_326.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/shuangchuangzhix/2015fxsczx/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"32"},{"title":"《双创之星》活动","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446448715111_143.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/fxsczx/2015fxsczx/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"33"},{"title":"抗战纪录片","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446450590396_346.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/jilupian/jilupianzhuantiweihuqu/rlsgswl/sy/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"34"},{"title":"抗战剧展播","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446450102455_667.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/201551wuyiPAGE1433143891760901/kzsl70zndsj/index.json","cid":"cid=00","category":"5","fontcolor":"218 112 214","adid":"","sign":"","clickImgUrl":"","order":"35"},{"title":"2015中秋韵","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449934679_717.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/201551wuyiPAGE1442282172710849/201551new/index.json","cid":"cid=00","category":"5","fontcolor":"0 0 255","adid":"","sign":"","clickImgUrl":"","order":"36"},{"title":"DV看两岸","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449702215_645.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/dianboerjiye/aixiyouDVkanliangan/kzsl70zndsj/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"37"},{"title":"网络春晚","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449221495_130.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015wlcw/2015wlcwnew/index.json","cid":"cid=00","category":"5","fontcolor":"195 39 43","adid":"","sign":"","clickImgUrl":"","order":"38"},{"title":"梦娃","imgUrl":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/11/2/1446449323055_841.jpg","bigImgUrl":"","listUrl":"http://serv.cbox.cntv.cn/json/zhuantiweihuqu/2015mengwa/mengwa/index.json","cid":"cid=00","category":"5","fontcolor":"46 139 87","adid":"","sign":"","clickImgUrl":"","order":"39"}]
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
        /**
         * title : 2016元旦荧屏欢乐送
         * imgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/29/1451381950091_175.jpg
         * bigImgUrl :
         * listUrl : http://cbox.cntv.cn/json2015/topic/cboxzz/2015zt/hulianwangdahuiPAGE1451291568114676/rightlist/index.json
         * cid :
         * category : 7
         * fontcolor :
         * adid :
         * sign :
         * clickImgUrl :
         * order : 1
         */

        private List<CategoryListEntity> categoryList;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCategoryList(List<CategoryListEntity> categoryList) {
            this.categoryList = categoryList;
        }

        public String getTitle() {
            return title;
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
            private String fontcolor;
            private String adid;
            private String sign;
            private String clickImgUrl;
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

            public void setFontcolor(String fontcolor) {
                this.fontcolor = fontcolor;
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

            public String getFontcolor() {
                return fontcolor;
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

            public String getOrder() {
                return order;
            }
        }
    }
}
