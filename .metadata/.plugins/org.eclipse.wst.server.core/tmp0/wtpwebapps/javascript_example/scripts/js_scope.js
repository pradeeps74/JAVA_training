/**
 * 
 */
var name='Global Hospital';
 phone=450778590;
function show(){
	console.log("Name :"+name);
	console.log("phone no : = "+phone);
	//var _localBranch='k.k.nagar';//this will be local variable cannot be accessed by from other functions
	  localBranch='k.k.nagar';//this is not a local variable since its defined without var even if it is inside the function
	console.log("Branch :="+localBranch);
}
function invoke(){
	show();
	console.log("Name :"+name);
	console.log("phone no : = "+phone);
		console.log("Branch :="+localBranch);
}
invoke();
