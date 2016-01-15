package cn.guLang.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * class summary:播放
 * Created by JackHappiness
 * Data 2016/1/9
 * Version 1.0
 */
public class VideoPlayBean {

    /**
     * play_channel : CCTV 新闻频道
     * f_pgmtime : 2016-01-08 01:34:21
     * tag :
     * cdn_info : {"cdn_vip":"125.46.64.11","cdn_code":"VOD-MP4-CU-ZZ","cdn_name":"CU郑州"}
     * editer_name : zhangzhu
     * version : 0.2
     * is_fn_hot : true
     * title : [新闻直播间]习近平在视察第13集团军时强调 深入推进政治建军改革强军依法治军 坚定信心狠抓落实开创强军兴军新局面
     * is_protected : 0
     * hls_url : http://asp.cntv.lxdns.com/asp/hls/main/0303000a/3/default/177cbcff42464bf9aacb270d57c3e800/main.m3u8?maxbr=450
     * hls_cdn_info : {"cdn_vip":"asp.cntv.lxdns.com","cdn_code":"VOD-HLS-CDN-CNC","cdn_name":"3rd网宿"}
     * client_sid : 95b6981216b346d4ac906e72df98e5e4
     * is_ipad_support : true
     * video : {"validChapterNum":2,"lowChapters":[{"image":"http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg","url":"http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264200000nero_aac16.mp4","duration":"446"}],"totalLength":"446.00","chapters":[{"image":"http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg","url":"http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264418000nero_aac32-1.mp4","duration":"298"},{"image":"http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg","url":"http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264418000nero_aac32-2.mp4","duration":"148"}],"url":""}
     * is_invalid_copyright : 0
     * produce_id : wxsb01
     * default_stream : STD
     * ack : yes
     * is_fn_multi_stream : false
     * embed :
     * asp_error_code : 0
     * column : 新闻直播间精切169
     * lc : {"isp_code":"2","city_code":"ZZ","provice_code":"HA","country_code":"CN","ip":"115.60.57.5"}
     * public : 1
     * is_p2p_use : true
     * produce :
     */

    private String play_channel;
    private String f_pgmtime;
    private String tag;
    /**
     * cdn_vip : 125.46.64.11
     * cdn_code : VOD-MP4-CU-ZZ
     * cdn_name : CU郑州
     */

    private CdnInfoEntity cdn_info;
    private String editer_name;
    private String version;
    private String is_fn_hot;
    private String title;
    private String is_protected;
    private String hls_url;
    /**
     * cdn_vip : asp.cntv.lxdns.com
     * cdn_code : VOD-HLS-CDN-CNC
     * cdn_name : 3rd网宿
     */

    private HlsCdnInfoEntity hls_cdn_info;
    private String client_sid;
    private String is_ipad_support;
    /**
     * validChapterNum : 2
     * lowChapters : [{"image":"http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg","url":"http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264200000nero_aac16.mp4","duration":"446"}]
     * totalLength : 446.00
     * chapters : [{"image":"http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg","url":"http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264418000nero_aac32-1.mp4","duration":"298"},{"image":"http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg","url":"http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264418000nero_aac32-2.mp4","duration":"148"}]
     * url :
     */

    private VideoEntity video;
    private String is_invalid_copyright;
    private String produce_id;
    private String default_stream;
    private String ack;
    private boolean is_fn_multi_stream;
    private String embed;
    private int asp_error_code;
    private String column;
    /**
     * isp_code : 2
     * city_code : ZZ
     * provice_code : HA
     * country_code : CN
     * ip : 115.60.57.5
     */

    private LcEntity lc;
    @SerializedName("public")
    private String publicX;
    private boolean is_p2p_use;
    private String produce;

    public void setPlay_channel(String play_channel) {
        this.play_channel = play_channel;
    }

