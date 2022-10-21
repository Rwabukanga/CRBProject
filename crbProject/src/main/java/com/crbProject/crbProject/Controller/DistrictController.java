package com.crbProject.crbProject.Controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crbProject.crbProject.Domain.District;
import com.crbProject.crbProject.Domain.Province;
import com.crbProject.crbProject.Service.DistrictService;
import com.crbProject.crbProject.Service.ProvinceService;
import com.crbProject.crbProject.Utility.Messages;
import com.crbProject.crbProject.Utility.ResponseBean;
import com.crbProject.crbProject.innerDomain.InnerDistrict;

@RestController
@CrossOrigin
@RequestMapping(value="/district")
public class DistrictController {
	
	@Autowired
	private DistrictService districtservice;
	
	@Autowired
	private ProvinceService provinceservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/savedistrict", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerDistrict district){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			  Province c = null;
			
			  Optional<Province> p = provinceservice.findByid(district.getProvinceid());
			 
			 if(p.isPresent()) {
				 c = p.get();
			 }
			  
			  District d = new District();
			  
			  d.setName(district.getName());
			  d.setProvinceid(c);
			  
			  districtservice.createDistrict(d);
			  
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(d);	
				
	
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}
	

}
