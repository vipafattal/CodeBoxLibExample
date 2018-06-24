import java.text.SimpleDateFormat
import java.util.*

fun getDateWithoutHours(date: Date = Date()): Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val localDeviceDate = formatter.format(date)

    return formatter.parse(localDeviceDate)
}