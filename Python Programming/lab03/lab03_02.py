import easygui

#이름
name = easygui.enterbox("이름을 입력하세요")

#음성 통화 시간
call = easygui.enterbox("음성 통화 시간(분)을 입력하세요")
call = int(call)
if call <= 120:
    call = 0
elif call > 120:
    call = (call*60-7200)*1.98
    
#문자 건수   
text = easygui.enterbox("문자 건수를 입력하세요")
text = int(text)
if text <= 200:
    text = 0
elif text > 200:
    text = (text-200)*22

#데이터 사용량
data = easygui.enterbox("데이터 사용량(MB)을 입력하세요")
data = int(data)
if data <= 800:
    data = 0
elif data > 800:
    data = (data-800)*55
    
total = int(37400+call+text+data)

easygui.msgbox("===="+name+"님의 4월 이용요금===="+"\n"+
               "34요금제 기본 요금:37400원"+"\n"+"음성통화 초과 요금:"+
               str(int(call))+"원"+"\n"+"문자 초과 요금:"+str(int(text))+
               "원"+"\n"+"데이터 사용 초과 요금:"+str(int(data))+"원"+"\n"+
               "============================="+"\n"+
               "총 요금:"+str(total)+"원")
