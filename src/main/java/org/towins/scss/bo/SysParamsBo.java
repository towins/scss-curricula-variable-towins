package org.towins.scss.bo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.HibernateDao;
import org.towins.scss.entity.SysParams;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysParamsBo {
    @Resource
    private HibernateDao dao;

    @Transactional(readOnly = true)
    public List<SysParams> queryAll(){
        return dao.findAll(SysParams.class);
    }
}
