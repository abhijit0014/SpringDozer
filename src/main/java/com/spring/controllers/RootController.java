package com.spring.controllers;


import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dto.EmployeeDTO;
import com.spring.entities.EmployeeEntity;

@Controller
public class RootController {

	@ResponseBody
	@RequestMapping("/")
	public void home()
	{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setName("Abhijit");
		employeeDTO.setCity("Kolkata");
		employeeDTO.setAge(25);
		
		
		Mapper mapper = new DozerBeanMapper();
		EmployeeEntity employeeEntity = mapper.map(employeeDTO, EmployeeEntity.class);
		
		
		final Logger log = LoggerFactory.getLogger(RootController.class);
		log.info("name = "+employeeEntity.getName());
	}
}
