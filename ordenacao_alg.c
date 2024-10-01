#include <stdio.h>
#include <time.h>
#include <stdlib.h>
//bubble sort
void bubble_sort(int vet[], int tam){
int i, temp, troca=1;	
while(troca){
	troca=0;
	for(i=0;i<tam-1;i++){
		if(vet[i]>vet[i+1]){ //evita repetir troca desnecessariamente, apenas trocando qnd de fato vet[i]>vet[i+1]
			troca=1;
			temp=vet[i];
			vet[i]=vet[i+1];
			vet[i+1]=temp;
		}
	}
}
}

//selection sort
void selection_sort(int vet[], int tam){
int i, j, indice_menor, aux;	
	for(i=0;i<tam;i++){//serve p ir reduzindo o vetor à medida q os menores forem indo p esquerda
		indice_menor=i;//indice_menor=0
		for(j=i+1;j<tam;j++){//da o indice do menor elemento do vetor
			if(vet[j]<vet[indice_menor])
			indice_menor=j;
			}
			aux=vet[i];
			vet[i]=vet[indice_menor];
			vet[indice_menor]=aux;
		}
	}

//insertion sort	
void insertion_sort(int v[], int tam){	
int i, troca=1, j, aux;
	while(troca){
	troca=0;
		for(i=0;i<tam-1;i++){
		if(v[i]>v[i+1]){
			troca=1;
			for(j=i+1;j<tam;j++){
				if(v[j]<v[j-1])
				aux=v[j-1];
				v[j-1]=v[j];
				v[j]=aux;
				}	
			}		
		}		
	}
}

void imprimir(int vet[], int tam){
int i;	

printf("Vetor gerado:\n");
for(i=0;i<tam;i++){
	printf("%d ",vet[i]);	
}	
}

int main(){
int tam=6, vet[tam], i, op;

	do{
	for(i=0;i<tam;i++){
	vet[i]=rand() % 100;	
	}
	printf("Novo ");
	imprimir(vet, tam);
	printf("\nEscolha o algortimo de ordenacao do vetor:\n1 - Bubble sort\n2 - Selection sort\n3 - Insertion sort\n0 - Sair.\n");
	scanf("%d",&op);
	system("cls");
	srand(time(NULL));
		switch(op){
		
		case 0:
		break;
		
		case 1:
		imprimir(vet, tam);
		printf("\nVetor ordenado:\n");	
		bubble_sort(vet, tam);
		for(i=0;i<tam;i++){
		printf("%d ",vet[i]);	
		}
		printf("\n\n");
		break;	
		
		case 2:
		imprimir(vet, tam);
		printf("\nVetor ordenado:\n");
		selection_sort(vet, tam);
		for(i=0;i<tam;i++){
		printf("%d ",vet[i]);	
		}
		printf("\n\n");
		break;
		
		case 3:
		imprimir(vet, tam);
		printf("\nVetor ordenado:\n");
		insertion_sort(vet, tam);
		for(i=0;i<tam;i++){
		printf("%d ",vet[i]);	
		}
		printf("\n\n");
		break;
		
		default:
		printf("Opcao invalida.\n\n");	
		}
	}while(op!=0);
return 0;	
}
