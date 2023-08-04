def solution(arr, queries):
    e=''
    for i in queries:
        e = arr[i[1]]
        d = arr[i[0]]
        arr[i[0]] =e
        arr[i[1]] =d
        
    return arr