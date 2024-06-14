fun main(args: Array<String>) {
2
    val rows = 5
3
    var k = 0
4
​
5
    for (i in 1..rows) {
6
        for (space in 1..rows - i) {
7
            print("  ")
8
        }
9
​
10
        while (k != 2 * i - 1) {
11
            print("* ")
12
            ++k
13
        }
14
​
15
        println()
16
        k = 0
17
    }
18
    for (i in rows downTo 1) {
19
​
20
        for (space in 1..rows - i) {
21
            print("  ")
22
        }
23
​
24
        for (j in i..2 * i - 1) {
25
            print("* ")
26
        }
27
​
28
        for (j in 0..i - 1 - 1) {
29
            print("* ")
30
        }
31
​
32
        println()
33
    }
34
}
