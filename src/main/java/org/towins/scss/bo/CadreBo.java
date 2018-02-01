package org.towins.scss.bo;

import org.apache.ibatis.session.SqlSession;
import org.forten.dto.Message;
import org.forten.dto.PageInfo;
import org.forten.utils.system.BeanPropertyUtil;
import org.forten.utils.system.ValidateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.HibernateDao;
import org.towins.dao.MybatisDao;
import org.towins.scss.dao.CadreDao;
import org.towins.scss.dto.qo.CadreQoForHr;
import org.towins.scss.dto.vo.CadreForHr;
import org.towins.scss.dto.vo.CadreForHr2;
import org.towins.scss.dto.vo.QueryList;
import org.towins.scss.entity.Cadre;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CadreBo {
    @Resource
    private HibernateDao dao;
    @Resource
    private MybatisDao mdao;
    @Transactional
    public Message doSave(Cadre cadre){
        try {
            dao.save(cadre);
            return Message.info("人员信息保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error("保存失败");
        }
    }
    @Transactional(readOnly = true)
    public QueryList<CadreForHr> queryList(CadreQoForHr qo){
        long count = getCourseDao().queryCountForHr(qo);
        if(count==0){
            return new QueryList<CadreForHr>();
            }
        PageInfo pageInfo = PageInfo.getInstance(qo.getPageNo(),qo.getPageSize(),(int)count);
        qo.setFirst(pageInfo.getFirst());
        List<CadreForHr> list = getCourseDao().queryCadreForHr(qo);
        return new QueryList<>(list,pageInfo);
        }
    @Transactional
    public Message doupdate(CadreForHr ch){
        ValidateUtil.validateThrow(ch);
        try{
            Cadre cadre = dao.loadById(Cadre.class ,ch.getId());
            BeanPropertyUtil.copy(cadre ,ch);
            return Message.info("学员信息修改成功！");
        }catch (Exception e){
            e.printStackTrace();
            return Message.info("学员信息修改失败！");
        }
    }
    @Transactional
    public Message doDelect(long[] id ){
        try {
            int i =0;
            for (i=0;i<id.length;i++){
                Map<String, Object> params = new HashMap<>();
                params.put("id", id[i]);
                int a = dao.executeUpdate("DELETE FROM Cadre WHERE id=:id", params);
            }
            return Message.info("成功删除了" + i + "条数据");
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error("删除失败，请重试!!!");
        }
    }
    @Transactional(readOnly = true)
    public CadreForHr2 doSelect(long cid){
        Map<String, Object> params = new HashMap<>(1);
        String hql = "SELECT new org.towins.scss.dto.vo.CadreForHr2(id,name,employee_card,sex,tel,email) FROM Cadre WHERE id=:id ";
        params.put("id",cid);
        return dao.findOneBy(hql,params);
    }
    private CadreDao getCourseDao() {
        SqlSession session = mdao.openSession();
        return session.getMapper(CadreDao.class);
    }
}
