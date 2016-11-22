def string_match(a, b):
    output = 0
    for i in range(0, len[a] - 1):
        if a[i] == b[i] and a[i+1] == b[i+1]:
            output += 1
    return output

string_match("hello", "helli")
