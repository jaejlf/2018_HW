import turtle

turtle.setup(600,600)
s = turtle.Screen()
s.title("제목을 정해주세요")

t= turtle.Turtle()
t.pensize(3)
t.color('black')

length= 50

def up():
    t.up()

def down():
    t.down()

def move(x,y):
    t.goto(x,y)

def square():
    t.begin_fill()
    for i in range(4):
        t.fd(length)
        t.rt(90)
    t.end_fill()


s.onclick(move)
s.onkey(up,"Up")
s.onkey(down, "Down")

s.onkey(square, 's')

s.listen()
s.mainloop()
