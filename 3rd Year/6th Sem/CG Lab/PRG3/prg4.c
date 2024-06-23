#include<GL/glut.h>
#include<stdio.h>
void myinit()
{
gluOrtho2D(-500,500,-500,500);
}

void drawtriangle()
{
glBegin(GL_POLYGON);
glVertex2f(100,100);
glVertex2f(200,100);
glVertex2f(150,150);
glEnd();
}

void translate()
{
glPushMatrix();
glTranslated(100,0,0);
drawtriangle();
glPopMatrix();
}

void rotate_triangle(){
glPushMatrix();
glRotated(45,0,0,1);
drawtriangle();
glPopMatrix();
}

void pivot_point_rotate(){
glColor3f(1,1,0);
glPushMatrix();
glTranslated(100,100,0);
glRotated(45,0,0,1);
glTranslated(-100,-100,0);
drawtriangle();
glPopMatrix();
}

void scale_triangle(){
glPushMatrix();
glScaled(2,2,1);
drawtriangle();
glPopMatrix();
}

void pivot_point_scale(){
glColor3f(1,1,0);
glPushMatrix();
glTranslated(100,100,0);
glScaled(2,2,1);
glTranslated(-100,-100,0);
drawtriangle();
glPopMatrix();
}

void display()
{
glClear(GL_COLOR_BUFFER_BIT);
glClearColor(1,1,1,0);
glColor3f(1,0,0);
drawtriangle();
translate();
drawtriangle();
glFlush();
}

void menu_rotate(int id){
	switch(id){
		case 1:
			translate();
			break;
		case 2:
			rotate_triangle();
			break;
		case 3:
			pivot_point_rotate();
			break;
		case 4:
			scale_triangle();
			break;
		case 5:
			pivot_point_scale();
			break;
		default:
			exit(0);
	}
}

int main(int argc, char **argv)
{
glutInit(&argc,argv);
glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
glutInitWindowSize(500,500);
glutCreateWindow("Transformations");
myinit();
glutDisplayFunc(display);
glutCreateMenu(menu_rotate);
glutAddMenuEntry("Translate",1);
glutAddMenuEntry("Rotation about Origin",2);
glutAddMenuEntry("Rotation about fixed point",3);
glutAddMenuEntry("Scale about Origin",4);
glutAddMenuEntry("Scale about fixed point",5);
glutAddMenuEntry("Exit",6);
glutAttachMenu(GLUT_RIGHT_BUTTON);
glutMainLoop();
return 0;
}
