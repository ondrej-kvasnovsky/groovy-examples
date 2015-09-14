import static java.util.Calendar.*

def nowCal = Calendar.instance
y = nowCal.get(YEAR)
Date nowDate = nowCal.time
m = nowDate[MONTH] + 1
d = nowDate[DATE]
println "Today is $d $m $y"

nowCal.set DATE, 1
nowCal.set MONTH, FEBRUARY
println "Changed to $nowCal.time"