package api.restapi.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerService customerService;

	@GetMapping("")
	public ResponseDto getCustomerByKey(@RequestHeader(name = "key") long key) {
		Customer customer = customerService.getCustomerByKey(key);
		return ResponseDto.builder().customer(customer).build();
	}
}