fun main(args: Array<String>) {
    // Mutable
    //var x = 1
    //Immutable (Java final equiv) (Node.js const equiv)
    //val x = 4


    var x = 0
    var y = 0
    while (x < 5) {
// Exercises
       if ( y < 5 ) {
           x += 1
           if ( y < 3) x -= 1
       }
        y += 3
//
        print("$x$y ")
        x += 1
    }

}
/*
    // Mutable
    var z = 1

    while (z <= 4) {
        println(if(z == 4) "z is 4" else "z isn't 4")
        z += 1
    }

    // Slick way of running minimalized code.
    //println(if (x > y) "x is greater than y" else "x is not greater than y")

    println("Done")

    println("Before the loop and x = $x.")
    while (x < 4) {
        println("In the loop and x is $x")
        x += 1
    }
    println("After the loop and x is $x")
} */