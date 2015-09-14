import groovy.time.TimeCategory

now = new Date()
println now

use(TimeCategory) {
    footballPractice = now + 1.week - 4.days + 2.hours - 3.seconds
}
println footballPractice