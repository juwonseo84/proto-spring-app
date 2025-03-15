# Helm Chart 저장소 관리 방안

## 1. 개요
Helm 차트를 효과적으로 관리하기 위한 방법으로, Helm 차트를 저장하고 배포하는 저장소 관리 방안에 대해 다룹니다. ChartMuseum과 같은 사설 Helm 차트 저장소를 활용하거나, GitHub/Bitbucket 등 Git 저장소와 연동하여 관리할 수 있습니다.

---

## 2. Helm 저장소 유형

### 2.1 공용 Helm 저장소
- Helm Hub 또는 Artifact Hub와 같은 공용 저장소를 사용하여 차트를 관리.
- 공개된 차트로 다른 사용자도 사용 가능.

### 2.2 사설 Helm 저장소
- **ChartMuseum**: Helm 차트를 저장하고 관리하는 사설 저장소.
- GitHub 또는 Bitbucket과 연동하여 CI/CD 파이프라인을 통해 자동으로 Helm 차트를 업로드하고 배포 가능.

---
## 3. ChartMuseum 설치 및 운영
````angular2html

proto-spring-app/
├── src/...
├── charts/
│   └── proto-spring-app/
│       ├── Chart.yaml
│       ├── values.yaml
│       └── templates/

````        
