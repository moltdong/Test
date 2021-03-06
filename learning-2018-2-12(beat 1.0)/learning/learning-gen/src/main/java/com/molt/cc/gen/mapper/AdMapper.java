package com.molt.cc.gen.mapper;

import com.molt.cc.gen.model.Ad;
import com.molt.cc.gen.model.AdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int countByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int deleteByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int insert(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int insertSelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    List<Ad> selectByExampleWithBLOBs(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    List<Ad> selectByExample(AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    Ad selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int updateByPrimaryKeySelective(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad
     *
     * @mbggenerated Sat Feb 10 19:27:25 CST 2018
     */
    int updateByPrimaryKey(Ad record);
}