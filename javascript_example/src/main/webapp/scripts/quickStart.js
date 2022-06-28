/**
 * 
 */
function display() {
	alert("Welcome to java script training");
}
var app = {}
app.display = function() {

	alert("annonymous function called");
}
app.readFile = function() {
	var messageOne = document.getElementById("msg");
	alert(messageOne.innerHTML);
	var messageTwo = document.getElementsByTagName("div")[0];
	alert(messageTwo.innerHTML);//its like a getter
}
app.attachEvent = function() {
	var citytButton = document.getElementById("city");
	citytButton.addEventListener("click", function() {
		var messageOne = document.getElementById("msg");
		messageOne.innerHTML = "Best city is Chennai";//its like a  setter
	});
	var nextLink = document.getElementById("link");
	nextLink.addEventListener("click", function(event) {
		event.preventDefault();
		});
}
