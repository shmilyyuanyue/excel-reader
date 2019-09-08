package com.shmily.excelreader.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ExcelBaseVO implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(ExcelBaseVO.class);

    private String name;

    private Map<String,Object> baseInfo = new HashMap<String, Object>();

    public Object getAttribute(String key){
        Object object = null;
        object = baseInfo.get(key);
        if (object==null){
            logger.error("获取属性失败，该属性值不存在！");
        }
        return object;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(Map<String, Object> baseInfo) {
        this.baseInfo = baseInfo;
    }
}
