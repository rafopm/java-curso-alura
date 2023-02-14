package com.bytebank;
public class TestReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControlBonificacion control = new ControlBonificacion();
        control.registrar(g1);
        control.registrar(ev);
        control.registrar(d);

        System.out.println(control.getSuma());

    }

}