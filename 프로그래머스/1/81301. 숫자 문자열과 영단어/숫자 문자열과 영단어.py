def solution(s):
    number_list = ['zero','one','two','three','four','five','six','seven','eight','nine']
    for i in range(len(number_list)):
        s=s.replace(number_list[i],str(i))
        
    return int(s)