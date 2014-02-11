package com.bibisco.dao.client;

import com.bibisco.dao.model.Projects;
import com.bibisco.dao.model.ProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int countByExample(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int deleteByExample(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int deleteByPrimaryKey(String idProject);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int insert(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int insertSelective(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	List<Projects> selectByExample(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	Projects selectByPrimaryKey(String idProject);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int updateByExampleSelective(@Param("record") Projects record, @Param("example") ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int updateByExample(@Param("record") Projects record, @Param("example") ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int updateByPrimaryKeySelective(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECTS
	 * @mbggenerated  Fri Aug 09 07:59:47 CEST 2013
	 */
	int updateByPrimaryKey(Projects record);
}