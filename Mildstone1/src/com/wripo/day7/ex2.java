package com.wripo.day7;
import java.io.*;
import java.util.*;

class ex2
{
public int allDigitsCount(int input1){

int c=0,r;
while(input1>0){
r=input1%10;
c++;
input1=input1/10;
}
return c;
}
}
