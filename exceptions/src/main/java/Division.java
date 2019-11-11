/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class Division {
    private int a;
    private int b;
    private int result;
    public Division(int a, int b){
        this.a = a;
        this.b = b;
        result = a/b;
    }
    public int getResult(){
        return result;
    }
}
