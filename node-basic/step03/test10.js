"use strict"


function Score(name, kor, eng, math) {
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.sum = this.kor + this.eng + this.math;
	this.aver = this.sum / 3;
}

var s1 = new Score("홍길동", 100, 100 ,100);
var s2 = new Score("임꺽정", 100, 100 ,100);
var s3 = new Score("유관순", 100, 100 ,100);


function displayScore(score) {
	console.log(score.name, score.kor, score.eng, score.math, score.sum, score.aver);
}


displayScore(s1)
displayScore(s2)
displayScore(s3)