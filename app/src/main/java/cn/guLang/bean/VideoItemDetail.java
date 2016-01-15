package cn.guLang.bean;

import java.io.Serializable;
import java.util.List;

/**
 * class summary:获取单个视频
 * Created by JackHappiness
 * Data 2016/1/9
 * Version 1.0
 */
public class VideoItemDetail implements Serializable{
 /**
     * vsid : C10313
     * order : 35143
     * vid : d144fefb3cd74255ac6c37c9c08a4b25
     * t : 《东方时空》 20160108
     * url : http://tv.cntv.cn/video/C10313/d144fefb3cd74255ac6c37c9c08a4b25
     * ptime : 2016-01-08 20:00:00
     * img : http://p5.img.cctvpic.com/fmspic/2016/01/08/d144fefb3cd74255ac6c37c9c08a4b25-1620.jpg
     * len : 00:53:34
     * em : CM01
     */

    private List<VideoEntity> video;

    public void setVideo(List<VideoEntity> video) {
        this.video = video;
    }

    public List<VideoEntity> getVideo() {
        return video;
    }

    public static class VideoEntity implements Serializable{
        private String vsid;
        private String order;
        private String vid;
        private String t;
        private String url;
        private String ptime;
        private String img;
        private String len;
        private String em;

        public void setVsid(String vsid) {
            this.vsid = vsid;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public void setT(String t) {
            this.t = t;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setLen(String len) {
            this.len = len;
        }

        public void setEm(String em) {
            this.em = em;
        }

        public String getVsid() {
            return vsid;
        }

        public String getOrder() {
            return order;
        }

        public String getVid() {
            return vid;
        }

        public String getT() {
            return t;
        }

        public String getUrl() {
            return url;
        }

        public String getPtime() {
            return ptime;
        }

        public String getImg() {
            return img;
        }

        public String getLen() {
            return len;
        }

        public String getEm() {
            return em;
        }
    }
}
