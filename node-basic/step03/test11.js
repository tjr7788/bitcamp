"use strict"


function fn() {
	console.log("okok");
}

fn.user = "홍길동";
fn.age= 20;
fn.plus= function(a,b) {
	console.log(a+b)
};


fn();

console.log(fn.user);

fn.plus(1,2);