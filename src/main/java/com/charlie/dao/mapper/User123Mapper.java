package com.charlie.dao.mapper;

import com.charlie.entity.User123;
import com.charlie.entity.User123Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User123Mapper {
    long countByExample(User123Example example);

    int deleteByExample(User123Example example);

    int insert(User123 record);

    int insertSelective(User123 record);

    List<User123> selectByExample(User123Example example);

    int updateByExampleSelective(@Param("record") User123 record, @Param("example") User123Example example);

    int updateByExample(@Param("record") User123 record, @Param("example") User123Example example);
}