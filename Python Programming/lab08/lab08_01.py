import turtle

s = turtle.Screen()
s.title("Turtle Title")

t = turtle.Pen()
t.pensize(3)

length = 50

#펜을 드는
def up():
    t.up()

#펜을 내리는
def down():
    t.down()

#좌표를 이동하는
def move(x,y):
    t.goto(x,y)

#길이를 늘리는
def long():
    global length
    if length < 100:
        length = length + 10

#길이를 줄이는
def short():
    global length
    
    if length > 10:
        length = length - 10

#정사각형
def square():
    t.begin_fill()
    for i in range(4):
        t.forward(length)
        t.right(90)
    t.end_fill()
    
#정삼각형
def triangle():
    t.begin_fill()
    for i in range(3):
        t.forward(length)
        t.right(120)
    t.end_fill()
        
#정팔각형
def octagon():
    t.begin_fill()
    for i in range(8):
        t.forward(length)
        t.right(45)
    t.end_fill()
    
#원
def circle():
    t.begin_fill()
    t.circle(length)
    t.end_fill()
    
#별
def star():
    t.begin_fill()
    for i in range(5):
        t.forward(length)
        t.right(144)
    t.end_fill()
        
#빨강
def Red():
    t.pencolor("Red")
    t.color("Red")
    
#노랑
def Yellow():
    t.pencolor("Yellow")
    t.color("Yellow")
    
#파랑
def Blue():
    t.pencolor("Blue")
    t.color("Blue")
    
#캔버스 초기화
def Reset():
    s.reset()
    
#끝
def Bye():
    s.bye()


s.onkey(up, "Up")                            #펜을 드는
s.onkey(down, "Down")                        #펜을 내리는
s.onclick(move)                              #좌표를 이동하는

s.onkey(long, "Right")                       #길이를 늘리는
s.onkey(short,"Left")                        #길이를 줄이는

s.onkey(square, "s")                         #정사각형
s.onkey(triangle, "t")                       #정삼각형
s.onkey(octagon, "o")                        #정팔각형
s.onkey(circle, "c")                         #원
s.onkey(star, "q")                           #별

s.onkey(Red,"r")                             #빨강
s.onkey(Yellow,"y")                          #노랑
s.onkey(Blue, "b")                           #파랑

s.onkey(Reset,"0")                           #캔버스 초기화
s.onkey(Bye,"1")                             #끝


s.listen()
s.mainloop()

