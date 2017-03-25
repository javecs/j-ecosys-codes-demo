package com.example

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Button
import com.vaadin.ui.Notification
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

@Theme("valo")
@SpringUI
class Welcome : UI() {
    override fun init(request: VaadinRequest?) {
        content = VerticalLayout().apply {
            setSizeFull()
            addComponent(Button("ようこそ", Button.ClickListener { Notification.show("Java エコシステムへ") }))
        }
    }
}