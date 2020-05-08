package contracts.groovy

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description("show information about me.")
	request {
	    method GET()
	    url("/showMe")
	}
	response {
	    body(file('person.json'))
	    status 200
	    headers {
			contentType(applicationJson())
		}
	}
}