mylist = []
same = 1
rank = 1


while True:
    print("숫자를 입력해 주세요. 끝내시려면 엔터키를 눌러주세요.")
    k = input()

    if k != '':
        k = int(k)
        mylist.append(k)
        mylist.sort(reverse = True)


    else:
        break


    
if len(mylist) != 0:
    print(mylist)
    print("="*50)
    print("최대값",mylist[0])
    print("최소값",mylist[len(mylist)-1])
    
    middle = int(len(mylist) % 2)


    #짝수 개의 숫자를 입력했을 때
    if middle == 0:
        middle_even = int(len(mylist) // 2)
        middle_even = (mylist[middle_even] + mylist[middle_even-1])/2
        print("중간값",middle_even)


    #홀수 개의 숫자를 입력했을 때
    else:
        middle_odd = int(len(mylist) // 2)
        middle_odd = mylist[middle_odd]
        print("중간값",middle_odd)
        

    #점수판
    print("="*50)
    print("점수판")
    print("="*50)


    print("1위" + ' '*5 + str(mylist[0]) + "점")
    for i in range(1,len(mylist)):
        if mylist[i] == mylist[i-1]:
            same = same + 1
            rank = rank
            print(str(rank) + "위" + ' '*5 + str(mylist[i]) + "점")
        else:
            same = same
            rank = rank + same
            print(str(rank) + "위" + ' '*5 + str(mylist[i]) + "점")
            same = 1

else:
    print("숫자가 존재하지 않습니다.")
