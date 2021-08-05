###시작
def print_menu():
    print("="*50)
    print(' ' *23 + "영한사전" + ' '*23)
    print("="*50)
    print("1. 단어 입력")
    print("2. 단어 조회/수정")
    print("3. 단어 삭제")
    print("4. 전체 단어 출력")
    print("5. 단어 시험")
    print("6. 종료")
    print("="*50)


###선택 1 단어입력
def choice_1(mylist):
    print()
    print("저장할 단어를 입력하세요. 끝내시려면 엔터키를 눌러주세요.")
    print()
    while 1 :
        word = input("단어 : ")

        if word == '':          
            break

        if word in mylist:                      
            print("이미 존재하는 단어입니다.")
            print()
            
        else:
            mean = input("뜻 : ")
            mylist[word] = mean
            print()



###선택 2 단어 조회/수정
def choice_2(mylist):
    print()
    print("찾으실 단어를 입력하세요.")
    word = input("단어 : ")

    while True:
        if word in mylist:
            mean = mylist[word]
            print("-"*50)
            print(word,":",mean)
            print("-"*50)
            change = input("수정하시겠습니까?[Y/N] : ")
            
            if change == 'Y':
                change_mean = input(word + " : ")
                mylist[word] = change_mean
                break

            elif change == 'N':
                break

        elif word not in mylist:
            print(word + " 은(는) 사전에 존재하지 않습니다.")
            break


###선택 3 단어 삭제
def choice_3(mylist):
    print()
    print("삭제할 단어를 입력하세요.")
    word = input("단어 : ")
    
    if word not in mylist:
        print()
        print(word + " 은(는) 사전에 존재하지 않습니다.")

    elif word in mylist:
        del mylist[word]
        print("삭제되었습니다.")
        

###선택 4 전체 단어 출력
def choice_4(mylist):
    print()
    print("-"*50)
    for word, mean in mylist.items():      
        blank = 20 - len(word)
        print(word, ' '*blank, mean)
    print("-"*50)


###선택 5 단어 시험
def choice_5(mylist):
    correct = 0
    
    if len(mylist) == 0:
        print()
        print("단어가 존재하지 않아 시험이 불가능합니다.")
            
    else:
        for word, mean in mylist.items():
            print()
            test = input(word + ": ")
            if test == mean:
                correct += 1
                print("정답입니다.")
                print()
                
            else:
                correct = correct
                print("오답입니다.")
                print()
                
        print("총 %d개 정답입니다."%correct)      


###실행-마지막
mylist = {}
print_menu()

while True:
    menu = int(input("선택 "))

    #선택 1
    if menu == 1:
        choice_1(mylist)

    #선택 2
    elif menu == 2:
        choice_2(mylist)

    #선택 3
    elif menu == 3:
        choice_3(mylist)

    #선택 4
    elif menu == 4:
        choice_4(mylist)

    #선택 5
    elif menu == 5:
        choice_5(mylist)

    #선택 6
    elif menu == 6:
        print()
        print("이용해 주셔서 감사합니다.")
        break

   # 잘못 입력했을 때
    else:
        print()
        print("잘못 입력했습니다. 다시 선택해주세요.")

    print()
    print_menu()
