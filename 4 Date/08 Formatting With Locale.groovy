import static java.util.Calendar.*
import java.text.DateFormat

def today = new Date()

import static java.text.DateFormat.*
import static java.util.Locale.*
[ENGLISH, FRANCE, GERMAN].each { loc ->
    println getDateInstance(FULL, loc).format(today.time)
}