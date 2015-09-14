import static java.util.Calendar.*
import java.text.DateFormat
import java.text.SimpleDateFormat

printCal = { cal -> new SimpleDateFormat().format(cal.time)}
cal = Calendar.instance
cal.set 2015, JANUARY, 1, 00, 01, 0
println printCal(cal)

// roll minute back by 2 but don't adjust other fields
cal.roll MINUTE, -2
println printCal(cal)

// adjust hour back 1 and adjust other fields if needed
cal.add HOUR, -1
println printCal(cal)