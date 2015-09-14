import static java.util.Calendar.*

newyear = Calendar.instance
newyear.set 2009, JANUARY, 1
newyear.timeZone = TimeZone.getTimeZone("America/Los_Angeles")
newyear.timeZone = TimeZone.getTimeZone("UTC")

println newyear.time