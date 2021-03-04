package com.cgg.asynnocouplinga.service;

import com.cgg.asynnocouplinga.dto.RestResult;

public interface IRsService {

    RestResult<Object> setResource(String status, Long acTime, String name);

    RestResult<Object> getResource(String status);

    RestResult<Object> updateResource(String status, Long acTime, String name);

    RestResult<Object> getSetResource(String status);
}
