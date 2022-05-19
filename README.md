# Rick-and-Morty

   ОБЩАЯ ИНФОРМАЦИЯ 
Приложение поддерживает кэширование и имеет возможность работать без интернета. 
Функционал фильтрации так-же поддерживает работу без интернета. 
Все вкладки поддерживают Pull-to-Refresh.
В момент загрузки данных отображается прогресс-индикатор.
При открытии приложения отображается SplashScreenActivity. Данная активити отображается как фон, для системного Window, картинка главных героев, символизирующая приложение.
    
   ОСНОВНОЙ ЭКРАН
Основной экран содержит нижнюю навигацию с 3 вкладками: Characters, Episodes, Locations. 
После запуска приложения, первой отображается фрагмент с персонажами.
На каждой вкладке имеется доступ к фильтрации по данной вкладке. 
При нажатии на элемент из списка, открывается экран с деталями выбранного персонажа.
    
   ФРАГМЕНТ С ПЕРСОНАЖАМИ
Данный фрагмент содержит список всех персонажей, в виде таблицы с 2 столбцами. Каждый элемент содержит: название персонажа, вид, статус, пол, картинку. Данный список поддерживает пагинацию. 

   ФРАГМЕНТ С ЭПИЗОДАМИ
Данный фрагмент содержит список всех эпизодов, в виде таблицы с 2 столбцами. Каждый элемент содержит: название эпизода, номер эпизода, дату релиза. Данный список поддерживает пагинацию. 

  ФРАГМЕНТ С ЛОКАЦИЯМИ
Данный фрагмент содержит список всех локаций, в виде таблицы с 2 столбцами. Каждый элемент содержит: название локации, тип, измерение. Данный список поддерживает пагинацию. 

  ДЕТАЛИ ПЕРСОНАЖА
На данном экране отображается вся информация, которая приходит нам с сервера и полезна пользователю.
Список эпизодов отображается в виде таблицы с 2 столбцами и содержит те же данные, что и на вкладке с эпизодами.
При нажатии на эпизод отображаются детали выбранного эпизода. 

   ДЕТАЛИ ЛОКАЦИИ
На данном экране отображается вся информация, которая приходит нам с сервера и полезна пользователю.
Список персонажей отображается в виде таблицы с 2 столбцами и содержит те же данные, что и на вкладке с персонажами.
При нажатии на персонажа отображаются детали выбранного персонажа. 

  ДЕТАЛИ ЭПИЗОДА 
На данном экране отображается вся информация, которая приходит нам с сервера и полезна пользователю.
Список персонажей отображается в виде таблицы с 2 столбцами и содержит те же данные, что и на вкладке с персонажами.
При нажатии на персонажа отображаются детали выбранного персонажа.

   ИСТОРИЯ ЗАДАЧ, КОТОРЫЕ ВХОДЯТ В РЕЛИЗ

Network(JSON, Retrofit), Room, MVVM, Coroutines, Dagger2

   Api:

Содержит интерфейсы с GET запросами
Retrofit используется для получения данных в формате json.

   Db:

Используется библиотека Room.
Содержит три Entity класса для создания таблицы в базе, имя таблицы - имя класса, 
поля таблицы - поля класса(Characters, Episodes, Location)
В Dao описываются методы для работы с бд (получение, сохранение, фильтрация), а так-же SQL запросы.
Конвертеры преобразуют List<String>
CharacterDatabase - основной класс по работе с бд. В нем указаны, какие Entity будут использоваться, 
версия базы, методы для получения объектов.
Repository либо получает данные из интернета, либо работает с кэшированными данными.

   DI:

Модули, которые предоставляют требуемые объекты.
AppComponent когда будут вызываться методы и передавать туда экземпляры, то 
компонент наполнит эти экземпляры требуемыми объектами. 