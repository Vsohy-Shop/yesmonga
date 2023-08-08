package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.format.g */
public class C12681g implements C12688m {

    /* renamed from: a */
    public final C12680f f31244a;

    public C12681g(C12680f fVar) {
        this.f31244a = fVar;
    }

    /* renamed from: b */
    public static C12688m m54151b(C12680f fVar) {
        if (fVar instanceof C12689n) {
            return (C12688m) fVar;
        }
        if (fVar == null) {
            return null;
        }
        return new C12681g(fVar);
    }

    /* renamed from: a */
    public C12680f mo29301a() {
        return this.f31244a;
    }

    /* renamed from: q */
    public int mo29198q() {
        return this.f31244a.mo29296q();
    }

    /* renamed from: w */
    public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.f31244a.mo29300u((StringBuffer) appendable, nVar, locale);
        } else if (appendable instanceof Writer) {
            this.f31244a.mo29299t((Writer) appendable, nVar, locale);
        } else {
            StringBuffer stringBuffer = new StringBuffer(mo29198q());
            this.f31244a.mo29300u(stringBuffer, nVar, locale);
            appendable.append(stringBuffer);
        }
    }

    /* renamed from: y */
    public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        Appendable appendable2 = appendable;
        if (appendable2 instanceof StringBuffer) {
            this.f31244a.mo29298s((StringBuffer) appendable2, j, aVar, i, dateTimeZone, locale);
        } else if (appendable2 instanceof Writer) {
            this.f31244a.mo29297r((Writer) appendable2, j, aVar, i, dateTimeZone, locale);
        } else {
            StringBuffer stringBuffer = new StringBuffer(mo29198q());
            this.f31244a.mo29298s(stringBuffer, j, aVar, i, dateTimeZone, locale);
            appendable.append(stringBuffer);
        }
    }
}
