print("start")
# for fruit in fruits:
#     print(fruit)
# print("*****")
# for number in range(len(fruits)):
#     print(number)
# print("#########")
# print(fruits[1])
# print(fruits[2])
fruits = ['apple', 'orange', 'pear', 'straw', "test", "hi", "fun", "hello"]
print(fruits[3])
# print(fruits[0])
# print("end hard code index")
for index in range(1, len(fruits) - 1):
    print("Current index", index)

    print("Index + 1", index + 1)
    print("Index - 1", index - 1)
    print("Value at index:", fruits[index])
    print("Value at next index", fruits[index + 1])
    print("value behind me:", fruits[index - 1])
    print("\n\n")
print("end")
