#Check if a string is palindrome

s = "madam"

if s == s[::-1]:
    print("Palindome")
else:
    print("Not Paindrome")

#Time: O(n)
#Space: O(n)
