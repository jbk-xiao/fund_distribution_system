package com.myfunds.fds.entity;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitLog {
    public VisitLog(String vid, String detail) {
        this.vid = vid;
        this.detail = detail;
    }
    public VisitLog(String cid, String channel, String organization, String mid, String manager, String lid,
                    String date, String logAbstract) {
        this.cid = cid;
        this.channel = channel;
        this.organization = organization;
        this.mid = mid;
        this.manager = manager;
        this.lid = lid;
        this.date = date;
        this.logAbstract = logAbstract;
    }
    public VisitLog(String cid, String channel, String organization, String mid, String manager, String lid,
                    String date, String logAbstract, String detail) {
        this.cid = cid;
        this.channel = channel;
        this.organization = organization;
        this.mid = mid;
        this.manager = manager;
        this.lid = lid;
        this.date = date;
        this.logAbstract = logAbstract;
        this.detail = detail;
    }

    private String vid;
    private String cid;
    private String channel;
    private String organization;
    private String mid;
    private String manager;
    private String lid;
    private String date;
//    @SerializedName("abstract")
    private String logAbstract;
    private String detail;
}
