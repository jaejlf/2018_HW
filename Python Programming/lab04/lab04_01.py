print("+"*40)
print("              숙명은행 ATM              ")
print("+"*40)
name = input("계좌 소유자 이름을 입력하세요: ")
mymoney = 100000

while True:
    print("="*40)
    print("1. 입금"+"\n"+"2. 출금"+"\n"+"3. 잔액 확인"+"\n"+"4. 종료")
    print("-"*40)
    choice = input("선택: ")
    print("="*40)

    #선택 1
    if choice == "1":
        income = int(input("입금액: "))
        print(str(income)+"원이 입금되었습니다.")
        mymoney = mymoney + income

    #선택 2    
    elif choice == "2":
        outcome = int(input("출금액: "))
        
        if outcome > mymoney:
            print("잔액이 부족합니다. 인출이 이루어지지 못했습니다.")
        elif outcome <= 0:
            print("출금액을 정확히 입력하세요")
        elif outcome <= mymoney:
            print(str(outcome)+"원이 인출되었습니다.")
            mymoney = mymoney - outcome

    #선택 3        
    elif choice == "3":
        print(name+"님의 현재 잔액은 "+str(mymoney)+"원입니다.")

    #선택 4
    elif choice == "4":
        print("이용해 주셔서 감사합니다.")
        break
