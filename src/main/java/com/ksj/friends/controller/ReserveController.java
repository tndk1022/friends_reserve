package com.ksj.friends.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ksj.firends.model.ReserveModel;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ReserveController {
	@RequestMapping(value = "/main", method=RequestMethod.GET)
	public ModelAndView goReserve (HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		//salary 객체 리스트 변수
		List<ReserveModel> reserveList = new ArrayList<ReserveModel>();
		
		
		//Salary model
		ReserveModel ReserveModel = new ReserveModel();
		
		// 첫 번째 데이터
		ReserveModel = new ReserveModel();
		ReserveModel.setName("aaaa");
		reserveList.add(ReserveModel);
		
		
		mav.addObject("reserveList",reserveList);
		mav.setViewName("index");
		
		return mav;
	}
}
