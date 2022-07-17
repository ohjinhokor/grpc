package client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class GrpcClientController {

	@GetMapping("/{key}")
	public static ResponseDto getMethod(@PathVariable int key) {
		return GrpcClientService.grpcGetMethod(key);
	}
}