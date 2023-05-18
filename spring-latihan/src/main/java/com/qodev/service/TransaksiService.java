package com.qodev.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.qodev.domain.*;
import com.qodev.dto.GeneralResponse;
import com.qodev.dto.transaction.TrxRequest;
import com.qodev.dto.transaction.TrxResponse;
import com.qodev.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransaksiService {
    @Autowired
    private UserRepository usRepo;

    @Autowired
    private SpesificationRepository spekRepo;

    @Autowired
    private BrandRepository brandRepo;

    @Autowired
    private StockRepository stockRepo;

    public GeneralResponse saveTransaksi(TrxRequest request) throws JsonProcessingException {
        if (request.getId() == null){
            return createTransaksi(request);
        } else {
            return updateTransaksi(request);
        }

    }

    private GeneralResponse createTransaksi(TrxRequest request) throws JsonProcessingException {
        long start = System.currentTimeMillis();
        ObjectMapper objMapper = new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: START --------------------"));
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: REQUEST [[ %s ]] --------------------",objMapper.writeValueAsString(request)));
        GeneralResponse response = new GeneralResponse();

//        MasterBrand brand = brandRepo.findByBrandNameModel(request.getBrand().toLowerCase(), request.getModel().toLowerCase());
//        if (brand != null){
//            System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: Brand Route 1 --------------------"));
//
//            Integer idBrand = brand.getBrandId();
//            MasterSpesifikasi spek = spekRepo.findByBrandId(idBrand);
//            if (spek != null) {
//                response.setCode(500);
//                response.setMessage("DATA SUDAH ADA");
//                response.setData(null);
//
//                long stop = System.currentTimeMillis();
//                System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT ERROR [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
//                System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END ERROR %s ms --------------------", (stop - start)));
//                return response;
//            } else {
//                MasterSpesifikasi mstSpek = new MasterSpesifikasi();
//                mstSpek.setBrandId(idBrand);
//                mstSpek.setSpekPro(request.getProcessor());
//                mstSpek.setSpekRam(request.getRam());
//                mstSpek.setSpekHdd(request.getStorage());
//                mstSpek.setSpekVga(request.getGraphic_card());
//                spekRepo.save(mstSpek);
//
//                MasterStock stock = stockRepo.findByBrandId(idBrand);
//                if (stock != null) {
//                    response.setCode(500);
//                    response.setMessage("DATA SUDAH ADA");
//                    response.setData(null);
//
//                    long stop = System.currentTimeMillis();
//                    System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT ERROR [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
//                    System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END ERROR %s ms --------------------", (stop - start)));return response;
//                } else {
//                    MasterStock mstStock = new MasterStock();
//                    mstStock.setBrandId(idBrand);
//                    mstStock.setStockQty(request.getStock());
//                    stockRepo.save(mstStock);
//                }
//            }
//            request.setId(idBrand);
//            response.setCode(200);
//            response.setMessage("DATA SAVE SUCCESSFULLY");
//            response.setData(request);
//
//            long stop = System.currentTimeMillis();
//            System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
//            System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END %s ms --------------------", (stop - start)));
//            return response;
//        } else {
            System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: Brand Route 2 --------------------"));

            MasterBrand mstBrand = new MasterBrand();
            mstBrand.setBrandName(request.getBrand().trim().toString());
            mstBrand.setBrandModel(request.getModel().trim().toString());
            brandRepo.save(mstBrand);

            Integer idBrand = brandRepo.findByBrandNameModel(request.getBrand().toLowerCase(), request.getModel().toLowerCase()).getBrandId();
            MasterSpesifikasi spek = spekRepo.findByBrandId(idBrand);
            if (spek != null) {
                response.setCode(500);
                response.setMessage("DATA SUDAH ADA");
                response.setData(null);

                long stop = System.currentTimeMillis();
                System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT ERROR [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
                System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END ERROR %s ms --------------------", (stop - start)));
                return response;
            } else {
                MasterSpesifikasi mstSpek = new MasterSpesifikasi();
                mstSpek.setBrandId(idBrand);
                mstSpek.setSpekPro(request.getProcessor());
                mstSpek.setSpekRam(request.getRam());
                mstSpek.setSpekHdd(request.getStorage());
                mstSpek.setSpekVga(request.getGraphic_card());
                spekRepo.save(mstSpek);

                MasterStock stock = stockRepo.findByBrandId(idBrand);
                if (stock != null) {
                    response.setCode(500);
                    response.setMessage("DATA SUDAH ADA");
                    response.setData(null);

                    long stop = System.currentTimeMillis();
                    System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT ERROR [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
                    System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END ERROR %s ms --------------------", (stop - start)));return response;
                } else {
                    MasterStock mstStock = new MasterStock();
                    mstStock.setBrandId(idBrand);
                    mstStock.setStockQty(request.getStock());
                    stockRepo.save(mstStock);
                }
            }

            request.setId(idBrand);
            response.setCode(200);
            response.setMessage("DATA SAVE SUCCESSFULLY");
            response.setData(request);

            long stop = System.currentTimeMillis();
            System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
            System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END %s ms --------------------", (stop - start)));
            return response;
//        }
    }

    private GeneralResponse updateTransaksi(TrxRequest request) throws JsonProcessingException {
        long start = System.currentTimeMillis();
        ObjectMapper objMapper = new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: START --------------------"));
        GeneralResponse response = new GeneralResponse();

        long stop = System.currentTimeMillis();
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END %s ms --------------------", (stop - start)));
        return response;

    }

    public GeneralResponse detailById(Integer idBrand) throws JsonProcessingException {
        long start = System.currentTimeMillis();
        ObjectMapper objMapper = new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: START --------------------"));
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: REQUEST [[ %s ]] --------------------",idBrand));
        GeneralResponse response = new GeneralResponse();
        TrxResponse trxResponse = new TrxResponse();
        Optional<MasterBrand> check = brandRepo.findById(idBrand);
        if (check.isPresent()){
            MasterBrand brand = brandRepo.findByBrandId(idBrand);
            trxResponse.setId(brand.getBrandId());
            trxResponse.setBrand(brand.getBrandName());
            trxResponse.setModel(brand.getBrandModel());

            MasterSpesifikasi spek = spekRepo.findByBrandId(idBrand);
            if (spek != null){
//                trxResponse.setSpesifikasi(spek);
                trxResponse.setProcessor(spek.getSpekPro());
                trxResponse.setRam(spek.getSpekRam());
                trxResponse.setStorage(spek.getSpekHdd());
                trxResponse.setGraphic_card(spek.getSpekVga());
            }

            MasterStock stock = stockRepo.findByBrandId(idBrand);
            if (stock != null){
//                trxResponse.setStock(stock);
                trxResponse.setStock(stock.getStockQty());
            }
        }

        response.setCode(200);
        response.setData(trxResponse);
        response.setMessage("DATA BERHASIL DI GET DETAIL BY ID");

        long stop = System.currentTimeMillis();
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: RESULT [[ %s ]] --------------------",objMapper.writeValueAsString(response)));
        System.out.println(String.format("[[ Transaksi-Service ]]-------------------- createTransaksi: END %s ms --------------------", (stop - start)));
        return response;
    }

}
