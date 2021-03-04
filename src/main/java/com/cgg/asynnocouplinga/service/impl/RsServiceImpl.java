package com.cgg.asynnocouplinga.service.impl;


import com.cgg.asynnocouplinga.dao.ZkStudyRepository;
import com.cgg.asynnocouplinga.dto.RestResult;
import com.cgg.asynnocouplinga.entity.ZkStudy;
import com.cgg.asynnocouplinga.service.IRsService;
import com.cgg.asynnocouplinga.utils.UuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class RsServiceImpl implements IRsService {

    @Resource
    private ZkStudyRepository zkStudyRepository;


    @Resource
    private Environment environment;

    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public RestResult<Object> setResource(String status, Long acTime, String name) {
        ZkStudy zkStudy = new ZkStudy();
        zkStudy.setId(UuidUtil.uuid());
        zkStudy.setName(name);
        zkStudy.setStatus(status);
        zkStudy.setActiveTime(new Date(acTime));
        zkStudyRepository.save(zkStudy);
        return RestResult.success();
    }

    @Override
    public RestResult<Object> getResource(String status) {
        log.info("start search resource");
        List<ZkStudy> list = zkStudyRepository.findAll();
        return RestResult.success(list);
    }

    @Override
    public RestResult<Object> updateResource(String status, Long acTime, String name) {
        int count = zkStudyRepository.updateResource(status, new Date(acTime), name);
        return RestResult.success(count);
    }

    @Override
    public RestResult<Object> getSetResource(String status) {
        log.info("start search set resource");
        List<ZkStudy> list = zkStudyRepository.findAll();
        return RestResult.success(list);
    }
}


