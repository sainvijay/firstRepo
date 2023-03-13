package com.first.FirstService.services;

import java.util.ArrayList;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.first.FirstService.input.Employee;
import com.first.FirstService.repositories.EmployeeRepository;

@Dependent
public class EmployeeService {
	ArrayList<Object> list = new ArrayList<>();
	@Inject
	private EmployeeRepository empRepo;

	public Response getAllEmployee() {
		list = empRepo.getAllEmployee();
		return Response.status(Status.OK).entity(list).build();
	}

	public Response createEmployee(Employee emp) {
		String ss = empRepo.createEmployee(emp);
		if (ss.isEmpty())
			return Response.status(Status.CREATED).entity("Employee  Created Successfully").build();
		else
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Error").build();
	}

	public Response deleteEmployee(int id) {
		String st = String.valueOf(empRepo.deleteEmployee(id));
		if (st.equals("1"))
			return Response.status(Status.OK).entity("Employee  Deleted Successfully").build();
		else
			return Response.status(Status.NO_CONTENT).entity("Either No Content For this Id or Already Deleted")
					.build();
	}

	public Response findById(int id) {
		list = empRepo.findById(id);
		if (list.isEmpty() == false) {
			return Response.status(Status.OK).entity(list).build();
		} else
			return Response.status(Status.NO_CONTENT).entity("Either No Content For this Id or Already Deleted")
					.build();
	}

	public Response UpdateEmployee(Employee emp) {
		int ss = empRepo.UpdateEmployee(emp);
		if (ss != 0)
			return Response.status(Status.CREATED).entity("Employee  Updated Successfully").build();
		else
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Error,Not Updated!").build();
	}

}
