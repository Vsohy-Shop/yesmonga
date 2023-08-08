package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.urbanairship.util.o */
public class C9668o {

    /* renamed from: a */
    public static final SimpleDateFormat f26485a;

    /* renamed from: b */
    public static final SimpleDateFormat f26486b;

    /* renamed from: c */
    public static final Object f26487c = new Object();

    static {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        f26485a = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f26486b = simpleDateFormat2;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @C0359n0
    /* renamed from: a */
    public static String m36217a(long j) {
        String format;
        synchronized (f26487c) {
            format = f26485a.format(new Date(j));
        }
        return format;
    }

    /* renamed from: b */
    public static long m36218b(@C0363p0 String str) throws ParseException {
        long time;
        if (str != null) {
            try {
                synchronized (f26487c) {
                    try {
                        time = f26485a.parse(str).getTime();
                    } catch (ParseException unused) {
                        return f26486b.parse(str).getTime();
                    }
                }
                return time;
            } catch (Exception e) {
                throw new ParseException("Unexpected issue when attempting to parse " + str + " - " + e.getMessage(), -1);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new ParseException("Unable to parse null timestamp", -1);
        }
    }

    /* renamed from: c */
    public static long m36219c(@C0359n0 String str, long j) {
        try {
            return m36218b(str);
        } catch (ParseException unused) {
            return j;
        }
    }
}
