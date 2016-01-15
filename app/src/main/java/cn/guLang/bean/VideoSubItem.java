package cn.guLang.bean;

import java.io.Serializable;
import java.util.List;

/**
 * class summary:
 * Created by JackHappiness
 * Data 2016/1/9
 * Version 1.0
 */
public class VideoSubItem implements Serializable{

    private DataEntity data;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity implements Serializable{
        private List<?> bigImg;
        /**
         * title : 了不起的挑战
         * lastVideo :
         * brief :
         * imgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/22/1450763994064_134.jpg
         * bigImgUrl : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2015/12/22/1450763996476_987.jpg
         * cmsImgType :
         * vsetType :
         * vsetId : VSET100252374111
         * shareUrl : http://tv.cntv.cn/videoset/VSET100252374111
         * isShow :
         * columnSo :
         * vsetPageid :
         * cornerStr :
         * cornerColour :
         * order : 1
         */

        private List<ItemListEntity> itemList;

        public void setBigImg(List<?> bigImg) {
            this.bigImg = bigImg;
        }

        public void setItemList(List<ItemListEntity> itemList) {
            this.itemList = itemList;
        }

        public List<?> getBigImg() {
            return bigImg;
        }

        public List<ItemListEntity> getItemList() {
            return itemList;
        }


    }
}
