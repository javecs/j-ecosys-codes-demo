# j-ecosys-codes-demo
[Javaの開発環境](https://github.com/javecs/j-ecosys)ができたところで初めに動かしてみるアプリです。

## 使うもの
- Kotlin 1.1
- Spring Boot 1.5.2
- Vaadin 8

## ビルド＆実行
```
$ git clone https://github.com/javecs/j-ecosys-codes-demo.git
$ cd j-ecosys-codes-demo
$ gradle bootRun
```
- [localhost:8080](http://localhost:8080/)にアクセスして見てください。

![ようこそ](http://i.imgur.com/LhNHfLo.png)


## コードの説明

1. まずは、Vaadin Springプラグインを使用します。 

:octocat: [build.gradle](https://github.com/javecs/j-ecosys-codes-demo/blob/master/build.gradle#L36)
```
compile('com.vaadin:vaadin-spring-boot-starter')
```

2. 画面に表示するクラウは、VaadinのUIクラウを継承して`@SpringUI`をつけます。 そして、`init`の中で表示したい画面を書きます。  

:octocat: [DemoApplication.kt](https://github.com/javecs/j-ecosys-codes-demo/blob/master/src/main/kotlin/com/example/DemoApplication.kt#L22)
```Kotlin
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
```

3. UIにはテーマを適用することで、より洗練された画面表示ができます。  

:octocat: [DemoApplication.kt](https://github.com/javecs/j-ecosys-codes-demo/blob/master/src/main/kotlin/com/example/DemoApplication.kt#L20)
```
@Theme("valo")
```
  
## より詳しくは...
- VaadinとSpringのチュートリアルです。  
  http://vaadin.github.io/spring-tutorial/
- Vaadinのテーマを触ってみたいなら、次のページで試してみてください。  
  http://demo.vaadin.com/valo-theme/#!common
