package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a9 */
public final class C41859a9 implements C42112oc {

    /* renamed from: a */
    public final C42295z8 f105994a;

    public C41859a9(C42295z8 z8Var) {
        byte[] bArr = C41860aa.f105998d;
        this.f105994a = z8Var;
        z8Var.f106585a = this;
    }

    /* renamed from: J */
    public static C41859a9 m169629J(C42295z8 z8Var) {
        C41859a9 a9Var = z8Var.f106585a;
        return a9Var != null ? a9Var : new C41859a9(z8Var);
    }

    /* renamed from: A */
    public final void mo136527A(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof C41932ea) {
            C41932ea eaVar = (C41932ea) list;
            while (i2 < list.size()) {
                Object m = eaVar.mo136698m(i2);
                if (m instanceof String) {
                    this.f105994a.mo137468o(i, (String) m);
                } else {
                    this.f105994a.mo137460g(i, (zzka) m);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137468o(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo136528B(int i, float f) throws IOException {
        this.f105994a.mo137461h(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: C */
    public final void mo136529C(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C42295z8.m171215y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                C42295z8 z8Var = this.f105994a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                z8Var.mo137471r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C42295z8 z8Var2 = this.f105994a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            z8Var2.mo137470q(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo136530D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C42295z8.m171216z(((Long) list.get(i4)).longValue());
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137473t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137472s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo136531E(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137462i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137461h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo136532F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137464k(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137463j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo136533G(int i, long j) throws IOException {
        this.f105994a.mo137472s(i, j);
    }

    /* renamed from: H */
    public final void mo136534H(int i, long j) throws IOException {
        this.f105994a.mo137463j(i, j);
    }

    /* renamed from: I */
    public final void mo136535I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C42295z8.m171216z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                C42295z8 z8Var = this.f105994a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                z8Var.mo137473t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C42295z8 z8Var2 = this.f105994a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            z8Var2.mo137472s(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: U */
    public final void mo136536U(int i) throws IOException {
        this.f105994a.mo137469p(i, 4);
    }

    /* renamed from: a */
    public final void mo136537a(int i, Object obj, C41987hb hbVar) throws IOException {
        C42295z8 z8Var = this.f105994a;
        z8Var.mo137469p(i, 3);
        hbVar.mo136570h((C42246wa) obj, z8Var.f106585a);
        z8Var.mo137469p(i, 4);
    }

    /* renamed from: b */
    public final void mo136538b(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f105994a.mo137460g(i, (zzka) list.get(i2));
        }
    }

    /* renamed from: c */
    public final void mo136539c(int i, boolean z) throws IOException {
        this.f105994a.mo137459f(i, z);
    }

    /* renamed from: d */
    public final void mo136540d(int i, int i2) throws IOException {
        this.f105994a.mo137470q(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: e */
    public final void mo136541e(int i, String str) throws IOException {
        this.f105994a.mo137468o(i, str);
    }

    /* renamed from: f */
    public final void mo136542f(int i, long j) throws IOException {
        this.f105994a.mo137472s(i, j);
    }

    /* renamed from: g */
    public final void mo136543g(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137458e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137459f(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo136544h(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C42295z8.m171212v(((Integer) list.get(i4)).intValue());
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137466m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137465l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo136545i(int i, int i2) throws IOException {
        this.f105994a.mo137465l(i, i2);
    }

    /* renamed from: j */
    public final void mo136546j(int i, double d) throws IOException {
        this.f105994a.mo137463j(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k */
    public final void mo136547k(int i, Object obj, C41987hb hbVar) throws IOException {
        C42246wa waVar = (C42246wa) obj;
        C42261x8 x8Var = (C42261x8) this.f105994a;
        x8Var.mo137471r((i << 3) | 2);
        x8Var.mo137471r(((C41948f8) waVar).mo136761a(hbVar));
        hbVar.mo136570h(waVar, x8Var.f106585a);
    }

    /* renamed from: l */
    public final void mo136548l(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137464k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137463j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo136549m(int i, int i2) throws IOException {
        this.f105994a.mo137461h(i, i2);
    }

    /* renamed from: n */
    public final void mo136550n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C42295z8.m171216z(((Long) list.get(i4)).longValue());
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137473t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137472s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo136551o(int i, zzka zzka) throws IOException {
        this.f105994a.mo137460g(i, zzka);
    }

    @Deprecated
    /* renamed from: p */
    public final void mo136552p(int i) throws IOException {
        this.f105994a.mo137469p(i, 3);
    }

    /* renamed from: q */
    public final void mo136553q(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137462i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137461h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo136554r(int i, long j) throws IOException {
        this.f105994a.mo137472s(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: s */
    public final void mo136555s(int i, int i2) throws IOException {
        this.f105994a.mo137470q(i, i2);
    }

    /* renamed from: t */
    public final void mo136556t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137464k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137463j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo136557u(int i, int i2) throws IOException {
        this.f105994a.mo137461h(i, i2);
    }

    /* renamed from: v */
    public final void mo136558v(int i, long j) throws IOException {
        this.f105994a.mo137463j(i, j);
    }

    /* renamed from: w */
    public final void mo136559w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C42295z8.m171215y(((Integer) list.get(i4)).intValue());
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137471r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137470q(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo136560x(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137462i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137461h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo136561y(int i, int i2) throws IOException {
        this.f105994a.mo137465l(i, i2);
    }

    /* renamed from: z */
    public final void mo136562z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f105994a.mo137469p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C42295z8.m171212v(((Integer) list.get(i4)).intValue());
            }
            this.f105994a.mo137471r(i3);
            while (i2 < list.size()) {
                this.f105994a.mo137466m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f105994a.mo137465l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
