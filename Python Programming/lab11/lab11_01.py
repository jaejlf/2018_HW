# 시계의 테두리가 포함된 프로그램
 
from tkinter import *
import time
import math

tk = Tk()
canvas = Canvas(tk, width=500, height=500)
canvas.configure(background='white')
canvas.pack()

width = 500
height = 500
cx = width/2        # center x
cy = height/2       # center y

sr = height/2-50    # radius for second hand
mr = height/2-80	# radius for minute hand
hr = height/2-110	# radius for hour hand

while 1:
    t = time.localtime()    
    hour = (t[3] + t[4]/60)* 30
    minute = (t[4] + t[5]/60)*6
    second = t[5]*6
    
    month = t[1]
    date = t[2]
    day = t[6]
    _day = '월'
    if day == '0':
        _day = '월'
        
    elif day == '1':
        _day = '화'
        
    elif day == '2':
        _day = '수'
        
    elif day == '3':
        _day = '목'
        
    elif day == '4':
        _day = '금'
        
    elif day == '5':
        _day = '토'
        
    elif day == '6':
        _day = '일'

    canvas.delete("all")
    # clock outline
    canvas.create_arc(10,10,width-10,height-10, extent=359,style=CHORD, width = 2)    
    hx = hr * math.sin(hour/360 * 3.14*2)
    hy = hr * math.cos(hour/360 * 3.14*2)

    # 눈금
    for i in range(60):
        x1 = 250 + 240 * math.sin(6*i/360 * 3.14*2)
        y1 = 250 + 240 * math.cos(6*i/360 * 3.14*2)
        x2 = 250 + 230 * math.sin(6*i/360 * 3.14*2)
        y2 = 250 + 230 * math.cos(6*i/360 * 3.14*2)

        _x2 = 250 + 225 * math.sin(6*i/360 * 3.14*2)
        _y2 = 250 + 225 * math.cos(6*i/360 * 3.14*2)
        
        if i % 5 == 0:
            canvas.create_line(x1,y1,_x2,_y2, width = 3)

        else:
            canvas.create_line(x1,y1,x2,y2)
            


    # AM/PM
    if t[3] > 12:
        text = 'PM'
    else :
        text = 'AM'
    canvas.create_rectangle(cx-30,100,cx+30,130, outline = 'orange', width = 3)
    canvas.create_text(cx,115, text = text)

    # 날짜
    canvas.create_rectangle(cx-45,400,cx+45,380, outline = 'gray', width = 3)
    canvas.create_text(cx,390, text = str(month) + '월 ' + str(date) + '일' +'(' + _day + ')',fill = 'purple')
    

    # hour hand
    canvas.create_line(cx, cy, cx+hx, cy-hy, fill='Blue', width = 10)   
    mx = mr * math.sin(minute/360 * 3.14*2)
    my = mr * math.cos(minute/360 * 3.14*2)

    # minute hand 
    canvas.create_line(cx, cy, cx+mx, cy-my, fill='Green', width = 6)    
    sx = sr * math.sin(second/360 * 3.14*2)
    sy = sr * math.cos(second/360 * 3.14*2)

    # second hand
    canvas.create_line(cx, cy, cx+sx, cy-sy, fill='Red', width = 2)

    # center circle
    canvas.create_arc(cx-10, cy-10, cx+10, cy+10, extent=359,style=CHORD, width = 2, fill = 'black')
    
    time.sleep(0.1)
    tk.update()
