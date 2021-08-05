import math

print("*"*56)
print(" "*12, "숙명여자대학교 4월 단기 주차장")
print(" "*9, "(24시간 이상 주차하실 수 없습니다.)")
print("*"*56)
print()

number = input("차량 번호를 입력하세요: ")


while True:
    come_hour = int(input("들어온 시간을 입력하세요(0-23): "))
    come_minute = int(input("들어온 분을 입력하세요(0-59): "))
    out_hour = int(input("나간 시간을 입력하세요(0-23): "))
    out_minute = int(input("나간 분을 입력하세요(0-59): "))
    

    if come_hour < 0 or come_hour > 23 or come_minute < 0 or come_minute > 59 or out_hour < 0 or out_hour > 23 or out_minute < 0 or out_minute > 59:
           print("-" * 56)
           print("입력 오류입니다. 범위를 맞추어 다시 입력해 주세요.")
           print("-" * 56)

    else:
        print("="*56)
        print(" "*12 + "'"+ number + "' " + "차량 주차료 명세서")
        print("="*56)
        print("입차 시간 : " + str(come_hour) + "시 " + str(come_minute) + "분")
        print("출차 시간 : " + str(out_hour) + "시 " + str(out_minute) + "분")
        
        
        # 자정 안 넘김
        if out_hour >= come_hour:
            
            hour = int(out_hour - come_hour)
            minute = int(out_minute - come_minute)
            
            
            if minute >= 0:
                hour = hour
                minute = minute

            else:
                hour = int(hour - 1)
                minute = int(minute + 60)
                
            

            #요금계산
            time = int(hour*60 + minute)
            
            if time <= 30:
                fee = 1500

            else:
                fee = 1500 + math.ceil((time - 30)/15)*600
                if fee > 12000:
                    fee = 12000


            
       # 자정 넘김
        else:
            first_hour = int(23 - come_hour)
            second_hour = int(out_hour)
            hour = int(first_hour + second_hour)
            
            first_minute = int(60 - come_minute)
            second_minute = int(out_minute)
            
            minute = int(first_minute + second_minute)
                
                
            if minute >= 60:
                hour = int(hour + 1)
                minute = int(minute - 60)

            
            #first_day요금계산
            first_time = int(first_hour*60 + first_minute)

            if first_time <= 30:
                first_fee = 1500

            else:
                first_fee = 1500 + math.ceil((first_time - 30)/15)*600
                if first_fee > 12000:
                    first_fee = 12000


            #second_day요금계산
            second_time = int(second_hour*60 + second_minute)

            if second_time <= 30:
                second_fee = 1500

            else:
                second_fee = 1500 + math.ceil((second_time - 30)/15)*600
                if second_fee > 12000:
                    second_fee = 12000
            
            fee = first_fee + second_fee

        total_minute = int(hour*60 + minute)
        

        print("주차 시간 : " + str(hour) + "시간" + str(minute) + "분" + "(" + str(total_minute) + "분)")
        print("-"*56)
        print("주차 요금: " +str(fee) + "원")
        #break

