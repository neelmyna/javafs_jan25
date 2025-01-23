var num1="", num2="", op="";
function calc(ch){
    if(ch >= '0' && ch <= '9') {
        let box = document.getElementById("box").value;
        box += ch;
        document.getElementById("box").value = box;
    }else if(ch == '=') {
        num2 = document.getElementById("box").value;
        let expr = num1 + op + num2;
        let res = eval(expr)
        num1 = "";
        num2 = "";
        op = "";
        document.getElementById("box").value = res;
    }else if(ch == 'C') {
        num1 = "";
        num2 = "";
        op = "";
        document.getElementById("box").value = "";
    }else { // + - * / 
        num1 = document.getElementById("box").value;
        op = ch;
        document.getElementById("box").value = "";
    }
}