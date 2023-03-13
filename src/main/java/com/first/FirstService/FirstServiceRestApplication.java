package com.first.FirstService;







import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.first.FirstService.controllers.EmployeeController;
import com.first.FirstService.filter.CorsFilter;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@ApplicationPath("/first")
@ApplicationScoped
public class FirstServiceRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // 
        classes.add(FirstController.class);
        classes.add(EmployeeController.class);
        classes.add(CorsFilter.class); 
        
        
        
        
        return classes;
    }
}
