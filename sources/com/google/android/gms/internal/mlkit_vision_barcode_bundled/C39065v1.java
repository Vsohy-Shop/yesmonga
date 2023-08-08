package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1 */
public final class C39065v1 {

    /* renamed from: a */
    public final C39056u1 f98949a;

    public C39065v1(C39056u1 u1Var) {
        C39084x2.m160970f(u1Var, "output");
        this.f98949a = u1Var;
        u1Var.f98945a = this;
    }

    /* renamed from: m */
    public static C39065v1 m160895m(C39056u1 u1Var) {
        C39065v1 v1Var = u1Var.f98945a;
        if (v1Var != null) {
            return v1Var;
        }
        return new C39065v1(u1Var);
    }

    /* renamed from: A */
    public final void mo123064A(int i, float f) throws IOException {
        this.f98949a.mo123037n(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: B */
    public final void mo123065B(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123038o(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123037n(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo123066C(int i, Object obj, C39014p4 p4Var) throws IOException {
        C39056u1 u1Var = this.f98949a;
        u1Var.mo123045v(i, 3);
        p4Var.mo122794h((C39076w3) obj, u1Var.f98945a);
        u1Var.mo123045v(i, 4);
    }

    /* renamed from: D */
    public final void mo123067D(int i, int i2) throws IOException {
        this.f98949a.mo123041r(i, i2);
    }

    /* renamed from: E */
    public final void mo123068E(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C39056u1.m160852E(list.get(i4).intValue());
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123042s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123041r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo123069F(int i, long j) throws IOException {
        this.f98949a.mo123048y(i, j);
    }

    /* renamed from: G */
    public final void mo123070G(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C39056u1.m160859e(list.get(i4).longValue());
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123049z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123048y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo123071H(int i, Object obj, C39014p4 p4Var) throws IOException {
        C39076w3 w3Var = (C39076w3) obj;
        C39038s1 s1Var = (C39038s1) this.f98949a;
        s1Var.mo123047x((i << 3) | 2);
        C39091y0 y0Var = (C39091y0) w3Var;
        int a = y0Var.mo122983a();
        if (a == -1) {
            a = p4Var.mo122788b(y0Var);
            y0Var.mo122987g(a);
        }
        s1Var.mo123047x(a);
        p4Var.mo122794h(w3Var, s1Var.f98945a);
    }

    /* renamed from: I */
    public final void mo123072I(int i, Object obj) throws IOException {
        if (obj instanceof zzdc) {
            C39038s1 s1Var = (C39038s1) this.f98949a;
            s1Var.mo123047x(11);
            s1Var.mo123046w(2, i);
            s1Var.mo123036m(3, (zzdc) obj);
            s1Var.mo123047x(12);
            return;
        }
        C39056u1 u1Var = this.f98949a;
        C39076w3 w3Var = (C39076w3) obj;
        C39038s1 s1Var2 = (C39038s1) u1Var;
        s1Var2.mo123047x(11);
        s1Var2.mo123046w(2, i);
        s1Var2.mo123047x(26);
        s1Var2.mo123047x(w3Var.mo122992x());
        w3Var.mo122984e(u1Var);
        s1Var2.mo123047x(12);
    }

    /* renamed from: J */
    public final void mo123073J(int i, int i2) throws IOException {
        this.f98949a.mo123037n(i, i2);
    }

    /* renamed from: K */
    public final void mo123074K(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123038o(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123037n(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: L */
    public final void mo123075L(int i, long j) throws IOException {
        this.f98949a.mo123039p(i, j);
    }

    /* renamed from: a */
    public final void mo123076a(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123040q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123039p(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo123077b(int i, int i2) throws IOException {
        this.f98949a.mo123046w(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: c */
    public final void mo123078c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C39056u1.m160858d((intValue >> 31) ^ (intValue + intValue));
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                C39056u1 u1Var = this.f98949a;
                int intValue2 = list.get(i2).intValue();
                u1Var.mo123047x((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C39056u1 u1Var2 = this.f98949a;
            int intValue3 = list.get(i2).intValue();
            u1Var2.mo123046w(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo123079d(int i, long j) throws IOException {
        this.f98949a.mo123048y(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: e */
    public final void mo123080e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C39056u1.m160859e((longValue >> 63) ^ (longValue + longValue));
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                C39056u1 u1Var = this.f98949a;
                long longValue2 = list.get(i2).longValue();
                u1Var.mo123049z((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C39056u1 u1Var2 = this.f98949a;
            long longValue3 = list.get(i2).longValue();
            u1Var2.mo123048y(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo123081f(int i) throws IOException {
        this.f98949a.mo123045v(i, 3);
    }

    /* renamed from: g */
    public final void mo123082g(int i, String str) throws IOException {
        this.f98949a.mo123044u(i, str);
    }

    /* renamed from: h */
    public final void mo123083h(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C38906e3) {
            C38906e3 e3Var = (C38906e3) list;
            while (i2 < list.size()) {
                Object m = e3Var.mo122843m(i2);
                if (m instanceof String) {
                    this.f98949a.mo123044u(i, (String) m);
                } else {
                    this.f98949a.mo123036m(i, (zzdc) m);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123044u(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo123084i(int i, int i2) throws IOException {
        this.f98949a.mo123046w(i, i2);
    }

    /* renamed from: j */
    public final void mo123085j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C39056u1.m160858d(list.get(i4).intValue());
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123047x(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123046w(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo123086k(int i, long j) throws IOException {
        this.f98949a.mo123048y(i, j);
    }

    /* renamed from: l */
    public final void mo123087l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C39056u1.m160859e(list.get(i4).longValue());
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123049z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123048y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo123088n(int i, boolean z) throws IOException {
        this.f98949a.mo123035l(i, z);
    }

    /* renamed from: o */
    public final void mo123089o(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123034k(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123035l(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo123090p(int i, zzdc zzdc) throws IOException {
        this.f98949a.mo123036m(i, zzdc);
    }

    /* renamed from: q */
    public final void mo123091q(int i, List<zzdc> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f98949a.mo123036m(i, list.get(i2));
        }
    }

    /* renamed from: r */
    public final void mo123092r(int i, double d) throws IOException {
        this.f98949a.mo123039p(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: s */
    public final void mo123093s(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123040q(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123039p(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo123094t(int i) throws IOException {
        this.f98949a.mo123045v(i, 4);
    }

    /* renamed from: u */
    public final void mo123095u(int i, int i2) throws IOException {
        this.f98949a.mo123041r(i, i2);
    }

    /* renamed from: v */
    public final void mo123096v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C39056u1.m160852E(list.get(i4).intValue());
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123042s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123041r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo123097w(int i, int i2) throws IOException {
        this.f98949a.mo123037n(i, i2);
    }

    /* renamed from: x */
    public final void mo123098x(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123038o(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123037n(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo123099y(int i, long j) throws IOException {
        this.f98949a.mo123039p(i, j);
    }

    /* renamed from: z */
    public final void mo123100z(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f98949a.mo123045v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f98949a.mo123047x(i3);
            while (i2 < list.size()) {
                this.f98949a.mo123040q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f98949a.mo123039p(i, list.get(i2).longValue());
            i2++;
        }
    }
}