    public void setF_pgmtime(String f_pgmtime) {
        this.f_pgmtime = f_pgmtime;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setCdn_info(CdnInfoEntity cdn_info) {
        this.cdn_info = cdn_info;
    }

    public void setEditer_name(String editer_name) {
        this.editer_name = editer_name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setIs_fn_hot(String is_fn_hot) {
        this.is_fn_hot = is_fn_hot;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIs_protected(String is_protected) {
        this.is_protected = is_protected;
    }

    public void setHls_url(String hls_url) {
        this.hls_url = hls_url;
    }

    public void setHls_cdn_info(HlsCdnInfoEntity hls_cdn_info) {
        this.hls_cdn_info = hls_cdn_info;
    }

    public void setClient_sid(String client_sid) {
        this.client_sid = client_sid;
    }

    public void setIs_ipad_support(String is_ipad_support) {
        this.is_ipad_support = is_ipad_support;
    }

    public void setVideo(VideoEntity video) {
        this.video = video;
    }

    public void setIs_invalid_copyright(String is_invalid_copyright) {
        this.is_invalid_copyright = is_invalid_copyright;
    }

    public void setProduce_id(String produce_id) {
        this.produce_id = produce_id;
    }

    public void setDefault_stream(String default_stream) {
        this.default_stream = default_stream;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public void setIs_fn_multi_stream(boolean is_fn_multi_stream) {
        this.is_fn_multi_stream = is_fn_multi_stream;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public void setAsp_error_code(int asp_error_code) {
        this.asp_error_code = asp_error_code;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setLc(LcEntity lc) {
        this.lc = lc;
    }

    public void setPublicX(String publicX) {
        this.publicX = publicX;
    }

    public void setIs_p2p_use(boolean is_p2p_use) {
        this.is_p2p_use = is_p2p_use;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getPlay_channel() {
        return play_channel;
    }

    public String getF_pgmtime() {
        return f_pgmtime;
    }

    public String getTag() {
        return tag;
    }

    public CdnInfoEntity getCdn_info() {
        return cdn_info;
    }

    public String getEditer_name() {
        return editer_name;
    }

    public String getVersion() {
        return version;
    }

    public String getIs_fn_hot() {
        return is_fn_hot;
    }

    public String getTitle() {
        return title;
    }

    public String getIs_protected() {
        return is_protected;
    }

    public String getHls_url() {
        return hls_url;
    }

    public HlsCdnInfoEntity getHls_cdn_info() {
        return hls_cdn_info;
    }

    public String getClient_sid() {
        return client_sid;
    }

    public String getIs_ipad_support() {
        return is_ipad_support;
    }

    public VideoEntity getVideo() {
        return video;
    }

    public String getIs_invalid_copyright() {
        return is_invalid_copyright;
    }

    public String getProduce_id() {
        return produce_id;
    }

    public String getDefault_stream() {
        return default_stream;
    }

    public String getAck() {
        return ack;
    }

    public boolean isIs_fn_multi_stream() {
        return is_fn_multi_stream;
    }

    public String getEmbed() {
        return embed;
    }

    public int getAsp_error_code() {
        return asp_error_code;
    }

    public String getColumn() {
        return column;
    }

    public LcEntity getLc() {
        return lc;
    }

    public String getPublicX() {
        return publicX;
    }

    public boolean isIs_p2p_use() {
        return is_p2p_use;
    }

    public String getProduce() {
        return produce;
    }

    public static class CdnInfoEntity {
        private String cdn_vip;
        private String cdn_code;
        private String cdn_name;

        public void setCdn_vip(String cdn_vip) {
            this.cdn_vip = cdn_vip;
        }

        public void setCdn_code(String cdn_code) {
            this.cdn_code = cdn_code;
        }

        public void setCdn_name(String cdn_name) {
            this.cdn_name = cdn_name;
        }

        public String getCdn_vip() {
            return cdn_vip;
        }

        public String getCdn_code() {
            return cdn_code;
        }

        public String getCdn_name() {
            return cdn_name;
        }
    }

    public static class HlsCdnInfoEntity {
        private String cdn_vip;
        private String cdn_code;
        private String cdn_name;

        public void setCdn_vip(String cdn_vip) {
            this.cdn_vip = cdn_vip;
        }

        public void setCdn_code(String cdn_code) {
            this.cdn_code = cdn_code;
        }

        public void setCdn_name(String cdn_name) {
            this.cdn_name = cdn_name;
        }

        public String getCdn_vip() {
            return cdn_vip;
        }

        public String getCdn_code() {
            return cdn_code;
        }

        public String getCdn_name() {
            return cdn_name;
        }
    }

    public static class VideoEntity {
        private int validChapterNum;
        private String totalLength;
        private String url;
        /**
         * image : http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg
         * url : http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264200000nero_aac16.mp4
         * duration : 446
         */

        private List<LowChaptersEntity> lowChapters;
        /**
         * image : http://p3.img.cctvpic.com/fmspic/2016/01/08/177cbcff42464bf9aacb270d57c3e800-180.jpg
         * url : http://125.46.64.11/v.cctv.com/flash/mp4video48/TMS/2016/01/08/177cbcff42464bf9aacb270d57c3e800_h264418000nero_aac32-1.mp4
         * duration : 298
         */

        private List<ChaptersEntity> chapters;

        public void setValidChapterNum(int validChapterNum) {
            this.validChapterNum = validChapterNum;
        }

        public void setTotalLength(String totalLength) {
            this.totalLength = totalLength;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setLowChapters(List<LowChaptersEntity> lowChapters) {
            this.lowChapters = lowChapters;
        }

        public void setChapters(List<ChaptersEntity> chapters) {
            this.chapters = chapters;
        }

        public int getValidChapterNum() {
            return validChapterNum;
        }

        public String getTotalLength() {
            return totalLength;
        }

        public String getUrl() {
            return url;
        }

        public List<LowChaptersEntity> getLowChapters() {
            return lowChapters;
        }

        public List<ChaptersEntity> getChapters() {
            return chapters;
        }

        public static class LowChaptersEntity {
            private String image;
            private String url;
            private String duration;

            public void setImage(String image) {
                this.image = image;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public String getUrl() {
                return url;
            }

            public String getDuration() {
                return duration;
            }
        }

        public static class ChaptersEntity {
            private String image;
            private String url;
            private String duration;

            public void setImage(String image) {
                this.image = image;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getImage() {
                return image;
            }

            public String getUrl() {
                return url;
            }

            public String getDuration() {
                return duration;
            }
        }
    }

    public static class LcEntity {
        private String isp_code;
        private String city_code;
        private String provice_code;
        private String country_code;
        private String ip;

        public void setIsp_code(String isp_code) {
            this.isp_code = isp_code;
        }

        public void setCity_code(String city_code) {
            this.city_code = city_code;
        }

        public void setProvice_code(String provice_code) {
            this.provice_code = provice_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getIsp_code() {
            return isp_code;
        }

        public String getCity_code() {
            return city_code;
        }

        public String getProvice_code() {
            return provice_code;
        }

        public String getCountry_code() {
            return country_code;
        }

        public String getIp() {
            return ip;
        }
    }
}
