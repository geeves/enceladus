package io.soulglo.enceladus.lastread

data class LastRead(
	val lastReadId: Int? = null,
	val accountId: Int,
	val storyId: Int,
	val chapterId: Int,
	/**
	 * location = "{chapterId}-{paragraphNumber}"
	 * foo.com/story/{id}/{chapterNumber}/Title.html#{location}
	 */
	val location: String? = null,
)
