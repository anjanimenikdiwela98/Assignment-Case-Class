case class Point(a: Int,b: Int) {
    def x:Int=a
    def y:Int=b
    def add(that:Point) = Point(this.x + that.x, this.y + that.y)

    def move(dx:Int, dy:Int)=Point(this.x + dx, this.y + dy)

    def distance(that:Point) : Double = {
        val xDist:Int = this.x - that.x
        val yDist:Int = this.y - that.y
        val dist: Int = xDist*xDist + yDist*yDist
        scala.math.sqrt(dist)
    }

    def invert(that:Point) = Point(this.y,this.x)
  
}

object Point extends App {

    val a = Point(4,9)
    val b = Point(8,15)
    print("Add: ")
    println(a.add(b))

    val p = a.move(3,7)
    print("Move: ")
    println(p)
    
    val q = a.distance(b)
    print("Distance: ")
    println(q)

    val r = a.invert(a)
    print("Invert: ")
    println(r)
}