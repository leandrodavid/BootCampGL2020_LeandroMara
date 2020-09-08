package com.globallogic.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.globallogic.menu.entity.Plato;

import dao.PlatoDao;



/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger LOGGER= LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        
    	PlatoDao platoDao = new PlatoDao();
    	Plato plato = new Plato(0,"Milanesa Clasica","una delicada milanesa con crocantes papas fritas finamente seleccionadas",500);
    	//LOGGER.info(plato.toString());
    	platoDao.createPLato(plato);
    	platoDao.createPLato(new Plato(2,"Lomo al piedra","un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el\r\n" + 
    			"         lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor",750.00));
    	LOGGER.info("Menu: {}",platoDao.getPlatos());
    }
}
