package com.qtone.hdkt.dao.classes;

import com.qtone.hdkt.model.classes.Class;
import com.qtone.hdkt.model.classes.ClassExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    int countByExample(ClassExample example);

    int deleteByExample(ClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Class record);

    int insertSelective(Class record);

    List<Class> selectByExampleWithBLOBs(ClassExample example);

    List<Class> selectByExample(ClassExample example);

    Class selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByExampleWithBLOBs(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKeyWithBLOBs(Class record);

    int updateByPrimaryKey(Class record);
    /**
	 * 获取课程列表 
	 * @author  yuanjinxin
	 * @date:   2018年6月20日  下午13:28:45
	 * @param   classType  课程类型 1直播课 2面授课
	 * @param   orgId       机构id
	 * @return: List
	 */
 	List<Map<String, Object>> getClassListByType(Map<String, Object> paramMap);

 	/**
	 * 根据课程id获取课程详情 （未报名课程列表）
	 * @author  yuanjinxin
	 * @date:   2018年9月3日 下午14:26:41 
	 * @param   classId 班级id
	 * @return: map
	 */
	Map<String, Object> getclassDetail(@Param("classId")Integer classId, @Param("studentId")Integer studentId);
	
	 /**
	 * 获取我的课程列表 
	 * @author  yuanjinxin
	 * @date:   2018年6月20日  下午13:28:45
	 * @param   classType  课程类型 1直播课 2面授课
	 * @param   studentId  
	 * @param   orgId       机构id
	 * @return: List
	 */
 	List<Map<String, Object>> getMyClassListV2(Map<String, Object> paramMap);
 	
 	/**
	 * 根据课程id获取课程详情 （已报名课程列表）
	 * @author  yuanjinxin
	 * @date:   2018年9月6日 下午14:57:41 
	 * @param   classId 班级id
	 * @return: ResponseDto
	 * @throws BusinessException 
	 */
 	Map<String,Object> getMyClassDetail(@Param("classId")Integer classId,@Param("studentId")Integer studentId);
 	
 	/**
	 * 查询即将开始的课节信息
	 * @author  yuanjinxin
	 * @date:   2018年9月6日 下午16:42:41 
	 * @param   classId 课程id
	 * @return: map
	 */
    Map<String,Object> getFutureLesson(@Param("classId")Integer classId);
    
    /**
	 * 查询课程的每节课信息
	 * @author  yuanjinxin
	 * @date:   2018年9月7日 上午9:53:41
	 * @param   classId 班级id
	 * @return: List
	 */
    List<Map<String,Object>> getLessonList(@Param("classId")Integer classId,@Param("studentId")Integer studentId);
    
    /**
	 * 查询当前机构下是否有此课程信息
	 * @author  yuanjinxin
	 * @date:   2018年9月7日 上午9:54:41
	 * @param   orgId       机构id
	 * @return: List
	 */
	int getClassIdByOrgId(@Param("orgId")Integer orgId,@Param("classId")Integer classId);
	
	/**
	 * 查询此课程下是否有此课程
	 * @author  yuanjinxin
	 * @date:   2018年6月20日 上午10:28:45
	 * @param   classId   班级id
	 * @param   courseCode 课程code
	 * @return: map
	 */
    Integer getCourseCode(Map<String, Object> paramMap);
    
    /**
   	 *查看学生是否报过此门课程
   	 * @author  yuanjinxin
   	 * @date:   2018年6月20日 上午10:28:45
   	 * @param   classId   班级id
   	 * @param   courseCode 课程code
   	 * @param   studentId  学生Id
   	 * @return: int
   	 */
     int selectIsApply(Map<String, Object> paramMap);
     
     /**
 	 * 查询当前课程最大uid
 	 * @author  yuanjinxin
 	 * @date:   2018年8月27日 下午15:56:45
 	 * @param   classId   班级id
 	 * @return: int
 	 */
     Integer selectMaxUid(@Param("classId")Integer classId);
     
     /**
 	 * 给学生添加课程
 	 * @author  yuanjinxin
 	 * @date:   2018年6月20日 上午10:28:45
 	 * @param   classId   班级id
 	 * @param   courseCode 课程code
 	 * @param   studentId  学生Id
 	 * @return: int
 	 */
     int saveStudentClass(Map<String, Object> paramMap);
     
     /**
 	 * 修改课程码使用状态
 	 * @author  yuanjinxin
 	 * @date:   2018年6月20日 上午10:28:45
 	 * @param   classId   班级id
 	 * @param   courseCode 课程code
 	 * @param   studentId  学生Id
 	 * @return: int
 	 */
     int updateCourseCodeUseStatus(Map<String, Object> paramMap);
     
     /**
 	 * 修改课程报名人数
 	 * @author  yuanjinxin
 	 * @date:   2018年6月20日 上午10:28:45
 	 * @param   classId   班级id
 	 * @return: int
 	 */
     int saveClassEnrollment(@Param("classId")Integer classId);
     
     /**
 	 * 修改课程是否报满状态
 	 * @author  yuanjinxin
 	 * @date:   2018年6月20日 上午10:28:45
 	 * @param   classId   班级id
 	 * @param   fullStatus 班级状态
 	 * 
 	 * @return: int
 	 */
     int updateFullStatus(@Param("classId")Integer classId,@Param("fullStatus")Integer fullStatus);

 	/**
 	 * 
 	 * @Title: listClass   
 	 * @Description: TODO
 	 * @param paramMap
 	 * @return
 	 * @return: List<Map<String,Object>>    
 	 * @author: weili
 	 * @date: 2018年9月6日 上午10:25:28
 	 * @throws
 	 */
	List<Map<String, Object>> listClass(Map<String, Object> paramMap);

	/**
	 * 
	 * @Title: getLessonByclassId   
	 * @Description: 查询class下的lesson
	 * @param cid
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午5:36:56
	 * @throws
	 */
	List<Integer> getLessonByclassId(int cid);

	/**
	 * 
	 * @Title: getLessonClasstestIdByLessonId   
	 * @Description: 根据lessonid查询随堂测
	 * @param lessonId
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午5:44:08
	 * @throws
	 */
	List<Integer> getLessonClasstestIdByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonClasstestProblemAnswerBylessonClasstestId   
	 * @Description: 删除学生对随堂检测的题目中的答案
	 * @param lessonClasstestId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午5:53:19
	 * @throws
	 */
	void deleteLessonClasstestProblemAnswerBylessonClasstestId(int lessonClasstestId);

	/**
	 * 
	 * @Title: deleteLessonAnswerWayByLessonId   
	 * @Description: 删除答题方式表
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午5:59:17
	 * @throws
	 */
	void deleteLessonAnswerWayByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonClasstestByLessonId   
	 * @Description: 删除课程中的随堂检测
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:01:20
	 * @throws
	 */
	void deleteLessonClasstestByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonCoursewareByLessonId   
	 * @Description: 删除课程使用的课件
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:03:44
	 * @throws
	 */
	void deleteLessonCoursewareByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonHomeworkByLessonId   
	 * @Description: 删除课程中使用的作业
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:05:17
	 * @throws
	 */
	void deleteLessonHomeworkByLessonId(int lessonId);

	/**
	 * 
	 * @Title: getLessonHomeworkIdByLessonId   
	 * @Description: 获取课程中使用的作业ids
	 * @param lessonId
	 * @return
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:09:50
	 * @throws
	 */
	List<Integer> getLessonHomeworkIdByLessonId(int lessonId);

	/**
	 * 
	 * @Title: getLessonHomeworkStudentIdBylessonHomeworkId   
	 * @Description: 获取课程中学生的作业以及状态
	 * @param lessonHomeworkId
	 * @return
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:15:02
	 * @throws
	 */
	List<Integer> getLessonHomeworkStudentIdBylessonHomeworkId(int lessonHomeworkId);

	/**
	 * 
	 * @Title: deleteLessonHomeworkStudentByLessonHomeworkId   
	 * @Description: 删除课程中学生的作业以及状态
	 * @param lessonHomeworkId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:28:32
	 * @throws
	 */
	void deleteLessonHomeworkStudentByLessonHomeworkId(int lessonHomeworkId);

	/**
	 * 
	 * @Title: deleteLessonHomeworkStudentProblemByLessonHomeworkStudentId   
	 * @Description: 删除学生的题目
	 * @param lessonHomeworkStudentId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:31:55
	 * @throws
	 */
	void deleteLessonHomeworkStudentProblemByLessonHomeworkStudentId(int lessonHomeworkStudentId);

	/**
	 * 
	 * @Title: deleteLessonPaperByLessonId   
	 * @Description: 删除课程使用的试卷
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:35:26
	 * @throws
	 */
	void deleteLessonPaperByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonPictureByLessonId   
	 * @Description: 删除课程中保存的课堂截图
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:37:28
	 * @throws
	 */
	void deleteLessonPictureByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonPraiseByLessonId   
	 * @Description: 删除课程表扬记录
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:40:19
	 * @throws
	 */
	void deleteLessonPraiseByLessonId(int lessonId);

	/**
	 * 
	 * @Title: deleteLessonStoryBookByLessonId   
	 * @Description: 删除课程中选择的作业绘本
	 * @param lessonId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:42:56
	 * @throws
	 */
	void deleteLessonStoryBookByLessonId(int lessonId);

	/**
	 * 
	 * @Title: getLessonStoryBookIdByLessonId   
	 * @Description: 获取课程中选择的作业绘本id
	 * @param lessonId
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午6:47:23
	 * @throws
	 */
	List<Integer> getLessonStoryBookIdByLessonId(int lessonId);

	/**
	 * 
	 * @Title: getlessonStoryBookStudentIdByLessonStoryBookId   
	 * @Description: 获取学生的课程中的故事绘本
	 * @param lessonStoryBookId
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:07:08
	 * @throws
	 */
	List<Integer> getlessonStoryBookStudentIdByLessonStoryBookId(int lessonStoryBookId);

	/**
	 * 
	 * @Title: deleteLessonStoryBookStudentByLessonStoryBookId  
	 * @Description: 删除学生的课程中的故事绘本
	 * @param lessonStoryBookId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:10:51
	 * @throws
	 */
	void deleteLessonStoryBookStudentByLessonStoryBookId(int lessonStoryBookId);

	/**
	 * 
	 * @Title: deleteLessonStoryBookStudentProblemByLessonStoryBookStudentId   
	 * @Description: 删除课程中作业绘本的学生答案
	 * @param lessonStoryBookStudentId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:19:56
	 * @throws
	 */
	void deleteLessonStoryBookStudentProblemByLessonStoryBookStudentId(int lessonStoryBookStudentId);

	/**
	 * 
	 * @Title: getLessonStoryBookStudentProblemIdByLessonStoryBookStudentId   
	 * @Description: 课程中作业绘本的学生答案
	 * @param lessonStoryBookStudentId
	 * @return: List<Integer>    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:23:52
	 * @throws
	 */
	List<Integer> getLessonStoryBookStudentProblemIdByLessonStoryBookStudentId(int lessonStoryBookStudentId);

	/**
	 * 
	 * @Title: deleteLessonStoryBookStudentProblemAnswerByLessonStoryBookStudentProblemId   
	 * @Description: 删除学生绘本故事中电子教材的答案
	 * @param lessonStoryBookStudentProblemId
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:27:35
	 * @throws
	 */
	void deleteLessonStoryBookStudentProblemAnswerByLessonStoryBookStudentProblemId(
			int lessonStoryBookStudentProblemId);

	/**
	 * 
	 * @Title: deleteClassDateBycid   
	 * @Description:  删除班级的上课日期 
	 * @param cid
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:40:38
	 * @throws
	 */
	void deleteClassDateBycid(int cid);

	/**
	 * 
	 * @Title: deleteClassCodeBycid   
	 * @Description: 删除课程中的课程码
	 * @param cid
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:42:31
	 * @throws
	 */
	void deleteClassCodeBycid(int cid);

	/**
	 * 
	 * @Title: deleteClassLessonBycid   
	 * @Description: 删除班级中的课程每节课
	 * @param cid
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:43:34
	 * @throws
	 */
	void deleteClassLessonBycid(int cid);

	/**
	 * 
	 * @Title: deleteClassStudentBycid   
	 * @Description: 删除参加课程的学生
	 * @param cid
	 * @return: void    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:44:52
	 * @throws
	 */
	void deleteClassStudentBycid(int cid);

	/**
	 * 
	 * @Title: deleteClassBycid   
	 * @Description: 删除班级
	 * @param cid
	 * @return
	 * @return: int    
	 * @author: weili
	 * @date: 2018年9月6日 下午7:46:05
	 * @throws
	 */
	int deleteClassBycid(int cid);
 	
 	/**
 	 * @author huari
 	 * @time 2018年9月6日下午4:41:07
 	 * @Description 授课-我的班级(分页)--教师所属
 	 * @param teacherId
 	 * @return
 	 */
 	List<Map<String, Object>> teacherClassList(@Param("teacherId") Integer teacherId);
 	
 	/**
 	 * @author huari
 	 * @time 2018年9月6日下午5:43:11
 	 * @Description 获取该班级详情信息
 	 * @param classId
 	 * @return
 	 */
 	Map<String,Object> getClassDetail(@Param("classId") Integer classId);
 	
 	/**
 	 * @author huari
 	 * @time 2018年9月6日下午5:57:09
 	 * @Description 根据班级id获取小节课信息
 	 * @param classId
 	 * @return
 	 */
 	List<Map<String,Object>> getClassLessonByClassId(@Param("classId") Integer classId);
 	
 	/**
 	 * @author huari
 	 * @time 2018年9月7日下午5:22:23
 	 * @Description 获取小节课—班级的信息
 	 * @param lessonId
 	 * @return
 	 */
 	Map<String,Object> getInfoByLessonId(@Param("lessonId") Integer lessonId);

 	/**
 	 * 
 	 * @Title: getClassCodeByClassId   
 	 * @Description: 根据班级id获取课程码
 	 * @param classId
 	 * @return
 	 * @return: List<Map<String,Object>>    
 	 * @author: weili
 	 * @date: 2018年9月7日 上午10:56:23
 	 * @throws
 	 */
	List<Map<String, Object>> getClassCodeByClassId(Integer classId);

	/**
	 * 
	 * @Title: getClassInfo   
	 * @Description: 获取班级基本信息
	 * @param classId
	 * @return: Map<String,Object>    
	 * @author: weili
	 * @date: 2018年9月7日 下午2:29:09
	 * @throws
	 */
	Map<String, Object> getClassInfo(Integer classId);

	/**
	 * 
	 * @Title: creatCourse   
	 * @Description: 创建班级
	 * @param paramMap
	 * @return: int    
	 * @author: weili
	 * @date: 2018年9月10日 下午5:52:38
	 * @throws
	 */
	int creatCourse(Map<String, Object> paramMap);

	/**
	 * 
	 * @Title: updateCodeByid   
	 * @Description: 级联更新code
	 * @param id
	 * @param string
	 * @return
	 * @return: Integer    
	 * @author: weili
	 * @date: 2018年9月10日 下午6:38:22
	 * @throws
	 */
	Integer updateCodeByid(@Param("id")Integer id, @Param("code")String code);

	/**
	 * 
	 * @Title: saveClassDateId   
	 * @Description: 更新classdateid
	 * @param classId
	 * @param classDateId
	 * @return
	 * @return: Integer    
	 * @author: weili
	 * @date: 2018年9月10日 下午9:02:31
	 * @throws
	 */
	Integer saveClassDateId(int classId, int classDateId);


	/**
 	 * 
 	 * @Description: 根据lessonid查询班级名称code
 	 * @param lessonId  
 	 * @author: yuanjinxin
 	 * @date: 2018年9月7日 上午10:56:23
 	 */
	Map<String, Object> getClassNameByLessonId(Integer lessonId);
}