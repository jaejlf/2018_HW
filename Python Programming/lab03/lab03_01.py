import random
print("-----------------------------------")
print("           하이-로우 게임          ")
print("-----------------------------------")

answer = random.randint(1,100)
name = input("이름을 입력하세요: ")
num = int(input("도전 횟수를 입력하세요: "))
guess = 0
k = 1

while guess != answer and num > 0:
    guess = int(input(name+"님 "+str(k)+"번째 추측 값을 입력해주세요(1~100): "))
    k=k+1
    if guess < answer:
        print(guess,"은(는) 정답보다 작습니다.")
    elif guess > answer:
        print(guess,"은(는) 정답보다 큽니다.")
    num = num-1
    print(num,"번 기회가 남았습니다.")
    print()
        
if guess == answer:
    print("정답입니다.")
else:
    print("더이상 기회가 없습니다. 정답은",answer,"입니다.")
