package controller;

import java.util.ArrayList;
import dao.ClienteDao;
import model.Cliente;

public class ClienteController {
    private ClienteDao dao;
    public ClienteController(){
        dao = new ClienteDao();
    }


    public void cadastrar(int codigo, String nome, String numero, String email){
        Cliente cliente = new Cliente(codigo, nome, numero, email);
        dao.cadastrar(cliente);
    }

    public ArrayList<Cliente> listar(){
        return dao.listar();
    }

    public Cliente buscar(int codigo){
        return dao.buscar(codigo);
    }

    public boolean alterar(int codigo, String nome, String numero, String email){
        return dao.alterar(codigo,nome,numero, email);
    }
    public boolean remover(int codigo){
        return dao.remover(codigo);
    }
}
