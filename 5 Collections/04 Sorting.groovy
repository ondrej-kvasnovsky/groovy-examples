def technologies = ["Groovy", "Grails"]

// Sort a list (mutates original list)
technologies.sort()
println technologies

// To sort without mutating original, you can do:
sortedTechnologies = technologies.sort(false)
println sortedTechnologies
