package org.towins.scss.action;

import org.forten.dto.Message;
import org.junit.Test;
import org.towins.scss.bo.CadreBo;

/**
 * Created by zhaoqiwang on 2018/1/29.
 */
public class CadreActionTest {
    private CadreBo bo;
    @Test
    public void doDelete() throws Exception {
        long[] iArray = new long[3];
        iArray[0] = 1;
        iArray[1] = 2;
        iArray[2] = 3;
        Message msg= bo.doDelect(iArray);
    }

}