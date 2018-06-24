import java.util.*
import java.util.Calendar.*


operator fun Date.plus(date: Date): Date {

    val c1 = getInstance()
    val c2: Calendar = getInstance()

    c1.time = this
    c2.time = date

    //making new instance with same c1 variable values at the first
    return (c1.clone() as Calendar).apply {
        add(YEAR, c2.get(YEAR))
        add(MONTH, c2.get(MONTH) + 1) // Months are zero-based!
        add(DATE, c2.get(DATE))
        add(HOUR_OF_DAY, c2.get(HOUR_OF_DAY))
        add(MINUTE, c2.get(MINUTE))
        add(SECOND, c2.get(SECOND))
        add(MILLISECOND, c2.get(MILLISECOND))
    }.time
}


infix fun Date.addDays(days: Int): Date =

        getInstance().apply {
            time = this@addDays
            add(DATE, days)
        }.time


infix fun Date.addHours(hours: Int): Date =
        getInstance().apply {
            time = this@addHours
            add(HOUR_OF_DAY, hours)
        }.time


infix fun Date.addMinutes(min: Int): Date =
        getInstance().apply {
            time = this@addMinutes
            add(MINUTE, min)
        }.time