package androidx.core.util;

import androidx.annotation.RestrictTo;
import androidx.compose.p004ui.graphics.vector.C15369g;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.util.h0 */
public final class C17985h0 {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public static final int f46470a = 19;

    /* renamed from: b */
    public static final int f46471b = 60;

    /* renamed from: c */
    public static final int f46472c = 3600;

    /* renamed from: d */
    public static final int f46473d = 86400;

    /* renamed from: e */
    public static final Object f46474e = new Object();

    /* renamed from: f */
    public static char[] f46475f = new char[24];

    /* renamed from: a */
    public static int m81707a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static void m81708b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m81710d(j - j2, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static void m81709c(long j, PrintWriter printWriter) {
        m81710d(j, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public static void m81710d(long j, PrintWriter printWriter, int i) {
        synchronized (f46474e) {
            printWriter.print(new String(f46475f, 0, m81712f(j, i)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public static void m81711e(long j, StringBuilder sb) {
        synchronized (f46474e) {
            sb.append(f46475f, 0, m81712f(j, 0));
        }
    }

    /* renamed from: f */
    public static int m81712f(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        int i11;
        long j2 = j;
        int i12 = i;
        if (f46475f.length < i12) {
            f46475f = new char[i12];
        }
        char[] cArr = f46475f;
        int i13 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i13 == 0) {
            int i14 = i12 - 1;
            while (i14 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i13 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i15 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i16 = floor / 60;
            i4 = floor - (i16 * 60);
            i5 = i16;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i12 != 0) {
            int a = m81707a(i2, 1, false, 0);
            if (a > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int a2 = a + m81707a(i3, 1, z5, 2);
            if (a2 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int a3 = a2 + m81707a(i5, 1, z6, 2);
            if (a3 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int a4 = a3 + m81707a(i4, 1, z7, 2);
            if (a4 > 0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            i6 = 0;
            for (int a5 = a4 + m81707a(i15, 2, true, i11) + 1; a5 < i12; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i17 = i6 + 1;
        if (i12 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i18 = i17;
        int g = m81713g(cArr, i2, 'd', i17, false, 0);
        if (g != i18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int g2 = m81713g(cArr, i3, C15369g.f37981g, g, z2, i7);
        if (g2 != i18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int g3 = m81713g(cArr, i5, C15369g.f37977c, g2, z3, i8);
        if (g3 != i18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int g4 = m81713g(cArr, i4, C15369g.f37987m, g3, z4, i9);
        if (!z || g4 == i18) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        int g5 = m81713g(cArr, i15, C15369g.f37977c, g4, true, i10);
        cArr[g5] = C15369g.f37987m;
        return g5 + 1;
    }

    /* renamed from: g */
    public static int m81713g(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
