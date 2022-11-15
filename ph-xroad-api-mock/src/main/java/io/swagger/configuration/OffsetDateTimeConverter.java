package io.swagger.configuration;

import org.springframework.core.convert.converter.Converter;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;


public class OffsetDateTimeConverter implements Converter<String, OffsetDateTime> {
    private final DateTimeFormatter formatter;

    public OffsetDateTimeConverter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public OffsetDateTimeConverter(String dateFormat) {
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }

    @Override
    public OffsetDateTime convert(String source) {
        if(source == null || source.isEmpty()) {
            return null;
        }
        return OffsetDateTime.parse(source, this.formatter);
    }
}
