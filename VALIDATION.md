# Проверка проекта

Дата последней полной проверки: 17 ноября 2026 года.

## Окружение

- OpenJDK 25
- Gradle 9.6.0
- Android Gradle Plugin 9.4.1
- Kotlin Compose plugin 2.2.10
- compileSdk / targetSdk 37
- minSdk 24
- Jetpack Compose BOM 2026.02.01

## Выполненные проверки

- `affirmations:assembleDebug` — успешно;
- `courses:assembleDebug` — успешно;
- `woof:assembleDebug` — успешно;
- `superheroes:assembleDebug` — успешно;
- `thirtydays:assembleDebug` — успешно;
- `thirtydays:testDebugUnitTest` — успешно;
- общий запуск `assembleDebug testDebugUnitTest` — успешно, 5 APK созданы.

Для сборки в ограниченной среде использовалась отдельная директория debug-keystore.
При обычном запуске Android Studio использует стандартный пользовательский keystore.

Остаются только предупреждения компилятора о будущей семантике use-site target для
resource-аннотаций и deprecated API окраски status bar в исходных учебных темах.
Они не влияют на сборку и работу приложений.

## Ограничение проверки

`lintDebug` не дошёл до анализа исходников: Android Gradle Plugin запросил
`com.android.tools.lint:lint-gradle:32.4.1`, которого не было в локальном кэше,
а доступ к `dl.google.com` в изолированной среде оказался недоступен. Это сетевое
ограничение проверки; ошибок Lint в результате не получено и не скрыто.
