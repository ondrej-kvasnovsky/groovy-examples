import static java.util.Calendar.*

cal = Calendar.instance
cal.set 1988, APRIL, 4, 0, 0, 0
date = cal.time
def (doy, woy, y) = [DAY_OF_YEAR, WEEK_OF_YEAR, YEAR].collect{ date[it] }
println "$date is: day $doy and week $woy of year $y"