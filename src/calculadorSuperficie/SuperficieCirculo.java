/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorSuperficie;

/**
 *
 * @author Cristian
 */
public class SuperficieCirculo {
    
    public double supCircunferencia(double r){
        if(r>=0)
            return Math.PI*r*r;
        return -1;
    }
}
