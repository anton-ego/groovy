import groovy.transform.*
@Canonical
/* @Cannonical is synonym to all the next:
@ToString 
@EqualsAndHashCode
@TupleConstructor //take arguments in order without naming
*/
class Person1 {
String first
String last
/*    void setLast(String last) {
        println 'inside setLast'
        this.last = last
        }
    String toString() {"$first $last"}
*/
}

Person1 t1 = new Person(first: 'Hanley', last: 'Ramirez')
Person1 t2 = new Person(first: 'Hanley', last: 'Ramirez')
Person1 t3 = new Person('AA','ZZ')
//p.setFirst('David')
//p.last = 'Ortiz'
println t1.toString() //"${p.getFirst()} ${p.last}"
    
Person f = new Person1(first: 'Pink', last: 'Floyd')
println f == t1
println f != t2
println t2 == t3
Set people = [f,t1, t2, t3]
println people.size()

