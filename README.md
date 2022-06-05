# selenium-test-tasks-1

Тестовое задание 1.

1. Вход на gmail.com с помощью адреса электронной почты
	1. Шаг 1: Зайти на сайт gmail.com, в поле ввода ввести корректный адрес электронной почты
	2. Шаг 2: Нажать на кнопку "Далее", в поле ввода пароля ввести корректный пароль
	3. Шаг 3: Нажать кнопку "Далее"
	Ожидаемый рез-т: ошибка не появляется, совершается переход на другую страницу
	Фактический рез-т: совпадает с ожидаемым результатом

2. Проверка невозможности входа с помощью некорректного адреса электронной почты
	1. Шаг 1: Зайти на сайт gmail.com, в поле ввода ввести некорректный адрес электронной почты
	2. Шаг 2: Нажать на кнопку "Далее", появляется ошибка о некорректности вводимых данных
	Ожидаемый рез-т: появление сообщения об ошибке в вводимых данных, не отображается поле для ввода пароля
	Фактический рез-т: после ввода некорректного адреса электронной почты, поле для ввода почты подсвечивается красным и появляется сообщение "Не удалось найти аккаунт Google", не появляется поле для ввода пароля

3. Проверка невозможности входа с помощью некорректного номера телефона
	1. Шаг 1: Зайти на сайт gmail.com, в поле ввода некорректный номер телефона
	2. Шаг 2: Нажать на кнопку "Далее", появляется ошибка о некорректности вводимого номера телефона
	Ожидаемый рез-т: появление сообщения об ошибке в вводимых данных,не отображается поле для ввода пароля
	Фактический рез-т: после ввода несуществующего номера телефона, поле для ввода почты подсвечивается красным и появляется сообщение "Ввeдите адрес электронной почты или номер телефона.", не появляется поле для ввода пароля

4. Ввод корректной почты и некоррекного пароля
	1. Шаг 1: Зайти на сайт gmail.com, в поле ввода ввести корректный адрес электронной почты
	2. Шаг 2: Нажать на кнопку "Далее", в поле пароль ввести некорректный пароль
	3. Шаг 3: Нажать кнопку "Далее"
	Ожидаемый рез-т: появляется ошибка "Неверный пароль. Повторите попытку или нажмите на ссылку "Забыли пароль?", чтобы сбросить его."
	Фактический рез-т: совпадает с ожидаемым результатом

5. Ссылка "Забыли адрес элетронной почты?" (ручное тестирование)
	1. Шаг 1: Зайти на сайт gmail.com, нажать на "Забыли адрес электронной почты?" под полем ввода номера телефона или адреса электронной почты.
	2. Шаг 2: Ввести резервный адрес электронной почты, нажать кнопку "Далее"
	3. Шаг 3: Указать Имя и Фамилию для аккаунта Google, нажать кнопку "Далее"
	4. Шаг 4: Подтвердить отправку кода подтвеждения на резервный адрес электронной почты
	5. Шаг 5: Перейти на резервный почтовый ящик, найти письмо от noreply@google.com с кодом подтверждения, скопировать код подтвеждения
	6. Шаг 6: Перейти на вкладку с полем ввода кода подтвеждения, вставить код в поле ввода, нажать на кнопку "Далее"
	7. Шаг 7: Выбрать аккаунт для входа
	Ожидаемый рез-т: успешный переход на страницу ввода пароля от аккаунта
	Фактический рез-т: совпадает с ожидаемым результатом
