package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter extends C33708s<Time> {
    public static final C33714t FACTORY = new C33714t() {
        public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

    public synchronized Time read(C33710a aVar) throws IOException {
        if (aVar.peek() == JsonToken.NULL) {
            aVar.nextNull();
            return null;
        }
        try {
            return new Time(this.format.parse(aVar.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    public synchronized void write(C33713c cVar, Time time) throws IOException {
        cVar.value(time == null ? null : this.format.format(time));
    }
}
