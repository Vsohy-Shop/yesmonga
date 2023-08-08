package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends C33708s<Date> {
    public static final C33714t FACTORY = new C33714t() {
        public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> dateFormats;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }

    private synchronized Date deserializeToDate(String str) {
        for (DateFormat parse : this.dateFormats) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return ISO8601Utils.parse(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    public Date read(C33710a aVar) throws IOException {
        if (aVar.peek() != JsonToken.NULL) {
            return deserializeToDate(aVar.nextString());
        }
        aVar.nextNull();
        return null;
    }

    public synchronized void write(C33713c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.nullValue();
        } else {
            cVar.value(this.dateFormats.get(0).format(date));
        }
    }
}
