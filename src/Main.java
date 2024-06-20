import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String [] args){
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(81);

       /* System.out.println(curso1);
        System.out.println(curso2);*/

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();

        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao(("Descrição: Bootcamp Java devoloper"));
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devMilton = new Dev();
        devMilton.setNome("Milton");
        devMilton.inscreverBootCamo(bootCamp);
        devMilton.progredir();
        System.out.println("Conteudos inscritos Milton " + devMilton.getConteudosInscritos());
        System.out.println("******");
        System.out.println("Conteudos concluidos Milton " + devMilton.getConteudosConcluidos());
        System.out.println("XP : " + devMilton.calcularTotalXp());
        System.out.println("*****");

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootCamo(bootCamp);
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("Conteudos inscritos Eduardo " + devEduardo.getConteudosInscritos());
        System.out.println("*****");
        System.out.println("Conteudos concluidos Eduardo " + devMilton.getConteudosConcluidos());
        System.out.println("XP : " + devMilton.calcularTotalXp());



    }
}
