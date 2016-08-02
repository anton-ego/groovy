//'https://yandex.ru'.toURL().text.eachLine { println it }
//'https://ya.ru'.toURL().eachLine { println it }
assert 'https://ya.ru'.toURL().readLines()*.size() ==
'https://ya.ru'.toURL().text.readLines()*.size()

