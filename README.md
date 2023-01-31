# 3.1.5TryIt
Пересмотреть названия методов в контроллере согласно конвенции https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html

задайся вопросом ЧТО ДЕЛАЕТ МЕТОД, исходя из этого составь название

Названия методов должны звучать как глаголы и отражать суть выполнения

MvcConfig - рудимент

grantedAuthorityDefaults - рудимент

зачем ты разрешил всем пользоваться /api если у тебя под этим урлом завязаны круд операции администратора? .antMatchers("/api/**").permitAll()

RestControllers переименовать в AdminController

метод что возвращает /admin можно переместить в Rest используя ModelAndView, дабы не плодить классы

зачем столько методов на поиск сущьностей в БД, оставить по 1ому методу с каждой стороны

кодстайл

все глаголы show заменить на get, ты ничего никому не показываешь

убрать @Fetch(FetchMode.JOIN) причина тут https://www.baeldung.com/hibernate-fetchmode

Разобраться для чего нужен @Transactional, где ставиться https://vladmihalcea.com/spring-transaction-best-practices/

что этот метод encodePassword делает в сервисе юзера? он не имеет никакого отношения к сущьности User

не вижу смысла проверять фронт пока не исправлены критические ошибки
