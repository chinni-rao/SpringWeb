package com.springweb.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.beans.Student;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "admissionForm")
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value = "admissionFormMA")
	public ModelAndView getAdmissionFormMA(){
		ModelAndView model = new ModelAndView("AdmissionFormModelAttr");
		return model;
	}
//	@RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST)
//	public ModelAndView submitAdmissionForm(@RequestParam(name="studentName") String studentName, @RequestParam(name="studentHobby") String studentHobby){
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("message", "Details submitted by you:: Name: "+studentName+ ", Hobby: " + studentHobby);
//		return model;
//	}
	
	@RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> paramMap){
		String studentName = paramMap.get("studentName");
		String studentHobby = paramMap.get("studentHobby");
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("message", "Details submitted by you:: Name: "+studentName+ ", Hobby: " + studentHobby);
		return model;
	}
	
	@RequestMapping(value = "submitAdmissionFormModelAttr.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormModel(@ModelAttribute("student1")Student student){
				
		ModelAndView model = new ModelAndView("AdmissionSuccessModel");
		return model;
	}
}
