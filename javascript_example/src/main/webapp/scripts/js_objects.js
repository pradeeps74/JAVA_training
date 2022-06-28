/**
 * 
 */
//document object
//date object
function usingDateObj(){
	var birthDate=new Date();
	var option=confirm("is this your date of Birthday"+birthDate);
	if(!option){
		birthDate.setFullYear(1999,4,7);
	document.write("My birthday");
	document.write("Year"+birthDate.getFullYear());
	document.write("Month"+birthDate.getMonth());
	document.write("Date"+birthDate.getDay());
	}
	else{
		document.write("I found your birthday");
	document.write("Year"+birthDate.getFullYear());
	document.write("Month"+birthDate.getMonth());
	document.write("Date"+birthDate.getDay());
	}
	
}

//history object
//Array object
function usingArrays(){
	//Array using shortcuts
	var texts=['home','client','aboutus','Downloads'];
	writeToFile(texts);
	//Array using constructors
	var cities=new Array('chennai','salem','erode');
writeToFile(cities);
	var countries=new Array();
	countries[0]='India';
	countries[1]='Saudi Arabia';
	countries[2]='Malysia';
writeToFile(countries);
	
};
function writeToFile(items){
	document.write("<ul>");
	for(idxPos in items){
		document.write("<li>"+items[idxPos]+"</li>")
	}
	document.write("</ul>");
}
//Window object
function usingWindowObj(){
	window.location="http://www.google.com"
};
function windowObjOpen(){
	window.open('index.html','indexPage')
}
function invoke(){
	var goToGoogleButton=document.getElementById("googleBtn");
	goToGoogleButton.addEventListener('click',usingWindowObj);
	
	var openWindowButton=document.getElementById("openBtn");
	openWindowButton.addEventListener('click',windowObjOpen);
	
	var printButton=document.getElementById("printBtn");
	printButton.addEventListener('click',function(){
		window.print();
	});
};
(function(){
	invoke();
	usingArrays();
	usingDateObj();
})()