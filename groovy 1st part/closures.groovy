List nums = [3,1,5,6,9]
nums.each 
    {
        n ->
        println n
    }

nums.each { 
    println it
    }

nums.eachWithIndex {
    n, idx ->
    println "nums[$idx] == $n"
}

Map m = [a:1, b:2, c:3]
for (String key : m.keySet()) {
    def val = m[key]
    println "map[$key] = $val"
}

m.each { e->
    println "m[${e.key}] == ${e.value}"
    }

m.each { k,v ->
    println "m[$k] == $v"
    }

10.downto(7, {println it}) // Speaking Groovy with Java accent
10.downto(7) {println it} //Idiomatic Groovy
10.downto 7, {println it} //Optional parentheses





