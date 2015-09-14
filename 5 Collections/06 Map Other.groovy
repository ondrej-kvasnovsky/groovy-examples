// Creating an empty map
def devMap = [:]
println devMap

// Add values
devMap = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
devMap.put('lastName','Perez')

// Iterate over elements of a map
devMap.each { println "$it.key: $it.value" }
devMap.eachWithIndex { it, i -> println "$i: $it"}

// Evaluate if a map contains a key
assert devMap.containsKey('name')

// Evaluate if a map contains a value
assert devMap.containsValue('Roberto')

// Get the keys of a map
println devMap.keySet()

// Get the values of a map
println devMap.values()