korean = []
english = []

myfile = input("불러올 파일 이름을 입력하세요 : ")
print("="*30)
f = open(myfile)
korean_total = 0
english_total = 0
k = 0

while True:
    
    temp = f.readline()
    if len(temp) == 0:
        break
    temp = temp.strip()
    temp = temp.split(' ')
    
    korean.append(int(temp[0]))
    english.append(int(temp[1]))
 
    korean_total += korean[k]
    english_total += english[k]
    k += 1
    
f.close()
korean_ave = float(korean_total/k)
english_ave = float(english_total/k)
total_ave = (korean_ave + english_ave)/2

print("국어 평균 : %5.2f" %korean_ave)
print("영어 평균 : %5.2f" %english_ave)
print("총 평균 : %5.2f" %total_ave)
