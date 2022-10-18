package com.crbProject.crbProject.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crbProject.crbProject.Domain.Gender;
import com.crbProject.crbProject.Service.GenderService;
import com.crbProject.crbProject.Utility.Messages;
import com.crbProject.crbProject.Utility.ResponseBean;
import com.crbProject.crbProject.innerDomain.InnerGender;


@Controller
@CrossOrigin
@RequestMapping(value="/gender")
public class GenderController {

	@Autowired
	private GenderService genderservice;
	
	

	@CrossOrigin
	@RequestMapping(value="/savegender", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerGender gender){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			  Gender c = new Gender();
			
			   c.setName(gender.getName());
			
			   genderservice.createGender(c);
			
			    rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(c);	
				
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}
	
	
	
}
