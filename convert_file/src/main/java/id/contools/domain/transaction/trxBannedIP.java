package id.contools.domain.transaction;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trx_banned_ip", schema = "public")
public class trxBannedIP extends PanacheEntityBase {
    @Id
    @Column(name = "banned_id")
    private String bannedId;

    @Column(name = "banned_ip")
    private String bannedIp;

    @Column(name = "banned_attack")
    private String bannedAttack;

    @Column(name = "banned_status")
    private Integer bannedStatus;

    @Column(name = "banned_start_date")
    private Date startBannedDate;

    @Column(name = "banned_end_date")
    private Date endBannedDate;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    public String getBannedId() {
        return bannedId;
    }

    public void setBannedId(String bannedId) {
        this.bannedId = bannedId;
    }

    public String getBannedIp() {
        return bannedIp;
    }

    public void setBannedIp(String bannedIp) {
        this.bannedIp = bannedIp;
    }

    public String getBannedAttack() {
        return bannedAttack;
    }

    public void setBannedAttack(String bannedAttack) {
        this.bannedAttack = bannedAttack;
    }

    public Integer getBannedStatus() {
        return bannedStatus;
    }

    public void setBannedStatus(Integer bannedStatus) {
        this.bannedStatus = bannedStatus;
    }

    public Date getStartBannedDate() {
        return startBannedDate;
    }

    public void setStartBannedDate(Date startBannedDate) {
        this.startBannedDate = startBannedDate;
    }

    public Date getEndBannedDate() {
        return endBannedDate;
    }

    public void setEndBannedDate(Date endBannedDate) {
        this.endBannedDate = endBannedDate;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
