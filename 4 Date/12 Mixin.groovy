import groovy.time.TimeCategory

Integer.metaClass.mixin TimeCategory
Date.metaClass.mixin TimeCategory

footballPractice = 1.week.from.now - 4.days + 2.hours - 3.seconds
println footballPractice