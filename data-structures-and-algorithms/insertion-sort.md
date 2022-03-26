# Insertion Sort Projesi

1) `[22,27,16,2,18,6]`

- Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

    - `[2,27,16,22,18,6]` : 22 <--> 2
    - `[2,6,16,22,18,27]` : 27 <--> 6
    - `[2,6,16,22,18,27]` : 16 <--> 16
    - `[2,6,16,18,22,27]` : 22 <--> 18
    - `[2,6,16,18,22,27]` : 22 <--> 22
    - `[2,6,16,18,22,27]` : 27 <--> 27

- Big-O gösterimini yazınız.

    `O(n^2)`

- Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.

    - `O(n^2)` : Worst case
    - `O(n^2)` : Average case
    - `O(n)` &nbsp; &nbsp; : Best case

- Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

    `Average case`

2) `[7,3,5,8,2,9,4,15,6]`

- Yukarı verilen dizinin Insertion Sort'a göre ilk 4 adımını yazınız.

    - `[2,3,5,8,7,9,4,15,6]` : 7 <--> 2
    - `[2,3,5,8,7,9,4,15,6]` : 3 <--> 3
    - `[2,3,4,8,7,9,5,15,6]` : 5 <--> 4
    - `[2,3,4,5,7,9,8,15,6]` : 8 <--> 5
