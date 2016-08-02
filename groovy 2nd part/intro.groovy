def x =1 
println x.class.name
x = 'abc'
println x.class.name
x = new Date()
println x.class.name
x = 1.0
println x.class.name

def nums = [ 3, 5 , 6,7,  8,9] as SortedSet
println nums
println nums.class.name
def map = [a:1, b:2, c:2]
println map
println map.keySet()
println map.entrySet()
println map.values()

map.d = 3
map['e'] = 2
map.put('f', 1)
println map

List strings = 'this is a list of dtrings'.split()
println strings
println strings.class.name
strings.eachWithIndex { s, idx ->
    println "strings[${idx*2}] == $s"
}

boolean isPalindrome(String s) {
    // \w --> a-zA-Z0-9_
    // \W the opposite of \w
    String test = s.toLowerCase().replaceAll(/\W/,'')
    test == test.reverse()
    
}

println isPalindrome("Madam, in Eden, I'm Adam")
println isPalindrome("Flee to me, remote elf!")
println isPalindrome("Go hang a salami, I'm a lasagna hog")
println isPalindrome("not a one")

assert isPalindrome("Madam, in Eden, I'm Adam")
assert isPalindrome("Flee to me, remote elf!")
assert isPalindrome("Go hang a salami, I'm a lasagna hog")
assert !isPalindrome("not a one")

import groovy.transform.*
@Canonical
class Person {
    String first
    String second
}
/*
Person p1 = new Person(first: 'Larry', second: 'Gag')
Person p2 = new Person(first: 'Larry', second: 'Gag')
Person p3 = new Person('Larry','Gag')
Person p4 = new Person(first: 'Harry', second: 'Bag')
println p1 == p2
println p1 == p3
Set people = [p1,p2,p3, ]
println people
*/
Person p1 = new Person(first: 'Larry', second: 'Gag')
Person p2 = new Person(first: 'Harry', second: 'Bag')
Person p3 = new Person('Robert','Parrish')

List people = [p1,p2,p3]
println people*.second
//Person p1 = new Person(first: 'Barry', second: 'Fag')
println people.collect {"$it.first $it.second"}
              .findAll {it.size() > 10}
              .join(',' )











