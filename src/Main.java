import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Desenvolvedor Java");
        bootcamp1.setDescricao("Descrição do Bootcamp Desenvolvedor Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);


        System.out.println("=====DEV1=====");
        Dev devpedro = new Dev();
        devpedro.setNome("Pedro");
        devpedro.inscreverBootcamp(bootcamp1);
        System.out.printf("Conteúdos Inscritos Pedro: %s\n", devpedro.getConteudosInscritos());
        devpedro.progredir();

        System.out.println("-");

        System.out.printf("Conteúdos Concluídos Pedro: %s\n", devpedro.getConteudosConcluidos());
        System.out.printf("Conteúdos Inscritos Pedro: %s\n", devpedro.getConteudosInscritos());

        System.out.println();

        System.out.println("=====DEV2=====");
        Dev devgabriel = new Dev();
        devgabriel.setNome("Gabriel");
        devgabriel.inscreverBootcamp(bootcamp1);
        System.out.printf("Conteúdos Inscritos Gabriel: %s\n", devgabriel.getConteudosInscritos());
        devgabriel.progredir();

        System.out.println("-");

        System.out.printf("Conteúdos Concluídos Gabriel: %s\n", devgabriel.getConteudosConcluidos());
        System.out.printf("Conteúdos Inscritos Gabriel: %s\n", devgabriel.getConteudosInscritos());


    }
}