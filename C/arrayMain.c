#include "arrayFunctions.h"
void main(){

  int size = 6;
  // int arr[6] = {1, 1, 7, 410, 6, 5};
  Array arr;
  int i;

  float mit;
  initArray(&arr);
  einlesenInArray(&arr);

  printf("--------------AUSGABE DES ARRAYS----------------\n");
  ausgeben(arr.array, arr.used);
  printf("\nGRÖßTE ZAHL-----------------------------------");
  printf("\n%i", groessteZahl(arr.array, arr.size));
  printf("\nMITTELWERT------------------------------------");
  printf("\n%.2f", mittelwert(arr.array, arr.used));
  printf("\n-----------------BUBBLESORT------------------- \n");
  bubblesort(arr.array, arr.size);

  freeArray(&arr);

}
