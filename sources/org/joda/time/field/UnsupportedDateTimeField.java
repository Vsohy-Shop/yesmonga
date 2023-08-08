package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;

public final class UnsupportedDateTimeField extends C12599c implements Serializable {

    /* renamed from: a */
    public static HashMap<DateTimeFieldType, UnsupportedDateTimeField> f31131a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final C12646e iDurationField;
    private final DateTimeFieldType iType;

    public UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, C12646e eVar) {
        if (dateTimeFieldType == null || eVar == null) {
            throw new IllegalArgumentException();
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = eVar;
    }

    /* renamed from: Y */
    public static synchronized UnsupportedDateTimeField m53627Y(DateTimeFieldType dateTimeFieldType, C12646e eVar) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        synchronized (UnsupportedDateTimeField.class) {
            HashMap<DateTimeFieldType, UnsupportedDateTimeField> hashMap = f31131a;
            unsupportedDateTimeField = null;
            if (hashMap == null) {
                f31131a = new HashMap<>(7);
            } else {
                UnsupportedDateTimeField unsupportedDateTimeField2 = hashMap.get(dateTimeFieldType);
                if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.mo28841t() == eVar) {
                    unsupportedDateTimeField = unsupportedDateTimeField2;
                }
            }
            if (unsupportedDateTimeField == null) {
                unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, eVar);
                f31131a.put(dateTimeFieldType, unsupportedDateTimeField);
            }
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return m53627Y(this.iType, this.iDurationField);
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        throw mo29090Z();
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        throw mo29090Z();
    }

    /* renamed from: C */
    public int mo28800C() {
        throw mo29090Z();
    }

    /* renamed from: D */
    public int mo28801D(long j) {
        throw mo29090Z();
    }

    /* renamed from: E */
    public int mo28802E(C12714n nVar) {
        throw mo29090Z();
    }

    /* renamed from: F */
    public int mo28803F(C12714n nVar, int[] iArr) {
        throw mo29090Z();
    }

    /* renamed from: G */
    public String mo28804G() {
        return this.iType.mo27803G();
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return null;
    }

    /* renamed from: I */
    public DateTimeFieldType mo28806I() {
        return this.iType;
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        throw mo29090Z();
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return false;
    }

    /* renamed from: L */
    public boolean mo28809L() {
        return false;
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        throw mo29090Z();
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        throw mo29090Z();
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        throw mo29090Z();
    }

    /* renamed from: P */
    public long mo28813P(long j) {
        throw mo29090Z();
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        throw mo29090Z();
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        throw mo29090Z();
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        throw mo29090Z();
    }

    /* renamed from: T */
    public long mo28817T(long j, String str) {
        throw mo29090Z();
    }

    /* renamed from: U */
    public long mo28818U(long j, String str, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: V */
    public int[] mo28819V(C12714n nVar, int i, int[] iArr, int i2) {
        throw mo29090Z();
    }

    /* renamed from: W */
    public int[] mo28820W(C12714n nVar, int i, int[] iArr, String str, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: Z */
    public final UnsupportedOperationException mo29090Z() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
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
        throw mo29090Z();
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        throw mo29090Z();
    }

    /* renamed from: e */
    public int[] mo28826e(C12714n nVar, int i, int[] iArr, int i2) {
        throw mo29090Z();
    }

    /* renamed from: f */
    public int[] mo28827f(C12714n nVar, int i, int[] iArr, int i2) {
        throw mo29090Z();
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        throw mo29090Z();
    }

    /* renamed from: h */
    public String mo28829h(int i, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: i */
    public String mo28830i(long j) {
        throw mo29090Z();
    }

    /* renamed from: j */
    public String mo28831j(long j, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: k */
    public String mo28832k(C12714n nVar, int i, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: l */
    public String mo28833l(C12714n nVar, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: m */
    public String mo28834m(int i, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: n */
    public String mo28835n(long j) {
        throw mo29090Z();
    }

    /* renamed from: o */
    public String mo28836o(long j, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: p */
    public String mo28837p(C12714n nVar, int i, Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: q */
    public String mo28838q(C12714n nVar, Locale locale) {
        throw mo29090Z();
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
    public C12646e mo28841t() {
        return this.iDurationField;
    }

    public String toString() {
        return "UnsupportedDateTimeField";
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        throw mo29090Z();
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return null;
    }

    /* renamed from: w */
    public int mo28845w(Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: x */
    public int mo28846x(Locale locale) {
        throw mo29090Z();
    }

    /* renamed from: y */
    public int mo28847y() {
        throw mo29090Z();
    }

    /* renamed from: z */
    public int mo28848z(long j) {
        throw mo29090Z();
    }
}
