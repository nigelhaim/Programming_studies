import wikipedia

entry = input("Input a word: ")

meaning = wikipedia.page(entry)
source = meaning.url
print()
print(meaning.content)
print()
print(f"Source: {source}")