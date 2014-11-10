grails.servlet.version = "3.0"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.fork = [
        test   : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon: true],
        run    : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve: false],
        war    : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve: false],
        console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits("global") {
        excludes 'grails-plugin-databinding', 'grails-plugin-gsp', 'grails-plugin-rest', 'grails-resources'
    }
    log "error"
    checksums true
    legacyResolve false

    repositories {
        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    dependencies {
        compile 'org.mybatis:mybatis:3.2.7'
        compile 'org.mybatis:mybatis-spring:1.2.2'
    }

    plugins {
        build ":tomcat:7.0.55"

        compile ":vaadin:7.3.3.2"

        runtime ":hibernate4:4.3.5.5"
    }
}
