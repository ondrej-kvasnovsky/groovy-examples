ArrayList.metaClass.remove = { obj ->
   println "Not able to replace a method which already exists!"
}

ArrayList.metaClass.remove2 = { obj ->
   "Remove2 called"
}

def a = new ArrayList()
a.add('first object')

// returns true because the remove method defined by ArrayList is called, 
// i.e. our attempt at replacing it above has no effect
println a.remove('first object')

// ArrayList does not define a method named remove2, 
// so the method we add above via the metaClass is invoked
println a.remove2('third object')