while True:
    
    money = input("과세 표준 금액을 입력하세요(만원 단위): ")

    #프로그램 종료
    if money == '' :
        print("프로그램을 종료합니다.")
        break

    money = int(money)
    
    #과세 표준 금액 1200원 이하
    if money <= 1200:
        money = int(money*0.06)
        print("근로소득세는 " + str(money) + " 만원 입니다.")
        print("="*40)
        

    #과세 표준 금액 1200만원 초과 ~ 4600만원 이하
    elif 1200 < money and money <= 4600:
        money = int(72 + (money - 1200) * 0.15)
        print("근로소득세는 " + str(money) + " 만원 입니다.")
        print("="*40)
        

    #과세 표준 금액 4600만원 초과 ~ 8800만원 이하
    elif 4600 < money and money <=8800:
        money = int(582 + (money - 4600) * 0.24)
        print("근로소득세는 " + str(money) + " 만원 입니다.")
        print("="*40)


    #과세 표준 금액 8800만원 초과 ~ 3억원 이하
    elif 8800 < money and money <= 30000:
        money = int(1590 + (money - 8800) * 0.35)
        print("근로소득세는 " + str(money) + " 만원 입니다.")
        print("="*40)
        

    #과세 표준 금액 3억원 초과
    elif 30000 < money:
        money = int(9010 + (money - 30000) * 0.38)
        print("근로소득세는 " + str(money) + " 만원 입니다.")
        print("="*40)

