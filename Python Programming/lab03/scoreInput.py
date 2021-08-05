def write_file():
    f = open(filename,'w')
    for score in myscores:
        msg = score + "\n"
        f.write(msg)
    f.close()
    

# 파일명 입력
filename = input("파일명을 입력하세요: ")

# 점수 입력
myscores=[]
while True:
    print("점수를 입력해 주세요. 끝내시려면 엔터키 두 번 눌러주세요.")
    score = input()
    if len(score) == 0:
        break
    myscores.append(score)

write_file()
print(filename,"저장 완료")



    
