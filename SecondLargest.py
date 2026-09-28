#Second Largest element in an Array

arr = [10,25,7,45,32]

largest = float('-inf')
second = float('-inf')

for i in arr:
    if i>largest:
        second = largest
        largest = i

    elif i>second and i != largest:
        second = i


print("Second largest element : ",second)

#Time Complexity : O(n)
#Space Complexity : O(1)
