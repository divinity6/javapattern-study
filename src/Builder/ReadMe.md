### Builder 패턴

- 복잡한 구성의 객체를 효과적으로 생성하는 패턴


- 알려진 Builder 패턴은 2가지다
  - **Parameter**
    - 생성자의 인자가 많을때, 각 인자를 독립적으로 지정하는 패턴
  - **Procedure**
    - 객체 생성 시 여러 단계를 순차적으로 거칠 때, 이 단계의 순서를 결정해 두고,
    - 각 단계를 다양하게 구현할 수 있도록 하는 패턴

---

### 느낀점

- 즉, 생성자가 많을경우 builder 패턴을 적용할 수 있고,


- 아니면, 생성시 거쳐야할 단계가 많을 경우 builder 패턴을 적용할 수 있음


- 그리고, Procedure 빌더 패턴은 여러 패턴들( Template, Facade, Strategy )들의 응용인데,


- 실제 코드작성하다보면, 그 패턴대로 코드를 짠다기보단, 


- 이런식으로 여러패턴들을 응용해서 작성해야할 경우가 훨씬 많지

