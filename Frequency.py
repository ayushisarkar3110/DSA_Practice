#Count frequency of character

s = "hello"

freq = {}

for c in s:
    freq[c] = freq.get(c, 0) + 1

print(freq)

#Time: O(n)
#Space: O(k)
