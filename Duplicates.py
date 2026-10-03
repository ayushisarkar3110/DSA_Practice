#Find Duplicate elements

arr = [1,2,3,2,4,1]

unique = set()
duplicate = set()

for i in arr:
    if i in unique:
        duplicate.add(i)
    else:
        unique.add(i)
print("Duplicate elements : ",duplicate)

#Time: O(n)
#Space: O(n)
        
