// Creating an empty map
def devMap = [:]
println devMap

// Add values
devMap = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
devMap.put('lastName','Perez')

// Iterate over elements of a map
devMap.each { println "$it.key: $it.value" }

devMap.eachWithIndex { it, i -> println "$i: $it"}