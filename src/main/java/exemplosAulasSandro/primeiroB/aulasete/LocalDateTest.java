package exemplosAulasSandro.primeiroB.aulasete;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.AUGUST, 28); //data ficticia
        LocalDate agora = LocalDate.now(); //data atual
        System.out.println("Ano: " + date.getYear());
        System.out.println("Mes: " + date.getMonth());
        System.out.println(date.getMonthValue()); //valor do mes
        System.out.println(date.getDayOfWeek()); //dia da semana
        System.out.println(date.getDayOfMonth()); // dia do mes
        System.out.println(date.lengthOfMonth()); //qts dias tem o mes
        System.out.println(date.isLeapYear()); // ano bisexto ou nao
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date);
        System.out.println(agora);
        agora = agora.plusWeeks(4); //precisamos adicionar novamente a variavel de referencia
        System.out.println(agora);
    }

}
