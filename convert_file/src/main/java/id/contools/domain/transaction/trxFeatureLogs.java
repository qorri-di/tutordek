package id.contools.domain.transaction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trx_feature_logs", schema = "public")
public class trxFeatureLogs {
    @Id
    @Column(name = "feature_log_id")
    private String featureLogId;

    @Column(name = "feature_log_featureId")
    private String featureId;

    @Column(name = "feature_log_menu")
    private String featureLogMenu;

    @Column(name = "feature_log_path")
    private String featureLogPath;

    @Column(name = "feature_log_ip")
    private String featureLogIp;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    public String getFeatureLogId() {
        return featureLogId;
    }

    public void setFeatureLogId(String featureLogId) {
        this.featureLogId = featureLogId;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public String getFeatureLogMenu() {
        return featureLogMenu;
    }

    public void setFeatureLogMenu(String featureLogMenu) {
        this.featureLogMenu = featureLogMenu;
    }

    public String getFeatureLogPath() {
        return featureLogPath;
    }

    public void setFeatureLogPath(String featureLogPath) {
        this.featureLogPath = featureLogPath;
    }

    public String getFeatureLogIp() {
        return featureLogIp;
    }

    public void setFeatureLogIp(String featureLogIp) {
        this.featureLogIp = featureLogIp;
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
