# Unit 3 — Android Basics with Compose

Оставшиеся задания Unit 3 после уже выполненного раздела **More Kotlin fundamentals**.
Это один Gradle-проект с пятью независимыми Android-приложениями. В Android Studio
каждый модуль можно выбрать как отдельную конфигурацию запуска.

## Что выполнено

| Раздел курса | Модуль | Результат |
|---|---|---|
| Add a scrollable list | `affirmations` | Карточки с изображениями в `LazyColumn` |
| Change the app icon | `affirmations` | Adaptive launcher icon |
| Practice: Build a grid | `courses` | Двухколоночный `LazyVerticalGrid` с темами курсов |
| Material Theming with Compose | `woof` | Цвета, формы, типографика и top app bar |
| Simple animation with Compose | `woof` | Раскрывающиеся карточки с spring-анимацией |
| Testing for Accessibility | `woof` | Семантика кнопок, декоративные изображения и touch targets |
| Practice: Build Superheroes app | `superheroes` | Material-тема, список героев и анимация появления |
| Project: Create a 30 Days App | `thirtydays` | Оригинальное приложение с 30 советами об Android |

Онлайн-видео и Quiz не являются программными заданиями и в репозиторий не входят.

## Итоговый проект 30 Days

`thirtydays` — самостоятельная работа «30 Days of Android»:

- 30 последовательных карточек с заголовком и подробным советом;
- вертикальный прокручиваемый список;
- собственные векторные иллюстрации;
- светлая и тёмная Material 3 темы;
- Montserrat для типографики;
- раскрытие текста с анимацией размера и поворота стрелки;
- content descriptions и доступные кнопки;
- unit-тест, проверяющий количество и порядок дней.

## Запуск в Android Studio

1. Откройте папку `Unit3_Compose` как существующий проект.
2. Дождитесь Gradle Sync.
3. Выберите модуль `affirmations`, `courses`, `woof`, `superheroes` или `thirtydays`.
4. Запустите его на эмуляторе или подключённом устройстве.

Локальная конфигурация рассчитана на SDK из `/home/rahmannur0101/AndroidSDK`.
Минимальная версия Android — API 24.

## Проверка из терминала

```bash
./gradlew assembleDebug
./gradlew testDebugUnitTest
```

Готовые debug APK появляются в `<module>/build/outputs/apk/debug/`.

## Структура Git

Работа разбита на локальные коммиты:

1. конфигурация общего Gradle workspace;
2. Pathway 2 — Affirmations и Courses;
3. Woof — тема, анимация и доступность;
4. Superheroes;
5. оригинальный 30 Days App;
6. документация и финальная проверка.

Источники учебных требований и ресурсов перечислены в `SOURCES.md`, результаты
локальной проверки — в `VALIDATION.md`.

