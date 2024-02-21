# Learn
## Node.js 에서는 파일이 서버 역할 가능
+ 서버 역할을 수행할 수 있는 코드를 입력해두고 node위에서 동작시키면 서버로써 역할을 수행가능하다.

Javascript의 큰 단점
> 장점으로는 한 페이지에 대한 편집이 쉽다는 것이다.

하지만 현대의 웹페이지는 방대한 규모의 멀티페이징이 필요하다.

+ SPA - Single Page Application
  + javascript는 single page였다.
  + 그래서 나온 게 React
    + 리액트의 어원은 chemical reactions이다. 화학반응에서 영감을 받았고, 그래서 로고가 원자 모양이다. 또한 반응성(reactivity)아는 단어가 있기에
    + 비교군으로는 imperative programing(절차형 프로그래밍)이 존재하는데, 변화한 순간 특정한 연산을 하는 것이 react이다.
    + jsx를 사용하며, virtual DOM을 사용한다.
## React
> javascript library이다. 웹프런트 기술과 WAS를 아울러서 프로그래밍하는 것으로 등장

+ 하지만 억지로 하는 거보단 서버를 java spring으로 사용하는 것이 유리했다. 그래서 프론트로 발전함. html 위주로 프로그래밍 하는 것이 아닌 html을 만들어낸다. 그래서 좀 더 유연하다.

### React의 특징
+ Component단위로 쪼갠다.
+ virtual DOM을 사용한다.
### 특징
+ src에는 html이 존재하지 않는다.
+ public에 `index.html`하나만 존재한다.
+ index.js 안에 render하는 곳에 app tag는 app.js를 가져와서 랜더 한다는 뜻
+ 태그로 표시한다는 것은 로직이 들어간 태그이다.(<App />) - 태그는 웹에서 상당히 중요
+ 이런 것을 html tag라고 하지 않고 jsx라고 부른다.

## ??
### application , applet, app
+ 많은 기능을 하는 것이 어플리케이션
+ applet : 간단한 기능 하나를 수행하는 일
+ app : 극단적으로 하나의 일을 수행하는 가장 작은 단위의 프로그래밍

component를 가지는 것을 container라고 한다.
msa에서는 controller가 service를 가진다.

### function App(){}의 역할은 int main(){}과 같다.


<\div> 태그를 지우면 에러가 발생한다.
+ Element tag의 규칙은 root element를 가져야하고, root element는 하나만 존재해야한다.

### 함수의 params로 전달할 때는 props 라는 키워드 사용


## component를 만드는 기본 기술은 Class이다.
+ 리액트는 자바스크립트 개발자이긴 하고 함수형 프로그래밍이다.
+ 자바스크립트에게 class를 통해 component를 만들라고 하는 것은 어려워서 function으로 뺐다.
+ 그래서 Tag가 대문자로 시작한다.

---  
# Do
## 코드 지시문 작성 ( 책 코드 11-1 )

+ 서버의 요청한 작업을 CRUD라고 한다.
+ 이 작업을 로컬, 네트워크, 데이터베이스 등에 따라 다름
+ 웹에서 데이터를 가지고 로직을 처리한다.

### 필요한 지식
+ 네트워크 프로그래밍
  + request할 때, 데이터를 주게된다.
  + 요청을 구분할 수 있어야한다. -> _URL_을 통해 구분
  + 이를 정리한 것이 RESTFUL
## URL의 구성요소
(프로토콜)://(컴퓨터 위치)(포트).(서비스 이름).(params)
+ 여기에서 ip 주소가 복잡하므로 도입한 것인 DNS(Domain Name Service)이다.

## code 11-1
> RESTful API를 사용해본다.

+ 우리는
+ path: 'user/:id' - 이건 거의 패턴으로 봐야한다.

+ param형식으로 보낸 경우 어떻게 정보를 받아내는지

+ 404 error는 해당 데이터가 존재하지 않는다는 응답이다.

+ 데이터베이스가 없으므로 배열을 생성해 collection에 대한 작업 수행
```javascript  
// todo  
```  


