"use strict"

function f1() {
	console.log('f1()....')
}


var f4 = function() {
	console.log('f4().....')
}

var f2 = f1
var f3 = f2
f1 = f4

f3()
f2()
f1()
f4()
