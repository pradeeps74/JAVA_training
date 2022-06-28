/**
 *  Examples on Different ways of writing java script functions
 */
//named functions
function simple(){
	
	console.log('Hello World');
}

/*//named functions with arguments and handling the case
where argument is not possible*/
function withArgs(name){
	if(name==null){//checking the presence of an argument
		document.write('welcome Guest');
	}
	else{
	document.write('welcome'+" "+name)
	}
}
//Named function expression
var usdToInr=function(usd){
	return usd*0.80;
};
var inrToUsd=function(inr){
	var usd= inr/0.80;
};
 
//Function taking another function as an argument

function converter(funcRef,name){
	console.log(name);
	console.log(funcRef());
};
function display(){
	return '$javascript is Interesting$';
}



(function(){
	/*simple();
	withArgs('pradeep');
	withArgs();*/
	/*//'function will get displayed' +
	console.log(usdToInr);*/
	/*//'return value of function will get displayed'+
	console.log(usdToInr(100));*/
/*	// value is undefined bcz method doesn't have return stmt'
	console.log(inrToUsd(8000));
*/
/*converter(function(){
	return 'Good Morning' 
},'Greeting Function');*/
converter(display,'pradeep');
})();
