# docker sbt

```
$ sbt docker:publishLocal
...

$ docker images
REPOSITORY          TAG                 IMAGE ID            CREATED              SIZE
docker-ex           0.1.0-SNAPSHOT      ba2f852c1d94        About a minute ago   694 MB

$ docker run -d -p 8080:8080 docker-ex:0.1.0-SNAPSHOT

$ curl -i http://localhost:8080/
HTTP/1.1 200 OK
Content-Length: 0

$ docker ps
CONTAINER ID        IMAGE                      COMMAND             CREATED             STATUS              PORTS                    NAMES
5b77e01ded8a        docker-ex:0.1.0-SNAPSHOT   "bin/docker-ex"     2 minutes ago       Up 2 minutes        0.0.0.0:8080->8080/tcp   determined_bhabha
```
