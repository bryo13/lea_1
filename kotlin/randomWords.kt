package RandomWords

fun main() {
	val word_list1 = arrayOf("one","bigger","bug")
	val word_list2 = arrayOf("schooled","church","mecca")
	val word_list3 = arrayOf("consumer","eater","cook")

	val size_list1 = word_list1.size
	// val size_list2 = word_list2.size
	// val size_list3 = word_list3.size

	val random_index = (Math.random() * size_list1).toInt()

	val phrase = "${word_list1[random_index]} ${word_list2[random_index]} ${word_list3[random_index]}"

	println(phrase)
}
