package com.first.FirstService.controllers;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import com.first.FirstService.input.Employee;
import com.first.FirstService.services.EmployeeService;

@Path("/emp")
public class EmployeeController {

	@Inject
	private EmployeeService empService;

	@GET
	public Response getAllEmployee() {
		return empService.getAllEmployee();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployee(@RequestBody Employee emp) {
		System.out.println(emp);
		return empService.createEmployee(emp);
	}

	@DELETE
	@Path("del/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteEmployee(@PathParam(value = "id") int id) {
		return empService.deleteEmployee(id);
	}

	@GET
	@Path("/{id}")
	public Response findById(@PathParam(value = "id") int id) {
		return empService.findById(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response UpdateEmployee(@RequestBody Employee emp) {
		System.out.println(emp);
		return empService.UpdateEmployee(emp);
		
	}
//	@GET
//	@Path("/getImgtoByte")
//	public Response imgToByte() throws FileNotFoundException {
//	 File f = new File("D:\\IMAGES");
//     FileInputStream fin = new FileInputStream(f);
//     byte imagebytearray[] = new byte[(int)f.length()];
//     fin.read(imagebytearray);
//     String imagetobase64 = Base64.encodeBase64String(imagebytearray);
//     fin.close();
// 
//	}
	
	

}
