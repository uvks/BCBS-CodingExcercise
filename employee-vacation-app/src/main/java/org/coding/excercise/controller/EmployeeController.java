package org.coding.excercise.controller;

import java.util.Date;

import org.coding.excercise.entitybeans.Employee;
import org.coding.excercise.service.EmployeeVacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeVacationService service;
	
	@RequestMapping("/createEmployee")
    public void createEmployee(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String userName) {
       service.createEmployee(firstName, lastName, userName);;
    }
	
	@RequestMapping("/getEmployee")
    public @ResponseBody Employee getEmployee(@RequestParam Integer empId) {
        return service.getEmployee(empId);
    }
	
	@RequestMapping("/addVacation")
    public void addVacation(@RequestParam Integer empId, @RequestParam Date fromDate, @RequestParam Date endDate) {
        service.addVacation(empId, fromDate, endDate);
    }

}
