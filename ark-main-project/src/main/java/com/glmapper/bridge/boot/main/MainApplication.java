package com.glmapper.bridge.boot.main;

import com.glmapper.bridge.boot.one.TestOneUtil;
import com.glmapper.bridge.boot.two.TestTwoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/13 10:00 PM
 * @since:
 **/
@SpringBootApplication
public class MainApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
        test("test");
    }

    public static void test(String param) {

        LOGGER.info("test in biz.");

        if (!StringUtils.isEmpty(param)){
            TestOneUtil testOneUtil = new TestOneUtil();
            System.out.println(testOneUtil.testOne());
            TestTwoUtil testTwoUtil = new TestTwoUtil();
            System.out.println(testTwoUtil.testTwo(param));
        }
        else {
            System.out.println("no params");
        }
    }
}
