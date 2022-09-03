#Consider the problem of counting, in a given text, the number of substrings that start with 
#an A and end with a B. For example, there are four such substrings in CABAAYBXA. 
#Design a brute-force algorithm for this problem and determine its efficiency class.

string = input("Input String: ").upper()
num_slice = 0
substring_count = 0
slice_count = 0

for i in string:#for loop that scans every character in the string
    num_slice = num_slice + 1#the number of character skips each character in the string based on the number of loops already made
    sliced_string = string[num_slice:]#skips each character in the string based on the number of loops already made
    if i == 'A':#if i is qual to 'A' then it will run a loop that will scan the next characters for 'B'
        for j in sliced_string:
            if j == 'B':#if the next characters has a 'B' then it will add 1 to the count of substring
                substring_count = substring_count + 1

print(substring_count)

#Psuedocode Translation 
#for i <- in string 
#   if i = 'A'
#       for j <- in string characters skipped by i iteration 
#           if j = 'B'
#               add count 
#return count