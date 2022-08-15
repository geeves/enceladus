package io.soulglo.enceladus.chapter

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.safety.Cleaner
import org.jsoup.safety.Safelist
import org.springframework.stereotype.Service

@Service
class ComposeService {


	fun appendLocations(doc: Document, chapterId: Int): Document {
		for ((i, el: Element) in doc.select("p").withIndex()) {
			el.attr("location", "${chapterId}-${i}")
		}
		return doc;
	}

	private fun clean(dirtyDocument: Document): Document {
		val cleaner = Cleaner(safelist())
		return cleaner.clean(dirtyDocument)
	}

	fun clean(html: String): Document {
		return clean(Jsoup.parse(html))
	}

	companion object {
		private fun safelist(): Safelist {
			return Safelist.basic()
				.removeAttributes(":all", ":all")
				.removeTags("a", "code", "pre")
				.addTags("h1", "h2", "h3", "h4", "h5", "h6")
		}
	}
}
