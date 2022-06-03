package com.csrlnd.LibraryAPI.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.User;
import com.csrlnd.LibraryAPI.Domain.UserRole;
import com.csrlnd.LibraryAPI.Model.Staff;
import com.csrlnd.LibraryAPI.Repositories.StaffRepository;

@Service
public class MongoAuthStaffDetailService implements UserDetailsService {
    
	@Autowired
	StaffRepository staffRepo;
	
	
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

    	Staff staff = staffRepo.findUserByUsername(userName);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

		
		
		  staff.getAuthorities() .forEach(role -> { grantedAuthorities.add(new
		  SimpleGrantedAuthority(role.getRole().getName())); });
		 
		 
        
        //grantedAuthorities.add(new SimpleGrantedAuthority("ADMIN"));

        return new User(staff.getName(), new BCryptPasswordEncoder().encode(staff.getPassword()),grantedAuthorities);
        
        //return new User("admin",new BCryptPasswordEncoder().encode("admin"),grantedAuthorities);
    }

}
