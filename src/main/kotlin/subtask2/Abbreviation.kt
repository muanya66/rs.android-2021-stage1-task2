package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        //throw NotImplementedError("Not implemented")
        val strA = a.toUpperCase()
        val strB = b.toCharArray()

        val textMessage1 = "YES"
        val textMessage2 = "NO"

        var i = 0

        while (i < strB.size) {
            if (strA.indexOf(strB[i].toString(),i) >= 0){
                i++
                if (i == strB.size) return textMessage1
            }else return textMessage2
        }

        return textMessage2
    }

    }


