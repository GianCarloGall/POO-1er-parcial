import java.util.Scanner;
class Pokedex{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int elec = 0;
        int elec2=0;
        int f = 100, d = 0, v = 100, ap = 101, as = 100, gol1 = 0;
        int aleatorio = 0;
        System.out.println("Bienvenido al tu Pokedex de Confianza");
        System.out.println("El Pokedex puedes elegir uno de nuestros 500 pokemones que tenemos, pero en este Pokedex no asi que solo puedes elegir 3 xd recuerda que es un alfa");
        System.out.println("Primero debes elejir un Pokemon antes de comenzar la batalla puedes ver las estadisticas o ir a una batalla directamente");
        System.out.println("1. Charmander Tipo Fuego");
        System.out.println("2. Bulbasor Tipo Planta");
        System.out.println("3. Squartle Tipo Platna");
        elec = in.nextInt();
        switch (elec) {
            /*
            Puse switch para que el jugador elija su pokemon se podria decir que este switch es el principal
            porque dentro de cada switch principal hay 3 switch secundarios la funcion de eso es porque antes 
            de cada switch secundario hay un do-while con el que va a regresar al menu principal y eligir un nuevo
            pokemon o elegir el mismo que tenia antes donde entraria en bucle hasta que elija la opcion de batalla 
            que puede escribir con cualquier numero con execpcion del dos, porque el dos marca el regreso del menu :3
            */
        case 1 :      
            System.out.println("Elegistes Charmander enserio? Bueno es tu eleccion ta wueno");
            System.out.println("Te mostrare las Estadisticas de Charmander tipo fuego");
            System.out.println("id 1");
            System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
            System.out.println("Fuerza: 100");
            System.out.println("Defensa: 0");
            System.out.println("Vida: 100");
            System.out.println("Ataque Principal: 101");
            System.out.println("Ataque Secundario: 100");
            System.out.println("Ahora quieres ir a una Batalla");
            System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
            elec2 = in.nextInt();
            do { 
                System.out.println("Bienvenido al tu Pokedex de Confianza");
                System.out.println("El Pokedex puedes elegir uno de nuestros 500 pokemones que tenemos, pero en este Pokedex no asi que solo puedes elegir 3 xd recuerda que es un alfa");
                System.out.println("Primero debes elejir un Pokemon antes de comenzar la batalla puedes ver las estadisticas o ir a una batalla directamente");
                System.out.println("1. Charmander Tipo Fuego");
                System.out.println("2. Bulbasor Tipo Planta");
                System.out.println("3. Squartle Tipo Planta");
                elec = in.nextInt();
                switch (elec) {
                    //holi
                case 1:
                    System.out.println("Elegistes Charmander enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Charmander tipo fuego");
                    System.out.println("id 1");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                case 2 :
                    System.out.println("Elegistes Bulbasor enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Bulabasor tipo planta");
                    System.out.println("id 2");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                case 3 :
                    System.out.println("Elegistes Squartle enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Squartle tipo agua");
                    System.out.println("id 3");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Squartle");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                }

            } 
            while ( elec2 <= 2 );
            {
                System.out.println("Bueno ya que porfin te decidiste en POKEMON es hora de la batalla");
                System.out.println("Te pondremos con un Pokemos aleatorio asi que preparate :O");
                aleatorio = (int) (Math.random() *100 );
                if (aleatorio < 50){
                    System.out.println("Valla te toco contra Bulbasor te mostrare sus estadisticas ¡HORA DE LA BATALLA!");
                    System.out.println("id 2");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora tu Estadisticas Suerte:)");
                    System.out.println("id 1");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Que ataque quiere hacer primero(tu golpeas primero porque eres local)");
                    System.out.println("Lanzar ataque principal 1 = 1 lanzar ataque secundario 2 =2 ");
                    gol1 = in.nextInt();
                    if (gol1 == 1){
                        System.out.println("Haz elegido el ataque principal ten cuidado puedes matarlo de un golpe");
                        v = ap-d;
                        if (v>=0){
                            System.out.println("Haz ganado la batalla quieres iniciar otra o elegir otro Pokemon");
                        }
                }   }
                break; 
            }
        case 2 :
            System.out.println("Elegistes Bulbasor enserio? Bueno es tu eleccion ta wueno");
            System.out.println("Te mostrare las Estadisticas de Bulabasor tipo planta");
            System.out.println("id 2");
            System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
            System.out.println("Fuerza: 100");
            System.out.println("Defensa: 0");
            System.out.println("Vida: 100");
            System.out.println("Ataque Principal: 101");
            System.out.println("Ataque Secundario: 100");
            System.out.println("Ahora quieres ir a una Batalla");
            System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
            elec2 = in.nextInt();
            do{ 
                System.out.println("Bienvenido al tu Pokedex de Confianza");
                System.out.println("El Pokedex puedes elegir uno de nuestros 500 pokemones que tenemos, pero en este Pokedex no asi que solo puedes elegir 3 xd recuerda que es un alfa");
                System.out.println("Primero debes elejir un Pokemon antes de comenzar la batalla puedes ver las estadisticas o ir a una batalla directamente");
                System.out.println("1. Charmander Tipo Fuego");
                System.out.println("2. Bulbasor Tipo Planta");
                System.out.println("3. Squartle Tipo Planta");
                elec = in.nextInt();
                switch (elec) {
                    //holi
                case 1:
                    System.out.println("Elegistes Charmander enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Charmander tipo fuego");
                    System.out.println("id 1");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                case 2 :
                    System.out.println("Elegistes Bulbasor enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Bulabasor tipo planta");
                    System.out.println("id 2");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                case 3 :
                    System.out.println("Elegistes Squartle enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Squartle tipo agua");
                    System.out.println("id 3");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Squartle");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                }
            } 
            while ( elec2 <= 2 );
            {
                System.out.println("Bueno ya que porfin te decidiste en POKEMON es hora de la batalla");
                System.out.println("Te pondremos con un Pokemos aleatorio asi que preparate :O");
                aleatorio = (int) (Math.random() *100 );
                if (aleatorio < 50){
                    System.out.println("Valla te toco contra Bulbasor te mostrare sus estadisticas ¡HORA DE LA BATALLA!");
                    System.out.println("id 2");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora tu Estadisticas Suerte:)");
                    System.out.println("id 1");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Que ataque quiere hacer primero(tu golpeas primero porque eres local)");
                    System.out.println("Lanzar ataque principal 1 = 1 lanzar ataque secundario 2 =2 ");
                    gol1 = in.nextInt();
                    if (gol1 == 1){
                        System.out.println("Haz elegido el ataque principal ten cuidado puedes matarlo de un golpe");
                        v = ap-d;
                        if (v>=0){
                            System.out.println("Haz ganado la batalla quieres iniciar otra o elegir otro Pokemon");
                        }
                    }

            
                }    break; 
                
            } 

        case 3 :
            System.out.println("Elegistes Squartle enserio? Bueno es tu eleccion ta wueno");
            System.out.println("Te mostrare las Estadisticas de Squartle tipo agua");
            System.out.println("id 3");
            System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Squartle");
            System.out.println("Fuerza: 100");
            System.out.println("Defensa: 0");
            System.out.println("Vida: 100");
            System.out.println("Ataque Principal: 101");
            System.out.println("Ataque Secundario: 100");
            System.out.println("Ahora quieres ir a una Batalla");
            System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
            elec2 = in.nextInt();
            do { 
                System.out.println("Bienvenido al tu Pokedex de Confianza");
                System.out.println("El Pokedex puedes elegir uno de nuestros 500 pokemones que tenemos, pero en este Pokedex no asi que solo puedes elegir 3 xd recuerda que es un alfa");
                System.out.println("Primero debes elejir un Pokemon antes de comenzar la batalla puedes ver las estadisticas o ir a una batalla directamente");
                System.out.println("1. Charmander Tipo Fuego");
                System.out.println("2. Bulbasor Tipo Planta");
                System.out.println("3. Squartle Tipo Planta");
                elec = in.nextInt();
                switch (elec) {
                    //holi
                case 1:
                    System.out.println("Elegistes Charmander enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Charmander tipo fuego");
                    System.out.println("id 1");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                case 2 :
                    System.out.println("Elegistes Bulbasor enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Bulabasor tipo planta");
                    System.out.println("id 2");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                case 3 :
                    System.out.println("Elegistes Squartle enserio? Bueno es tu eleccion ta wueno");
                    System.out.println("Te mostrare las Estadisticas de Squartle tipo agua");
                    System.out.println("id 3");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Squartle");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Si=1 o Volver a elegir a un Pokemon=2");
                    elec2 = in.nextInt();
                    break;
                }
            } 
            while ( elec2 <= 2 ); 
            {
                System.out.println("Bueno ya que porfin te decidiste en POKEMON es hora de la batalla");
                System.out.println("Te pondremos con un Pokemos aleatorio asi que preparate :O");
                aleatorio = (int) (Math.random() *100 );
                if (aleatorio < 50){
                    System.out.println("Valla te toco contra Bulbasor te mostrare sus estadisticas ¡HORA DE LA BATALLA!");
                    System.out.println("id 2");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Bulbasor");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora tu Estadisticas Suerte:)");
                    System.out.println("id 1");
                    System.out.println("Nombre: Pues este ya te lo sabes tu lo elgiste, Charmander");
                    System.out.println("Fuerza: 100");
                    System.out.println("Defensa: 0");
                    System.out.println("Vida: 100");
                    System.out.println("Ataque Principal: 101");
                    System.out.println("Ataque Secundario: 100");
                    System.out.println("Ahora quieres ir a una Batalla");
                    System.out.println("Que ataque quiere hacer primero(tu golpeas primero porque eres local)");
                    System.out.println("Lanzar ataque principal 1 = 1 lanzar ataque secundario 2 =2 ");
                    gol1 = in.nextInt();
                    if (gol1 == 1){
                        System.out.println("Haz elegido el ataque principal ten cuidado puedes matarlo de un golpe");
                        v = ap-d;
                        if (v>=0){
                            System.out.println("Haz ganado la batalla quieres iniciar otra o elegir otro Pokemon");
                        }
                    }
                }
            }  break; 
        }
    }
}