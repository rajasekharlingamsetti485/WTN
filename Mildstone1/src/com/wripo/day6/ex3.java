package com.wripo.day6;
import java.io.*;
import java.util.*;
class ex3
{
public long nthFibonacci(int input1){
int a=0;
int b=1;
int c=0;
int d=3;
while(d<=input1){
 c=a+b;
a=b;
b=c;
d++;
}
return c;
}
}