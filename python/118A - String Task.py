# input consists on lowercase and uppercase letters
vowels = "aoyeui"
word = input()

# delete all the vowels
# insert "." before each consonant

# convert the word to lowercase
word = word.lower()

# delete all the vowels and insert "." while adding to new string
temp = ""
for char in word:
	if char not in vowels:
		temp += "." + char
word = temp 

print(word)