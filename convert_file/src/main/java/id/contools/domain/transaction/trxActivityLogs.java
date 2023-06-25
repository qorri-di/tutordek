package id.contools.domain.transaction;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trx_activity_log", schema = "public")
public class trxActivityLogs extends PanacheEntityBase {
    @Id
    @Column(name = "activity_id")
    private String activityId;

    @Column(name = "activity_feature")
    private String activityFeature;

    @Column(name = "activity_menu")
    private String activityMenu;

    @Column(name = "activity_path")
    private String activityPath;

    @Column(name = "activity_ip")
    private String activityIp;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityFeature() {
        return activityFeature;
    }

    public void setActivityFeature(String activityFeature) {
        this.activityFeature = activityFeature;
    }

    public String getActivityMenu() {
        return activityMenu;
    }

    public void setActivityMenu(String activityMenu) {
        this.activityMenu = activityMenu;
    }

    public String getActivityPath() {
        return activityPath;
    }

    public void setActivityPath(String activityPath) {
        this.activityPath = activityPath;
    }

    public String getActivityIp() {
        return activityIp;
    }

    public void setActivityIp(String activityIp) {
        this.activityIp = activityIp;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
