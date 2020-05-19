package contracts.groovy

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description("find a person and show information about him.")
	request {
	    method POST()
	    url("/findPerson")
	    body(name:'Mooodo',gender:'male')
	    headers {
			contentType(applicationJson())
		}
	}
	response {
	    body(file('person.json'))
	    status 200
	    headers {
			contentType(applicationJson())
		}
	}
}