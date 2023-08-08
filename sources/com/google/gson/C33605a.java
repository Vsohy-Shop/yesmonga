package com.google.gson;

import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.a */
public final class C33605a extends C33708s<Date> {

    /* renamed from: c */
    public static final String f81762c = "DefaultDateTypeAdapter";

    /* renamed from: a */
    public final Class<? extends Date> f81763a;

    /* renamed from: b */
    public final List<DateFormat> f81764b;

    public C33605a(Class<? extends Date> cls) {
        ArrayList arrayList = new ArrayList();
        this.f81764b = arrayList;
        this.f81763a = m135355a(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }

    /* renamed from: a */
    public static Class<? extends Date> m135355a(Class<? extends Date> cls) {
        Class cls2;
        Class cls3;
        Class<Date> cls4 = Date.class;
        if (cls == cls4 || cls == (cls2 = java.sql.Date.class) || cls == (cls3 = Timestamp.class)) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + cls4 + ", " + cls3 + ", or " + cls2 + " but was " + cls);
    }

    public final Date deserializeToDate(String str) {
        synchronized (this.f81764b) {
            for (DateFormat parse : this.f81764b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date parse3 = ISO8601Utils.parse(str, new ParsePosition(0));
                return parse3;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f81764b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public Date read(C33710a aVar) throws IOException {
        if (aVar.peek() == JsonToken.NULL) {
            aVar.nextNull();
            return null;
        }
        Date deserializeToDate = deserializeToDate(aVar.nextString());
        Class<? extends Date> cls = this.f81763a;
        if (cls == Date.class) {
            return deserializeToDate;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(deserializeToDate.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(deserializeToDate.getTime());
        }
        throw new AssertionError();
    }

    public void write(C33713c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.nullValue();
            return;
        }
        synchronized (this.f81764b) {
            cVar.value(this.f81764b.get(0).format(date));
        }
    }

    public C33605a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f81764b = arrayList;
        this.f81763a = m135355a(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public C33605a(Class<? extends Date> cls, int i) {
        ArrayList arrayList = new ArrayList();
        this.f81764b = arrayList;
        this.f81763a = m135355a(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateFormat(i));
        }
    }

    public C33605a(int i, int i2) {
        this(Date.class, i, i2);
    }

    public C33605a(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f81764b = arrayList;
        this.f81763a = m135355a(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2));
        }
    }
}
