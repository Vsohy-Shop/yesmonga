package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.bi */
public final class C41168bi {

    /* renamed from: a */
    public final C41144ai f104468a;

    public C41168bi(C41144ai aiVar) {
        C41650vj.m168604f(aiVar, "output");
        this.f104468a = aiVar;
        aiVar.f104444a = this;
    }

    /* renamed from: m */
    public static C41168bi m167162m(C41144ai aiVar) {
        C41168bi biVar = aiVar.f104444a;
        if (biVar != null) {
            return biVar;
        }
        return new C41168bi(aiVar);
    }

    /* renamed from: A */
    public final void mo135070A(int i, float f) throws IOException {
        this.f104468a.mo135013n(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: B */
    public final void mo135071B(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135014o(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135013n(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo135072C(int i, Object obj, C41315hl hlVar) throws IOException {
        C41144ai aiVar = this.f104468a;
        aiVar.mo135021v(i, 3);
        hlVar.mo135462h((C41627uk) obj, aiVar.f104444a);
        aiVar.mo135021v(i, 4);
    }

    /* renamed from: D */
    public final void mo135073D(int i, int i2) throws IOException {
        this.f104468a.mo135017r(i, i2);
    }

    /* renamed from: E */
    public final void mo135074E(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C41144ai.m167088E(list.get(i4).intValue());
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135018s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135017r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo135075F(int i, long j) throws IOException {
        this.f104468a.mo135024y(i, j);
    }

    /* renamed from: G */
    public final void mo135076G(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C41144ai.m167095e(list.get(i4).longValue());
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135025z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135024y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo135077H(int i, Object obj, C41315hl hlVar) throws IOException {
        C41627uk ukVar = (C41627uk) obj;
        C41720yh yhVar = (C41720yh) this.f104468a;
        yhVar.mo135023x((i << 3) | 2);
        C41695xg xgVar = (C41695xg) ukVar;
        int a = xgVar.mo135622a();
        if (a == -1) {
            a = hlVar.mo135456b(xgVar);
            xgVar.mo135629k(a);
        }
        yhVar.mo135023x(a);
        hlVar.mo135462h(ukVar, yhVar.f104444a);
    }

    /* renamed from: I */
    public final void mo135078I(int i, Object obj) throws IOException {
        if (obj instanceof zztd) {
            C41720yh yhVar = (C41720yh) this.f104468a;
            yhVar.mo135023x(11);
            yhVar.mo135022w(2, i);
            yhVar.mo135012m(3, (zztd) obj);
            yhVar.mo135023x(12);
            return;
        }
        C41144ai aiVar = this.f104468a;
        C41627uk ukVar = (C41627uk) obj;
        C41720yh yhVar2 = (C41720yh) aiVar;
        yhVar2.mo135023x(11);
        yhVar2.mo135022w(2, i);
        yhVar2.mo135023x(26);
        yhVar2.mo135023x(ukVar.mo135623b());
        ukVar.mo135624c(aiVar);
        yhVar2.mo135023x(12);
    }

    /* renamed from: J */
    public final void mo135079J(int i, int i2) throws IOException {
        this.f104468a.mo135013n(i, i2);
    }

    /* renamed from: K */
    public final void mo135080K(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135014o(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135013n(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: L */
    public final void mo135081L(int i, long j) throws IOException {
        this.f104468a.mo135015p(i, j);
    }

    /* renamed from: a */
    public final void mo135082a(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135016q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135015p(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo135083b(int i, int i2) throws IOException {
        this.f104468a.mo135022w(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: c */
    public final void mo135084c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C41144ai.m167094d((intValue >> 31) ^ (intValue + intValue));
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                C41144ai aiVar = this.f104468a;
                int intValue2 = list.get(i2).intValue();
                aiVar.mo135023x((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C41144ai aiVar2 = this.f104468a;
            int intValue3 = list.get(i2).intValue();
            aiVar2.mo135022w(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo135085d(int i, long j) throws IOException {
        this.f104468a.mo135024y(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: e */
    public final void mo135086e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C41144ai.m167095e((longValue >> 63) ^ (longValue + longValue));
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                C41144ai aiVar = this.f104468a;
                long longValue2 = list.get(i2).longValue();
                aiVar.mo135025z((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C41144ai aiVar2 = this.f104468a;
            long longValue3 = list.get(i2).longValue();
            aiVar2.mo135024y(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo135087f(int i) throws IOException {
        this.f104468a.mo135021v(i, 3);
    }

    /* renamed from: g */
    public final void mo135088g(int i, String str) throws IOException {
        this.f104468a.mo135020u(i, str);
    }

    /* renamed from: h */
    public final void mo135089h(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C41194ck) {
            C41194ck ckVar = (C41194ck) list;
            while (i2 < list.size()) {
                Object m = ckVar.mo135129m(i2);
                if (m instanceof String) {
                    this.f104468a.mo135020u(i, (String) m);
                } else {
                    this.f104468a.mo135012m(i, (zztd) m);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135020u(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo135090i(int i, int i2) throws IOException {
        this.f104468a.mo135022w(i, i2);
    }

    /* renamed from: j */
    public final void mo135091j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C41144ai.m167094d(list.get(i4).intValue());
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135023x(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135022w(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo135092k(int i, long j) throws IOException {
        this.f104468a.mo135024y(i, j);
    }

    /* renamed from: l */
    public final void mo135093l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C41144ai.m167095e(list.get(i4).longValue());
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135025z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135024y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo135094n(int i, boolean z) throws IOException {
        this.f104468a.mo135011l(i, z);
    }

    /* renamed from: o */
    public final void mo135095o(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135010k(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135011l(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo135096p(int i, zztd zztd) throws IOException {
        this.f104468a.mo135012m(i, zztd);
    }

    /* renamed from: q */
    public final void mo135097q(int i, List<zztd> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f104468a.mo135012m(i, list.get(i2));
        }
    }

    /* renamed from: r */
    public final void mo135098r(int i, double d) throws IOException {
        this.f104468a.mo135015p(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: s */
    public final void mo135099s(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135016q(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135015p(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo135100t(int i) throws IOException {
        this.f104468a.mo135021v(i, 4);
    }

    /* renamed from: u */
    public final void mo135101u(int i, int i2) throws IOException {
        this.f104468a.mo135017r(i, i2);
    }

    /* renamed from: v */
    public final void mo135102v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C41144ai.m167088E(list.get(i4).intValue());
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135018s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135017r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo135103w(int i, int i2) throws IOException {
        this.f104468a.mo135013n(i, i2);
    }

    /* renamed from: x */
    public final void mo135104x(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135014o(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135013n(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo135105y(int i, long j) throws IOException {
        this.f104468a.mo135015p(i, j);
    }

    /* renamed from: z */
    public final void mo135106z(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f104468a.mo135021v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f104468a.mo135023x(i3);
            while (i2 < list.size()) {
                this.f104468a.mo135016q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f104468a.mo135015p(i, list.get(i2).longValue());
            i2++;
        }
    }
}
