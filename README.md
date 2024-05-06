# TDD 연습
## TDD Tips
- 테스트 코드를 먼저 만들고, 통과 시킬만큼 구현한다.
  - 아직 추가하지 않은 테스트를 고려해서 구현하지 않는다.
- 차근차근 점진적으로 단계를 밟아야 막히지 않는다.
  - "이런 건 뻔하잖아" 를 조심해라. 
  - 그러다가 옴짝달싹 할 수 없는 상태에 빠질 수 있다. (`Stucking`)
- 자주 `git commit` 을 하고, 막히면 언제든 `rollback` 한다.
- 개발중인 `class` 는 `src/test/java` 소스 폴더에 만들고, 개발을 완료한 후에 `src/main/java` 소스 폴더에 이동 시켜서 배포 대상에 포함시킨다.
- 첫 번째 테스트를 선택할 때에는 가장 쉽거나 가장 예외적인 상황을 선택해야 한다.
- 테스트를 통과한 뒤에는 개선할 코드가 있으면 리팩토링한다.
  - 리팩토링은 필수다.
  - 화장실 갔다가 손 씻는 것은 시간날 때 하는 게 아니라 바로 바로 해야 하는 것이다. 
- 리팩토링을 수행한 뒤에는 다시 테스트를 실행해서 기존 기능이 망가지지 않았는지 확인한다.
- 테스트 코드도 코드이기 때문에 개선할 코드가 있으면 리팩토링 한다.
  - 하지만, 테스트 코드의 중복을 무턱대고 제거하면 안된다.
  - 중복을 제거한 뒤에 오히려 테스트 코드 관리가 어려워 진다면 제거했던 중복을 되돌려야 한다.
- 테스트가 구체적이 될수록 코드는 범용적이게 된다.

## TDD 이점
### Debugging Time
- 디버깅에 시간을 보내고 싶지 않다.
- 코드가 동작하도록 하는데 시간을 보내고 싶다.
- `TDD`가 디버깅 시간을 최소 반으로 줄여줄 것이다.
### Design Documents
- `TDD`의 법칙을 잘 따르면 설계 문서를 얻게 된다.
- `test`는 `low level design document`이다.
### Decoupling
- 테스트를 먼저 작성하면 `production` 코드가 테스트 가능해진다.
- `TDD`로 구현하면 `decouple`된 시스템을 갖게 된다.
- 테스트를 먼저 작성하면 더 나은 설계를 얻는다.
### Courage to Change
- test가 안전벨트 역할을 수행하기 때문에 변경이 두렵지 않게 된다.
### Trust
- `TAD`(개발 후에 테스트)를 추가한다면, 그 테스트는 신뢰할 수 없다.
- `TAD`는 매우 지루하다.
- `TAD` 시간을 낭비라고 생각하게 된다.

 
# 참고자료
1. 테스트 주고 개발 시작하기 - 최범균
   - https://www.yes24.com/Product/Goods/89145195?pid=123487&cosemkid=go15827091829401613&gad_source=1&gclid=Cj0KCQjwudexBhDKARIsAI-GWYUjevGmahKwc205Ci7OpSfYqI-DUjfWDkwzMRu2J7JLiv9wcbV4Lb8aArz6EALw_wcB
2. 백명석 유튜브
   - https://www.youtube.com/@codetemplate
3. 리팩토링 2판 - 마틴 파울러
   - https://www.yes24.com/Product/Goods/89649360
4. 테스트 주도 개발 - 켄트 벡
   - https://www.yes24.com/Product/Goods/12246033