println 'abc'.collect{ it }
println 'abc'.collect{ it + '.' }
println 'abc'.collect{ 'test-' + it  }
println 'abc'.collect{ it * 3 }