object Bob {
    fun hey(what: String): String {
        val trimmed = what.trim()

        val isSilence = trimmed.isEmpty()
        val isQuestion = trimmed.endsWith("?")
        val isYelling = trimmed.isNotEmpty() &&
                trimmed == trimmed.uppercase() &&
                trimmed != trimmed.lowercase()

        return when {
            isSilence -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            isQuestion -> "Sure."
            else -> "Whatever."
        }
    }
}