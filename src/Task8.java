import java.util.Arrays;
public class Task8 {
    static class Main {
        public static void main(String[] args) {
            String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"}; //Создан массив с ролями, размер 4
            //Массив содержащийтекст пьессы
            String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
            //размер 7 строк
            String[] roles2 = new String[roles.length]; //Создание строкового массива 2 с таким же размером как массив 1
            for (int i = 0; i < roles.length; i++) {
                roles2[i] = roles[i] + ": ";
            }
            StringBuilder sb = new StringBuilder(); // создали новую пополняемую строку
            String space = "\n"; // просто разделитель строк, чтобы при выводе красиво было

            for(int i=0; i < roles.length; i++){
                if(i==0){
                    sb.append(roles[i]);
                    sb.append(":");
                }else{
                    sb.append(space);
                    sb.append(space);
                    sb.append(roles[i]);
                    sb.append(":");
                }

                for(int j=0; j < textLines.length; j++){
                    if(textLines[j].startsWith(roles[i]+":")){ //добавление нумерации строк
                        sb.append(space);
                        sb.append((j+1));
                        sb.append(") ");
                        sb.append(textLines[j].replaceFirst(roles2[i], "")); //удаляет роль из начала строки.
                    }
                }
            }

            String stringResult = sb.toString();

            System.out.println(stringResult);
        }
    }
}


