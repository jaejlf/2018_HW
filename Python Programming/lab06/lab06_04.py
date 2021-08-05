import turtle

turtle.setup(1000,500)
edges = 100
length = 4
angle = 3.6

#BLUE   
blue = turtle.Pen()
blue.up()
blue.goto(-150,100)
blue.down()
blue.pencolor("Blue")
blue.width(7)

#BLACK
black = turtle.Pen()
black.up()
black.goto(0,100)
black.down()
black.pencolor("Black")
black.width(7)

#RED
red = turtle.Pen()
red.up()
red.goto(150,100)
red.down()
red.pencolor("Red")
red.width(7)

#YELLOW
yellow = turtle.Pen()
yellow.up()
yellow.goto(-75,20)
yellow.down()
yellow.pencolor("Yellow")
yellow.width(7)

#GREEN
green = turtle.Pen()
green.up()
green.goto(75,20)
green.down()
green.pencolor("Green")
green.width(7)

for i in range(edges):
    blue.forward(length)     #BLUE 원 그리기
    blue.right(angle)
    
    black.forward(length)    #BLACK 원 그리기
    black.right(angle)

    red.forward(length)      #RED 원 그리기
    red.right(angle)
    
    yellow.forward(length)   #YELLOW 원 그리기
    yellow.right(angle)
    
    green.forward(length)    #GREEN 원 그리기
    green.right(angle)
    



