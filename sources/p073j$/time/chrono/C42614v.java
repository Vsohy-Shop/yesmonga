package p073j$.time.chrono;

import java.io.Serializable;
import java.util.Arrays;
import p073j$.time.C42586c;
import p073j$.time.LocalDate;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42679r;

/* renamed from: j$.time.chrono.v */
public final class C42614v implements C42602j, Serializable {

    /* renamed from: d */
    public static final C42614v f107799d;

    /* renamed from: e */
    private static final C42614v[] f107800e;

    /* renamed from: a */
    private final transient int f107801a;

    /* renamed from: b */
    private final transient LocalDate f107802b;

    /* renamed from: c */
    private final transient String f107803c;

    static {
        C42614v vVar = new C42614v(-1, LocalDate.m171813of(1868, 1, 1), "Meiji");
        f107799d = vVar;
        C42614v vVar2 = new C42614v(0, LocalDate.m171813of(1912, 7, 30), "Taisho");
        C42614v vVar3 = new C42614v(1, LocalDate.m171813of(1926, 12, 25), "Showa");
        C42614v vVar4 = new C42614v(2, LocalDate.m171813of(1989, 1, 8), "Heisei");
        C42614v vVar5 = new C42614v(3, LocalDate.m171813of(2019, 5, 1), "Reiwa");
        C42614v[] vVarArr = new C42614v[5];
        f107800e = vVarArr;
        vVarArr[0] = vVar;
        vVarArr[1] = vVar2;
        vVarArr[2] = vVar3;
        vVarArr[3] = vVar4;
        vVarArr[4] = vVar5;
    }

    private C42614v(int i, LocalDate localDate, String str) {
        this.f107801a = i;
        this.f107802b = localDate;
        this.f107803c = str;
    }

    /* renamed from: n */
    static C42614v m172242n(LocalDate localDate) {
        C42614v vVar;
        if (!localDate.mo137916K(C42613u.f107795d)) {
            int length = f107800e.length;
            do {
                length--;
                if (length < 0) {
                    return null;
                }
                vVar = f107800e[length];
            } while (localDate.compareTo(vVar.f107802b) < 0);
            return vVar;
        }
        throw new C42586c("JapaneseDate before Meiji 6 are not supported");
    }

    /* renamed from: o */
    static C42614v m172243o() {
        C42614v[] vVarArr = f107800e;
        return vVarArr[vVarArr.length - 1];
    }

    /* renamed from: r */
    public static C42614v m172244r(int i) {
        if (i >= f107799d.f107801a) {
            int i2 = i + 2;
            C42614v[] vVarArr = f107800e;
            if (i2 <= vVarArr.length) {
                return vVarArr[i2 - 1];
            }
        }
        throw new C42586c("Invalid era: " + i);
    }

    /* renamed from: s */
    static long m172245s() {
        long f = C42662a.DAY_OF_YEAR.mo138210E().mo138231f();
        for (C42614v vVar : f107800e) {
            f = Math.min(f, (long) ((vVar.f107802b.mo137917M() - vVar.f107802b.mo137915E()) + 1));
            if (vVar.mo138088q() != null) {
                f = Math.min(f, (long) (vVar.mo138088q().f107802b.mo137915E() - 1));
            }
        }
        return f;
    }

    /* renamed from: t */
    static long m172246t() {
        int year = (999999999 - m172243o().f107802b.getYear()) + 1;
        int year2 = f107800e[0].f107802b.getYear();
        int i = 1;
        while (true) {
            C42614v[] vVarArr = f107800e;
            if (i >= vVarArr.length) {
                return (long) year;
            }
            C42614v vVar = vVarArr[i];
            year = Math.min(year, (vVar.f107802b.getYear() - year2) + 1);
            year2 = vVar.f107802b.getYear();
            i++;
        }
    }

    /* renamed from: x */
    public static C42614v[] m172247x() {
        C42614v[] vVarArr = f107800e;
        return (C42614v[]) Arrays.copyOf(vVarArr, vVarArr.length);
    }

    public final int getValue() {
        return this.f107801a;
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        C42662a aVar = C42662a.ERA;
        return nVar == aVar ? C42611s.f107793d.mo138036W(aVar) : super.mo137889i(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final LocalDate mo138087p() {
        return this.f107802b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C42614v mo138088q() {
        if (this == m172243o()) {
            return null;
        }
        return m172244r(this.f107801a + 1);
    }

    public final String toString() {
        return this.f107803c;
    }
}
