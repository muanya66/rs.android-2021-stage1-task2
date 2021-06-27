package subtask3

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

       var errorOutput = ""

        return when (blockB) {
            String::class -> blockA.filterIsInstance<String>().reduce { prev, last -> prev + last }

            Int::class -> blockA.filterIsInstance<Int>().reduce { prev, last -> prev + last }

            LocalDate::class -> blockA.filterIsInstance<LocalDate>().max() ?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: errorOutput

            else -> errorOutput
        }

    }
}
