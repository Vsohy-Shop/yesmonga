package androidx.compose.p004ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.r */
public final class C15495r {
    /* renamed from: a */
    public static final int m68719a() {
        return C15479h0.m68605b(0);
    }

    /* renamed from: b */
    public static final boolean m68720b(int i) {
        return i != 0;
    }

    /* renamed from: c */
    public static final int m68721c(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = (i & -97) | ((i & 96) >>> 5); (i3 & 1) == 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: d */
    public static final int m68722d(int i) {
        int i2 = -1;
        for (int i3 = (i & -97) | ((i & 96) >>> 5); i3 != 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: e */
    public static final boolean m68723e(int i) {
        return false;
    }

    /* renamed from: f */
    public static final boolean m68724f(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: g */
    public static final boolean m68725g(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: h */
    public static final boolean m68726h(int i) {
        return (i & 1048576) != 0;
    }

    /* renamed from: i */
    public static final boolean m68727i(int i) {
        return (i & 4096) != 0;
    }

    /* renamed from: j */
    public static final boolean m68728j(int i) {
        return (i & 16) != 0;
    }

    /* renamed from: k */
    public static final boolean m68729k(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: l */
    public static final boolean m68730l(int i) {
        return (i & 65536) != 0;
    }

    /* renamed from: m */
    public static final boolean m68731m(int i) {
        return (i & 2097152) != 0;
    }

    /* renamed from: n */
    public static final boolean m68732n(int i, int i2) {
        if (i2 == 0) {
            return m68733o(i);
        }
        if (i2 == 1) {
            return m68735q(i);
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            if ((i & (1 << i2)) != 0) {
                return true;
            }
        } else if ((i & (1 << (i2 + 2))) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m68733o(int i) {
        return (i & 33) != 0;
    }

    /* renamed from: p */
    public static final boolean m68734p(int i) {
        return (i & 4194304) != 0;
    }

    /* renamed from: q */
    public static final boolean m68735q(int i) {
        return (i & 66) != 0;
    }

    /* renamed from: r */
    public static final boolean m68736r(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: s */
    public static final boolean m68737s(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: t */
    public static final boolean m68738t(int i) {
        return (i & 4) != 0;
    }
}
