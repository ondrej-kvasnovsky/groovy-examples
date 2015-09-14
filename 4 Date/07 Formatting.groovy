import static java.util.Calendar.*
import java.text.DateFormat

def today = new Date()

def plainFormatter = DateFormat.instance
println plainFormatter.format(today)