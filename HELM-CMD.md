# Helm CLI 명령어 정리 가이드

## 🧰 기본 명령어
- `helm version`  
  Helm 버전 정보 출력
- `helm help`  
  Helm 명령어 도움말 보기
---

## 📦 Helm 차트 저장소 관리

- `helm repo add <name> <url>`  
  Helm 차트 저장소 추가  
  예: `helm repo add bitnami https://charts.bitnami.com/bitnami`

- `helm repo list`  
  등록된 저장소 목록 확인

- `helm repo update`  
  저장소 정보 업데이트

- `helm repo remove <name>`  
  저장소 삭제

---

## 🔍 Helm 차트 검색

- `helm search repo <chart-name>`  
  로컬에 등록된 저장소에서 차트 검색  
  예: `helm search repo nginx`

- `helm search hub <chart-name>`  
  Helm Hub에서 차트 검색  
  예: `helm search hub mysql`

---

## 🚀 차트 설치/업그레이드/삭제

### ✅ 설치
- `helm install <release-name> <chart-name>`  
  차트를 Kubernetes에 설치  
  예: `helm install my-release bitnami/nginx`

### 🔁 업그레이드
- `helm upgrade <release-name> <chart-name>`  
  설치된 차트를 업그레이드  
  예: `helm upgrade my-release bitnami/nginx`

### ❌ 삭제
- `helm uninstall <release-name>`  
  릴리스 삭제  
  예: `helm uninstall my-release`

---

## 📋 차트 관리

- `helm list`  
  설치된 릴리스 목록 확인

- `helm status <release-name>`  
  특정 릴리스의 상태 확인

- `helm rollback <release-name> <revision>`  
  릴리스를 이전 리비전에 롤백  
  예: `helm rollback my-release 2`

- `helm get values <release-name>`  
  릴리스에서 사용된 값 확인

- `helm get manifest <release-name>`  
  Kubernetes 매니페스트 출력

---

## 📦 차트 패키징 및 배포

- `helm package <chart-dir>`  
  차트 디렉토리를 `.tgz` 패키지로 만들기  
  예: `helm package ./my-chart`

- `helm push <chart-file> <repo-name>`  
  차트 파일을 저장소에 푸시  
  예: `helm push my-chart-0.1.0.tgz my-repo`

---

## 🧪 템플릿 렌더링 및 디버깅

- `helm template <release-name> <chart-name>`  
  실제 Kubernetes 매니페스트로 렌더링  
  예: `helm template my-release bitnami/nginx`

- `helm install <release-name> <chart-name> --debug`  
  디버그 모드로 차트 설치

---

## 📁 네임스페이스 및 값 파일

- `helm install <release-name> <chart-name> --namespace <namespace>`  
  지정한 네임스페이스에 설치  
  예: `helm install my-release bitn
