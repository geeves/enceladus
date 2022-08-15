package io.soulglo.nucleus.chapter

import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations
import java.io.BufferedReader
import java.io.InputStream
import java.nio.charset.StandardCharsets.UTF_8


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ComposeServiceTests {

	@InjectMocks
	lateinit var composeService: ComposeService


	@BeforeAll
	fun setup() {
		MockitoAnnotations.openMocks(this)
	}

	@Test
	fun test_ParagraphLocation() {
		val input: InputStream = this.javaClass.getResourceAsStream("/locations.html") as InputStream
		val html: String = input.bufferedReader().use(BufferedReader::readText)
		val chapterId = 25
		val changedDocument: Document = composeService.appendLocations(
			composeService.clean(html),
			chapterId
		)
		val el: Element? = changedDocument.body().select("p").last()
		val updatedHtml = el?.attr("location")

		assertEquals("25-19", updatedHtml)
	}

}
