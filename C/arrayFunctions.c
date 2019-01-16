#include <stdio.h>
#include <stdlib.h>
//------------ Mittelwertberechnung ----------------//
float mittelwert(int* refArray, int size){
  int i;
  int summe = 0;

  for(i = 0; i<size; i++){
    summe += refArray[i];
  }

  return (float) summe/size;
}

//------------ Größte Zahl -----------------------//

int groessteZahl(int* refArray, int size){
  int max = refArray[0];
  int i;
  for(i=0; i<size; i++){
    if(max < refArray[i]){
      max = refArray[i];
    }
  }
  return max;
}

// ------------ Ausgabe -------------------------//

void ausgeben(int* refArray, int size){
  int i;
  for(i=0; i<size; i++){
    printf("%i\n", refArray[i]);
  }
}

//------------- Bubblesort ----------------------//

void bubblesort(int* refArray, int size){
  int i, j,tmp;

  for (i = 1; i < size ; i++) {
   for (j = 0; j < size - i ; j++) {
       if (refArray[j] > refArray[j+1]){
           tmp = refArray[j];
           refArray[j] = refArray[j+1];
           refArray[j+1] = tmp;
       }
   }
 }

  for(i=0; i<size; i++){
    printf("%i\n",refArray[i] );
  }
}
//------------------- Array Structure -------------//
typedef struct{
  int *array;
  size_t used;
  size_t size;
} Array;

//------------------- Einlesen --------------------//
void einlesenInArray(Array * arr){
  int eingabe;
  int i;

  while(eingabe != 0){
      if(arr->used == arr->size){

        arr->size += 1;
        arr->array = (int *)realloc(arr->array, arr->size * sizeof(int));
      }
        printf("\nEingabe einer Zahl: ");
        scanf("%i", &eingabe);

        if(eingabe!=0){
          arr->array[arr->used++] = eingabe;
        }else{
          arr->size-=1;
        }
  }
  printf("\n");
}

void freeArray(Array * arr){
  free(arr->array);
  arr->array=NULL;
  arr->used = arr->size = 0;
}

void initArray(Array * arr){
  arr->array=(int *)malloc(1 * sizeof(int));
  arr->used=0;
  arr->size=1;
}
