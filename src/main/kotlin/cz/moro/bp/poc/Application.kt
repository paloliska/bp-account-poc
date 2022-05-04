package cz.moro.bp.poc

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("cz.moro.bp.poc")
		.start()
}

