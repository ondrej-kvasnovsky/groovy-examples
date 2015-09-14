def technologies = ["Groovy", "Grails"]

// Replace all elements in the list
Collections.replaceAll(technologies, 'Gradle', 'gradle')
println technologies

// Shuffle a list
Collections.shuffle(technologies, new Random())
println technologies

// Clear a list
technologies.clear()
println technologies