## Стянуть образ Docker

```shell script
docker pull jetbrains/teamcity-server
```

## Создать в домашней директории папки
```
~/teamcity_server/datadir
~/teamcity/logs
~/teamcity_agent
```

## Запустить сервер
```shell script
docker run -it --name teamcity-server-instance \
    -v ~/teamcity_server/datadir:/data/teamcity_server/datadir \
    -v ~/teamcity/logs:/opt/teamcity/logs \
    -p 8111:8111 \
    jetbrains/teamcity-server
```

## Авторизоваться на сервере как супер пользователь

URL: http://localhost:8111

## Скачивание и запуск агента
1. перейти на вкладку агенты и скачать **zip** в директорию **~/teamcity_agent**
1. распаковать архив в директриии **~/teamcity_agent** командой 
```shell script
unzip -d buildAgent buildAgent.zip
```
1. скопировать файл
```shell script
cp ~/teamcity_agent/buildAgent/conf/buildAgent.dist.properties ~/teamcity_agent/buildAgent/conf/buildAgent.properties
```
1. запустить агента
```shell script
sh ~/teamcity_agent/buildAgent/bin/agent.sh start
```
1. На сервере перейти 
> Agents -> Unauthorized -> Выбрать агента -> Нажать Authorize

## Важно! Какая либо сборка происходит на машине расположения агента.
Так же Maven репозиторий агента располагается по пути //TODO: ....