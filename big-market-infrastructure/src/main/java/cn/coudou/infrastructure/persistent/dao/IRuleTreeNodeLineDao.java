package cn.coudou.infrastructure.persistent.dao;

import cn.coudou.infrastructure.persistent.po.RuleTreeNode;
import cn.coudou.infrastructure.persistent.po.RuleTreeNodeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IRuleTreeNodeLineDao {

    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);

}

