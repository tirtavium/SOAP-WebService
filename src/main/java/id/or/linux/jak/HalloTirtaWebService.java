package id.or.linux.jak;

import id.or.linux.jak.domain.User;
import id.or.linux.jak.domain.UserRequest;

import javax.jws.WebService;

@WebService
public interface HalloTirtaWebService {

	User greetUser(UserRequest ur);
}
