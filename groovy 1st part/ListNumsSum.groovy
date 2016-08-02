List nums = [3,1,4,1,5,9,2,6,5]
println nums
println nums.sum()

//Java approach
int total = 0
for (int n : nums) {
    total += 2 * n
}
assert total == 72

//Groovy using collect
assert 72 == nums.collect { it * 2 }.sum()

//Reduce to a problem already solved
assert 72 == nums.sum() * 2

// sum with a closure
assert 72 == nums.sum { it * 2 }

//sum with spread-dot
assert 72 == nums*.multiply(2).sum()

//double the collection
assert 72 == (nums * 2).sum()

//use inject
assert 72 == nums.inject(0) { acc, val -> 
    println "acc=$acc, val=$val"
    acc + 2 * val
}

