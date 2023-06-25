package id.contools.domain.masterdata;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mst_price_details", schema = "public")
public class mstPriceDetails extends PanacheEntityBase {
    @Id
    @Column(name = "price_detail_id")
    private String priceDetailId;

    @Column(name = "price_detail_name")
    private String priceDetailName;

    @Column(name = "price_id")
    private String priceId;

    @Column(name = "price_detail_status")
    private Integer priceDetailStatus;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    public String getPriceDetailId() {
        return priceDetailId;
    }

    public void setPriceDetailId(String priceDetailId) {
        this.priceDetailId = priceDetailId;
    }

    public String getPriceDetailName() {
        return priceDetailName;
    }

    public void setPriceDetailName(String priceDetailName) {
        this.priceDetailName = priceDetailName;
    }

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public Integer getPriceDetailStatus() {
        return priceDetailStatus;
    }

    public void setPriceDetailStatus(Integer priceDetailStatus) {
        this.priceDetailStatus = priceDetailStatus;
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
