package co.siadi.DAO;

import java.util.List;

public interface DAO <K,O> {
    public void insertar(O o);
     public void modificar(O o);
      public void eliminar(O o);
       public O obtenerPorId(K k);
       
     public List<O>Listar();
}
       