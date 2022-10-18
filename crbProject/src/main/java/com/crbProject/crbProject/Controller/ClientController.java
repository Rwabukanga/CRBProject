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

import com.crbProject.crbProject.Domain.Country;
import com.crbProject.crbProject.Domain.Gender;
import com.crbProject.crbProject.Domain.Tcl01Client;
import com.crbProject.crbProject.Domain.Tcl550MaritStatus;
import com.crbProject.crbProject.Domain.Tcl554ASvillage;
import com.crbProject.crbProject.Service.CountryService;
import com.crbProject.crbProject.Service.GenderService;
import com.crbProject.crbProject.Service.Tcl01ClientService;
import com.crbProject.crbProject.Service.Tcl550MaritStatusService;
import com.crbProject.crbProject.Service.Tcl554ASvillageService;
import com.crbProject.crbProject.Utility.Messages;
import com.crbProject.crbProject.Utility.ResponseBean;
import com.crbProject.crbProject.innerDomain.InnerTcl01Client;

@RestController
@CrossOrigin
@RequestMapping(value="/client")
public class ClientController {
	
	@Autowired
	private Tcl01ClientService clientservice;
	
	@Autowired
	private CountryService countryservice;
	
	@Autowired
	private GenderService genderservice;
	
	@Autowired
	private Tcl550MaritStatusService martservice;
	
	@Autowired
	private Tcl554ASvillageService villageservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/saveclient", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createClient(HttpServletRequest request, @RequestBody InnerTcl01Client client){
		
		ResponseBean rb = new ResponseBean();
		try {
			
		Country c=null;
		Tcl550MaritStatus status=null;
		Gender g=null;
		Tcl554ASvillage vill= null;
		
			Optional<Country> country = countryservice.findByid(client.getCountryid());
			if(country.isPresent()) {
				 c = country.get();
				
			}
            
			Optional<Tcl550MaritStatus> mart = martservice.findByid(client.getMaritstatusid());
			if(mart.isPresent()) {
				status = mart.get();
			}
			
			Optional<Gender> gender = genderservice.findByid(client.getGenderid());
			if(gender.isPresent()) {
				g=gender.get();
			}
			
			Optional<Tcl554ASvillage> village = villageservice.findByid(client.getVillageid());
			if(village.isPresent()) {
				vill=village.get();
			}

			Tcl01Client clientt= new Tcl01Client();
			
			clientt.setFirstname(client.getFirstname());
			clientt.setLastname(client.getLastname());
			clientt.setEmployerName(client.getFirstname()+" "+client.getLastname());
			clientt.setDateOfBirth(client.getDateOfBirth());
			clientt.setDrivingLicenseNumber(client.getDrivingLicenseNumber());
			clientt.setEmailAddress(client.getEmailAddress());
			clientt.setEmployerAddressLine1(client.getEmployerAddressLine1());
			clientt.setEmployerAddressLine2(client.getEmployerAddressLine2());
			clientt.setEmployerTown(client.getEmployerTown());
			clientt.setGenderid(g);
			clientt.setGroupName(client.getGroupName());
			clientt.setGroupNumber(client.getGroupNumber());
			clientt.setHealthInsuranceNumber(client.getHealthInsuranceNumber());
			clientt.setHomeTelephone(client.getHomeTelephone());
			clientt.setMaritstatusid(status);
			clientt.setMobileTelephone(client.getMobileTelephone());
			clientt.setPassportNumber(client.getPassportNumber());
			clientt.setPhysicalAddressLine1(client.getPhysicalAddressLine1());
			clientt.setPhysicalAddressLine2(client.getPhysicalAddressLine2());
			clientt.setPhysicalAddressPlotNumber(client.getPhysicalAddressPlotNumber());
			clientt.setPhysicalAddressPostalCode(client.getPhysicalAddressPostalCode());
			clientt.setPlaceOfBirth(client.getPlaceOfBirth());
			clientt.setPostalAddressNumber(client.getPostalAddressNumber());
			clientt.setPostalCode(client.getPostalCode());
			clientt.setResidenceType(client.getResidenceType());
			clientt.setSocialSecurityNumber(client.getSocialSecurityNumber());
			clientt.setStudentNumber(client.getStudentNumber());
			clientt.setSurName(client.getSurName());
			clientt.setWorkTelephone(client.getWorkTelephone());
			clientt.setVillageid(vill);
			clientt.setCountryid(c);
			
			clientservice.createTcl01Client(clientt);
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(clientt);
			
		}catch(Exception ex) {
			//ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	
	
	

}
