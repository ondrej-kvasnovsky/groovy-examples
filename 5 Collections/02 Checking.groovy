def technologies = ["Groovy", "Grails"]

//Evaluate if a list contains element(s) (boolean)
println technologies.contains( 'Groovy' )

// Or
println 'Groovy' in technologies

// Check for multiple contents
println technologies.containsAll(['Groovy','Grails'])
