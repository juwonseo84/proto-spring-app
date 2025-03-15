## Docker 
```
docker build -t seojuwon/demo-app:1.0.1 .
docker push seojuwon/demo-app:1.0.1
```
```angular2html
helm upgrade my-service \
  'git+https://github.com/juwonseo84/proto-spring-app.git?ref=master' \
  --install \
  --namespace proto \
  --set image.tag=$TAG
```