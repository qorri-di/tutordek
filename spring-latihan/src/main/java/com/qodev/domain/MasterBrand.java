package com.qodev.domain;

import javax.persistence.*;

@Entity
@Table(name = "mst_brands", schema = "public")
public class MasterBrand {
    @Id
    @SequenceGenerator(name = "mst_brand_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mst_brand_seq")
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "brand_model")
    private String brandModel;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }
}
