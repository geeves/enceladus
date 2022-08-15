package io.soulglo.enceladus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EnceladusApplication

fun main(args: Array<String>) {
	runApplication<EnceladusApplication>(*args)
}
