package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;

public class DelegatedDateTimeField extends C12599c implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final C12599c iField;
    private final C12646e iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(C12599c cVar) {
        this(cVar, (DateTimeFieldType) null);
    }

    /* renamed from: A */
    public int mo28798A(C12714n nVar) {
        return this.iField.mo28798A(nVar);
    }

    /* renamed from: B */
    public int mo28799B(C12714n nVar, int[] iArr) {
        return this.iField.mo28799B(nVar, iArr);
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.iField.mo28800C();
    }

    /* renamed from: D */
    public int mo28801D(long j) {
        return this.iField.mo28801D(j);
    }

    /* renamed from: E */
    public int mo28802E(C12714n nVar) {
        return this.iField.mo28802E(nVar);
    }

    /* renamed from: F */
    public int mo28803F(C12714n nVar, int[] iArr) {
        return this.iField.mo28803F(nVar, iArr);
    }

    /* renamed from: G */
    public String mo28804G() {
        return this.iType.mo27803G();
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        C12646e eVar = this.iRangeDurationField;
        if (eVar != null) {
            return eVar;
        }
        return this.iField.mo28805H();
    }

    /* renamed from: I */
    public DateTimeFieldType mo28806I() {
        return this.iType;
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        return this.iField.mo28807J(j);
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return this.iField.mo28808K();
    }

    /* renamed from: L */
    public boolean mo28809L() {
        return this.iField.mo28809L();
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return this.iField.mo28810M(j);
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        return this.iField.mo28811N(j);
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return this.iField.mo28812O(j);
    }

    /* renamed from: P */
    public long mo28813P(long j) {
        return this.iField.mo28813P(j);
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        return this.iField.mo28814Q(j);
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        return this.iField.mo28815R(j);
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        return this.iField.mo28816S(j, i);
    }

    /* renamed from: T */
    public long mo28817T(long j, String str) {
        return this.iField.mo28817T(j, str);
    }

    /* renamed from: U */
    public long mo28818U(long j, String str, Locale locale) {
        return this.iField.mo28818U(j, str, locale);
    }

    /* renamed from: V */
    public int[] mo28819V(C12714n nVar, int i, int[] iArr, int i2) {
        return this.iField.mo28819V(nVar, i, iArr, i2);
    }

    /* renamed from: W */
    public int[] mo28820W(C12714n nVar, int i, int[] iArr, String str, Locale locale) {
        return this.iField.mo28820W(nVar, i, iArr, str, locale);
    }

    /* renamed from: Y */
    public final C12599c mo29074Y() {
        return this.iField;
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        return this.iField.mo28822a(j, i);
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return this.iField.mo28823b(j, j2);
    }

    /* renamed from: c */
    public int[] mo28824c(C12714n nVar, int i, int[] iArr, int i2) {
        return this.iField.mo28824c(nVar, i, iArr, i2);
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return this.iField.mo28825d(j, i);
    }

    /* renamed from: e */
    public int[] mo28826e(C12714n nVar, int i, int[] iArr, int i2) {
        return this.iField.mo28826e(nVar, i, iArr, i2);
    }

    /* renamed from: f */
    public int[] mo28827f(C12714n nVar, int i, int[] iArr, int i2) {
        return this.iField.mo28827f(nVar, i, iArr, i2);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.iField.mo28828g(j);
    }

    /* renamed from: h */
    public String mo28829h(int i, Locale locale) {
        return this.iField.mo28829h(i, locale);
    }

    /* renamed from: i */
    public String mo28830i(long j) {
        return this.iField.mo28830i(j);
    }

    /* renamed from: j */
    public String mo28831j(long j, Locale locale) {
        return this.iField.mo28831j(j, locale);
    }

    /* renamed from: k */
    public String mo28832k(C12714n nVar, int i, Locale locale) {
        return this.iField.mo28832k(nVar, i, locale);
    }

    /* renamed from: l */
    public String mo28833l(C12714n nVar, Locale locale) {
        return this.iField.mo28833l(nVar, locale);
    }

    /* renamed from: m */
    public String mo28834m(int i, Locale locale) {
        return this.iField.mo28834m(i, locale);
    }

    /* renamed from: n */
    public String mo28835n(long j) {
        return this.iField.mo28835n(j);
    }

    /* renamed from: o */
    public String mo28836o(long j, Locale locale) {
        return this.iField.mo28836o(j, locale);
    }

    /* renamed from: p */
    public String mo28837p(C12714n nVar, int i, Locale locale) {
        return this.iField.mo28837p(nVar, i, locale);
    }

    /* renamed from: q */
    public String mo28838q(C12714n nVar, Locale locale) {
        return this.iField.mo28838q(nVar, locale);
    }

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return this.iField.mo28839r(j, j2);
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        return this.iField.mo28840s(j, j2);
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return this.iField.mo28841t();
    }

    public String toString() {
        return "DateTimeField[" + mo28804G() + C12361b.f30261l;
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        return this.iField.mo28843u(j);
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return this.iField.mo28844v();
    }

    /* renamed from: w */
    public int mo28845w(Locale locale) {
        return this.iField.mo28845w(locale);
    }

    /* renamed from: x */
    public int mo28846x(Locale locale) {
        return this.iField.mo28846x(locale);
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.iField.mo28847y();
    }

    /* renamed from: z */
    public int mo28848z(long j) {
        return this.iField.mo28848z(j);
    }

    public DelegatedDateTimeField(C12599c cVar, DateTimeFieldType dateTimeFieldType) {
        this(cVar, (C12646e) null, dateTimeFieldType);
    }

    public DelegatedDateTimeField(C12599c cVar, C12646e eVar, DateTimeFieldType dateTimeFieldType) {
        if (cVar != null) {
            this.iField = cVar;
            this.iRangeDurationField = eVar;
            this.iType = dateTimeFieldType == null ? cVar.mo28806I() : dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }
}
