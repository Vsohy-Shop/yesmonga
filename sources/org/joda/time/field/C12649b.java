package org.joda.time.field;

import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.field.b */
public abstract class C12649b extends C12599c {

    /* renamed from: a */
    public final DateTimeFieldType f31133a;

    public C12649b(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.f31133a = dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        return mo28847y();
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        return mo28798A(nVar);
    }

    /* renamed from: C */
    public abstract int mo28800C();

    /* renamed from: D */
    public int mo28801D(long j) {
        return mo28800C();
    }

    /* renamed from: E */
    public int mo28802E(C12714n nVar) {
        return mo28800C();
    }

    /* renamed from: F */
    public int mo28803F(C12714n nVar, int[] iArr) {
        return mo28802E(nVar);
    }

    /* renamed from: G */
    public final String mo28804G() {
        return this.f31133a.mo27803G();
    }

    /* renamed from: H */
    public abstract C12646e mo28805H();

    /* renamed from: I */
    public final DateTimeFieldType mo28806I() {
        return this.f31133a;
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        return false;
    }

    /* renamed from: L */
    public final boolean mo28809L() {
        return true;
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return j - mo28812O(j);
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        long O = mo28812O(j);
        if (O != j) {
            return mo28822a(O, 1);
        }
        return j;
    }

    /* renamed from: O */
    public abstract long mo28812O(long j);

    /* renamed from: P */
    public long mo28813P(long j) {
        long O = mo28812O(j);
        long N = mo28811N(j);
        if (N - j <= j - O) {
            return N;
        }
        return O;
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        long O = mo28812O(j);
        long N = mo28811N(j);
        long j2 = j - O;
        long j3 = N - j;
        if (j2 < j3) {
            return O;
        }
        if (j3 >= j2 && (mo28828g(N) & 1) != 0) {
            return O;
        }
        return N;
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        long O = mo28812O(j);
        long N = mo28811N(j);
        if (j - O <= N - j) {
            return O;
        }
        return N;
    }

    /* renamed from: S */
    public abstract long mo28816S(long j, int i);

    /* renamed from: T */
    public final long mo28817T(long j, String str) {
        return mo28818U(j, str, (Locale) null);
    }

    /* renamed from: U */
    public long mo28818U(long j, String str, Locale locale) {
        return mo28816S(j, mo28963Y(str, locale));
    }

    /* renamed from: V */
    public int[] mo28819V(C12714n nVar, int i, int[] iArr, int i2) {
        C12652e.m53806p(this, i2, mo28803F(nVar, iArr), mo28799B(nVar, iArr));
        iArr[i] = i2;
        while (true) {
            i++;
            if (i >= nVar.size()) {
                return iArr;
            }
            C12599c field = nVar.getField(i);
            if (iArr[i] > field.mo28799B(nVar, iArr)) {
                iArr[i] = field.mo28799B(nVar, iArr);
            }
            if (iArr[i] < field.mo28803F(nVar, iArr)) {
                iArr[i] = field.mo28803F(nVar, iArr);
            }
        }
    }

    /* renamed from: W */
    public int[] mo28820W(C12714n nVar, int i, int[] iArr, String str, Locale locale) {
        return mo28819V(nVar, i, iArr, mo28963Y(str, locale));
    }

