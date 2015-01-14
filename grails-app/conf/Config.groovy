grails {
	plugin {
		drools {
			domainClass = "grails.plugin.drools.DroolsRule"
		}
	}
}

log4j = {
	error 'org.drools',
		'org.kie'

	error 'org.codehaus.groovy.grails',
		'org.springframework',
		'org.hibernate',
		'net.sf.ehcache.hibernate'
}
