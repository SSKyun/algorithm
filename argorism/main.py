a = int(input())
cubes = []
for i in range(a):
    i = input()
    cubes.append(i)
cubes.sort()
for i in range(len(cubes)):
    print(cubes[i])