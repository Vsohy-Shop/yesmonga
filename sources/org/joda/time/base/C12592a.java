package org.joda.time.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.joda.convert.ToString;
import org.joda.time.C12710j;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.C12671a;

/* renamed from: org.joda.time.base.a */
public abstract class C12592a extends C12594c implements C12710j {
    /* renamed from: B0 */
    public int mo28705B0() {
        return mo27913m().mo28619E().mo28828g(mo27912k());
    }

    /* renamed from: B1 */
    public Calendar mo28706B1(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Calendar instance = Calendar.getInstance(mo28742K1().mo27817N(), locale);
        instance.setTime(mo28744O0());
        return instance;
    }

    /* renamed from: F1 */
    public GregorianCalendar mo28707F1() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(mo28742K1().mo27817N());
        gregorianCalendar.setTime(mo28744O0());
        return gregorianCalendar;
    }

    /* renamed from: P1 */
    public int mo28708P1() {
        return mo27913m().mo28643i().mo28828g(mo27912k());
    }

    /* renamed from: R1 */
    public int mo28709R1() {
        return mo27913m().mo28641g().mo28828g(mo27912k());
    }

    /* renamed from: S1 */
    public String mo28710S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29259v(this);
    }

    /* renamed from: T */
    public int mo28711T(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.mo27802F(mo27913m()).mo28828g(mo27912k());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: T0 */
    public int mo28712T0() {
        return mo27913m().mo28645k().mo28828g(mo27912k());
    }

    /* renamed from: V1 */
    public int mo28713V1() {
        return mo27913m().mo28655v().mo28828g(mo27912k());
    }

    /* renamed from: Z0 */
    public int mo28714Z0() {
        return mo27913m().mo28628N().mo28828g(mo27912k());
    }

    /* renamed from: d2 */
    public int mo28715d2() {
        return mo27913m().mo28633U().mo28828g(mo27912k());
    }

    /* renamed from: e1 */
    public int mo28716e1() {
        return mo27913m().mo28617C().mo28828g(mo27912k());
    }

    /* renamed from: f2 */
    public int mo28717f2() {
        return mo27913m().mo28622H().mo28828g(mo27912k());
    }

    public int getYear() {
        return mo27913m().mo28631S().mo28828g(mo27912k());
    }

    /* renamed from: h1 */
    public int mo28719h1() {
        return mo27913m().mo28615A().mo28828g(mo27912k());
    }

    /* renamed from: h2 */
    public int mo28720h2() {
        return mo27913m().mo28632T().mo28828g(mo27912k());
    }

    /* renamed from: i1 */
    public int mo28721i1() {
        return mo27913m().mo28638d().mo28828g(mo27912k());
    }

    /* renamed from: p1 */
    public int mo28722p1() {
        return mo27913m().mo28659z().mo28828g(mo27912k());
    }

    /* renamed from: r1 */
    public int mo28723r1() {
        return mo27913m().mo28616B().mo28828g(mo27912k());
    }

    /* renamed from: s0 */
    public int mo28724s0() {
        return mo27913m().mo28642h().mo28828g(mo27912k());
    }

    @ToString
    public String toString() {
        return super.toString();
    }

    /* renamed from: v1 */
    public int mo28726v1() {
        return mo27913m().mo28621G().mo28828g(mo27912k());
    }

    /* renamed from: w0 */
    public String mo28727w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29259v(this);
    }

    /* renamed from: z0 */
    public int mo28728z0() {
        return mo27913m().mo28626L().mo28828g(mo27912k());
    }
}
