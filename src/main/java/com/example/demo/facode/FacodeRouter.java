package com.example.demo.facode;

import com.example.demo.model.LongDTO;
import com.example.demo.model.UserDTO;
import com.example.demo.model.UserDetailDTO;
import com.example.demo.model.UserDetailDTO2;

public class FacodeRouter {
	private FacodeRouter() {
		//Don't make instance
	}
	public static void router(Object target) {
		
		if(target instanceof UserDetailDTO) {
			UserDetailDTO dto = (UserDetailDTO)target;
			System.out.println(dto);
			
		}
		
		if(target instanceof UserDetailDTO2) {
			UserDetailDTO2 dto = (UserDetailDTO2)target;
			System.out.println(dto);
			
		}
		
		
		if(target instanceof LongDTO) {
			LongDTO dto = (LongDTO)target;
			System.out.println(dto);
			
		}
		
		if(target instanceof UserDTO) {
			UserDTO dto = (UserDTO)target;
			System.out.println(dto);
		}
		
		
		
		
	}
	

}
