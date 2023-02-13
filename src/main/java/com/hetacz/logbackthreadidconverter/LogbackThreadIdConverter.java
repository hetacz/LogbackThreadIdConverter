package com.hetacz.logbackthreadidconverter;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class LogbackThreadIdConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent e) {
        return String.valueOf(Thread.currentThread().getId());
    }
}
