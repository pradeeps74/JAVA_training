/**
 * 
 */
var size=1.0;
function incFontSize(){
	var para=document.getElementById("firstPara");
	/*para.setAttribute("class","fontSizeUp");*/
	size=size+0.2;
	if(size<2.5){
	para.setAttribute("style","font-size:"+size+'em');}
}
function addClickEvent(){
	var imgRef=document.getElementById("increment");
	imgRef.addEventListener('click',incFontSize);
	var imgRef=document.getElementById("decrement");
	imgRef.addEventListener('click',decFontSize);
}
(function(){
	addClickEvent();
	
})();
function decFontSize(){
	var para=document.getElementById("firstPara");
	size=size-0.2;
	if(size>=1.0){
	/*para.setAttribute("class","fontSizeDown");*/
	para.setAttribute("style","font-size:"+size+'em');
}
}

