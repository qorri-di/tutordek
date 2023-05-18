package com.qodev.dto.transaction;

import com.qodev.domain.MasterSpesifikasi;
import com.qodev.domain.MasterStock;

import java.util.List;

public class TrxResponse {
    private Integer id;

    private String brand;

    private String model;

//    private MasterSpesifikasi spesifikasi;
//
//    private MasterStock stock;

    private String processor;

    private String ram;

    private String storage;

    private String graphic_card;

    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public MasterSpesifikasi getSpesifikasi() {
//        return spesifikasi;
//    }
//
//    public void setSpesifikasi(MasterSpesifikasi spesifikasi) {
//        this.spesifikasi = spesifikasi;
//    }

//    public MasterStock getStock() {
//        return stock;
//    }

//    public void setStock(MasterStock stock) {
//        this.stock = stock;
//    }

        public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGraphic_card() {
        return graphic_card;
    }

    public void setGraphic_card(String graphic_card) {
        this.graphic_card = graphic_card;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
