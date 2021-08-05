import easygui
import random

computer = random.randint(1,3)
computer_score = 0
me_score = 0
k = 1

while computer_score < 3 and me_score < 3:
    
    me = easygui.buttonbox(str(k) + "번째 판\n가위 바위 보 중 하나를 선택하세요", choices = ['가위', '바위', '보'])

    if me == '가위' and computer == 2:
        computer_score += 1
        easygui.msgbox("컴퓨터는 바위를 냈습니다. 당신이 졌습니다.\n컴퓨터 %d : %d 사용자" %(computer_score, me_score))
        k += 1
        
    elif me == '가위'and computer == 3:
        me_score +=1
        easygui.msgbox("컴퓨터는 보를 냈습니다. 당신이 이겼습니다.\n컴퓨터 %d : %d 사용자" %(computer_score, me_score))
        k += 1
        
    elif me == '바위' and computer == 1:
        me_score +=1
        easygui.msgbox("컴퓨터는 가위를 냈습니다. 당신이 이겼습니다.\n컴퓨터 %d : %d 사용자" %(computer_score, me_score))
        k += 1

    elif me == '바위' and computer == 3:
        computer_score +=1
        easygui.msgbox("컴퓨터는 보를 냈습니다. 당신이 졌습니다.\n컴퓨터 %d : %d 사용자" %(computer_score, me_score))
        k += 1

    elif me == '보' and computer == 1:
        computer_score +=1
        easygui.msgbox("컴퓨터는 가위를 냈습니다. 당신이 졌습니다.\n컴퓨터 %d : %d 사용자" %(computer_score, me_score))
        k += 1

    elif me == '보' and computer == 2:
        me_score +=1
        easygui.msgbox("컴퓨터는 바위를 냈습니다. 당신이 이겼습니다.\n컴퓨터 %d : %d 사용자" %(computer_score, me_score))
        k += 1

    else:
        if computer == 1:
            same = '가위'
        elif computer == 2:
            same = '바위'
        else:
            same = '보'
        easygui.msgbox("모두 " + same + "를 냈습니다. 비겼습니다.\n컴퓨터 %d : %d 사용자" % (computer_score, me_score))


if computer_score == 3:
    easygui.msgbox("컴퓨터 %d : %d 사용자\n컴퓨터가 우승했습니다." % (computer_score, me_score))

else:
    easygui.msgbox("컴퓨터 %d : %d 사용자\n당신이 우승했습니다." % (computer_score, me_score))
