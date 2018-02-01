package org.towins.scss.dao;

import org.towins.scss.dto.qo.CadreQoForHr;
import org.towins.scss.dto.vo.CadreForHr;

import java.util.List;

public interface CadreDao {
    long queryCountForHr(CadreQoForHr qo);
    List<CadreForHr> queryCadreForHr(CadreQoForHr qo);
}
