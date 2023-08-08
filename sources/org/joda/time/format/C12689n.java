package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.format.n */
public class C12689n implements C12680f, C12688m {

    /* renamed from: a */
    public final C12688m f31311a;

    public C12689n(C12688m mVar) {
        this.f31311a = mVar;
    }

    /* renamed from: a */
    public static C12680f m54351a(C12688m mVar) {
        if (mVar instanceof C12681g) {
            return ((C12681g) mVar).mo29301a();
        }
        if (mVar instanceof C12680f) {
            return (C12680f) mVar;
        }
        if (mVar == null) {
            return null;
        }
        return new C12689n(mVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12689n) {
            return this.f31311a.equals(((C12689n) obj).f31311a);
        }
        return false;
    }

    /* renamed from: q */
    public int mo29296q() {
        return this.f31311a.mo29198q();
    }

    /* renamed from: r */
    public void mo29297r(Writer writer, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        this.f31311a.mo29200y(writer, j, aVar, i, dateTimeZone, locale);
    }

    /* renamed from: s */
    public void mo29298s(StringBuffer stringBuffer, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
        try {
            this.f31311a.mo29200y(stringBuffer, j, aVar, i, dateTimeZone, locale);
        } catch (IOException unused) {
        }
    }

    /* renamed from: t */
    public void mo29299t(Writer writer, C12714n nVar, Locale locale) throws IOException {
        this.f31311a.mo29199w(writer, nVar, locale);
    }

    /* renamed from: u */
    public void mo29300u(StringBuffer stringBuffer, C12714n nVar, Locale locale) {
        try {
            this.f31311a.mo29199w(stringBuffer, nVar, locale);
        } catch (IOException unused) {
        }
    }

    /* renamed from: w */
    public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
        this.f31311a.mo29199w(appendable, nVar, locale);
    }

    /* renamed from: y */
    public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        this.f31311a.mo29200y(appendable, j, aVar, i, dateTimeZone, locale);
    }
}
