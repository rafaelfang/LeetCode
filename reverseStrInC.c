#include <stdio.h>
#include <string.h>
#include <stdlib.h>


void reverse(char* str){
	if(str==NULL){
		return;
	}
	char* end=str+strlen(str)-1;
	char temp;
	while(str<end){
		temp=*str;
		*str=*end;
		*end=temp;
		str++;
		end--;
	}
	
}
int main(int argc, char* argv[]) {
	char str[20]="hello";
	printf("Original String is: %s\n",str);
	reverse(str);
	printf("Reversed String is: %s\n",str);
   
}