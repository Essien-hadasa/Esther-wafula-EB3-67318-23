/**
*Sorts a list in descending order using Gnome Sort algorithm.
*Returns a Pair containing the total count of (comparisons , swaps).
*/
fun gnomeSortDescending(arr:MutableList<Int>):Pair<Int>{
var comparisons=0
var swaps=0
var index=0

while(index<arr.size){
//we increment comparisons every time we check the'if' condition comparisons++
//logic:if we are at the start , or the current element is 
//smaller than or equal to the previous one , we are moving
//in the right direction for a descending sort.

if (index==0||arr[index]<=arr[index-1]){
index++}else{
//if the currentelement is larger than the previous one,
//they are out of the order for a descending list.We swap them.
val temp=arr[index]
arr[index]=arr[index-1]
arr[index-1]=temp

swaps++
//after a swap,the "gnome" steps back one position to see 
//if the swapped element needs to move further back.
index--
}
}
return Pair(comparisons ,swaps)
}

fun main(){
val numbers=mutableListOf(64,34,25,12,22,11,900
println("Original list:$numbers)
//destructing the returned Pair into two variables

val(comparisons ,swaps)=gnomeSortDescending(numbers)
println("Sorted list(descending):$numbers")
println("Total comparisons:$comparisons")
println("Total swaps : $swaps")
}
