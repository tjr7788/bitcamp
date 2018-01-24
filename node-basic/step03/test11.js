/* 주제: 사용자에게서 입력 받기
- 외부에서 제공하는 'prompt'라는 nodeJS 모듈(=라이브러리=컴포넌트=플러그인)을
  추가해야 한다. 그래야 NodeJS에서 사용할 수 있다.
> npm install 모듈명
> npm install prompt

- 소스 코드에서 모듈을 사용하려면 NodeJS에게 요구해야 한다.
var 모듈을가리키는변수명 = require('모듈명');
*/
"use strict"

function f1(a, b) {
	console.log(arguments.length)
	console.log(typeof(arguments))
}

console.log(arguments.length)
console.log(arguments.arguments)

f1(10, 20)
f1(30, 20)

f1()
f1(10)
f1(10,40)
f1(10,40,40)