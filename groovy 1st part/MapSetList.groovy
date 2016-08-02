def map = [a:1, b:2, c:3]
map.put('d',3)
map['e'] = 1
map.f = 3
println map
println map.getClass().name

def nums1  = [3,1,4,1,5,2,9,4,8,4]
println nums1
println nums1.class.name

def nums2  = [3,1,4,1,5,2,9,4,8,4] as LinkedList
println nums2
println nums2.class.name

def nums3  = [3,1,4,1,5,2,9,4,8,4] as Set
println nums3
println nums3.class.name

def nums4  = [3,1,4,1,5,2,9,4,8,4] as SortedSet
println nums4
println nums4.class.name

def str = 'this is a list of string'.split()
println str
println str.class.name

List lstr = 'this is a list of string'.split()
println lstr
println lstr.class.name

List<Integer> nums5 = [3,1,5,6, 'abc']
nums5 << new Date()
println nums5
println nums5.class.name





