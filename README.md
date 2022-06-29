Финальный проект второго спринта 
====
## Описание проекта
Финальный проект 2 спринта курса "Автоматизатор тестирования на Java". Проект создан с целью изучения юнит-тестирования. Автотесты покрывают классы склонированного исходного репозитория https://github.com/yandex-praktikum/qa_java . При создании проекта использовались такие приемы юнит-тестирования как Mock, Stab, Spy и  параметризация.

## Перед началом работы
Необходимо, чтобы были уставновлены:  
•	IntelliJ IDEA + Maven     
•	Git Bash  
### Переключитесь на ветку develop.
1.	Перейдите в репозиторий с заготовкой кода: https://github.com/ZhDV96/qa_java
2.	Нажмите кнопку Fork для клонирования репозитория — она на панели справа и сверху. Появится выпадающий список. Выберите свой аккаунт на GitHub.
3.	Откройте терминал(Git Bash) и перейдите в папку проекта, которую удалось создать на компьютере. Для этого понадобится команда cd.
4.	Используя команду git clone git@github.com:username/qa_java.git в терминале, скачайте себе данный репозиторий. Укажите имя своего аккаунта на GitHub вместо username.
### Отчёт с jacoco.
1.	В IntelliJ IDEA с подключенным Maven запустите выполнение автотестов командой mvn verify.
2.	Найдите в папке target/site/jacoco/ файл index.html, нажмите на него правой кнопкой мыши и выбери Open In — Browser — и выберите нужный браузер.
