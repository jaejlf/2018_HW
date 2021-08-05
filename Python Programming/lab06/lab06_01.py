import turtle
t = turtle.Pen()
t.up()
t.goto(-300,0)
t.down()

#본체
for i in range(2):
    t.forward(600)
    t.right(90)
    t.forward(250)
    t.right(90)

#지붕
t.goto(0,150)
t.goto(300,0)

#문
t.up()
t.goto(-70,-250)
t.down()
for j in range(2):
    t.forward(140)
    t.left(90)
    t.forward(170)
    t.left(90)
    
#문고리
t.up()
t.goto(-50,-165)
t.down()
t.circle(7)

#창문
t.up()
t.goto(-200,-80)
t.down()
for u in range(4):
    t.right(90)
    for k in range(4):
        t.forward(40)
        t.left(90)

t.up()
t.goto(200,-80)
t.down()
for u in range(4):
    t.right(90)
    for k in range(4):
        t.forward(40)
        t.left(90)
