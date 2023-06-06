package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao Curso Javasccript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(mentoria1.toString());
        System.out.println(mentoria1.toString());*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro Jesus");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Leandro: " + devLeandro.getConteudoInscritos());
        devLeandro.progredir();
        devLeandro.progredir();
        System.out.println("---");
        System.out.println("Conteúdo Inscritos Leandro: " + devLeandro.getConteudoInscritos());
        System.out.println("Conteúdo Concluidos Leandro: " + devLeandro.getConteudoConcluidos());
        System.out.printf("XP:" + devLeandro.calcularTotalXp());

        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João Pereira");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos João: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdo Inscritos João: " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdo Concluidos João: " + devJoao.getConteudoConcluidos());
        System.out.printf("XP:" + devJoao.calcularTotalXp());



    }
}