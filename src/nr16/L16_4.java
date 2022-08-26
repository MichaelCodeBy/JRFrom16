package nr16;

import java.io.StringWriter;
//Есть еще один интересный класс-наследник от класса Writer — это StringWriter. В нем находится
// изменяемая строка — объект StringBuffer. И каждый раз, когда вы что-то «пишете» в объект
// StringWriter, текст просто добавляется во внутренний буфер.
public class L16_4 {
    public static void main(String[] args) {


        StringWriter writer = new StringWriter();//Создается целевой символьный поток StringWriter
        writer.write("Hello");//Строка пишется в буфер внутри StringWriter
        writer.write(String.valueOf(123));//Строка пишется в буфер внутри StringWriter

        String result = writer.toString();//Преобразовываем содержимое объекта к строке
        System.out.println(result);
    }
}