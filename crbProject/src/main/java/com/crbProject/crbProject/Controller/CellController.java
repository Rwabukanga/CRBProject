package com.crbProject.crbProject.Controller;

import java.util.Optional;

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

import com.crbProject.crbProject.Domain.Cell;
import com.crbProject.crbProject.Domain.Sector;
import com.crbProject.crbProject.Service.CellService;
import com.crbProject.crbProject.Service.SectorService;
import com.crbProject.crbProject.Utility.Messages;
import com.crbProject.crbProject.Utility.ResponseBean;
import com.crbProject.crbProject.innerDomain.InnerCell;

@Controller
@RequestMapping(value="/cell")
public class CellController {
	
	@Autowired
	private CellService cellservice;
	
	@Autowired
	private SectorService sectorservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/savecell", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCell(HttpServletRequest request, @RequestBody InnerCell cell){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			
			Optional<Sector> sector= sectorservice.findByid(cell.getSectorid());
			
			Sector s = sector.get();
			
			Cell c = new Cell();
			c.setName(cell.getName());
			c.setSectorid(s);
			cellservice.createCell(c);
			
			
			  
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
