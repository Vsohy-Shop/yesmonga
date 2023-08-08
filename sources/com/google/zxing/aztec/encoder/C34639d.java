package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.zxing.aztec.encoder.d */
public final class C34639d {

    /* renamed from: b */
    public static final String[] f83794b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    public static final int f83795c = 0;

    /* renamed from: d */
    public static final int f83796d = 1;

    /* renamed from: e */
    public static final int f83797e = 2;

    /* renamed from: f */
    public static final int f83798f = 3;

    /* renamed from: g */
    public static final int f83799g = 4;

    /* renamed from: h */
    public static final int[][] f83800h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: i */
    public static final int[][] f83801i;

    /* renamed from: j */
    public static final int[][] f83802j;

    /* renamed from: a */
    public final byte[] f83803a;

    /* renamed from: com.google.zxing.aztec.encoder.d$a */
    public class C34640a implements Comparator<C34642f> {
        public C34640a() {
        }

        /* renamed from: a */
        public int compare(C34642f fVar, C34642f fVar2) {
            return fVar.mo102466e() - fVar2.mo102466e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 256});
        f83801i = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f83801i[0][i] = (i - 65) + 2;
        }
        f83801i[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f83801i[1][i2] = (i2 - 97) + 2;
        }
        f83801i[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f83801i[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = f83801i[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f83801i[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f83801i[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6});
        f83802j = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f83802j;
        iArr6[0][4] = 0;
        int[] iArr7 = iArr6[1];
        iArr7[4] = 0;
        iArr7[0] = 28;
        iArr6[3][4] = 0;
        int[] iArr8 = iArr6[2];
        iArr8[4] = 0;
        iArr8[0] = 15;
    }

    public C34639d(byte[] bArr) {
        this.f83803a = bArr;
    }

    /* renamed from: b */
    public static Collection<C34642f> m141299b(Iterable<C34642f> iterable) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        for (C34642f next : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                C34642f fVar = (C34642f) it.next();
                if (fVar.mo102469h(next)) {
                    z = false;
                    break;
                } else if (next.mo102469h(fVar)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public static void m141300d(C34642f fVar, int i, int i2, Collection<C34642f> collection) {
        C34642f c = fVar.mo102464c(i);
        collection.add(c.mo102470i(4, i2));
        if (fVar.mo102467f() != 4) {
            collection.add(c.mo102471j(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(c.mo102470i(2, 16 - i2).mo102470i(2, 1));
        }
        if (fVar.mo102465d() > 0) {
            collection.add(fVar.mo102463a(i).mo102463a(i + 1));
        }
    }

    /* renamed from: f */
    public static Collection<C34642f> m141301f(Iterable<C34642f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C34642f d : iterable) {
            m141300d(d, i, i2, linkedList);
        }
        return m141299b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.common.C34709a mo102457a() {
        /*
            r8 = this;
            com.google.zxing.aztec.encoder.f r0 = com.google.zxing.aztec.encoder.C34642f.f83807e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0008:
            byte[] r3 = r8.f83803a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = r1
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = r1
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = m141301f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.mo102459e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            com.google.zxing.aztec.encoder.d$a r1 = new com.google.zxing.aztec.encoder.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.aztec.encoder.f r0 = (com.google.zxing.aztec.encoder.C34642f) r0
            byte[] r1 = r8.f83803a
            com.google.zxing.common.a r0 = r0.mo102472k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.C34639d.mo102457a():com.google.zxing.common.a");
    }

    /* renamed from: c */
    public final void mo102458c(C34642f fVar, int i, Collection<C34642f> collection) {
        boolean z;
        char c = (char) (this.f83803a[i] & 255);
        if (f83801i[fVar.mo102467f()][c] > 0) {
            z = true;
        } else {
            z = false;
        }
        C34642f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f83801i[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo102464c(i);
                }
                if (!z || i2 == fVar.mo102467f() || i2 == 2) {
                    collection.add(fVar2.mo102470i(i2, i3));
                }
                if (!z && f83802j[fVar.mo102467f()][i2] >= 0) {
                    collection.add(fVar2.mo102471j(i2, i3));
                }
            }
        }
        if (fVar.mo102465d() > 0 || f83801i[fVar.mo102467f()][c] == 0) {
            collection.add(fVar.mo102463a(i));
        }
    }

    /* renamed from: e */
    public final Collection<C34642f> mo102459e(Iterable<C34642f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C34642f c : iterable) {
            mo102458c(c, i, linkedList);
        }
        return m141299b(linkedList);
    }
}
