// Plugin Runtime Defaults
grails {
	plugin {
		drools {
			domainClass = "grails.plugin.drools.DroolsRule"
		}
	}
}

log4j = {
	warn 'org.drools',
		'org.kie'

	error 'org.codehaus.groovy.grails',
		'org.springframework',
		'org.hibernate',
		'net.sf.ehcache.hibernate'
}