package pks.singleton;

/*
Синхронизация полезна только один раз, при первом обращении к getInstance(), после этого каждый раз, при обращении
этому методу, синхронизация просто забирает время, но есть возможность обрабатывать исключительные ситуации
в конструкторе.

В каких случаях будет правильным обрабатывать исключительные ситуации в конструкторе?

Как я думаю это может быть:
Класс "композиция" и один из его "объектов" пришел как null

Класс, при инициализации, использует "методы", которые могут вызвать Exception, например, часть полей класса
берется из БД. А БД попросту недоступна.

В конструктор приходят "некорректные" значения: например int age, приходит как "-1"


Буду рад услышать, я правильно думаю или нет. И Ваше мнение (ответ).
 */

public class Properties {
    private static Properties instance;

    private Properties() {
    }

    public static synchronized Properties getInstance() {
        if (instance == null) {
            instance = new Properties();
        }
        return instance;
    }
}
