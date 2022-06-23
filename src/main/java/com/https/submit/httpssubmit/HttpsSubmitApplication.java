package com.https.submit.httpssubmit;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.https.submit.response.ResponseHandler;

@Controller
public class HttpsSubmitApplication {

	//private static final Logger LOGGER=LoggerFactory.getLogger(HttpsSubmitApplication.class);
	//@Autowired
	//private RestTemplate restTemplate;
	//@Autowired
	//private Environment environment;
	@Autowired
	HttpServletRequest request;
	@PostMapping("/httpssubmit")
	public ResponseEntity<Object> doSubmit(@RequestBody byte[] bodyfromstrs){
		//System.out.println("httpssubmit success! "+bodyfromstrs);
		//System.out.println(request.getHeader("Content-Type"));
		//System.out.println(request.getHeader("customheader"));
		String encodedString = Base64.getEncoder().encodeToString(bodyfromstrs);
		System.out.println("pdf file encoded: "+encodedString);
		return ResponseHandler.generateResponse("Successfully added data!", HttpStatus.OK, null);
		}
}
