package subtask1

import java.util.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.lang.Exception


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
       val errorMessage  = "Такого дня не существует"
        return try {

            val  inputDate = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale.forLanguageTag("Ru"))
            LocalDate.of(year.toInt(),month.toInt(),day.toInt()).format(inputDate)

        } catch (E: Exception){
            errorMessage
        }
    }
}
