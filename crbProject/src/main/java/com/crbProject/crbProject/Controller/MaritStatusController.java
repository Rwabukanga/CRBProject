package com.crbProject.crbProject.Controller;

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

import com.crbProject.crbProject.Domain.Tcl550MaritStatus;
import com.crbProject.crbProject.Service.Tcl550MaritStatusService;
import com.crbProject.crbProject.Utility.Messages;
import com.crbProject.crbProject.Utility.ResponseBean;
import com.crbProject.crbProject.innerDomain.InnerMaritStatus;


@RestController
@CrossOrigin
@RequestMapping(value="/martalstatus")
public class MaritStatusController {
	
	
	@Autowired
	private Tcl550MaritStatusService martservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/savemartalstatus", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createVillage(HttpServletRequest request, @RequestBody InnerMaritStatus martalstaus){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			
			
			Tcl550MaritStatus mart = new Tcl550MaritStatus();
			
			mart.setName(martalstaus.getName());
			
			martservice.createMartalStatus(mart);
			
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(mart);	
				

			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	

}
