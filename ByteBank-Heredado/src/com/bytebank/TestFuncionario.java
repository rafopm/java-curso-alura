package com.bytebank;

public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario nico = new Gerente();

        nico.setNombre("Nico Steppat");
        nico.setDocumentoIdentidad("223355646-9");
        nico.setSalario(2590.80);

        System.out.println(nico.getNombre());
        System.out.println(nico.getBonificacion());

    }

}
