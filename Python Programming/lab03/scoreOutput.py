def read_file():
    f = open(filename)
    while True:
        line = f.readline()
        if len(line) == 0:
            break
        line = line.strip()
        myscores.append(int(line))        
    f.close()


filename = input("불러올 파일 이름을 입력하세요: ")
myscores = []
read_file()
total = 0
count = 0

for score in myscores:
    print(score)
    total = total+score
    count = count+1
    score = max(myscores)

print("-----------------")
print("평균:",total/count)
print("최고점:",score)

