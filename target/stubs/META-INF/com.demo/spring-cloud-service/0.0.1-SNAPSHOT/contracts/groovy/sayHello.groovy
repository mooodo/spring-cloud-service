package contracts.groovy

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description("say hello to user, and show the server port")
	request {
	    method GET()
	    url("/sayHello") {
	        queryParameters {
	            parameter("user","Johnwood")
	        }
	    }
	}
	response {
	    body("Hi Johnwood, welcome to you! The server port is null")
	    status 200
	}

}