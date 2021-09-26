/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionaria;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class CONSECIONARIA {
   

    private static Object sn;
    
   

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
      
        
        float precio;
        float SedanEconomico = (float) 18940.00;
        float Sedan = (float) 23570.00;
        float Deportivo = (float) 24100.00;
        float Hibrido = (float) 25100.00;
        float Coupe = (float) 19350.00;
        float CoupeDeportivo = (float) 24100.00;        
        float Compacto = (float) 16190.00;
        float Hatchback = (float) 20150.00;
        float EconomicoversionRally = (float) 34700.00;
        
        //SELECCION DE AMENIDADES
        float Manual = (float) 00.00;
        float CVT = (float) 800.00;
        float ManualconTurbo = (float) 00.00;
        float CVTconTurbo = (float) 800.00;

        
        //COLOR DE PINTURA EXTERIOR
        float CosmicBlue = (float) 00.00;
        float BurgundyNight = (float) 00.00;
        float RallyeRed = (float) 00.00;
        float CrystalBlack = (float) 00.00;
        float ModernSteel = (float) 00.00;
        float TaffetaWhite = (float) 00.00;
        float EnergyGreen = (float) 00.00;
        float KonaCoffee = (float) 00.00;
        float OrangeFury = (float) 00.00;
        float HeliosYellow = (float) 00.00;
        float SonicGray = (float) 00.00;
        float PolishedMetal = (float) 00.00;
        
        //COLOR DE TAPICERIA 
        float GrayCloth = (float) 00.00;
        float BlackCloth = (float) 00.00;        
        float BlackGrayCloth = (float) 00.00;        
        float RedBlackSuedeEffectFabric = (float) 00.00;        
        
        //AROS
        float Pulgadas_15 = (float) 00.00;
        float Pulgadas_16 = (float) 00.00;        
        float Pulgadas_17 = (float) 1688.00;
        float Pulgadas_18 = (float) 1700.00;
        float Pulgadas_19 = (float) 3011.00;
        
        //ACCESORIOS EXTERIORES
        
        float BodySideMolding = (float) 217.00;
        float CarCover = (float) 230.00;
        float DecklidSpoiler = (float) 299.99;
        float DoorEdgeFilm = (float) 42.00;
        float DoorEdgeGuards = (float) 84.00;
        float DoorTrimChrome = (float) 285.00;
        float DoorVisor = (float) 185.00;
        float FrontFenderEmblems = (float) 50.00;
        float RearBumperApplique = (float) 70.00;
        float FoglLghts = (float) 325.00;
        float NoseMascs = (float) 158.00;
        float MoonrofVisor = (float) 135.00;
        float SplashGuardSet = (float) 104.00;
        float DustCover = (float) 350.00;
        float DoorMirrorCoverCarbonFiber = (float) 520.00;     
        
        //ACCESORIOS INTERIORES
        float AllSeasonsFloorMats = (float) 142.00;
        float AutomaticDimmingMirror = (float) 219.00;
        float CargoHook = (float) 12.00;
        float CargoNet = (float) 49.00;
        float ConsoleIllumination = (float) 250.00;
        float CargoOrganizer = (float) 87.00;
        float DoorPanelProtector = (float) 149.00;
        float ArmrestCompartiment = (float) 337.00;
        float DoorSillTrimIlluminated = (float) 290.00;
        float CargoCover = (float) 350.00;
        float CargoLiner = (float) 187.00;
        
        
        //ACCESORIOS ELECTRICOS
        float WirelessPhoneCharger = (float) 305.00;
        float USBCharger_2_1_Amp = (float) 120.00;
        float PuddleLight = (float) 185.00;
        float ParkingSensors = (float) 514.00;
        
        boolean salir = false;
        int opcion = (20);
        
        while (!salir){
        System.out.println("---------------------------------");
        System.out.println("---Concesionaria de Automoviles---");
        System.out.println("--------- MENU PRINCIPAL ---------");
        System.out.println("---------------------------------");
        System.out.println("1) seleccionar automovil");
        System.out.println("2) salir");
        
        
        System.out.println("Ingrese el numero deseado");
        
        int carros = consola.nextInt();
        switch (carros)  {
          
            case 1:
                System.out.println("Seleccionar gama del vehiculo");
                break;
                
            case 2:
                System.out.println("HA SALIDO DEL PROGRAMA");
                System.exit(0);
                break;
                
            default:
                System.out.println("NO VALIDO"); 
                System.out.println("INICIE NUEVAMENTE");
                System.exit(0);
            
        }    
            
        
        boolean sali = false;
        int opc = (0);
        
        while (!sali){//ESTE CICLO PARA PODER VOLVER AL MENU DE VEHICULOS, DESPUES DE HABER ELEGIDO AMENIDADES//
        System.out.println("1.-  Sedán Económico");
        System.out.println("2.-  Sedán");
        System.out.println("3.-  Deportivo");
        System.out.println("4.-  Hibrido");
        System.out.println("5.-  Coupe");
        System.out.println("6.-  Coupe Deportivo");
        System.out.println("7.-  Compacto");
        System.out.println("8.-  Hatchback");
        System.out.println("9.-  Economico Version Rally");
        System.out.println("10.- Regresar al menu principal");
        System.out.println("Ingrese gama de vehiculo:");
            
            
                
            
 
        int opciones = consola.nextInt();
        
        switch (opciones)  {
            case 1:
                
                System.out.println("1.-  Sedán Económico");
                System.out.println("ha seleccionado: Sedan Economico ------------------ $18,940.00");
                System.out.println("---------------------------------------------------------------");
                System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                int sedan = consola.nextInt();
     
        switch (sedan) {
                    case 1:// ESTE CASE 1 ES PARA CUANDO HAYAS DICHO QUE SI//
                        
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan Economico");
                               
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR AL MENU PRINCIPAL--");
               
                            
                        
         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                case 1:// 1ER CASE DE TIPO DE TRANSMISION//
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                            $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                               $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                    $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                     $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                     $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror          $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                   $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                       $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                  $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                     $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                        $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + SedanEconomico);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + SedanEconomico);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Sedán Económico                      $ 18,940.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 18,940.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
        }          //cierre del ciclo while
                salir = false;
                sali = false;
                break;
        
                
                
                
                
                
                
                
            case 2:
                        System.out.println("2.-  Sedán");
                        System.out.println("ha seleccionado: Sedan ------------------ $23,570.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        int economico = consola.nextInt();
                
                switch (economico) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + Sedan);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                               $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán Económico                       $"+SedanEconomico);
                                      System.out.println("                                                                       ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                               $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//                               
                                  break;
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + Sedan);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + Sedan);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Sedán                                 $"+Sedan);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Sedán                                $ 23,570.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 23,570.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;   
                break;
                  
          
                
                
                
                
                
            case 3:
                        System.out.println("3.-  Deportivo");
                        System.out.println("ha seleccionado: Deportivo ------------------ $24,100.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        int economicos = consola.nextInt();
                
                switch (economicos) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Deportivo");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                                 $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                                 $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + Deportivo);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                                 $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println("13.-          --INICIAR DE NUEVO--");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + Deportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow +  Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                         $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println("5.-            --INICIAR DE NUEVO--");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println("5.-            --INICIAR DE NUEVO--");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                  
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println("6.-            --INICIAR DE NUEVO--");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + Deportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println("16.-          --INICIAR DE NUEVO--");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + Deportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + Deportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + Deportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + Deportivo);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Deportivo                             $"+Deportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Deportivo                             $24,100.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 24,1000.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                        
                break;
                   
              
                
                
                
                
                
            case 4:
                        System.out.println("4.-  Hibrido");
                        System.out.println("ha seleccionado: Hibrido ------------------ $25,100.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        
                        int hibrido = consola.nextInt();
                
                switch (hibrido) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + Hibrido);
                                    
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                               $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ Hibrido);
                                    
                                  System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + Hibrido);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ Hibrido);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ Hibrido);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + Hibrido);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment + Hibrido);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + Hibrido);
                                      
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + Hibrido);
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + Hibrido);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + Hibrido);
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + Hibrido);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ Hibrido);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + Hibrido);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + Hibrido);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + Hibrido);
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + Hibrido);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hibrido                                 $"+Hibrido);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Hibrido                              $ 25,1000.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 25,100.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                break;
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            case 5:
                        System.out.println("5.-  Coupe");
                        System.out.println("ha seleccionado: Coupe ------------------ $19,350.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        int coupe = consola.nextInt();
                
                switch (coupe) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + Coupe);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + Coupe);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + Coupe);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + Coupe);
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + Coupe);
                                 System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + Coupe);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + Coupe);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + Coupe);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe                                 $"+Coupe);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Coupe                                $ 19,350.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 19,350.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                break;
                    
                
                
                
                
            case 6:
                        System.out.println("6.-  Coupe Deportivo");
                        System.out.println("ha seleccionado: Coupe Deportivo ------------------ $24,100.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        int deportivo = consola.nextInt();
                
                switch (deportivo) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + CoupeDeportivo);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + CoupeDeportivo);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ CoupeDeportivo);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + CoupeDeportivo);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ CoupeDeportivo);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + CoupeDeportivo);
                                    
                                  System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + CoupeDeportivo);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + CoupeDeportivo);
                                      
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println("16.-          --INICIAR DE NUEVO--");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + CoupeDeportivo);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + CoupeDeportivo);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + CoupeDeportivo);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Coupe Deportivo                       $"+CoupeDeportivo);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Coupe Deportivo                       $ 24,100.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $  24,100.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                break;
                
                
                
               
                
            case 7:
                        System.out.println("7.-  Compacto");
                        System.out.println("ha seleccionado: Compacto ------------------ $16,190.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        int compacto  = consola.nextInt();
                
                switch (compacto) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                                 $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                                 $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + Compacto);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                               $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + Compacto);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                               $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + Compacto);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                               $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                            $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + Compacto);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                               $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                               $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + Compacto);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                             $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + Compacto);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + Compacto);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Compacto                              $"+Compacto);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Compacto                             $ 16,190.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 16,190.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                break;
                           
                
                
            case 8:
                        System.out.println("8.-  Hatchback");
                        System.out.println("ha seleccionado: Hatchback ------------------ $20,150.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO "); 
                        int hacht = consola.nextInt();
                
                switch (hacht) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                              $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                 case 2:
                
                                      float tota = (float) (CVT + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                      case 4:
                                    float totas = (float) (CVTconTurbo + Hatchback);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                  case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                              $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                                    float tota = (float) (BurgundyNight + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + Hatchback);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ Hatchback);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                                    float tsota = (float) (HeliosYellow+ Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ Hatchback);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                  case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                      case 4:
                                    float totas = (float) (CargoNet + Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ Hatchback);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                          $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                       
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                              $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                                    float tota = (float) (USBCharger_2_1_Amp + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                           $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                           $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                      case 4:
                                    float totas = (float) (Pulgadas_18 + Hatchback);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                           $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + Hatchback);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                case 5:
                                      float totales = (float) (DoorEdgeGuards + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                            case 6:
                
                                      float tosta = (float) (DoorTrimChrome + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                 case 7:
                                      
                                      float totls = (float) (DoorVisor + Hatchback);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;
                                case 9:
                                      float stotal = (float) (RearBumperApplique + Hatchback);
                                      
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rear Bumper Applique                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                                      
                                      float tsota = (float) (FoglLghts + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                            $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                               case 11:
                                      float totalss = (float) (NoseMascs + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + Hatchback);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                     case 14:
                                    float ostas = (float) (DustCover + Hatchback);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + Hatchback);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Hatchback                             $"+Hatchback);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Hatchback                            $ 20,150.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 20,150.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                break;
                
                
                
case 9:
                        System.out.println("9.-  Economico Version Rally");
                        System.out.println("ha seleccionado: Economico Version Rally ------------------ $34,700.00");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" DESEA AGREGAR AMENIDADES? 1 = SI / 2 = NO ");
                        int version = consola.nextInt();
                
                switch (version) {
                    case 1:
                        System.out.println("HA DICHO QUE SI");
                        System.out.println("--------------------");
                        System.out.println("LISTA DE AMENIDADES");
                        System.out.println("ha seleccionado: Sedan");
                        
                         System.out.println("1.-  Tipo de Transmisión");
                         System.out.println("2.-  Color de Pintura Exterior");
                         System.out.println("3.-  Accesorios Interiores");
                         System.out.println("4.-  Accesorios Electrónicos");
                         System.out.println("5.-  Color de Tapicería");
                         System.out.println("6.-  Aros");
                         System.out.println("7.-  Accesorios Exteriores");
                         System.out.println("8.- --REGRESAR A LA SELECCION DE GAMA DE VEHICULOS--");
                         
                         int tipo = consola.nextInt();
                         switch (tipo) {
                             case 1:
                                 System.out.println("TIPO DE TRANSMISION");
                                 System.out.println("1.-  Manual --------------------- $0.00");
                                 System.out.println("2.-  CTV ------------------------ $800.00");
                                 System.out.println("3.-  Manual con Turbo ----------- $0.00");
                                 System.out.println("4.-  CVT con Turbo -------------- $800.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int transmision = consola.nextInt();
                                  switch (transmision){
                                      case 1:
                                      float total = (float) (Manual + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: MANUAL                              $"+Manual);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CVT + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT                                 $"+CVT);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (ManualconTurbo + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Manual con Turbo                    $"+ManualconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CVTconTurbo + EconomicoversionRally);
                                    
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: CVT con Turbo                       $"+CVTconTurbo);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;                   
                                  }
                                  salir = true;// CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                 case 2://1ER CASE DE COLOR DE PINTURA
                                 System.out.println("COLOR DE PINTURA EXTERIOR");
                                 System.out.println("1.-   Cosmic Blue --------------------------- $0.00");
                                 System.out.println("2.-   Burgundy Night ------------------------ $0.00");
                                 System.out.println("3.-   Rallye Red ---------------------------- $0.00");
                                 System.out.println("4.-   Crystal Black ------------------------- $0.00");
                                 System.out.println("5.-   Modern Steel -------------------------- $0.00");
                                 System.out.println("6.-   Taffeta White ------------------------- $0.00");
                                 System.out.println("7.-   Energy Green -------------------------- $0.00");
                                 System.out.println("8.-   Kona Coffee --------------------------- $0.00");
                                 System.out.println("9.-   Orange Fury --------------------------- $0.00");
                                 System.out.println("10.-  Helios Yellow ------------------------- $0.00");
                                 System.out.println("11.-  Sonic Gray ---------------------------- $0.00");
                                 System.out.println("12.-  Polished Metal ------------------------ $0.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int color = consola.nextInt();
                                  switch (color){
                                      case 1:
                                      float total = (float) (CosmicBlue + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cosmic Blue                         $"+CosmicBlue);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BurgundyNight + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Burgundy Night                     $"+BurgundyNight);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (RallyeRed + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Rallye Red                          $"+RallyeRed);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CrystalBlack + EconomicoversionRally);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Crystal Black                       $"+CrystalBlack);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ModernSteel + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Modern Steel                        $"+ModernSteel);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (TaffetaWhite + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Taffeta White                      $"+TaffetaWhite);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (EnergyGreen + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: REnergy Green                       $"+EnergyGreen);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (KonaCoffee+ EconomicoversionRally);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Kona Coffee                         $"+KonaCoffee);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (OrangeFury + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+OrangeFury);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (HeliosYellow+ EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Helios Yellow                      $"+HeliosYellow);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (SonicGray + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Sonic Gray                         $"+SonicGray);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (PolishedMetal+ EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Polished Metal                      $"+PolishedMetal);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO
                                  break;
                                
                case 3://1ER CASE DE ACCESORIOS INTERIORES//
                                 System.out.println("ACCESORIOS INTERIORES");
                                 System.out.println("1.-   All-Seasons Floor Mats --------------------------- $142.00");
                                 System.out.println("2.-   Automatic-Dimming Mirror ------------------------- $219.00");
                                 System.out.println("3.-   Cargo Hook --------------------------------------- $12.00");
                                 System.out.println("4.-   Cargo Net ---------------------------------------- $49.00");
                                 System.out.println("5.-   Console Illumination ----------------------------- $250.00");
                                 System.out.println("6.-   Cargo Organizer ---------------------------------- $87.00");
                                 System.out.println("7.-   Door Panel Protector ----------------------------- $149.00");
                                 System.out.println("8.-   Armrest Compartiment ----------------------------- $337.00");
                                 System.out.println("9.-   Door Sill Trim-Illuminated ----------------------- $290.00");
                                 System.out.println("10.-  Cargo Cover -------------------------------------- $166.00");
                                 System.out.println("11.-  Cargo Liner -------------------------------------- $187.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int acceso = consola.nextInt();
                                  switch (acceso){
                                      case 1:
                                      float total = (float) (AllSeasonsFloorMats + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: All-Seasons Floor Mats              $"+AllSeasonsFloorMats);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (AutomaticDimmingMirror + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Automatic-Dimming Mirror           $"+AutomaticDimmingMirror);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (CargoHook + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Hook                          $"+CargoHook);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (CargoNet + EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Net                           $"+CargoNet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (ConsoleIllumination + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Console Illumination                $"+ConsoleIllumination);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (CargoOrganizer + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Organizer                    $"+CargoOrganizer);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorPanelProtector + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Panel Protector                $"+DoorPanelProtector);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (ArmrestCompartiment+ EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Armrest Compartiment                $"+ArmrestCompartiment);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (DoorSillTrimIlluminated + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Sill Trim-Illuminated          $"+DoorSillTrimIlluminated);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (CargoCover+ EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Cover                       $"+CargoCover);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (CargoLiner + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Cargo Liner                         $"+CargoLiner);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                   
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 break;
                                 
                case 4://1ER CASE DE ACCESORIOS ELECTRONICOS
                                 System.out.println("ACCESORIOS ELECTRONICOS");
                                 System.out.println("1.-   Wireless Phone Charger --------------------------- $305.00");
                                 System.out.println("2.-   USB Charger - 2.1 Amp. --------------------------- $120.00");
                                 System.out.println("3.-   Puddle Light ------------------------------------- $185.00");
                                 System.out.println("4.-   Parking Sensors ---------------------------------- $514.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
 
                                 
                                 int accesorios = consola.nextInt();
                                 
                                  switch (accesorios){
                                      case 1:
                                      float total = (float) (WirelessPhoneCharger + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Wireless Phone Charger              $"+WirelessPhoneCharger);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (USBCharger_2_1_Amp + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: USB Charger - 2.1 Amp.            $"+USBCharger_2_1_Amp);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (PuddleLight + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Puddle Light                        $"+PuddleLight);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (ParkingSensors + EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Parking Sensors                     $"+ParkingSensors);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                  break;
                case 5://1ER CASE DE COLOR DE TAPICERIA//
                                 System.out.println("COLOR DE TAPICERIA");
                                 System.out.println("1.-   Gray Cloth ----------------------------------------------------- $00.00");
                                 System.out.println("2.-   Black Cloth ---------------------------------------------------- $00.00");
                                 System.out.println("3.-   Black/Gray Cloth ----------------------------------------------- $00.00");
                                 System.out.println("4.-   Red/Black Suede Effect-Fabric ---------------------------------- $00.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int colores = consola.nextInt();
                                 
                                  switch (colores){
                                      case 1:
                                      float total = (float) (GrayCloth + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Gray Cloth                          $"+GrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (BlackCloth + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black Cloth                       $"+BlackCloth);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (BlackGrayCloth + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Black/Gray Cloth                    $"+BlackGrayCloth);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (RedBlackSuedeEffectFabric + EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Red/Black Suede Effect-Fabric       $"+RedBlackSuedeEffectFabric);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                            
                 case 6://1ER CASE DE AROS//
                                 System.out.println("AROS");
                                 System.out.println("1.-   15 --------------------------------------------- $0.00");
                                 System.out.println("2.-   16 --------------------------------------------- $0.00");
                                 System.out.println("3.-   17 --------------------------------------------- $1688.00");
                                 System.out.println("4.-   18 --------------------------------------------- $1700.00");
                                 System.out.println("5.-   19 --------------------------------------------- $3011.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int accesos = consola.nextInt();
                                  switch (accesos){
                                      case 1:
                                      float total = (float) (Pulgadas_15 + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 15                         $"+Pulgadas_15);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (Pulgadas_16 + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 16                        $"+Pulgadas_16);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:__________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (Pulgadas_17 + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 17                         $"+Pulgadas_17);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (Pulgadas_18 + EconomicoversionRally);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 18                         $"+Pulgadas_18);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (Pulgadas_19 + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Pulgadas 19                         $"+Pulgadas_19);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                 case 7://1ER CASE DE ACCESORIOS EXTERIORES//
                                 System.out.println("ACCESORIOS EXTERIORES");
                                 System.out.println("1.-   Body Side Molding --------------------------------------- $217.00");
                                 System.out.println("2.-   Car Cover ----------------------------------------------- $230.00");
                                 System.out.println("3.-   Decklid Spoiler ----------------------------------------- $299..99");
                                 System.out.println("4.-   Door Edge Film ------------------------------------------ $42.00");
                                 System.out.println("5.-   Door Edge Guards ---------------------------------------- $84.00");
                                 System.out.println("6.-   Door Trim Chrome ---------------------------------------- $285.00");
                                 System.out.println("7.-   Door Visor ---------------------------------------------- $185.00");
                                 System.out.println("8.-   Front Fender Emblems ------------------------------------ $50.00");
                                 System.out.println("9.-   Rear Bumper Applique ------------------------------------ $70.00");
                                 System.out.println("10.-  Fog Lights ---------------------------------------------- $325.00");
                                 System.out.println("11.-  Nose Mascs ---------------------------------------------- $158.00");
                                 System.out.println("12.-  Moonrof Visor ------------------------------------------- $138.00");
                                 System.out.println("13.-  Splash Guard Set ---------------------------------------- $104.00");
                                 System.out.println("14.-  Dust Cover ---------------------------------------------- $350.00");
                                 System.out.println("15.-  Door Mirror Cover - Carbon Fiber ------------------------ $520.00");
                                 System.out.println(" ---------------------------------------------------------------------");
                                 System.out.println("ELIJA SU AMENIDAD");
                                 
                                 int exterior = consola.nextInt();
                                  switch (exterior){
                                      case 1:
                                      float total = (float) (BodySideMolding + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Body Side Molding                   $"+BodySideMolding);
                                      System.out.println("                                                          __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+total);//PRIMERA SUMA
                                 break;
                                case 2:
                
                                      float tota = (float) (CarCover + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Car Cover                         $"+CarCover);
                                      System.out.println("                                                        __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tota);//PRIMERA SUMA
                                      break;
                                case 3:
                                      
                                      float totals = (float) (DecklidSpoiler + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Decklid Spoiler                     $"+DecklidSpoiler);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totals);//PRIMERA SUMA
                                      break;
                                case 4:
                                    float totas = (float) (DoorEdgeFilm + EconomicoversionRally);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Film                      $"+DoorEdgeFilm);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totas);//PRIMERA SUMA
                                      break;
                                 case 5:
                                      float totales = (float) (DoorEdgeGuards + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Edge Guards                    $"+DoorEdgeGuards);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totales);//PRIMERA SUMA
                                 break;
                                case 6:
                
                                      float tosta = (float) (DoorTrimChrome + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Trim Chrome                   $"+DoorTrimChrome);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tosta);//PRIMERA SUMA
                                      break;
                                case 7:
                                      
                                      float totls = (float) (DoorVisor + EconomicoversionRally);
                                      
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Visor                          $"+DoorVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totls);//PRIMERA SUMA
                                      break;
                                case 8:
                                    float totasl = (float) (FrontFenderEmblems+ EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Front Fender Emblems                $"+FrontFenderEmblems);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totasl);//PRIMERA SUMA
                                      break;     
                                case 9:
                                      float stotal = (float) (RearBumperApplique + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Orange Fury                         $"+RearBumperApplique);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+stotal);//PRIMERA SUMA
                                 break;
                                case 10:
                
                                      float tsota = (float) (FoglLghts + EconomicoversionRally);
                                      System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Fog Lights                         $"+FoglLghts);
                                      System.out.println("                                                       __________________    ");
                                      System.out.println("TOTAL:_________________________________________________$"+tsota);//PRIMERA SUMA
                                      break;
                                case 11:
                                      
                                      float totalss = (float) (NoseMascs + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Nose Mascs                          $"+NoseMascs);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+totalss);//PRIMERA SUMA
                                      break;
                                case 12:
                                    float tostas = (float) (MoonrofVisor + EconomicoversionRally);
                                    
                                   System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Moonrof Visor                       $"+MoonrofVisor);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tostas);//PRIMERA SUMA
                                      break;
                                case 13:
                                      
                                      float tols = (float) (SplashGuardSet + EconomicoversionRally);
                                      
                                     System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Splash Guard Set                    $"+SplashGuardSet);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tols);//PRIMERA SUMA
                                      break;
                                case 14:
                                    float ostas = (float) (DustCover + EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Dust Cover                          $"+DustCover);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+ostas);//PRIMERA SUMA
                                      break;
                                case 15:
                                    float tost = (float) (DoorMirrorCoverCarbonFiber + EconomicoversionRally);
                                    
                                    System.out.println("--------------------------------------");
                                      System.out.println("Gama Seleccionada: Economico Version Rally              $"+EconomicoversionRally);
                                      System.out.println("                                                        ");
                                      System.out.println("Amenidades:                                                            ");
                                      System.out.println("TIPO DE TRANSMISION: Door Mirror Cover - Carbon Fiber    $"+DoorMirrorCoverCarbonFiber);
                                      System.out.println("                                                         __________________    ");
                                      System.out.println("TOTAL:___________________________________________________$"+tost);//PRIMERA SUMA
                                      break;
                                  }
                                  salir = true;
                                 break;//CERRAR EL PROGRAMA CUANDO TERMINE SU PROCESO//
                                 
                case 8://1ER CASE DE VEHICULOS//
                                 System.out.println("--REGRESAR AL MENU PRINCIPAL--"); 
                                 //AQUI NO NECESITA UN TRUE PARA SALIR
                         }
                        salir = false;//cierre del ciclo while     
                        sali = false;
                        break;
                        
                case 2://ESTE CASE 2 ES PARA CUANDO HAYAS DICHO QUE NO
                        System.out.println("HA DICHO QUE NO");
                        System.out.println("--------------------------------------");
                        System.out.println("Gama Seleccionada: Economico Version Rally              $ 34,700.00    ");
                        System.out.println("                                                                       ");
                        System.out.println("Amenidades: Ninguna                                     $     00.00    ");
                        System.out.println("                                                 __________________    ");
                        System.out.println("TOTAL:                                                  $ 134,700.00    ");
                        System.out.println("REINICIE NUEVAMENTE");
                        break;
       
                }
                sali = true;//cierre del ciclo while
                salir = false;
                        break;
            
                            
                case 10:
                        System.out.println("10.- Regresar al menu principal");
                        System.exit(0);
                       break;
                
                        
                        
                    default:
                        System.out.println("NUMERO NO VALIDO INCIE NUEVAMENTE");     
                }  
        
        sali = true;//cierre del ciclo while
        }
        
             salir = false;
        
    }
    }

}


    
    
