// Add a new method
Integer.metaClass.eights << { delegate * 8 }
println 2.eights()

Integer.metaClass.hundreds = { delegate * 100 }
println 2.hundreds()

// Replace an existing method 
// But only if you call that method from Groovy, not Java
Integer.metaClass.toString = { 'Groovy' }
println 100.toString()