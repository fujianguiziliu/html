//alert(123)
//专门写js代码文件
//alert("hello word");
//定义方法
function print() {
	alert("hi poal");
}
//调用方法
//print();

function sum(num1,num2) {
	return num1 + num2;
}

var ret = sum(10,11);
//alert(ret);

function submitForm() {
	//alert("submitForm");
	var form = document.getElementById("saveForm");
//	alert(form);
	form.submit();

}