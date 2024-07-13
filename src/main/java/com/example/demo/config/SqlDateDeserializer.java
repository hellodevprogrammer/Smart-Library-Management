//package com.example.demo.config;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//
//import java.io.IOException;
//import java.sql.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//public class SqlDateDeserializer extends JsonDeserializer<Date> {
//
//    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//    @Override
//    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) 
//            throws IOException, JsonProcessingException {
//        String date = jsonParser.getText();
//        try {
//            return new Date(dateFormat.parse(date).getTime());
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
