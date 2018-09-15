package br.com.heiderlopes.chatfuelfakebot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatFakeController {

    @RequestMapping("/saudacao")
    fun getSaudacao(): ChatfulResponse {
        val valores = mapOf("mensagemSaudacao" to "Oi vindo da api")
        return ChatfulResponse(valores)
    }

    @RequestMapping("/saudacao2")
    fun getSaudacao2(
            @RequestParam("nome") nome: String
    ): ChatfulResponse {
        val valores = mapOf("mensagemSaudacao" to "Oi $nome")
        return ChatfulResponse(valores)
    }

}