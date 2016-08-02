List nums = [3,1,5,6,78,6,544,32]
List result = []
nums.each {
    result << it * 2
    }
println result

println nums.collect { it*2 }        //map
println nums.findAll { it % 3 == 0 } //filter
println nums.sum() // reduce

List str = 'this is a list of strings'.split()
println str.collect { it[0] }
println str.collect { it.size() }
println str*.size()
println str.size()

def map = [k1:'v1',k2:'v2',k3:'v3']
println map.collect { k,v -> "$k=$v" }.join('&')
