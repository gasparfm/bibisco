package com.bibisco.dao.client;

import com.bibisco.dao.model.VScenes;
import com.bibisco.dao.model.VScenesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VScenesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    int countByExample(VScenesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    int deleteByExample(VScenesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    int insert(VScenes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    int insertSelective(VScenes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    List<VScenes> selectByExample(VScenesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    int updateByExampleSelective(@Param("record") VScenes record, @Param("example") VScenesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.V_SCENES
     *
     * @mbggenerated Sun May 25 01:18:25 CEST 2014
     */
    int updateByExample(@Param("record") VScenes record, @Param("example") VScenesExample example);
}