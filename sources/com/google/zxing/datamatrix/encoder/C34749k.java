package com.google.zxing.datamatrix.encoder;

import com.contentsquare.android.api.C14092c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.api.C32415m;
import com.google.zxing.C34645c;

/* renamed from: com.google.zxing.datamatrix.encoder.k */
public class C34749k {

    /* renamed from: i */
    public static final C34749k[] f84212i;

    /* renamed from: j */
    public static C34749k[] f84213j;

    /* renamed from: a */
    public final boolean f84214a;

    /* renamed from: b */
    public final int f84215b;

    /* renamed from: c */
    public final int f84216c;

    /* renamed from: d */
    public final int f84217d;

    /* renamed from: e */
    public final int f84218e;

    /* renamed from: f */
    public final int f84219f;

    /* renamed from: g */
    public final int f84220g;

    /* renamed from: h */
    public final int f84221h;

    static {
        C34749k[] kVarArr = {new C34749k(false, 3, 5, 8, 8, 1), new C34749k(false, 5, 7, 10, 10, 1), new C34749k(true, 5, 7, 16, 6, 1), new C34749k(false, 8, 10, 12, 12, 1), new C34749k(true, 10, 11, 14, 6, 2), new C34749k(false, 12, 12, 14, 14, 1), new C34749k(true, 16, 14, 24, 10, 1), new C34749k(false, 18, 14, 16, 16, 1), new C34749k(false, 22, 18, 18, 18, 1), new C34749k(true, 22, 18, 16, 10, 2), new C34749k(false, 30, 20, 20, 20, 1), new C34749k(true, 32, 24, 16, 14, 2), new C34749k(false, 36, 24, 22, 22, 1), new C34749k(false, 44, 28, 24, 24, 1), new C34749k(true, 49, 28, 22, 14, 2), new C34749k(false, 62, 36, 14, 14, 4), new C34749k(false, 86, 42, 16, 16, 4), new C34749k(false, 114, 48, 18, 18, 4), new C34749k(false, C14092c.f34532K1, 56, 20, 20, 4), new C34749k(false, C14092c.f34545P, 68, 22, 22, 4), new C34749k(false, 204, 84, 24, 24, 4, 102, 42), new C34749k(false, 280, 112, 14, 14, 16, 140, 56), new C34749k(false, C14092c.f34679z0, C14092c.f34532K1, 16, 16, 16, 92, 36), new C34749k(false, 456, C14092c.f34560U, 18, 18, 16, 114, 48), new C34749k(false, 576, 224, 20, 20, 16, C14092c.f34532K1, 56), new C34749k(false, 696, 272, 22, 22, 16, C14092c.f34545P, 68), new C34749k(false, 816, 336, 24, 24, 16, C14092c.f34527J, 56), new C34749k(false, C32415m.f78804e, C14092c.f34519G0, 18, 18, 36, HideBottomViewOnScrollBehavior.f74656f, 68), new C34749k(false, 1304, C14092c.f34592d1, 20, 20, 36, 163, 62), new C34742d()};
        f84212i = kVarArr;
        f84213j = kVarArr;
    }

    public C34749k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: m */
    public static C34749k m141833m(int i) {
        return m141836p(i, SymbolShapeHint.FORCE_NONE, true);
    }

    /* renamed from: n */
    public static C34749k m141834n(int i, SymbolShapeHint symbolShapeHint) {
        return m141836p(i, symbolShapeHint, true);
    }

    /* renamed from: o */
    public static C34749k m141835o(int i, SymbolShapeHint symbolShapeHint, C34645c cVar, C34645c cVar2, boolean z) {
        for (C34749k kVar : f84213j) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !kVar.f84214a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || kVar.f84214a) && ((cVar == null || (kVar.mo102830k() >= cVar.mo102488b() && kVar.mo102829j() >= cVar.mo102487a())) && ((cVar2 == null || (kVar.mo102830k() <= cVar2.mo102488b() && kVar.mo102829j() <= cVar2.mo102487a())) && i <= kVar.f84215b)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: p */
    public static C34749k m141836p(int i, SymbolShapeHint symbolShapeHint, boolean z) {
        return m141835o(i, symbolShapeHint, (C34645c) null, (C34645c) null, z);
    }

    /* renamed from: q */
    public static C34749k m141837q(int i, boolean z, boolean z2) {
        SymbolShapeHint symbolShapeHint;
        if (z) {
            symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        } else {
            symbolShapeHint = SymbolShapeHint.FORCE_SQUARE;
        }
        return m141836p(i, symbolShapeHint, z2);
    }

    /* renamed from: r */
    public static void m141838r(C34749k[] kVarArr) {
        f84213j = kVarArr;
    }

    /* renamed from: a */
    public int mo102822a() {
        return this.f84215b + this.f84216c;
    }

    /* renamed from: b */
    public final int mo102823b() {
        return this.f84215b;
    }

    /* renamed from: c */
    public int mo102787c(int i) {
        return this.f84220g;
    }

    /* renamed from: d */
    public final int mo102824d() {
        return this.f84216c;
    }

    /* renamed from: e */
    public final int mo102825e(int i) {
        return this.f84221h;
    }

    /* renamed from: f */
    public final int mo102826f() {
        int i = this.f84219f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: g */
    public int mo102788g() {
        return this.f84215b / this.f84220g;
    }

    /* renamed from: h */
    public final int mo102827h() {
        return mo102831l() * this.f84218e;
    }

    /* renamed from: i */
    public final int mo102828i() {
        return mo102826f() * this.f84217d;
    }

    /* renamed from: j */
    public final int mo102829j() {
        return mo102827h() + (mo102831l() << 1);
    }

    /* renamed from: k */
    public final int mo102830k() {
        return mo102828i() + (mo102826f() << 1);
    }

    /* renamed from: l */
    public final int mo102831l() {
        int i = this.f84219f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f84214a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.f84217d);
        sb.append('x');
        sb.append(this.f84218e);
        sb.append(", symbol size ");
        sb.append(mo102830k());
        sb.append('x');
        sb.append(mo102829j());
        sb.append(", symbol data size ");
        sb.append(mo102828i());
        sb.append('x');
        sb.append(mo102827h());
        sb.append(", codewords ");
        sb.append(this.f84215b);
        sb.append('+');
        sb.append(this.f84216c);
        return sb.toString();
    }

    public C34749k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f84214a = z;
        this.f84215b = i;
        this.f84216c = i2;
        this.f84217d = i3;
        this.f84218e = i4;
        this.f84219f = i5;
        this.f84220g = i6;
        this.f84221h = i7;
    }
}
