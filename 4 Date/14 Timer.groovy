import java.text.SimpleDateFormat
import static java.text.DateFormat.*
import static java.util.Locale.*
import static java.util.Calendar.*

cal = Calendar.instance
cal.roll SECOND, 1
def timer = new Timer(true)
def task = { println 'Background Task Done' }
timer.schedule task as TimerTask, cal.time