package edu.uptc.swi.employeeapp.controller;


import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import edu.uptc.swi.employeeapp.model.Employee;
import edu.uptc.swi.employeeapp.service.EmployeeDAOImpl;
import edu.uptc.swi.employeeapp.service.IEmployeeDAO;


@RestController
public class AddEmployeeController {
    private IEmployeeDAO employeeDAO = new EmployeeDAOImpl();


    @PostMapping("/save")
    public RedirectView addEmployee(Employee employee){
        boolean res=this.employeeDAO.save(employee);
        if(!res)
            return new RedirectView("/error.html");    
        else
            return new RedirectView("/confirm.html");
    }


    @RequestMapping("/findbyid")
    public Employee findByID(String id){
        return this.employeeDAO.findById(id);
    }


    @RequestMapping("/findall")
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }


    @RequestMapping("/deletebyid")
    public void deleteEmployee(String id) {
        this.employeeDAO.deleteEmployeeById(id);
    }


}
