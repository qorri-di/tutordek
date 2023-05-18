package com.qodev.repository;

import com.qodev.domain.MasterBrand;
import com.qodev.domain.MasterSpesifikasi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpesificationRepository extends PagingAndSortingRepository<MasterSpesifikasi, Integer> {
    @Query(value = "select ms.* from mst_spesifikasi ms where ms.brand_id= :brandId",nativeQuery = true)
    MasterSpesifikasi findByBrandId(@Param("brandId") Integer brandId);
}
