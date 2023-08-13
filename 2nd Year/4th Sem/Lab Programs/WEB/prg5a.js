var n = Number(prompt("Enter a number:"))
var a = 0
var b = 1
var c = 0
document.write("<h1>"+"Fibonacci Series"+"</h1>")
if(n==1){
    document.write("<h2>"+a+"\n")
}
else if(n==2){
    document.write("<h2>"+a+"<br>")
    document.write("<h2>"+b+"<br>")
}
else if(n>2){
    document.write("<h2>"+a+"<br>")
    document.write("<h2>"+b+"<br>")
    for(i=3;i<= n;i++){
        c = a + b
        a = b
        b = c
        document.write("<h2>"+c+"<br>")
    }
}
else{
    document.write("Wrong input")
}