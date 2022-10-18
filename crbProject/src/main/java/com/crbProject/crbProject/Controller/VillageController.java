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

import com.crbProject.crbProject.Domain.Cell;
import com.crbProject.crbProject.Domain.Tcl554ASvillage;
import com.crbProject.crbProject.Service.CellService;
import com.crbProject.crbProject.Service.Tcl554ASvillageService;
import com.crbProject.crbProject.Utility.Messages;
import com.crbProject.crbProject.Utility.ResponseBean;
import com.crbProject.crbProject.innerDomain.InnerTcl554ASvillage;


@RestController
@CrossOrigin
@RequestMapping(value="/village")
public class VillageController {
	
	@Autowired
	private Tcl554ASvillageService villageservice;
	
	@Autowired
	private CellService cellservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/savevillage", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createVillage(HttpServletRequest request, @RequestBody InnerTcl554ASvillage village){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			Cell c=null;
			Optional<Cell> cell= cellservice.findByid(village.getCellid());
			
			if(cell.isPresent()) {
				c=cell.get();
			}
			Tcl554ASvillage vill = new Tcl554ASvillage();
			
			vill.setName(village.getName());
			vill.setCellid(c);
			
			villageservice.createTcl01Client(vill);
			
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(vill);	
				

			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	
	
	
	
	

}
