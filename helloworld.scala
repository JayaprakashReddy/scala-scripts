#! This is scala script
Usage: scala helloworld.scala <NAME>
!#
var name:String="TEST";
try
{
name=args(0) match{
case a:String => a
case _ => "NoName"
}
}
catch{
case a:Exception =>{ name ="Exception" }
case _  => {name= "Something" }
}
println("Hello World! "+name)
println(s"Hello ${name}")
