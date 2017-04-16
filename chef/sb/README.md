## Docker build

```
docker build -t ${tag_name} .
docker run --privileged -d --name ${tag_name} ${image_id} /sbin/init
docker exec -it ${tag_name} bash
```
