"use strict"


function f1() {
	console.log("f1().....")
}

var f2 = function() {
	console.log("f2()....")
};

var f3 = () => {
	console.log("f3()....")
};

f1()
f2()
f3()
console.log("===================")

