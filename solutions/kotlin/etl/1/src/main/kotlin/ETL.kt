import java.util.TreeMap

object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val responseMap = TreeMap<Char, Int>()
        source.forEach { (key, value) ->  value.forEach { char -> responseMap[char + 32] = key }}
    return responseMap
    }
}
