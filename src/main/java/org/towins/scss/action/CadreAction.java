package org.towins.scss.action;

import org.forten.dto.Message;
import org.forten.utils.system.ValidateUtil;
import org.springframework.web.bind.annotation.*;
import org.towins.scss.bo.CadreBo;
import org.towins.scss.dto.qo.CadreQoForHr;
import org.towins.scss.dto.vo.CadreForHr;
import org.towins.scss.dto.vo.CadreForHr2;
import org.towins.scss.dto.vo.QueryList;
import org.towins.scss.entity.Cadre;

import javax.annotation.Resource;

@RestController
public class CadreAction {
    @Resource
    private CadreBo bo;
    @PostMapping ("cadre/save")
    public
    Message doSave(@RequestBody Cadre cadre){
        ValidateUtil.validateThrow(cadre);
        return bo.doSave(cadre);
    }
    @PostMapping("cadre/list")
    public
    QueryList<CadreForHr> queryList(@RequestBody CadreQoForHr qo){
        return bo.queryList(qo);
    }
    @GetMapping("cadre/selectCadre{cId}")
    public CadreForHr2 doSelect(@PathVariable long cId){
        return bo.doSelect(cId);
    }
    @PostMapping("cadre/update")
    public Message doUpdate(CadreForHr ch){
        ValidateUtil.validateThrow(ch);
        return bo.doupdate(ch);
    }
    @DeleteMapping ("cadre/del")
    public Message doDelete(@RequestBody long[] id){
        return bo.doDelect(id);
    }

}