    /* renamed from: Y */
    public int mo28963Y(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(mo28806I(), str);
        }
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        return mo28841t().mo28909b(j, i);
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return mo28841t().mo28910g(j, j2);
    }

    /* renamed from: c */
    public int[] mo28824c(C12714n nVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        C12599c cVar = null;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            int B = mo28799B(nVar, iArr);
            long j = (long) (iArr[i] + i2);
            if (j <= ((long) B)) {
                iArr[i] = (int) j;
                break;
            }
            if (cVar == null) {
                if (i != 0) {
                    cVar = nVar.getField(i - 1);
                    if (mo28805H().mo29034W() != cVar.mo28841t().mo29034W()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i2 -= (B + 1) - iArr[i];
            iArr = cVar.mo28824c(nVar, i - 1, iArr, 1);
            iArr[i] = mo28803F(nVar, iArr);
        }
        while (true) {
            if (i2 >= 0) {
                break;
            }
            int F = mo28803F(nVar, iArr);
            long j2 = (long) (iArr[i] + i2);
            if (j2 >= ((long) F)) {
                iArr[i] = (int) j2;
                break;
            }
            if (cVar == null) {
                if (i != 0) {
                    cVar = nVar.getField(i - 1);
                    if (mo28805H().mo29034W() != cVar.mo28841t().mo29034W()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i2 -= (F - 1) - iArr[i];
            iArr = cVar.mo28824c(nVar, i - 1, iArr, -1);
            iArr[i] = mo28799B(nVar, iArr);
        }
        return mo28819V(nVar, i, iArr, iArr[i]);
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo28816S(j, C12652e.m53793c(mo28828g(j), i, mo28801D(j), mo28848z(j)));
    }

    /* renamed from: e */
    public int[] mo28826e(C12714n nVar, int i, int[] iArr, int i2) {
        return mo28819V(nVar, i, iArr, C12652e.m53793c(iArr[i], i2, mo28802E(nVar), mo28798A(nVar)));
    }

    /* renamed from: f */
    public int[] mo28827f(C12714n nVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        C12599c cVar = null;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            int B = mo28799B(nVar, iArr);
            int i3 = iArr[i];
            long j = (long) (i3 + i2);
            if (j <= ((long) B)) {
                iArr[i] = (int) j;
                break;
            }
            if (cVar == null) {
                if (i == 0) {
                    i2 -= (B + 1) - i3;
                    iArr[i] = mo28803F(nVar, iArr);
                } else {
                    cVar = nVar.getField(i - 1);
                    if (mo28805H().mo29034W() != cVar.mo28841t().mo29034W()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i2 -= (B + 1) - iArr[i];
            iArr = cVar.mo28827f(nVar, i - 1, iArr, 1);
            iArr[i] = mo28803F(nVar, iArr);
        }
        while (true) {
            if (i2 >= 0) {
                break;
            }
            int F = mo28803F(nVar, iArr);
            int i4 = iArr[i];
            long j2 = (long) (i4 + i2);
            if (j2 >= ((long) F)) {
                iArr[i] = (int) j2;
                break;
            }
            if (cVar == null) {
                if (i == 0) {
                    r12 = i2 - ((F - 1) - i4);
                    iArr[i] = mo28799B(nVar, iArr);
                } else {
                    cVar = nVar.getField(i - 1);
                    if (mo28805H().mo29034W() != cVar.mo28841t().mo29034W()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            r12 = i2 - ((F - 1) - iArr[i]);
            iArr = cVar.mo28827f(nVar, i - 1, iArr, -1);
            iArr[i] = mo28799B(nVar, iArr);
        }
        return mo28819V(nVar, i, iArr, iArr[i]);
    }

    /* renamed from: g */
    public abstract int mo28828g(long j);

    /* renamed from: h */
    public String mo28829h(int i, Locale locale) {
        return mo28834m(i, locale);
    }

    /* renamed from: i */
    public final String mo28830i(long j) {
        return mo28831j(j, (Locale) null);
    }

    /* renamed from: j */
    public String mo28831j(long j, Locale locale) {
        return mo28829h(mo28828g(j), locale);
    }

    /* renamed from: k */
    public String mo28832k(C12714n nVar, int i, Locale locale) {
        return mo28829h(i, locale);
    }

    /* renamed from: l */
    public final String mo28833l(C12714n nVar, Locale locale) {
        return mo28832k(nVar, nVar.mo27959T(mo28806I()), locale);
    }

    /* renamed from: m */
    public String mo28834m(int i, Locale locale) {
        return Integer.toString(i);
    }

    /* renamed from: n */
    public final String mo28835n(long j) {
        return mo28836o(j, (Locale) null);
    }

    /* renamed from: o */
    public String mo28836o(long j, Locale locale) {
        return mo28834m(mo28828g(j), locale);
    }

    /* renamed from: p */
    public String mo28837p(C12714n nVar, int i, Locale locale) {
        return mo28834m(i, locale);
    }

    /* renamed from: q */
    public final String mo28838q(C12714n nVar, Locale locale) {
        return mo28837p(nVar, nVar.mo27959T(mo28806I()), locale);
    }

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return mo28841t().mo28911q(j, j2);
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        return mo28841t().mo28912r(j, j2);
    }

    /* renamed from: t */
    public abstract C12646e mo28841t();

    public String toString() {
        return "DateTimeField[" + mo28804G() + C12361b.f30261l;
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        return 0;
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return null;
    }

    /* renamed from: w */
    public int mo28845w(Locale locale) {
        return mo28846x(locale);
    }

    /* renamed from: x */
    public int mo28846x(Locale locale) {
        int y = mo28847y();
        if (y >= 0) {
            if (y < 10) {
                return 1;
            }
            if (y < 100) {
                return 2;
            }
            if (y < 1000) {
                return 3;
            }
        }
        return Integer.toString(y).length();
    }

    /* renamed from: y */
    public abstract int mo28847y();

    /* renamed from: z */
    public int mo28848z(long j) {
        return mo28847y();
    }
}
