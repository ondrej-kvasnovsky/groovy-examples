import static java.util.Calendar.*

def today = new Date()
def newYearsEve = today - 1
def boxingDay = today + 1

def holidays = boxingDay..newYearsEve

println today in holidays
println holidays.collect { it.day }