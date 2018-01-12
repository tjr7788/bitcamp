"use strict"


function play(a, b, fn) {
	fn(a, b);
}



play(10, 20, function(a, b) {
	console.log(a, '+', b, '=', a + b)
});

play(10, 20, function(a, b) {
	console.log(a, '-', b, '=', a - b)
});