
###시작
def print_menu():
    print("="*50)
    print("1. 타자 게임(영어단어)")
    print("2. 단어 추가")
    print("0. 종료")
    print("최단기록 : %.2f초" %record)
    print("="*50)



###선택 2 (단어 추가)
def choice_2(mywords):
    
    while True:
        print("추가할 단어를 입력하세요. 끝내려면 엔터를 두 번 입력하세요.")
        word = input("단어 : ")

        if len(word) == 0 :
            print("저장완료")
            break

        else:
            mywords.append(word)
        


###선택 1 (타자 게임)
def choice_1(mywords):
    global record
    k = 0

    while True:
        
        if len(mywords) < 10:
            print("단어가 10개 미만입니다. 단어를 추가한 뒤에 게임을 실행할 수 있습니다.")
            print()
            break

        else:
            from random import shuffle
            shuffle(mywords)
            print("준비되면 엔터!")
            print()
            start = t.time()
            
            while True:

                if k < 10:
                    print()
                    print("START!",k+1)
                    print(mywords[k])
                    answer = input()

                    if answer == mywords[k]:
                        print("[정타]")
                        k += 1

                    else:
                        print("[오타]")
                        k = k

                else:
                    end = t.time()
                    time = end - start
        
                    print("타자 시간 : %5.2f초" %time)
                    if time < record:
                        print("***신기록 달성!***")
                        record = time
                    break
            break



###선택 0 (종료)
def finish():
    global f
    f.close()
    f = open('words.txt','w')
    msg_1 = str(record) + '\n'
    f.write(msg_1)
    for word in mywords:
        msg_2 = word + '\n'
        f.write(msg_2)
    print("게임을 종료합니다.")
    


###실행
import random
import time
t = time

mylist = []
mywords = []
f = open('words.txt')
line = f.readline()
line = line.strip()
mylist.append(line)

record = mylist[0]
record = float(record)

while True:
    
    print_menu()
    menu = int(input("선택 : "))

    #선택 2
    if menu == 2:
        choice_2(mywords)

    #선택 1
    elif menu == 1:
        choice_1(mywords)

    #선택 0
    elif menu == 0:
        finish()
        break

    #잘못 입력했을 때
    else:
        print("잘못 입력했습니다. 다시 입력해주세요.")
        print()
        

f.close()


        

   
