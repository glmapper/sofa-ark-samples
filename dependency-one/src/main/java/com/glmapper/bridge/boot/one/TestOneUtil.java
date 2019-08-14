package com.glmapper.bridge.boot.one;

import com.glmapper.bridge.boot.IncompatibleUtil;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/13 9:19 PM
 * @since:
 **/
public class TestOneUtil {
    public String testOne(){
        return IncompatibleUtil.test1()+IncompatibleUtil.test2();
    }
}
