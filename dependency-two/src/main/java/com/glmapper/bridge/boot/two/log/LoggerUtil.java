package com.glmapper.bridge.boot.two.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/14 10:33 AM
 * @since:
 **/
public class LoggerUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtil.class);

    public void info(String message){
        LOGGER.info(message);
    }

    public static Logger getLogger(){
        return LOGGER;
    }
}
