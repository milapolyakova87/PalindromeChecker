# PalindromeChecker

Этот проект представляет собой программу на Java, которая запрашивает у пользователя строку и определяет, является ли она палиндромом. 
Палиндром — это строка, которая читается одинаково в обоих направлениях (слева направо и справа налево), игнорируя регистр и пробелы. Например, строка "A man a plan a canal Panama" является палиндромом.

---

## Описание

Программа позволяет пользователю ввести строку, удаляет все пробелы и приводит строку к нижнему регистру, а затем проверяет, является ли она палиндромом. Например:
- Ввод: `A man a plan a canal Panama`
- Вывод: `Строка "A man a plan a canal Panama" является палиндромом.`

---

## Как работает программа

Ввод строки:

Пользователь вводит строку через консоль.

Очистка строки:

Программа удаляет все пробелы с помощью метода replaceAll("\\s", "") и приводит строку к нижнему регистру с помощью метода toLowerCase().

Проверка на палиндром:

Программа сравнивает символы строки с двух концов:

Сравнивает символы с начала (left) и с конца (right).

Если символы не совпадают, строка не является палиндромом.

---

## Требования 
Java Development Kit (JDK) 8 или выше.

---
   
## Контакты
Если у вас есть вопросы или предложения, свяжитесь со мной в телеграм @M1laPolyakova


Если все символы совпадают, строка является палиндромом.

Вывод результата:

Программа выводит, является ли строка палиндромом.