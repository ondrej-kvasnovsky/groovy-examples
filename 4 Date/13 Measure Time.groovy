def reversedNumbers = (10000..1).toList()

// check size and first few elements
println reversedNumbers.size()
println reversedNumbers[0..5]

// now perform the operation we want to time
def before = System.currentTimeMillis()
reversedNumbers.sort()
def after = System.currentTimeMillis()

// check first few elements
println reversedNumbers[0..5]
println "Sorting took ${after-before} ms"