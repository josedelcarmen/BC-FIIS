public class PruebaPersona {
    public static void main(String[] args){
        Persona pepe = new Persona("José del Carmen", "Vílchez", "Canchucaja");
        Persona lucho = new Persona("Luis", "Candela", "Manzo");
        Persona julio = new Persona("Julio", "Castro", "Cruz");
        Persona maribel = new Persona("Maribel", "Díaz", "Agreda");

        System.out.println(pepe);
        System.out.println(lucho);
        System.out.println(julio);
        System.out.println(maribel);

        System.out.println( Persona.getUltimoId() );
    }
}
