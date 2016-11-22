int index1 = 0;
int index2 = 0;
int output = 0;
while(true){
// for(int i = 0; i < n; i++){
    if(index1 >= a.length || index2 >= b.length)
        break;
    if(index1 > 0 && a[index1].charAt(0) == a[index1 - 1].charAt(0)){
        index1++;
        continue;
    }
    if(index2 > 0 && b[index2].charAt(0) == b[index2 - 1].charAt(0)){
        index2++;
        continue;
    }
    if(a[index1].charAt(0) == b[index2].charAt(0)){
        output++;
        index1++;
        index2++;
    } else if(a[index1].charAt(0) > b[index2].charAt(0)){
        index2++;
    } else if(b[index2].charAt(0) > a[index1].charAt(0)){
        index1++;
    }
}
return output;
