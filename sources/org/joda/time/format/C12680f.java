package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.format.f */
public interface C12680f {
    /* renamed from: q */
    int mo29296q();

    /* renamed from: r */
    void mo29297r(Writer writer, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException;

    /* renamed from: s */
    void mo29298s(StringBuffer stringBuffer, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale);

    /* renamed from: t */
    void mo29299t(Writer writer, C12714n nVar, Locale locale) throws IOException;

    /* renamed from: u */
    void mo29300u(StringBuffer stringBuffer, C12714n nVar, Locale locale);
}
