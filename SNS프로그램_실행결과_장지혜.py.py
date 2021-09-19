import os
b=[]

data=[["Dracula","200604"],["Lizze","200602"],["Bare","200529"],["Phantom","200315"],["Mozart","200616"]] #정해져 있는 다섯개의 아이디, 패스워드

class Simple_login:
    def __init__(self,ID,password):
        self.ID=ID
        self.password=password

#    def login(self):

login_check=1

while login_check:
    print("Enter Your ID:",end=" ")
    ID=input()
    print("Enter Your password:",end=" ")
    password=input()

    for i in range(len(data)):
        if ID==data[i][0]:
            if password==data[i][1]:
                login_check=0
                break
#다섯번 틀릴경우
    if login_check>=5:
        print("sign in please")
        print("Make your ID:",end="")
        ID=input()
        print("Make your passowrd:",end="")
        password=input()
        data.append([ID,password])
        login_check=1

    elif login_check>=1:
        print("incorrect id or pw")
        os.system('cls')
        login_check=login_check+1

b.append(Simple_login(ID,password))
os.system('cls')

a=[]

class Simple_SNS:
    def __init__(self,name,time,timeline,tag,like,comment):
        self.name=name
        self.time=time
        self.timeline=timeline
        self.tag=tag
        self.like=like
        self.comment=comment

    def show_timeline(self):
        print("--------------------------------------------------------------------")
        print("| "+ self.name.ljust(31)+self.time.rjust(31))
        print("| "+ self.timeline.ljust(57))
        print("|                                                                   ")
        print("| "+ self.tag.ljust(62))
        print("|                                                                   ")
        print("| "+ str(self.like).ljust(3)+"명이 좋아합니다.")
        print("| "+ self.comment.ljust(62))
        print("--------------------------------------------------------------------")

    def add_good_respone(self):
        self.like=self.like+1
        return self.like

    def input_message(self,text):
        self.comment=self.comment+"\n"+"|"+" "+ID+":"+text
        return self.comment


#정해져 있는 피드
a.append(Simple_SNS("Dracula","20200604","사랑 앞에 누구도 절대 다 예외없이 항복해 다 무릎꿇고 포기해","#How_Do_You_Choose",9,"Lizze: 그 힘을 막지 못하네 마음의 선택 "))
a.append(Simple_SNS("Dracula","20200604","왜 죽어야만 하는지 죽기 위해 살 순 없어 거부해 ","#Train_Sequence",4,"Phantom: 자연의 법칙에 맞서 운명을 따라 내게 와 기다리는 내게"))
a.append(Simple_SNS("Dracula","20200604","Immordite Nosferatu","#Frash_Blood",5," "))
a.append(Simple_SNS("Lizze","20200602","황금빛 열매 그 속엔 지친 너를 구원해줄 열쇠가","#Will_You_Stay",6,"Dracula: 탐스럽게 무르익은 것 너의 품에 떨어져"))
a.append(Simple_SNS("Lizze","20200602","Sweet little sister 아픈 것은 우리를 절대 해칠 수 없어","#Sweet_Little_Sister",3,"Bare:해칠 수 없어"))
a.append(Simple_SNS("Phantom","20200601","돌이킬 순 없으니 마지막 순간 ","#Past_The_Point_Of_No_Return",15," "))
a.append(Simple_SNS("Bare","20200601","수많은 교리 속에서 길을 잃고 헤맸죠 이해할 수 없어 그저 사랑인 건데","#Absolution",49," "))
a.append(Simple_SNS("Mozart","20200601","이해하고 사랑해 주지 않나요 사랑해줘요 내 모습 그대로","#왜_나를_사랑하지_않나요",10," "))

while(1):
    os.system('cls')
    a.sort(key=lambda object : object.time,reverse=True)
    for i in range(len(a)):
        a[i].show_timeline()

    print("새 게시물은 올리려면 posting, 댓글은 comment, 좋아요는 like를 입력하세요.:",end=" ")
    act=input()
#게시물 올리기
    if act=="posting":
        print("글을 입력하세요 :",end=" ")
        text=input()
        print("태그를 입력하세요 :", end="")
        tag=input()
        a.append(Simple_SNS(ID,"20200605",text,tag,0," "))
#댓글 달기
    elif act=="comment":
        print("몇번글에 댓글? :",end=" ")
        num=int(input())
        print("댓글을 입력하세요 :", end="")
        text=input()
        a[num-1].input_message(text)
#좋아요 누르기
    elif act=="like":
        print("몇번글에 좋아요? :",end=" ")
        num=int(input())
        a[num-1].add_good_respone()
