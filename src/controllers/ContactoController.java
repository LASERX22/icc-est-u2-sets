package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorHash;
import utils.ContactoComparadorTelefono;

public class ContactoController {
    public ContactoController(){
        System.out.println("Nombre - Apellido");
        runTreeContacto();
        System.out.println("===================");
        System.out.println("Nombre - Apellido - Telefono");
        runTreeContactoNumero();
        System.out.println("===================");
        System.out.println("HashCode");
        runTreeContactoHash();
    }

    public void runTreeContacto(){
        ContactoComparador comparador=new ContactoComparador();
        Set<Contacto> agenda=new TreeSet<>(comparador);
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto:agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoNumero(){
        ContactoComparadorTelefono comparador2=new ContactoComparadorTelefono();
        Set<Contacto> agenda=new TreeSet<>(comparador2);
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto:agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoHash(){
        ContactoComparadorHash comparador3=new ContactoComparadorHash();
        Set<Contacto> agenda=new TreeSet<>(comparador3);
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        for(Contacto contacto:agenda){
            System.out.println(contacto);
        }
    }
    
}
