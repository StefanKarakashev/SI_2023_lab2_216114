# Втора лабораториска вежба по Софтверско инженерство

## Стефан Каракашев, бр. на индекс 216114


###  Control Flow Graph

[https://imgur.com/a/f7qEIQc](https://imgur.com/a/kAAfRo6)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.

### Тест случаи според критериумот  Every branch
https://docs.google.com/spreadsheets/d/1XAgida9wsVBM7K8XUX1XqWNsPhiquEn3abufYtoVgGw/edit?usp=sharing

### Тест случаи според критериумот Multiple Condition за условот "if (user==null || user.getPassword()==null || user.getEmail()==null)"
https://docs.google.com/spreadsheets/d/1QpK8Fu303f0j7fr0JG1125bzu9I89fq0GgpXAOMLjl0/edit?usp=sharing

### Објаснување на напишаните unit tests
Во функцијата testEveryBranch() ги тестирам четирите тест кејсови
кои го покриват сите "бренчови"

Исто и за "every condition" во фунцкијата oid testEveryCondition()
за условот "if (user==null || user.getPassword()==null || user.getEmail()==null)"
