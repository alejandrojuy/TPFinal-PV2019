/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.ICategoriaDao;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.CategoriaDAOimpl;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import java.util.List;

/**
 *
 * @author jaimito
 */
public class TestCrearProducto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        //Ejecutar los test de acuerdo a los numeros
        IProductoDAO ida= new ProductoDAOImp();
        Categoria categoriaLavaderoYBaño = new Categoria();
        Categoria categoriaCocina = new Categoria();
        Categoria categoriaColchonesYSomiers = new Categoria();
        Categoria categoriaDormitorio = new Categoria();
        Categoria categoriaSaladeEstar = new Categoria();
        ICategoriaDao iCategoriaDao= new CategoriaDAOimpl();
        IProductoDAO iProductoDAO = new ProductoDAOImp();
                
        List<Categoria> categorias= iCategoriaDao.obtenerCategorias();
        categoriaCocina = categorias.get(0);
        categoriaColchonesYSomiers = categorias.get(1);
        categoriaDormitorio = categorias.get(2);
        categoriaLavaderoYBaño = categorias.get(3);
        categoriaSaladeEstar = categorias.get(4);
//      
        Producto producto1Cocima = new Producto(1, 1099, categoriaCocina, 100,"Liv Home", "Cestos de Residuos Acero Inoxidable 12 Lts + 3 Lts LIV HOME", "Los Cestos de Residuos de Liv Home fueron diseñados en acero inoxidable para darle estilo y ofrecerte la posibilidad de ubicarlo en cualquier ambiente. En esta oportunidad ofrecemos un combo ideal para que puedas almacenar todos tus residuos.","N°20 Los Ceibos", true,"muebleria1" );
        Producto producto2Cocima = new Producto(2,1699, categoriaCocina, 50, "MAC","Organizador Centro Estant T6BLMAC Blanco", " Se entrega desarmado en su caja.Viene con el manual de instrucciones para armar. Incluye los accesorios necesarios para que puedas armarlo vos mismo. En algunos casos incluye una llave Allen. No incluye herramientas.","N° 10 San Salvador", true, "muebleria2");
        Producto producto3Cocima = new Producto(3, 1499, categoriaCocina, 255, "Platinun", "Organizador Centro ", "Se entrega desarmado en su caja.Viene con el manual de instrucciones para armar. Incluye los accesorios necesarios para que puedas armarlo vos mismo. En algunos casos incluye una llave Allen. No incluye herramientas.", "N°3 Palpala, Palomares", true, "muebleria3");
        Producto producto4Cocima = new Producto(4, 4799, categoriaCocina, 39, "Platinun", "Despensero Escobero Organizador Blanco", "Súper ordenadoEl Escobero Melamina Blanco E052 de Dielfe cuenta con 4 estantes para que guardes todos lo que necesitas y tu cocina quede súper ordenada además cuenta con dos puertas para que nada quede a la vista. ¡Muy ordenado!", "N° 8 Cuyaya, Moreno", true, "muebleria4");
        Producto producto5Cocima = new Producto(5, 4339, categoriaCocina, 20,"MelBlack","Despensero Centro Estant DIS4BL Blanco", "Se entrega desarmado en su caja.Incluye los accesorios necesarios para que puedas armarlo vos mismo. En algunos casos incluye una llave Allen. No incluye herramientas.", "N° 4 Los Perales ", true,  "muebleria5");
        iProductoDAO.agregarProducto(producto1Cocima);
        iProductoDAO.agregarProducto(producto2Cocima);
        iProductoDAO.agregarProducto(producto3Cocima);
        iProductoDAO.agregarProducto(producto4Cocima);
        iProductoDAO.agregarProducto(producto5Cocima);
      
        Producto producto6ColchonesYSomiers = new Producto(6, 1499, categoriaColchonesYSomiers, 200, "NUBE", "Almohada NUBE Viscolestastica Memoria Inteligente", "La tela que recubre a la Almohada Nube es la Jackard texturizada con fragancia a frutos del bosque y dotada de máxima seguridad para que el durmiente se desconecte totalmente en sus horas de descanso consiguiendo una experiencia placentera.", "N°20 Los Ceibos", true,"muebleria6" );
        Producto producto7ColchonesYSomiers = new Producto(7, 30007,categoriaColchonesYSomiers, 25, "Elite Lujo","Colchón Elite Lujo con Pillow Top Bordo 2 Plazas 140 x 190 c", "Especificaciones de Colchón Elite Lujo con Pillow Top Bordo 2 Plazas 140 x 190 c. Generales:  Colchón, material Interior,resortes, antibacteriano,  peso máximo Soportado 110 kg + Refuerzo Lumbar", "N° 10 San Salvador", true, "muebleria7");
        Producto producto8ColchonesYSomiers = new Producto(8,15243,categoriaColchonesYSomiers, 100, "Sommier Brighton","Colchón y Sommier Brighton Dorado Queen Size (200 x 160 cms)", "RESORTES POCKET: Está compuesto por resortes cilíndricos embolsados en tela. La característica principal es que los resortes de acero no tienen contacto entre sí dentro de la estructura del colchón.", "N°3 Palpala, Palomares", true, "muebleria8");
        Producto producto9ColchonesYSomiers = new Producto(9, 69787, categoriaColchonesYSomiers, 500, "King Koil", "Colchón y Sommier King Koil Creation Queen Size 200x160 cms","La capa de espuma con cinco zonas diferenciadas, asegura la correcta alineación de la columna a través de parámetros ergonómicos que contemplan la presión que cada zona del cuerpo genera el colchón.", "N° 8 Cuyaya, Moreno", true, "muebleria9");
        Producto producto10ColchonesYSomiers = new Producto(10, 1967.40, categoriaColchonesYSomiers, 10, "Twin Oregon","Juego de Sábanas Twin Oregon Tango Rojo 150 Hilos", "Juego de Sábanas, tamaño Twin, no Reversible, 150 hilos, diseño liso, Apto Lavarropas, 150cm  Ancho sábana plana, ancho sábana ajustable.", "N° 4 Los Perales", true, "muebleria10");      
        iProductoDAO.agregarProducto(producto6ColchonesYSomiers);
        iProductoDAO.agregarProducto(producto7ColchonesYSomiers);
        iProductoDAO.agregarProducto(producto8ColchonesYSomiers);
        iProductoDAO.agregarProducto(producto9ColchonesYSomiers);
        iProductoDAO.agregarProducto(producto10ColchonesYSomiers);
        
      
         Producto producto11Dormitorio = new Producto(11, 3990, categoriaDormitorio, 78, "Centro Estant", "Botinero 24 Pares Wengue","Color Wengue,  de materialMelamina 15 Mm,Centro Estant, dimensiones 157x62x25 Cm, origen Argentina, cantidad De Cajones 4.", "N° 8 Cuyaya, Moreno", true, "muebleria11");
         Producto producto12Dormitorio = new Producto(12, 6.894, categoriaDormitorio, 4, "M+Design", "Combo Placard + Comoda + Mesa de Luz","Este combo cuenta con un placard mediano de dos puertas, el cual tiene una repisa para guardar ropa doblada, etc. Una cómoda con tres cajones y una mesa de luz con un cajón.", "N° 4 Los Perales ", true, "muebleria12");
         Producto producto13Dormitorio = new Producto(13, 5000, categoriaDormitorio, 13, "Ricchezze", "Comoda 4 Cajones 1 Puertas 95x87x37 Tabaco","Comoda de color marrón, material de  melamina, de dimensiones  95x87x37 Cm, con  una Puertas 1 y 4 Cajones.", "N° 10 San Salvador", true, "muebleria13");
         Producto producto14Dormitorio = new Producto(14, 5674.19, categoriaDormitorio, 66, "Ricchezze", "Placard 6 Ptas 4Cj 176x185x46 Roble Moro", "Producto con 6 Puertas, de color roble, con las dimensiones 176x185x46 Cm, con 4 Cajones y 6 puertas.", "N° 4 Los Perales", true, "muebleria14");       
         iProductoDAO.agregarProducto(producto11Dormitorio);
         iProductoDAO.agregarProducto(producto12Dormitorio);
         iProductoDAO.agregarProducto(producto13Dormitorio);
         iProductoDAO.agregarProducto(producto14Dormitorio);
         
        Producto producto15LavaderoYBaño = new Producto(15, 2399, categoriaLavaderoYBaño, 29, "Abc", "Alacena Esquinera de Baño con Puerta Vidriada", "Material del producto Mdf, color Blanco,con dimensiones 27x73 Cm", "N°3 Palpala, Palomares", true, "muebleria15");
         Producto producto16LavaderoYBaño = new Producto(16, 1355, categoriaLavaderoYBaño, 200, "Trento ", "Botiquin Trento Melamina 55x55 Cm", "Desarrolado con material de melamina, de color Blanco, con dimensiones 55x55 Cm","N° 4 Los Perales", true, "muebleria16");
         Producto producto17LavaderoYBaño = new Producto(17, 3321, categoriaLavaderoYBaño, 500, "Eco", "Set de Cajas Organizadoras Eco box Garden Life Transparente", "Para que puedas llevarlas de un punto a otro cómodamente.", "N° 10 San Salvador", true, "muebleria17");
         Producto producto18LavaderoYBaño = new Producto(18, 4657, categoriaLavaderoYBaño, 5, "Ferrum", "Vanitory con Bacha De Apoyo Ferrum Armonica YL15A-B7 40 cm", " Con Reflejar llevamos a tus manos productos fabricados y diseñados con la más alta tecnología italiana en manos argentinas. ", "N°3 Palpala, Palomares", true, "muebleria18");
         iProductoDAO.agregarProducto(producto15LavaderoYBaño);
         iProductoDAO.agregarProducto(producto16LavaderoYBaño);
         iProductoDAO.agregarProducto(producto17LavaderoYBaño);
         iProductoDAO.agregarProducto(producto18LavaderoYBaño);
        
         Producto producto19SaladeEstar = new Producto(19, 4222, categoriaSaladeEstar, 9, "Tecno","Mesa para TV color Blanco", "El producto se entrega desarmado en su embalaje original sellado con termocontraible. El sellado lo protege contra agentes ambientales.", "N° 4 Los Perales", true, "muebleria19");
         Producto producto20SaladeEstar = new Producto(20, 1822, categoriaSaladeEstar, 2, "Tecno", "Set de Sillas de Plástico Negro Malba Full Confort 6 U", "Set de Sillas con patas de caño para el hogar, son 6 unidades.","N° 10 San Salvador", true,"muebleria20" );
         Producto producto21SaladeEstar = new Producto(21,5212, categoriaSaladeEstar, 33, "American Wood", "Sillón Cubik 3 Cuerpos De Chenille Gris Oscuro American Wood", "Sillón Tapizado De Chenille con relleno de Almohadas y fibra Siliconada .","N° 10 San Salvador" , true, "muebleria21");
         Producto producto22SaladeEstar = new Producto(22, 8522, categoriaSaladeEstar, 14, "Tecno", "Mesa de Acero Cromado y Vidrio Moderna Tecno 046 Cromo 120 x", "Mesa con un diseño moderna, desarrolada con material de acero Cromado y Vidrio.", "N°3 Palpala, Palomares", true, "muebleria22");
         iProductoDAO.agregarProducto(producto19SaladeEstar);
         iProductoDAO.agregarProducto(producto20SaladeEstar);
         iProductoDAO.agregarProducto(producto21SaladeEstar);
         iProductoDAO.agregarProducto(producto22SaladeEstar);
         
        
         
         
         
    }
    
    }
 
    

