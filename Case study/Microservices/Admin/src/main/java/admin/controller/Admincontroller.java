package admin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import admin.model.Admin;
import admin.model.Bookingdetails;
import admin.model.CustomerRating;
import admin.model.Washers;
import admin.model.washpack;
import admin.repository.adminrepo;
import admin.service.serviceImplementation;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/admin")
public class Admincontroller<AdminInfo> {
	
	@Autowired
	private serviceImplementation service;

	@Autowired
	private RestTemplate restTemplate;
	

	// Admin operations
	@PostMapping("/addadmin")
	public String saveadmin(@RequestBody Admin admin) {
		service.saveadmin(admin);
		return "Admin saved by ID:" + admin.getId();
	}

	@GetMapping("/alladmin")
	public List<Admin> getadmin() {
		return service.findAll();
	}
	
	
	 @PutMapping("/update/{Id}")
     @ResponseStatus(HttpStatus.CREATED)
     public Admin updateProfile(@PathVariable("adminId") String adminId,@RequestBody AdminInfo adminInfo){
             ((Admin) adminInfo).setAdminId(adminId);
             return adminrepo.save((adminrepo) adminInfo);

	/*
	 * @PutMapping("/updateadmin") public String updateadminById(@RequestBody Admin
	 * admin) { service.saveadmin(admin); return
	 * "Admin updated successfully with Id:" + admin.getId();
	 */
	}

	@DeleteMapping("/deleteadmin")
	public String deleteadmin(@RequestParam int id) {
		service.deleteadmin(id);
		return "Sucessfully deleted admin";
	}


	@GetMapping("/allpacks")
	public List<washpack> getwashpacks() {
		return service.getwashpack();

	}

	@PostMapping("/addpack")
	public String savepack(@RequestBody washpack p) {
		service.savepack(p);
		return "New pack added";
	}

	@DeleteMapping("/deletepack/{id}")
	public String deletepack(@RequestParam int id) {
		service.deletepack(id);
		return "pack deleted";
	}

	@PostMapping("/addratings")
	public String saveratings(@RequestBody CustomerRating rating) {
		service.save(rating);
		return "Thanks for your feedback";
	}

	@GetMapping("/allratings")
	public List<CustomerRating> getuser() {
		// TODO Auto-generated method stub
		return service.getuser();
	}

	@GetMapping("/allorders")
	public List<Bookingdetails> findAllorders() {
		String baseurl = "http://localhost:8083/order/allorders";
		Bookingdetails[] allorders = restTemplate.getForObject(baseurl, Bookingdetails[].class);
		return Arrays.asList(allorders);
	}

	@GetMapping("/allwashers")
	public List<Washers> findAllwashers() {
		String baseurl = "http://localhost:8082/wash/allwashers";
		Washers[] wash = restTemplate.getForObject(baseurl, Washers[].class);
		return Arrays.asList(wash);
	}

}
