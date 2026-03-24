name:Esther wafula

reg no.:EB3/67318/23

Gnome sort algorithm

it is based on the technique used by Dutch Garden Gnome sorting flower pots.since this is a descending sort;
if the current element is smaller than or equal to the previous one, gnome moves one step forward.
if the current is larger ,they are in the wrong order.the gnome swaps them and takes one step backward to see if the swapped element needs to move back even further.
the process repeats until the gnome reaches the end of the line.

HOW IT WORKS (IN MY OWN WORDS)

thinking of a person walking through a line of numbers. if the number they are looking at is smaller than the one behind it,they stay put and move to the next one.If the current number is larger ,they swap it with the one behind it and takes a step back to check if that number needs to move even further back.they keep bubbling that large number toward the front until it finds its place,then they resume moving forward.

COMPLEXITY ANALYSIS
(I).TIME COMPLEXITY
1.Best case 0(n):
happens when the list is already sorted in descending order.the gnome walks from the start to the end without stepping back.
2.Average case 0(n^2):
for every few steps forward, the gnome must take several steps back to reposition elements.
3.worst case 0(n^2):
occurs when thw list is in perfect ascending ,every element must be moved all the way to the front of the list.
(II).SPACE COMPLEXITY 0(1):
it uses a single temporary variable to facilitate the swaps and does not require additional list or significant memory.

HOW THE ALGORITHM SORTS SMALL LIST:[12,63,22](descending)
a).start:index 0.move to index 1.   
(b).compare 63 and 12:since 63>12,we swap.list:[64,12,22].step back to index 0.     (c).index is 0:move to index 1.
(d).compare 12 and 63:12<=63is true.move to index 2.   
(e).compare 12 and 22:since 22>12,we swap.list:[63,22,12].step back to index 1.      (f).compare 22 and 63:22<=63 is true .move to index 2.
(g).index reaches end:sorting complete.



