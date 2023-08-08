package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sy */
public final class C29723sy implements C29947z {

    /* renamed from: a */
    public final C29686ry f71460a;

    public C29723sy(C29686ry ryVar) {
        C29909xz.m121348f(ryVar, "output");
        this.f71460a = ryVar;
        ryVar.f71445a = this;
    }

    /* renamed from: M */
    public static C29723sy m121085M(C29686ry ryVar) {
        C29723sy syVar = ryVar.f71445a;
        if (syVar != null) {
            return syVar;
        }
        return new C29723sy(ryVar);
    }

    /* renamed from: A */
    public final void mo84840A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84779t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84778s(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo84841B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C29686ry.m121016g(list.get(i4).longValue());
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84769E(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84768D(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo84842C(int i, long j) throws IOException {
        this.f71460a.mo84778s(i, j);
    }

    /* renamed from: D */
    public final void mo84843D(int i, long j) throws IOException {
        this.f71460a.mo84768D(i, j);
    }

    /* renamed from: E */
    public final void mo84844E(int i, int i2) throws IOException {
        this.f71460a.mo84776q(i, i2);
    }

    /* renamed from: F */
    public final void mo84845F(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84777r(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84776q(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo84846G(int i, int i2) throws IOException {
        this.f71460a.mo84780u(i, i2);
    }

    /* renamed from: H */
    public final void mo84847H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C29686ry.m121016g(list.get(i4).longValue());
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84769E(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84768D(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo84848I(int i, double d) throws IOException {
        this.f71460a.mo84778s(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: J */
    public final void mo84849J(int i, List<zbwp> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f71460a.mo84774o(i, list.get(i2));
        }
    }

    /* renamed from: K */
    public final void mo84850K(int i) throws IOException {
        this.f71460a.mo84765A(i, 3);
    }

    /* renamed from: L */
    public final void mo84851L(int i, long j) throws IOException {
        this.f71460a.mo84768D(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: a */
    public final void mo84852a(int i, int i2) throws IOException {
        this.f71460a.mo84766B(i, i2);
    }

    /* renamed from: b */
    public final void mo84853b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84777r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84776q(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo84854c(int i, long j) throws IOException {
        this.f71460a.mo84778s(i, j);
    }

    /* renamed from: d */
    public final void mo84855d(int i, Object obj, j10 j10) throws IOException {
        C29686ry ryVar = this.f71460a;
        ryVar.mo84765A(i, 3);
        j10.mo84485c((x00) obj, ryVar.f71445a);
        ryVar.mo84765A(i, 4);
    }

    /* renamed from: e */
    public final void mo84856e(int i, zbwp zbwp) throws IOException {
        this.f71460a.mo84774o(i, zbwp);
    }

    /* renamed from: f */
    public final void mo84857f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84779t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84778s(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo84858g(int i, int i2) throws IOException {
        this.f71460a.mo84776q(i, i2);
    }

    /* renamed from: h */
    public final <K, V> void mo84859h(int i, p00<K, V> p00, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f71460a.mo84765A(i, 2);
            this.f71460a.mo84767C(q00.m120911b(p00, next.getKey(), next.getValue()));
            q00.m120913e(this.f71460a, p00, next.getKey(), next.getValue());
        }
    }

    /* renamed from: i */
    public final void mo84860i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C29686ry.m121015f(list.get(i4).intValue());
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84767C(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84766B(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo84861j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C29686ry.m121016g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                C29686ry ryVar = this.f71460a;
                long longValue2 = list.get(i2).longValue();
                ryVar.mo84769E((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C29686ry ryVar2 = this.f71460a;
            long longValue3 = list.get(i2).longValue();
            ryVar2.mo84768D(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo84862k(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof e00) {
            e00 e00 = (e00) list;
            while (i2 < list.size()) {
                Object c3 = e00.mo84576c3(i2);
                if (c3 instanceof String) {
                    this.f71460a.mo84784y(i, (String) c3);
                } else {
                    this.f71460a.mo84774o(i, (zbwp) c3);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84784y(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo84863l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C29686ry.m121015f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                C29686ry ryVar = this.f71460a;
                int intValue2 = list.get(i2).intValue();
                ryVar.mo84767C((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C29686ry ryVar2 = this.f71460a;
            int intValue3 = list.get(i2).intValue();
            ryVar2.mo84766B(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo84864m(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84779t(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84778s(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo84865n(int i, int i2) throws IOException {
        this.f71460a.mo84780u(i, i2);
    }

    /* renamed from: o */
    public final void mo84866o(int i, long j) throws IOException {
        this.f71460a.mo84768D(i, j);
    }

    /* renamed from: p */
    public final void mo84867p(int i, float f) throws IOException {
        this.f71460a.mo84776q(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: q */
    public final void mo84868q(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C29686ry.m121009J(list.get(i4).intValue());
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84781v(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84780u(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo84869r(int i, Object obj) throws IOException {
        if (obj instanceof zbwp) {
            C29612py pyVar = (C29612py) this.f71460a;
            pyVar.mo84767C(11);
            pyVar.mo84766B(2, i);
            pyVar.mo84774o(3, (zbwp) obj);
            pyVar.mo84767C(12);
            return;
        }
        C29612py pyVar2 = (C29612py) this.f71460a;
        pyVar2.mo84767C(11);
        pyVar2.mo84766B(2, i);
        pyVar2.mo84767C(26);
        pyVar2.mo84783x((x00) obj);
        pyVar2.mo84767C(12);
    }

    /* renamed from: s */
    public final void mo84870s(int i, Object obj, j10 j10) throws IOException {
        x00 x00 = (x00) obj;
        C29612py pyVar = (C29612py) this.f71460a;
        pyVar.mo84767C((i << 3) | 2);
        C29648qx qxVar = (C29648qx) x00;
        int d = qxVar.mo84729d();
        if (d == -1) {
            d = j10.mo84483a(qxVar);
            qxVar.mo84726a(d);
        }
        pyVar.mo84767C(d);
        j10.mo84485c(x00, pyVar.f71445a);
    }

    /* renamed from: t */
    public final void mo84871t(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84777r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84776q(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo84872u(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84772m(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84773n(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo84873v(int i, String str) throws IOException {
        this.f71460a.mo84784y(i, str);
    }

    /* renamed from: w */
    public final void mo84874w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f71460a.mo84765A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C29686ry.m121009J(list.get(i4).intValue());
            }
            this.f71460a.mo84767C(i3);
            while (i2 < list.size()) {
                this.f71460a.mo84781v(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f71460a.mo84780u(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo84875x(int i) throws IOException {
        this.f71460a.mo84765A(i, 4);
    }

    /* renamed from: y */
    public final void mo84876y(int i, int i2) throws IOException {
        this.f71460a.mo84766B(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: z */
    public final void mo84877z(int i, boolean z) throws IOException {
        this.f71460a.mo84773n(i, z);
    }
}
