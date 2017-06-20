
package listasdoblescircularesdobles;
public class metodos {
    private Nodo inicio,fin;
    public metodos(){
        inicio =fin=null;
    }
    public void insertar(int x){
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if(inicio==null){
            inicio=nuevo;
            fin=nuevo;
            inicio.ant=fin;
            fin.sig=inicio;
        }else{
            fin.sig=nuevo;
            nuevo.ant=fin;
            fin=nuevo;
            inicio.ant=fin;
            fin.sig=inicio;
        }
        
    }
    
    public void insertarPrimero(int x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (inicio==null) {
            inicio=nuevo; 
            fin=nuevo;
            inicio.ant=fin;
            fin.sig=inicio;
        } else {
            nuevo.sig=inicio;
           inicio.ant=nuevo;
           inicio=nuevo;
           inicio.ant=fin;
            fin.sig=inicio;
        }
    } 
    
    public void insertarUltimo(int x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (inicio==null) {
          inicio=nuevo; 
            fin=nuevo;
            inicio.ant=fin;
            fin.sig=inicio;
        } else {
            nuevo.ant=fin;
            fin.sig=nuevo;
            fin=nuevo;
            inicio.ant=fin;
            fin.sig=inicio;
        }
    }

    void imprimir(){
        if(inicio!=null){
            Nodo reco=inicio;
            do{
                System.out.println(""+reco.info);
                reco=reco.sig;
            }while(reco!= inicio);
            
        }else{
            System.out.println("LISTA VACIA");
            
        }
    }
    

    void imprimirInverso(){
    if(inicio!=null){
    Nodo reco=fin;
      do{
      System.out.println(reco.info);
      reco=reco.ant;
      }while(reco!=fin);
    }
    else{
    System.out.println("lista vacia");
    }
    }

void imprimirInverso2()
{
    if (inicio!=null){
        Nodo reco = fin ;
        do{
            System.out.println(reco.info);
            
            reco=reco.ant;
        }while(reco!=fin);
        System.out.println("");
    }
}
   void  insertarPrimeroc (int x){
        Nodo nuevo = new Nodo();
        nuevo.info=x;
        if(inicio==null){
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;
            inicio=nuevo;
        }else{
              Nodo ultimo =inicio.ant;
              nuevo.sig =inicio;
                nuevo.ant =inicio;
                inicio.ant=nuevo;
               ultimo.sig=nuevo;
                inicio=nuevo;          
    }
           
    }
   
    public boolean vacia ()  {
        if (inicio== null)
            return true;
        else
            return false;
    }
       public void eliminarPrimero (){ 
        inicio=inicio.sig;
        fin.sig=inicio;
        inicio.ant=fin;
    }  
     
    public void eliminarUltimo(){ 
        fin = fin.ant;
        fin.sig=inicio;
       inicio.ant=fin;
    }


            }


