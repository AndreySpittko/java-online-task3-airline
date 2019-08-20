package com.epam.airlineOOP.services.fileService;

import javafx.util.converter.LocalDateTimeStringConverter;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FileService {
    private static final String FILE_NAME = ".\\src\\main\\java\\com\\epam\\airlineOOP\\fileHistory\\" + generateFileName()+".txt";

    private static String generateFileName(){
//        return LocalDateTime.now().toString().replace( "-" , "" ).replace( ":" , "" );
        return DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(LocalDateTime.now());
    }

    public void getFileName(){
        String now = LocalDateTime.now( ZoneId.of( "America/Montreal" ) ).truncatedTo( ChronoUnit.SECONDS ).toString().replace( "-" , "" ).replace( ":" , "" );
        System.out.println(now);
        System.out.println(FILE_NAME);
        System.out.println(LocalDateTime.now().toString());
        System.out.println(generateFileName());

        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String format = timeStampPattern.format(LocalDateTime.now());
        System.out.println(format);
    }

    public void writer(String text){
        try(FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
