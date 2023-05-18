package com.qodev.domain;

import javax.persistence.*;

@Entity
@Table(name = "mst_spesifikasi", schema = "public")
public class MasterSpesifikasi {
    @Id
    @SequenceGenerator(name = "mst_spek_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mst_spek_seq")
    @Column(name = "spek_id")
    private Integer spekId;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "spek_processor")
    private String spekPro;

    @Column(name = "spek_ram")
    private String spekRam;

    @Column(name = "spek_storage")
    private String spekHdd;

    @Column(name = "spek_vga")
    private String spekVga;

    public Integer getSpekId() {
        return spekId;
    }

    public void setSpekId(Integer spekId) {
        this.spekId = spekId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getSpekPro() {
        return spekPro;
    }

    public void setSpekPro(String spekPro) {
        this.spekPro = spekPro;
    }

    public String getSpekRam() {
        return spekRam;
    }

    public void setSpekRam(String spekRam) {
        this.spekRam = spekRam;
    }

    public String getSpekHdd() {
        return spekHdd;
    }

    public void setSpekHdd(String spekHdd) {
        this.spekHdd = spekHdd;
    }

    public String getSpekVga() {
        return spekVga;
    }

    public void setSpekVga(String spekVga) {
        this.spekVga = spekVga;
    }
}
