package com.zbsnetwork.zbsjava.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ZbsJsonMapper extends ObjectMapper {
    public ZbsJsonMapper(byte chainId) {
        registerModule(new ZbsModule(chainId, this));
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
