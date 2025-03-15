## Docker 
```
docker build -t seojuwon/proto-spring-app:0.0.1 .
docker push seojuwon/proto-spring-app:0.0.1
```
```angular2html
helm install my-service \
  'git+https://github.com/juwonseo84/proto-spring-helm-api.git?ref=master' \
  --install \
  --namespace proto \
  --set image.tag=$TAG
```

git clone https://github.com/juwonseo84/proto-spring-helm-api.git