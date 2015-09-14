import java.text.SimpleDateFormat
import static java.text.DateFormat.*
import static java.util.Locale.*

Date date = new SimpleDateFormat("yyyy-MMM-dd").parse("2008-DEC-25")
println date