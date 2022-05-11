fun main() {
    //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    val b: String?= null
    val l = b!!.length
}