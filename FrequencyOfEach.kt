fun main(arr:Array<String>){
Fre.Frequency("Hello")
}
class Fre{
    companion object{
        fun Frequency(str :String){
            val length:Int=str.length
            for (ch in 'a'..'z'){
                var counter:Int=0;
                for (i in 0 until length){
                    if(ch==str.get(i)){
                        counter++;
                    }
                }
                if(counter!=0) {
                    println(ch + "\t" + counter)
                }
            }
        }
    }

}
