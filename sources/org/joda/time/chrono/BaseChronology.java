package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.C12715o;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.C12652e;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public abstract class BaseChronology extends C12589a implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    /* renamed from: A */
    public C12599c mo28615A() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51313N(), mo28658y());
    }

    /* renamed from: B */
    public C12599c mo28616B() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51314O(), mo28618D());
    }

    /* renamed from: C */
    public C12599c mo28617C() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51315P(), mo28618D());
    }

    /* renamed from: D */
    public C12646e mo28618D() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51461j());
    }

    /* renamed from: E */
    public C12599c mo28619E() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51316Q(), mo28620F());
    }

    /* renamed from: F */
    public C12646e mo28620F() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51462k());
    }

    /* renamed from: G */
    public C12599c mo28621G() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51317R(), mo28623I());
    }

    /* renamed from: H */
    public C12599c mo28622H() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51318S(), mo28623I());
    }

    /* renamed from: I */
    public C12646e mo28623I() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51463l());
    }

    /* renamed from: J */
    public long mo28624J(C12714n nVar, long j) {
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            j = nVar.mo28207t(i).mo27802F(this).mo28816S(j, nVar.getValue(i));
        }
        return j;
    }

    /* renamed from: K */
    public void mo28625K(C12714n nVar, int[] iArr) {
        int size = nVar.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = iArr[i2];
            C12599c field = nVar.getField(i2);
            if (i3 < field.mo28800C()) {
                throw new IllegalFieldValueException(field.mo28806I(), (Number) Integer.valueOf(i3), (Number) Integer.valueOf(field.mo28800C()), (Number) null);
            } else if (i3 <= field.mo28847y()) {
                i2++;
            } else {
                throw new IllegalFieldValueException(field.mo28806I(), (Number) Integer.valueOf(i3), (Number) null, (Number) Integer.valueOf(field.mo28847y()));
            }
        }
        while (i < size) {
            int i4 = iArr[i];
            C12599c field2 = nVar.getField(i);
            if (i4 < field2.mo28803F(nVar, iArr)) {
                throw new IllegalFieldValueException(field2.mo28806I(), (Number) Integer.valueOf(i4), (Number) Integer.valueOf(field2.mo28803F(nVar, iArr)), (Number) null);
            } else if (i4 <= field2.mo28799B(nVar, iArr)) {
                i++;
            } else {
                throw new IllegalFieldValueException(field2.mo28806I(), (Number) Integer.valueOf(i4), (Number) null, (Number) Integer.valueOf(field2.mo28799B(nVar, iArr)));
            }
        }
    }

    /* renamed from: L */
    public C12599c mo28626L() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51319T(), mo28627M());
    }

    /* renamed from: M */
    public C12646e mo28627M() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51464m());
    }

    /* renamed from: N */
    public C12599c mo28628N() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51320U(), mo28630P());
    }

    /* renamed from: O */
    public C12599c mo28629O() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51321V(), mo28630P());
    }

    /* renamed from: P */
    public C12646e mo28630P() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51465n());
    }

    /* renamed from: Q */
    public abstract C12589a mo27834Q();

    /* renamed from: R */
    public abstract C12589a mo27835R(DateTimeZone dateTimeZone);

    /* renamed from: S */
    public C12599c mo28631S() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51322W(), mo28634V());
    }

    /* renamed from: T */
    public C12599c mo28632T() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51323X(), mo28634V());
    }

    /* renamed from: U */
    public C12599c mo28633U() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51324Y(), mo28634V());
    }

    /* renamed from: V */
    public C12646e mo28634V() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51466o());
    }

    /* renamed from: a */
    public long mo28635a(long j, long j2, int i) {
        if (j2 == 0 || i == 0) {
            return j;
        }
        return C12652e.m53795e(j, C12652e.m53799i(j2, i));
    }

    /* renamed from: b */
    public long mo28636b(C12715o oVar, long j, int i) {
        if (!(i == 0 || oVar == null)) {
            int size = oVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                long value = (long) oVar.getValue(i2);
                if (value != 0) {
                    j = oVar.mo28702t(i2).mo27877d(this).mo28910g(j, value * ((long) i));
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    public C12646e mo28637c() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51455a());
    }

    /* renamed from: d */
    public C12599c mo28638d() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51348x(), mo28637c());
    }

    /* renamed from: e */
    public C12599c mo28639e() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51349y(), mo28657x());
    }

    /* renamed from: f */
    public C12599c mo28640f() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51350z(), mo28657x());
    }

    /* renamed from: g */
    public C12599c mo28641g() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51305A(), mo28644j());
    }

    /* renamed from: h */
    public C12599c mo28642h() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51306B(), mo28644j());
    }

    /* renamed from: i */
    public C12599c mo28643i() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51307C(), mo28644j());
    }

    /* renamed from: j */
    public C12646e mo28644j() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51456b());
    }

    /* renamed from: k */
    public C12599c mo28645k() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51308D(), mo28646l());
    }

    /* renamed from: l */
    public C12646e mo28646l() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51457c());
    }

    /* renamed from: m */
    public int[] mo28647m(C12714n nVar, long j) {
        int size = nVar.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = nVar.mo28207t(i).mo27802F(this).mo28828g(j);
        }
        return iArr;
    }

    /* renamed from: n */
    public int[] mo28648n(C12715o oVar, long j) {
        int size = oVar.size();
        int[] iArr = new int[size];
        long j2 = 0;
        if (j != 0) {
            for (int i = 0; i < size; i++) {
                C12646e d = oVar.mo28702t(i).mo27877d(this);
                if (d.mo28950n0()) {
                    int q = d.mo28911q(j, j2);
                    j2 = d.mo28909b(j2, q);
                    iArr[i] = q;
                }
            }
        }
        return iArr;
    }

    /* renamed from: o */
    public int[] mo28649o(C12715o oVar, long j, long j2) {
        int size = oVar.size();
        int[] iArr = new int[size];
        if (j != j2) {
            for (int i = 0; i < size; i++) {
                C12646e d = oVar.mo28702t(i).mo27877d(this);
                int q = d.mo28911q(j2, j);
                if (q != 0) {
                    j = d.mo28909b(j, q);
                }
                iArr[i] = q;
            }
        }
        return iArr;
    }

    /* renamed from: p */
    public long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return mo28659z().mo28816S(mo28641g().mo28816S(mo28619E().mo28816S(mo28631S().mo28816S(0, i), i2), i3), i4);
    }

    /* renamed from: q */
    public long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return mo28615A().mo28816S(mo28622H().mo28816S(mo28617C().mo28816S(mo28655v().mo28816S(mo28641g().mo28816S(mo28619E().mo28816S(mo28631S().mo28816S(0, i), i2), i3), i4), i5), i6), i7);
    }

    /* renamed from: r */
    public long mo28652r(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return mo28615A().mo28816S(mo28622H().mo28816S(mo28617C().mo28816S(mo28655v().mo28816S(j, i), i2), i3), i4);
    }

    /* renamed from: s */
    public abstract DateTimeZone mo27836s();

    /* renamed from: t */
    public C12599c mo28653t() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51309I(), mo28654u());
    }

    public abstract String toString();

    /* renamed from: u */
    public C12646e mo28654u() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51458f());
    }

    /* renamed from: v */
    public C12599c mo28655v() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51310J(), mo28657x());
    }

    /* renamed from: w */
    public C12599c mo28656w() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51311K(), mo28657x());
    }

    /* renamed from: x */
    public C12646e mo28657x() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51459g());
    }

    /* renamed from: y */
    public C12646e mo28658y() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51460i());
    }

    /* renamed from: z */
    public C12599c mo28659z() {
        return UnsupportedDateTimeField.m53627Y(DateTimeFieldType.m51312M(), mo28658y());
    }
}
