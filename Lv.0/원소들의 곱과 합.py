def solution(num_list):
    answer = 0
    p =1
    hap =0
    for i in num_list:
        p*=i
        hap +=i
    if p < pow(hap,2) :
        answer = 1
    return answer