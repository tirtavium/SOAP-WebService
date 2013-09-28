package id.or.linux.jak.impl;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import id.or.linux.jak.HalloTirtaWebService;
import id.or.linux.jak.domain.User;
import id.or.linux.jak.domain.UserRequest;


@WebService(endpointInterface="id.or.linux.jak.HalloTirtaWebService")
public class HalloTirtaWebServiceImpl implements HalloTirtaWebService {

	public User greetUser(UserRequest ur) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(ur.getUserName());
		user.setJenkel(ur.getJenisKelamin());
		List<String> list = new ArrayList<String>();
		list.add("gepeng");
		list.add("ganteng");
		list.add("kan ?");
		user.setRole(list);
		return user;
	}

}
