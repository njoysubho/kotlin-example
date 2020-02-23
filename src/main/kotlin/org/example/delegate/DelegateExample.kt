package org.example.delegate

class MyClass{
    var p:String by Delegate()

    fun checkValue():String{
        return p;
    }
    fun ops(x:Int,y:Int,op:(Int,Int)->Int):Int{
        return op(x,y)
    }
}

fun main(args:Array<String>){
    var m = MyClass();
    m.p="Hi"
    print(m.checkValue())

    var f = {x:Int,y:Int->x+y}
    print(m.ops(1,2,f))
}