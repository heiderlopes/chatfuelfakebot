package br.com.heiderlopes.chatfuelfakebot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatFakeController {

    @RequestMapping("/")
    fun getSaudacao(): ChatfulSaudacaoAtributes {
        return ChatfulSaudacaoAtributes(Saudacao("OI"))
    }

}