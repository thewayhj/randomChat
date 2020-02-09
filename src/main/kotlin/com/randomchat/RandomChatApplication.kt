package com.randomchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RandomChatApplication

fun main(args: Array<String>) {
	runApplication<RandomChatApplication>(*args)
}
