/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscamimas1.pkg0;

import javax.swing.JButton;

/**
 *
 * @author davidvargas
 */
public class casillas extends JButton{
    
    private boolean mina;
    
    public casillas(){
        super();
        double random=Math.random();
        if(random>0.9)
            mina=true;
        else
            mina=false;
    }

    /**
     *
     * @return
     */
    public boolean estaminado(){
         
         return mina;
     }
     
    
    
}
