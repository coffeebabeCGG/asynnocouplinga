package com.cgg.asynnocouplinga.dao;

import com.cgg.asynnocouplinga.entity.ZkStudy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author cgg
 */

@Repository
public interface ZkStudyRepository extends JpaRepository<ZkStudy, Long> {

    @Modifying
    @Query(value = "update zk_study z set z.active_time = ?2, z.name = ?3 where z.status = ?1", nativeQuery = true)
    int updateResource(String status, Date acTime, String name);

}
