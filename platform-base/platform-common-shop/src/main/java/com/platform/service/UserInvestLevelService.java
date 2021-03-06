package com.platform.service;

import com.platform.entity.UserInvestLevelEntity;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * Service接口
 *
 * @author softopensell
 * @email softopensell@outlook.com
 * @date 2019-06-15 02:21:39
 */
public interface UserInvestLevelService {

    /**
     * 根据主键查询实体
     *
     * @param id 主键
     * @return 实体
     */
    UserInvestLevelEntity queryObject(Integer id);

    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<UserInvestLevelEntity> queryList(Map<String, Object> map);

    /**
     * 分页统计总数
     *
     * @param map 参数
     * @return 总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 保存实体
     *
     * @param userInvestLevel 实体
     * @return 保存条数
     */
    int save(UserInvestLevelEntity userInvestLevel);

    /**
     * 根据主键更新实体
     *
     * @param userInvestLevel 实体
     * @return 更新条数
     */
    int update(UserInvestLevelEntity userInvestLevel);

    /**
     * 根据主键删除
     *
     * @param id
     * @return 删除条数
     */
    int delete(Integer id);

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @return 删除条数
     */
    int deleteBatch(Integer[] ids);
    
    UserInvestLevelEntity queryByLevelType(Integer userLevelType);
}