## React
movie-app에서 구현해봤다.

App.js에서 구현하기

+ /<img/>는 alt가 필요하다.
+
+
+
+

## 초기의 형태를 알기 위해 Class 경험
React를 class형식으로 생성을 해봤다.
+ class의 멤버는 data 와 method
+ js에서는 state,

## class
+ class가 해야하는 일은 추상적으로 동일한 작업에 관한 것이다. 반복될 경우 코드를 재사용한다.
+ fax가 약간 비슷하다. 복사기랑도 비슷하고 전화기랑도 비슷하다. 그래서 합쳐서 제품이 나온다.
  + 하지만 fax가 전화기는 아니다. 즉, 클래스는 핵심적인 역할을 해야한다.
+ js에서 state는 데이터 값을 관리하겠다.
+ react의 class는 element라고 생각해야 한다.
  + 그래픽 요소
  + 데이터 핸들링(이벤트 기반)
+
+ 결론 클래스를 만들면 데이터를 가지기 위해 state를 가지게 되고(은닉성을 위해) 이로 인해 함수로 프로그래밍 하는 것보다 추가적인 작업이 생기게 된다.

## 나의 생각
아 그래서 component라는 OOP를 사용하지만, class를 사용하지 않고 js의 태생적인 것을 그대로 함수형 프로그래밍을 사용하고, function으로 만든 태그의 네이밍을 대문자로 시작하는 것이구나.

### 윈도우즈 programing 주의점
+ 우리가 생각하는 것처럼 바로 그려지지 않는다. 자연스럽게 나타내기 위해서는
+ 우리가 보고 있는 것은 렌더링이다. 콘솔에 찍힌 것이 아니라 그래픽으로 나타낸 것이다. 그래픽적 요소를 가지고 계속 랜더링하는 것이다. 변할 때마다.
+ 내부에서 혼자 렌더할 시점에 랜더한다는 것이다. 그 기술은 애플릿이다. 리액트 콤포넌트의 라이프 사이클을 알아야 이것을 이해할 수 있다.


## 코드 지시문 작성 ( 책 코드 11-1 )

- 서버의 요청한 작업을 CRUD라고 한다.
- 이 작업을 로컬, 네트워크, 데이터베이스 등에 따라 다름
- 웹에서 데이터를 가지고 로직을 처리한다.

### 필요한 지식

- 네트워크 프로그래밍
  - request할 때, 데이터를 주게된다.
  - 요청을 구분할 수 있어야한다. -> _URL_을 통해 구분
  - 이를 정리한 것이 RESTFUL

## URL의 구성요소

(프로토콜)://(컴퓨터 위치)(포트).(서비스 이름).(params)

- 여기에서 ip 주소가 복잡하므로 도입한 것인 DNS(Domain Name Service)이다.

## code 11-1

> RESTful API를 사용해본다.

- 우리는

- path: 'user/:id' - 이건 거의 패턴으로 봐야한다.

- param형식으로 보낸 경우 어떻게 정보를 받아내는지

- 404 error는 해당 데이터가 존재하지 않는다는 응답이다.

- 데이터베이스가 없으므로 배열을 생성해 collection에 대한 작업 수행


`// todo`

## React Training

``` javascript
import './App.css';
import React from "react";
function LikeFood(props) {
   <h2> I like {props.name}</h2>
   <img> src = {props.image} alt = {props.name} </img> }
   const foods = [
   { name : 'hamberger', image: 'https://place-hold.it/100x200'   },
   { name : 'pizza', image: 'https://place-hold.it/100x200'   },
   { name : 'pasta', image: 'https://place-hold.it/100x200'   },
   { name : 'chicken', image: 'https://place-hold.it/100x200'   }
   ]; 
function App() {
     return (         
     <div className="App">
                  <header className="App-header">
     <div>
     <h1>Hello React</h1>                   {foods.map((food) => (                           <LikeFood props={food} />                   ))}                                    </div>             </header>         </div>     ); } export default App;
```


---  
# etc
## ToDo

## Notice

## TMI