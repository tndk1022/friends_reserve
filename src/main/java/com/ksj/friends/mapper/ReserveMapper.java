package com.ksj.friends.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ksj.firends.model.ReserveModel;

@Repository
@Mapper
public interface ReserveMapper {
	List<ReserveModel> getSalary();
}