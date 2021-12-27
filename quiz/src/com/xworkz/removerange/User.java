package com.xworkz.removerange;


	
	import java.util.ArrayList;
	import java.util.Iterator;

	import com.xworkz.removerange.UserDTO;

	public class User {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();

		public void add(UserDTO dto) {
			list.add(dto);
		}

		public void display() {
			System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "User name", "Email");
			Iterator<UserDTO> itr = list.iterator();
			while (itr.hasNext()) {
				UserDTO userDTO = (UserDTO) itr.next();
				System.out.println(userDTO);
			}
		}

		public void removeRange(int from, int to) {
			list.removeRange(from, to); // error
			list.subList(from, to).clear();
			display();
		}
	}


