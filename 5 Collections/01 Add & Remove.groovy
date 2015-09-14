// create empty list
def technologies = []
println technologies

// As with Java
technologies.add("Grails")
println technologies

// Left shift adds, and returns the list
technologies << "Groovy"
println technologies

// Add multiple elements
technologies.addAll(["Gradle","Griffon"])
println technologies

// As with Java
technologies.remove("Griffon")
println technologies

// Subtraction works also
technologies = technologies - 'Grails'
println technologies
