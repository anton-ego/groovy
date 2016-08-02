List nums = [3,2,6,5,67 ,8,2]
println nums
println nums.class.name
println nums[1..3]
println nums.drop(3)
println nums - 2 -5 + [2,5]
println nums*2
println nums << [3,4]
println nums << 7

nums = [3, [1, [4, [1, [5, 9], 2], 6], 5]]
println nums.flatten()
println nums
println nums*2
println nums - 3 - 5 + [[[[[2,5]]]]] //=(
println nums.flatten() - 1 - 5
