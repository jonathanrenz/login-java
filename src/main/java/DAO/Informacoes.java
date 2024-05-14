/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import modelDominio.Usuario;

/**
 *
 * @author Jonathan Renz
 */
public class Informacoes {

    public Usuario userLogado;

    public Informacoes(Usuario userLogado) {
        this.userLogado = userLogado;
    }

    public Usuario getUserLogado() {
        return userLogado;
    }

    public void setUserLogado(Usuario userLogado) {
        this.userLogado = userLogado;
    }
}
