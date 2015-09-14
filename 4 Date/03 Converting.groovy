import static java.util.Calendar.*

now = Calendar.instance
println 'now is a ' + now.class.name

date = now.time
println 'date is a ' + date.class.name + ' with value ' + date

millis = date.time
println 'millis is a ' + millis.class.name + ' with value ' + millis