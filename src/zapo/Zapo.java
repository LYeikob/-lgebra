/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zapo;
import java.util.Scanner;
/**
 *
 * @author l_ryu_000
 */
public class Zapo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Captura =new Scanner(System.in);
        boolean imp = false;
        double NumerosC[][]=new double [2][10];
        
        System.out.println("ESTE programa realiza las 7 operaciones vasicas de suma , resta , multiplicacion , division ,Cartesiana a polar , polar a cartesiana y teorema de mourie");
        for (int y=0; y<2; y++){
            for (int x=0; x<2; x++){
                if(x==0){
                    System.out.println("ingresa la parte real del numero complejo "+ (y+1) +":");
                    NumerosC[0][y]=Captura.nextDouble();              
                }
                if(x==1){
                    System.out.println("ingresa la parte imaginaria del numero complejo "+ (y+1) +":");
                    NumerosC[1][y]=Captura.nextDouble();                    
                }
                
            }
        }
        
        //presentacion de datos
        
        
        for (int y=0; y<2; y++){
            for (int x=0; x<2; x++){
                if(x==0){                   
                System.out.print(NumerosC[x][y]+" ");
                }              
                if(x==1){
                    if(NumerosC[x][y]>=0){
                        System.out.print("+ "+NumerosC[x][y]+"i");
                    }
                    if(NumerosC[x][y]<0){
                        System.out.print("+ "+NumerosC[x][y]+"i");
                    }
                    
                }      
            }
        
            System.out.print("\n\n");
        }
        
        
        
        
        
        //operaciones
        
        
        
        
        
        
        
        
                System.out.println("1)suma");
                System.out.println("2)resta");
                System.out.println("3)multiplicasion");
                System.out.println("4)division");
                System.out.println("5)Exponencial o polar");
                System.out.println("6)Exponencial o polar viseversa");
                System.out.println("7)Teorema de mourie");
                System.out.println("\n selecciona operacion");
                int a;
                
                a=Captura.nextInt();
                
            switch(a){
                case 1:    
                    System.out.println("suma");
                    NumerosC[0][2]=NumerosC[0][0]+NumerosC[0][1];
                    NumerosC[1][2]=NumerosC[1][0]+NumerosC[1][1];
                   break;
                case 2:
                    System.out.println("resta");
                    NumerosC[0][2]=NumerosC[0][0]-NumerosC[0][1];
                    NumerosC[1][2]=NumerosC[1][0]-NumerosC[1][1];
                   break;
                case 3:    
                    System.out.println("multiplicasion");
                    NumerosC[0][2]=NumerosC[0][0]*NumerosC[0][1];
                    NumerosC[1][2]=NumerosC[0][0]*NumerosC[1][1];
                    NumerosC[1][3]=NumerosC[1][0]*NumerosC[0][1];
                    NumerosC[0][3]=NumerosC[1][0]*NumerosC[1][1];
                    if (NumerosC[0][3]>=0){
                        
                        System.out.println("suma");
                    NumerosC[0][4]=NumerosC[0][2]+ (NumerosC[0][3] * -1);
                    NumerosC[1][4]=NumerosC[1][2]+NumerosC[1][3];
                    }
                    if (NumerosC[0][3]<0){
                        
                    System.out.println("suma");
                    NumerosC[0][4]=NumerosC[0][2]+ (NumerosC[0][3] * -1);
                    NumerosC[1][4]=NumerosC[1][2]+NumerosC[1][3];
                    }
                    break;    
                case 4:
                    //programacion de la división
                    System.out.println("division");
                    //2da division por default
                    
                    NumerosC[0][2]=NumerosC[0][1];
                    NumerosC[1][2]=NumerosC[1][1]*-1;
                    NumerosC[0][3]=NumerosC[0][1];
                    NumerosC[1][3]=NumerosC[1][1]*-1;
                    
                    //inicio de la division
                    
                    //resultado de los numeradores
                    NumerosC[0][4]=NumerosC[0][0]*NumerosC[0][2]; //resultado de la 1 divicion en el numerador
                    NumerosC[1][5]=NumerosC[0][0]*NumerosC[1][2]; //resutado de las 2da division en el numerador
                    NumerosC[0][5]=NumerosC[1][0]*NumerosC[0][2]; //resutado de las 3ra division en el numerador
                    NumerosC[1][4]=NumerosC[1][0]*NumerosC[1][2]; //resutado de las 4ta division en el numerador
                    NumerosC[0][6]=NumerosC[0][1]*NumerosC[0][3]; //resultado de la 1ra division en el denominador
                    NumerosC[1][6]=NumerosC[1][1]*NumerosC[1][3]; //resultado de la 2da division en el denominador
                    
                    //cambio de numeros imaginarios a numeros reales
                    NumerosC[0][7]=NumerosC[1][4]*-1; //resultado de la 2da division en el denominador
                    NumerosC[1][7]=NumerosC[1][6]*-1; //resultado de la 2da division en el denominador
                    
                    //resultado
                    
                    NumerosC[0][8]=NumerosC[0][4]+NumerosC[0][7]; //2do resultado de la 2da division en el numerador
                    NumerosC[1][8]=NumerosC[0][5]+NumerosC[1][5]; //2do resultado de la 2da division en el numerador
                    NumerosC[0][9]=NumerosC[0][6]+NumerosC[1][7]; //2do resultado de la 2da division en el denominador
                    NumerosC[1][9]=NumerosC[0][6]+NumerosC[1][7]; //2do resultado de la 2da division en el denominador
                    break;                
                case 5:
                    imp=true;
                    System.out.println("POLAR");
                    
        //operacion de vector o numero compejo 
        //el cuadrado de "x" y "y"
        NumerosC[0][1]= NumerosC[0][0] * NumerosC[0][0];  //el cuadrado de el numero real 1
        NumerosC[1][1] = NumerosC[1][0] * NumerosC[1][0]; //el cuadrado de el numero imaginario 1
        NumerosC[0][2] = NumerosC[0][1] + NumerosC[1][1]; //la suma de los cuadrados
        
        //raiz cuadrada de el resultado sumado de los cuadrado "x" y "y" 
        NumerosC[1][2] = Math.sqrt(NumerosC[0][2]); //hipotenusa
        System.out.println("hipotenusa = "+NumerosC[1][2]);   
        
        
        //operacion de la tangente y convercion a grados para el cuadrante 1 , 2 y 4
        NumerosC[0][4] = Math.atan2(NumerosC[1][0], NumerosC[0][0]); //tangente inversa

        NumerosC[1][3] = Math.toDegrees(NumerosC[0][4]); //radianes a grados
        System.out.println("resultado de la tangente en grados = " + NumerosC[1][3] + "º");
        if (NumerosC[0][0]>=0){
            if(NumerosC[1][0]>=0){
         
        if (NumerosC[0][0]>=0){
            if (NumerosC[1][0]>=0){
                //cuadrante 1 cuando "x" y "y" son positivos
            NumerosC[0][4]= 360-NumerosC[1][3];
            System.out.println("NumerosC[0][4] "+NumerosC[0][4]); //angulo faltante en este caso el resultado anterior -360
            NumerosC[1][4] = NumerosC[0][4]*-1; // pasarlo a positivo el angulo
            NumerosC[0][5] = Math.toRadians(NumerosC[1][4]); //grados a radianes
            NumerosC[1][5] = Math.cos(NumerosC[0][5]);
            NumerosC[0][6] = NumerosC[1][2] * NumerosC[1][5];
            System.out.println("R= "+NumerosC[1][2]+"(Cos "+NumerosC[1][3]+"+ iSen "+NumerosC[1][3]+")");      
            System.out.println("Exp = "+NumerosC[1][2]+" e  "+NumerosC[1][3]);
            System.out.println("Fp = "+NumerosC[1][2]+"(Cos "+NumerosC[1][3]+") = "+NumerosC[1][3]+ " Este resultado es grados");
            
            //paso para la inversa
            
            
            
            
        }
        }        
        }
            else{
                //cuadrante 4 cuando "x" es positivo y "y" es negativo
                NumerosC[0][4]= 360+NumerosC[1][3];
            System.out.println("gt "+NumerosC[0][4]);
            NumerosC[1][4] = NumerosC[0][4]*-1;
            NumerosC[0][5] = Math.toRadians(NumerosC[1][4]);
            NumerosC[1][5] = Math.cos(NumerosC[0][5]);
            NumerosC[0][6] = NumerosC[1][2] * NumerosC[1][5];
            System.out.println("R= "+NumerosC[1][2]+"(Cos "+NumerosC[0][4]+"+ iSen "+NumerosC[0][4]+")");      
            System.out.println("Exp = "+NumerosC[1][2]+" e  "+NumerosC[0][4]);
            System.out.println("Fp = "+NumerosC[1][2]+"(Cos "+NumerosC[0][4]+") = "+NumerosC[0][6]+ " Este resultado es grados");
            }
        }
        else if (NumerosC[0][0]<0){
            if (NumerosC[1][0]>=0){
                //cuadrante 2 cuando "x" es negativo y "y" es positivo
                NumerosC[0][4] = 360 + NumerosC[1][3];
                NumerosC[1][4] = NumerosC[0][4]*-1;
            NumerosC[0][5] = Math.toRadians(NumerosC[1][4]);
            NumerosC[1][5] = Math.cos(NumerosC[0][5]);
            NumerosC[0][6] = NumerosC[1][2] * NumerosC[1][5];
                System.out.println("R= "+NumerosC[1][2]+"(Cos "+NumerosC[1][3]+"+ iSen "+NumerosC[1][3]+")");
                System.out.println("Exp = "+NumerosC[1][2]+" e "+NumerosC[1][3]);
                System.out.println("Fp = "+NumerosC[1][2]+"(Cos "+NumerosC[1][3]+") ="+NumerosC[0][6]+"");
                //hipotenusa y grados convierta a cartesiana
                
            }
            else if(NumerosC[1][0]<0){
                //cuadrante 3 cuando "x" es negativo y "y" es negativo
                System.out.println("el cuadrante x y y es negativo");
               NumerosC[0][4]= 360+NumerosC[1][3];
            System.out.println("NumerosC[0][4] "+NumerosC[0][4]);
            NumerosC[1][4] = NumerosC[0][4]*-1;
            NumerosC[0][5] = Math.toRadians(NumerosC[1][4]);
            NumerosC[1][5] = Math.cos(NumerosC[0][5]);
            NumerosC[0][6] = NumerosC[1][2] * NumerosC[1][5];
            System.out.println("R= "+NumerosC[1][2]+"(Cos "+NumerosC[0][4]+"+ iSen "+NumerosC[0][4]+")");      
            System.out.println("Exp = "+NumerosC[1][2]+" e  "+NumerosC[0][4]);
            System.out.println("Fp = "+NumerosC[1][2]+"(Cos "+NumerosC[0][4]+") = "+NumerosC[0][6]+ " Este resultado es grados");
            }
        }   break;
                case 6:
                    System.out.println("INVERSA POLAR");
            NumerosC[0][9]= NumerosC[0][0] *(Math.cos(((NumerosC[1][0]*Math.PI)/180)));
            NumerosC[1][9]= NumerosC[0][0] * (Math.sin(((NumerosC[1][0]*Math.PI)/180)));
                    
                    break;
                    
                    
                case 7:
                    imp = true;
                    System.out.println("Teorema de mourie");
        System.out.println("1) es exponente real\n 2) raiz");
        NumerosC[1][1]= Captura.nextDouble();        
        if (NumerosC[1][1] == 1){
            System.out.println("ingresa la potencia ");
            NumerosC[0][1]= Captura.nextDouble();
            for (NumerosC[0][5]=0; NumerosC[0][5]<=NumerosC[0][1]-1; NumerosC[0][5]++){
            System.out.print("("+NumerosC[0][0]+"+"+NumerosC[1][0]+ ")");    
            }
            
            
            NumerosC[1][7] = NumerosC[0][0] + NumerosC[1][0];
            NumerosC[1][8] = Math.pow(NumerosC[1][7], NumerosC[0][1]);
                        
                System.out.print(" = "+NumerosC[1][8]);
            System.out.println("\n");
            
        }else if (NumerosC[1][1] == 2){
            System.out.println("ingresa la potencia ");
             NumerosC[1][3]= Captura.nextDouble();
             NumerosC[1][4]= Math.pow(NumerosC[0][0], 1/NumerosC[1][3]);//potencia
            for (NumerosC[0][5]=0; NumerosC[0][5]<=NumerosC[1][3]-1; NumerosC[0][5]++){
                NumerosC[0][6] = 360*NumerosC[0][5];
                NumerosC[0][7] = NumerosC[1][0]+NumerosC[0][6]/NumerosC[1][3];    
                NumerosC[1][6] = Math.toRadians(NumerosC[0][7]);
                NumerosC[1][7] = Math.cos(NumerosC[1][6]);
                NumerosC[1][8] = Math.sin(NumerosC[1][6]);
                System.out.println(+NumerosC[0][0]+"^1/"+NumerosC[1][3]+" (cos "+NumerosC[1][0]+"+"+NumerosC[0][6]+"/"+NumerosC[1][3]+" +Isen "+NumerosC[1][0]+"+"+NumerosC[0][6]+"/"+NumerosC[1][3]+") =  "+NumerosC[0][0]+"^1/"+NumerosC[1][3]+" (cos "+NumerosC[0][7]+" +Isen "+NumerosC[0][7]+") = "+NumerosC[0][0]+"^1/"+NumerosC[1][3]+" ("+NumerosC[1][7]+" + "+NumerosC[1][8]+")");   
            }
        }
                 break;
                    default: System.out.println("numero invalido");
                            break;
}
            //presentacion de resultados
            if (imp == false){
            for (int y=0; y<=9; y++){
            for (int x=0; x<=9; x++){
                if(x==0){                   
                System.out.print(NumerosC[x][y]+" ");
                }              
                if(x==1){
                    if(NumerosC[x][y]>=0){
                        System.out.print("+ "+NumerosC[x][y]+"i");
                    }                   
                    if(NumerosC[x][y]<0){
                        System.out.print("+ "+NumerosC[x][y]+"i");
                  }   
                }      
            }
            System.out.print("\n\n");
      }
            System.out.println("resutado= "+NumerosC[0][8]+" / "+NumerosC[0][9]+""+NumerosC[1][8]+" / "+NumerosC[1][9]+"i");
    }
}
}
