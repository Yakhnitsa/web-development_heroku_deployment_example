### Запуск и авторизация:
    https://devcenter.heroku.com/articles/getting-started-with-java#set-up
   Авторизация (осуществляет переход в браузер на страницу авторизации):
   
    heroku login
### Создание и запуск приложения
    heroku create    
### Работа с консолью
 Запуск java
    heroku run java -version
    exit - выход из приложения
 Запуск bash
    heroku run bash
    exit - выход из консоли   
### Приложения
   Добавление приложения:
   
    heroku addons:create papertrail
   Список запущенных приложений:
   
        heroku addons
   Запуск приложения:
   
    heroku addons:open heroku-postgresql
    
### Конфигурация
   Просмотр конфигурации
    
    heroku config     
    
   Просмотр информации про базу данных
    
    heroku pg      
    
   Соединение с базой данных
    
    heroku pg:psql    