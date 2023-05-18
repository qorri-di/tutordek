package com.qodev.domain;

import javax.persistence.*;

@Entity
@Table(name = "mst_stock", schema = "public")
public class MasterStock {
    @Id
    @SequenceGenerator(name = "mst_stock_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mst_stock_seq")
    @Column(name = "stock_id")
    private Integer stockId;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "stock_qty")
    private Integer stockQty;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getStockQty() {
        return stockQty;
    }

    public void setStockQty(Integer stockQty) {
        this.stockQty = stockQty;
    }
}
