package com.ygy.mapper;

import com.ygy.model.Log;
import com.ygy.model.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LogMapper {
   void insertLog(Log log);
   List<Log> selectBean(Log log);
   void delet(Log log);
}