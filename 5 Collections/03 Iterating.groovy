def technologies = ["Groovy", "Grails"]

// Iterate over elements of a list
technologies.each { println "Technology: $it"}

technologies.eachWithIndex { it, i -> println "$i: $it"}
