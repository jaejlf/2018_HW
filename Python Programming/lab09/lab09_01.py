booklist = []
textbooklist = []


###Book 클래스###

class Book():
    __counter = 0     

    #초기화
    def __init__(self,writer,title,charge,page):
        self.writer = writer
        self.title = title
        self.charge = charge
        self.page = page
        
        Book.__counter += 1


    #소멸
    def __del__(self):
        Book.__counter -= 1
        

    #출력
    def print_book():
        for i in range (len(booklist)):
            print("저자 : " + booklist[i].writer)
            print("제목 : " + booklist[i].title)
            print("가격 : " + booklist[i].charge)
            print("페이지 수 : " + booklist[i].page)
            print()

            
    #count
    def book_count():
        return Book.__counter

    

book1 = Book('이기주','언어의 온도', '13800원', '308쪽')
book2 = Book('조남주', '82년생 김지영', '13000원', '192쪽')
book3 = Book('히가시노 게이고', '나미야 잡화점의 기적','14800원', '456쪽')
book4 = Book('공지영', '할머니는 죽지 않았다', '12000원', '272쪽')


booklist.append(book1)
booklist.append(book2)
booklist.append(book3)
booklist.append(book4)



###Textbook 클래스###

class Textbook(Book):   

    #초기화
    def __init__(self,writer,title,charge,page,name,major,year,semester):
        self.name = name
        self.major = major
        self.year = year
        self.semester = semester

        Book.__init__(self,writer,title,charge,page)

        
    #출력
    def print_textbook():
        for i in range (len(textbooklist)):
            print("저자 : " + textbooklist[i].writer)
            print("제목 : " + textbooklist[i].title)
            print("가격 : " + textbooklist[i].charge)
            print("페이지 수 : " + textbooklist[i].page)
            print("교과목명 : " + textbooklist[i].name)
            print("전공 : " + textbooklist[i].major)
            print("연도 : " + textbooklist[i].year)
            print("학기 : " + textbooklist[i].semester)
            print()


    #교과목명 변경
    def change_name(self,_name):
        self.name = _name

        
    #연도 변경
    def change_year(self,_year):
        self.year = _year

        
    #학기 변경
    def change_semester(self,_semester):
        self.semester = _semester
        


textbook1 = Textbook('유석종, 이상규, 창병모','Python 프로그래밍의 이해','18000원','320쪽','프로그래밍의 이해','소프트웨어학부','2017','1학기')
textbook2 = Textbook('심준호','데이터베이스프로그래밍','13000원','258쪽','데이터베이스프로그래밍','컴퓨터과학전공','2016','1학기')
textbook3 = Textbook('Roster Provost and Tom Fawcett','Data Science for Business','37400원','414쪽','데이터사이언스개론','소프트웨어융합전공','2018','2학기')
textbook4 = Textbook('창병모','유닉스 리눅스 사용해서 프로그래밍까지','24000원','466쪽','리눅스시스템','소프트웨어학부','2014','2학기')


textbooklist.append(textbook1)
textbooklist.append(textbook2)
textbooklist.append(textbook3)
textbooklist.append(textbook4)
        
        

###실행###

print("="*50)
Book.print_book()
Textbook.print_textbook()
print("-"*50)
print("총 " + str(Book.book_count()) + "권")
print()


#삭제
del booklist[2] 
del book3


#교과목명 수정
Textbook.change_name(textbook1,"소프트웨어의 이해")


#연도 수정
Textbook.change_year(textbook2,"2017")


#학기 수정
Textbook.change_semester(textbook3,"1학기")


#삭제
del textbooklist[3]
del textbook4


print("="*18 + " 수정된  목록 " + "="*18)
Textbook.print_textbook()
print("-"*50)
print("총" + str(Book.book_count()) + "권")

