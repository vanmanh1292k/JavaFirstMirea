# JavaFirstMirea
**Репозиторий для заданий и материалов по дисциплине «[Программирование на языке Джава](https://online-edu.mirea.ru/course/view.php?id=4053)» (РТУ МИРЭА, ИИТ, 2-ой курс).**

**Преподаватель**: Ермаков Сергей Романович, ermakov_s@mirea.ru, ermakov@sumirea.ru.

## Где что искать?

**Задания** на практику хранятся в этом репозитории (https://github.com/sermakov/JavaFirstMirea).

**Лекции, методические материалы, в том числе методички прошлых лет с объяснениями по практикам и лабораторным работам, ведомости по сдаче практических работ** хранятся на [странице курса в Системе дистанционного обучения](https://online-edu.mirea.ru/course/view.php?id=4053) и на [Discord-сервере для студентов](https://discord.gg/bcN2u46g4D).

**План практических работ** можно посмотреть в этом репозитории в [отдельном файле](https://github.com/sermakov/JavaFirstMirea/blob/master/Schedule.md).

**Необходимое и дополнительное программное обеспечение для выполнения заданий и прохождения курса, ссылки на обучение и документацию по среде разработки** приведены ниже.

### Необходимое ПО
* [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/download/) - среда разработки.
* [JDK](https://www.oracle.com/ru/java/technologies/javase-jdk16-downloads.html) - инструменты, полезные для разработки и тестирования программ, написанных на языке программирования Java и работающих на платформе Java.
* [Git](https://git-scm.com/downloads) - система контроля версий Git.
* [GitHub](https://github.com) - веб-сервис для системы контроля версий Git.

### Дополнительное ПО и ресурсы
* [Diagrams.net](https://app.diagrams.net/) - ресурс для создания простых картинок и диаграмм.

### [Обучение и документация Intellij IDEA](https://www.jetbrains.com/ru-ru/idea/resources/)

[Документация](https://www.jetbrains.com/help/idea/discover-intellij-idea.html) доступна только на английском языке. Если у вас сложности с английским, можете воспользоваться переводчиком.

Не стесняйтесь искать всевозможные варианты решения для вашего проекта. Пробуйте искать информацию в Google, Yandex и других поисковых системах обязательно на английском и русском языках. В поиске решений могут помочь следующие профессиональные ресурсы:

- [GitHub](https://github.com/);
- [Stack Overflow](https://stackoverflow.com/);
- [Киберфорум](https://www.cyberforum.ru/);
- [Хабр](https://habr.com/ru/all/);
- [Javatips.net](https://www.javatips.net/);
- [Java2s.com]();
- [The Java™ Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/);
- [JDK 16 Documentation](https://docs.oracle.com/en/java/javase/16/);
- [Соглашения по оформлению кода Java](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html).

### Дополнительные курсы

Есть два сервиса, которые я могу рекомендовать для самостоятельного дополнительного обучения. Бесплатные вводные части курсов подойдут тем, кто не понимает основ программирования и хочет исправить ситуацию:

* [Яндекс.Практикум. Java-разработчик](https://practicum.yandex.ru/profile/java-developer/). Пробный бесплатный вводный курс содержит знакомство с основами синтаксиса, условными операторами, циклами, массивами, методами, классами и объектами.
* [JavaRush](https://javarush.ru/me). Онлайн-курс обучения программированию на Java, на 80% состоящий из практики.

### Студенческая лицензия

Можно получить **Ultimate**-версию `IntelliJ IDEA` бесплатно для образования. Для этого необходимо [подать заявку](https://www.jetbrains.com/ru-ru/community/education/#students) на сайте JetBrains.

## Структура проекта
Предлагается сформировать 32 пакета на каждую практическую работу внутри репозитория. По итогу каждая практическая работа будет представлена пакетом внутри вашего репозитория в `IntelliJ IDEA`. 

Важно! Внутри каждого пакета должен быть создан свой исполняемый класс `Main.java` по стандарту, чтобы можно было организовать точку входа в программу.

```java
package ru.mirea.test;

public class Main {
    public static void main(String[] args) {
	// just a comment
    System.out.print("Hi");
    }
}
```
Так вы сможете разделить каждую вашу работу внутри вашего решения и подтягивать классы, созданные в предыдущих работах из других пакетов.

### Нейминг классов и проектов
* Имя класса должно совпадать с названием файла: `Example.java` и `public class Example { }`.
* Имена классов и методов пишутся слитно в соответствии с [CamelCase](https://ru.wikipedia.org/wiki/CamelCase): `NameOfMyClass`.
* Проекты также именуются в соответствии с CamelCase (например `ProjectName`).

## Расположение заданий

В каждом пакете в папке `src/ru/mirea` размещается файл `README.md`, в котором содержится описание практической работы, задание на выполнение и дополнительные ресурсы по теме задания.

## Порядок сдачи работ
1. Загрузка готового проекта на свой репозиторий GitHub.
2. Презентация проекта преподавателю на очном практическом занятии.
3. Формирование единого отчета по завершению всех практических занятий и загрузка отчета в СДО.

## Система оценивания

После презентации работы я ставлю оценку. Для работ есть три вида оценок: Pass (пройдено), Good (хорошо) и Super (отлично). Обратите внимание, что для получения оценки Super необходимо выполнить все варианты в работе и, при наличии, дополнительное задание.

Чем больше оценок Super - тем ближе автомат! 

