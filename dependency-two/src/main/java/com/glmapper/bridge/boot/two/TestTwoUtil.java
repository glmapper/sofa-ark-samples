package com.glmapper.bridge.boot.two;

import com.glmapper.bridge.boot.IncompatibleUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/13 9:21 PM
 * @since:
 **/
public class TestTwoUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestTwoUtil.class);

    public String testTwo(String param){
        LOGGER.info("test in plugin");
        if (StringUtils.isEmpty(param)){
            return IncompatibleUtil.test1() + IncompatibleUtil.test3();
        } else {
            return IncompatibleUtil.test1() + IncompatibleUtil.test3();
        }
    }
}
