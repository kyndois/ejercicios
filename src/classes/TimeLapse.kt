package classes

fun main(){
    var t1 = TimeLapse()
    println(t1)
    t1 = TimeLapse(3, 25, 42)
    println(t1)
    val t2 = TimeLapse(t1)
    println(t2)
    val t3 = TimeLapse(12930)
    println(t3)
    println()
    var t = TimeLapse()
    t.h=5
    t.m=20
    t.s=50
    println(t)
    println(""+t.h + " " + t.m + " " + t.s)

    println()
    t = TimeLapse(5, 20, 50)
    println(t.totalSec())
    println()
    t = TimeLapse(5, 20, 50)
    t.reset()
    println(t)

    println()
    t = TimeLapse(5, 50, 50)
    t.addSec(10000)
    println(t)

    println()
    t = TimeLapse(5, 50, 50)
    t.addTime(TimeLapse(2, 46, 40))
    println(t)
}

class TimeLapse {
    var h: Int = 0
    var m: Int = 0
    var s: Int = 0

    constructor()

    constructor(h: Int, m: Int, s: Int) {
        this.h = h
        this.m = m % 60
        this.s = s % 60
    }

    constructor(other: TimeLapse) {
        this.h = other.h
        this.m = other.m
        this.s = other.s
    }

    constructor(totalSeconds: Int) {
        this.h = totalSeconds / 3600
        this.m = (totalSeconds % 3600) / 60
        this.s = (totalSeconds % 3600) % 60
    }

    fun totalSec(): Int{
        return (this.s+(this.m*60)+((this.h*60)*60))
    }

    fun reset(){
        this.h = 0
        this.m = 0
        this.s = 0
    }

    fun addSec(sec:Int){
        val result = totalSec()+sec
        this.h = result / 3600
        this.m = (result % 3600) / 60
        this.s = (result % 3600) % 60
    }

    fun addTime(t:TimeLapse){
        var result = totalSec()
        result+=(t.h*60)*60
        result+=t.m*60
        result+=t.s
        this.h = result / 3600
        this.m = (result % 3600) / 60
        this.s = (result % 3600) % 60
    }


    override fun toString(): String {
        return "TimeLapse[${h}h:${m}m:${s}s]"
    }
}