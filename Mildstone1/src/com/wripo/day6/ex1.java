package com.wripo.day6;
import java.io.*;
import java.util.*;
class ex1
{
public int isPrime(int input1){
int cnt=0;
for(int i=1;i<=input1;i++){
if(input1%i==0) cnt++;
}
if(cnt==2) return 2;
else return 1;
}
}



