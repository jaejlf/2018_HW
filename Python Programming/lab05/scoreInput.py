myscores = []
myfile = input("저장할 파일 이름을 입력해주세요 : ")
f = open(myfile, 'w')

while True :
    print("국어와 영어 점수를 입력해 주세요\n예) 90 85")
    score = input()
    if len(score) == 0:
        break
    myscores.append(score)

for score in myscores:
    msg = score + "\n"
    f.write(msg)
f.close()


print(myfile, "저장 완료")
