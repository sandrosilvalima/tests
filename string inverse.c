#include<stdio.h>
#include<string.h>
#include<stdlib.h>  
int main()
{
    
       char string[30],auxiliar[30];
       int a,b;
       printf("DIGITE A FRASE OU PALAVRA QUE QUER INVERTER --> ");
       gets(string); 
       b=strlen(string)-1;   
       for(a=0;string[a]!='\0';a++){       
       auxiliar[b]=string[a];
       b--;     
       }
       auxiliar[a]='\0';      
       strcpy(string,auxiliar);    
       printf("\n\nRESULTADO DA INVERSÃO --> \n%s\n\n",string);
}

