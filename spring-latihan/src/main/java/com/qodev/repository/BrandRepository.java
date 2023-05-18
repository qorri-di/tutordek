package com.qodev.repository;

import com.qodev.domain.MasterBrand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends PagingAndSortingRepository<MasterBrand, Integer> {

    @Query(value = "select mb.* from mst_brands mb where lower(mb.brand_name) = :brandName and lower(mb.brand_model) = :brandModel",nativeQuery = true)
    MasterBrand findByBrandNameModel(@Param("brandName") String brandName, @Param("brandModel") String brandModel);

    @Query(value = "select mb.* from mst_brands mb where mb.brand_id = :brandId",nativeQuery = true)
    MasterBrand findByBrandId(@Param("brandId") Integer brandId);


}
