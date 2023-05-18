package com.qodev.repository;

import com.qodev.domain.MasterSpesifikasi;
import com.qodev.domain.MasterStock;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends PagingAndSortingRepository<MasterStock, Integer> {

    @Query(value = "select ms.* from mst_stock ms where ms.brand_id= :brandId",nativeQuery = true)
    MasterStock findByBrandId(@Param("brandId") Integer brandId);
    
}
