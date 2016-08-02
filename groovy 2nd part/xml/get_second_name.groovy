package xml

/**
 * Created by aegorov on 7/12/2016.
 */

def root = new XmlSlurper().parse('people.xml')
println "The second name is ${root.person[1].name}"