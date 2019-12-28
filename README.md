```shell script
docker pull jetbrains/teamcity-server
```

```shell script
docker run -it --name teamcity-server-instance  \
    -v ~/teamcity_server/datadir:/data/teamcity_server/datadir \
    -v ~/teamcity/logs:/opt/teamcity/logs  \
    -p 8111:8111 \
    jetbrains/teamcity-server
```