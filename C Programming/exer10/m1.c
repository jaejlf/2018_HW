#include <stdio.h>
#include <stdlib.h>

struct point{
	int x;
	int y;
};

struct rectangle{
        struct point upperLeft;
        struct point lowerRight;
};


int area(struct rectangle rec);
struct point centroid(struct rectangle rec);


int main(int argc, char *argv[]){
	struct rectangle a;
	struct point k;
	int tmp[4];
	int i;


	if(argc > 5) printf("Too many arguments!\n");
	else if((argc == 2)||(argc == 4)) printf("Wrong input!\n");

	else{

		if(argc == 3){
			printf("Enter a lower right point: ");
			for(i=0;i<2;i++){
				scanf("%d",&tmp[i]);
			}
			a.upperLeft.x = atoi(argv[1]);
        	        a.upperLeft.y= atoi(argv[2]);
			a.lowerRight.x = tmp[0];
			a.lowerRight.y = tmp[1];
		}

		else if(argc == 1){
			printf("Enter a upper left point: ");
			for(i=0;i<2;i++){
                                scanf("%d",&tmp[i]);
                        }
                        a.upperLeft.x = tmp[0];
                        a.upperLeft.y = tmp[1];

			printf("Enter a lower right point: ");
                        for(i=2;i<4;i++){
                                scanf("%d",&tmp[i]);
                        }
                        a.lowerRight.x = tmp[2];
                        a.lowerRight.y = tmp[3];
		}


		else{
			a.upperLeft.x = atoi(argv[1]);
	                a.upperLeft.y= atoi(argv[2]);
        	        a.lowerRight.x= atoi(argv[3]);
                	a.lowerRight.y= atoi(argv[4]);
		}

	        if((a.lowerRight.x <= a.upperLeft.x)||(a.upperLeft.y <= a.lowerRight.y)){
                        printf("Wrong input!\n");
                }

		else{
			printf("Area: %d\n",area(a));
	
			k = centroid(a);
			printf("Centroid: (%d, %d)\n",k.x,k.y);
		}
	}
	return 0;
}

int area(struct rectangle rec){
	int r;
	r = (rec.lowerRight.x - rec.upperLeft.x)*(rec.upperLeft.y - rec.lowerRight.y);

	return r;
}	

struct point centroid(struct rectangle rec){
	struct point a;
	a.x = (rec.upperLeft.x + rec.lowerRight.x) / 2;
	a.y = (rec.upperLeft.y + rec.lowerRight.y) / 2;

	return a;
};