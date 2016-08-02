List strs = 'this is a list of strings'.split()

//Java natural sort
Collections.sort(strs)
println strs

//Java length sort
Collections.sort(strs, new Comparator<String>() 
{ 
    int compare(String s1, String s2) 
    { 
        s1.size() <=> s2.size()
    }
})
println strs
assert strs*.size() == [1,2,2,4,4,7]

//Groovy natural sort
println strs.sort(false)

//Groovy length sort
println strs.sort(false, new Comparator<String>() 
{ 
    int compare(String s1, String s2) 
    { 
        s1.size() <=> s2.size()
    }
})

//Groovy reverse lenght sort with a 2-param closure
println strs.sort(false) { s1, s2 ->
    s2.size() <=> s1.size()
}

//Groovy length sort with a 1-param closure
println strs.sort(false) { it.size() }

//Groovy sort by length, then equal lengths alphabeticaly
println strs.sort(false) { String s1, String s2 ->
    s1.size() <=> s2.size() ?: s2 <=> s1
}