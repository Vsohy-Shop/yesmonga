package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.C1875h;
import com.google.android.gms.maps.model.C30594l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.maps.android.geometry.C33871a;
import com.google.maps.android.quadtree.C33882a;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.maps.android.heatmaps.b */
public class C33876b implements C30594l {

    /* renamed from: l */
    public static final int f82182l = 20;

    /* renamed from: m */
    public static final double f82183m = 0.7d;

    /* renamed from: n */
    public static final int[] f82184n;

    /* renamed from: o */
    public static final float[] f82185o;

    /* renamed from: p */
    public static final C33873a f82186p;

    /* renamed from: q */
    public static final double f82187q = 1.0d;

    /* renamed from: r */
    public static final int f82188r = 512;

    /* renamed from: s */
    public static final int f82189s = 1280;

    /* renamed from: t */
    public static final int f82190t = 5;

    /* renamed from: u */
    public static final int f82191u = 11;

    /* renamed from: v */
    public static final int f82192v = 22;

    /* renamed from: w */
    public static final int f82193w = 10;

    /* renamed from: x */
    public static final int f82194x = 50;

    /* renamed from: b */
    public C33882a<C33879c> f82195b;

    /* renamed from: c */
    public Collection<C33879c> f82196c;

    /* renamed from: d */
    public C33871a f82197d;

    /* renamed from: e */
    public int f82198e;

    /* renamed from: f */
    public C33873a f82199f;

    /* renamed from: g */
    public int[] f82200g;

    /* renamed from: h */
    public double[] f82201h;

    /* renamed from: i */
    public double f82202i;

    /* renamed from: j */
    public double[] f82203j;

    /* renamed from: k */
    public double f82204k;

    /* renamed from: com.google.maps.android.heatmaps.b$b */
    public static class C33878b {

        /* renamed from: a */
        public Collection<C33879c> f82205a;

        /* renamed from: b */
        public int f82206b = 20;

        /* renamed from: c */
        public C33873a f82207c = C33876b.f82186p;

        /* renamed from: d */
        public double f82208d = 0.7d;

        /* renamed from: e */
        public double f82209e = 0.0d;

        /* renamed from: f */
        public C33876b mo98575f() {
            if (this.f82205a != null) {
                return new C33876b(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        /* renamed from: g */
        public C33878b mo98576g(Collection<LatLng> collection) {
            return mo98581l(C33876b.m136434p(collection));
        }

        /* renamed from: h */
        public C33878b mo98577h(C33873a aVar) {
            this.f82207c = aVar;
            return this;
        }

        /* renamed from: i */
        public C33878b mo98578i(double d) {
            this.f82209e = d;
            return this;
        }

        /* renamed from: j */
        public C33878b mo98579j(double d) {
            this.f82208d = d;
            if (d >= 0.0d && d <= 1.0d) {
                return this;
            }
            throw new IllegalArgumentException("Opacity must be in range [0, 1]");
        }

        /* renamed from: k */
        public C33878b mo98580k(int i) {
            this.f82206b = i;
            if (i >= 10 && i <= 50) {
                return this;
            }
            throw new IllegalArgumentException("Radius not within bounds.");
        }

        /* renamed from: l */
        public C33878b mo98581l(Collection<C33879c> collection) {
            this.f82205a = collection;
            if (!collection.isEmpty()) {
                return this;
            }
            throw new IllegalArgumentException("No input points.");
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        f82184n = iArr;
        float[] fArr = {0.2f, 1.0f};
        f82185o = fArr;
        f82186p = new C33873a(iArr, fArr);
    }

    /* renamed from: c */
    public static Bitmap m136428c(double[][] dArr, int[] iArr, double d) {
        double[][] dArr2 = dArr;
        int[] iArr2 = iArr;
        int i = iArr2[iArr2.length - 1];
        double length = ((double) (iArr2.length - 1)) / d;
        int length2 = dArr2.length;
        int[] iArr3 = new int[(length2 * length2)];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d2 = dArr2[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d2 * length);
                if (d2 == 0.0d) {
                    iArr3[i4] = 0;
                } else if (i5 < iArr2.length) {
                    iArr3[i4] = iArr2[i5];
                } else {
                    iArr3[i4] = i;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr3, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    /* renamed from: d */
    public static Tile m136429d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: e */
    public static double[][] m136430e(double[][] dArr, double[] dArr2) {
        int i;
        int i2;
        double[][] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int floor = (int) Math.floor(((double) dArr4.length) / 2.0d);
        int length = dArr3.length;
        int i3 = length - (floor * 2);
        int i4 = 1;
        int i5 = (floor + i3) - 1;
        int[] iArr = new int[2];
        iArr[1] = length;
        iArr[0] = length;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int i6 = 0;
        while (true) {
            double d = 0.0d;
            if (i6 >= length) {
                break;
            }
            int i7 = 0;
            while (i7 < length) {
                double d2 = dArr3[i6][i7];
                if (d2 != d) {
                    int i8 = i6 + floor;
                    if (i5 < i8) {
                        i8 = i5;
                    }
                    int i9 = i8 + 1;
                    int i10 = i6 - floor;
                    if (floor > i10) {
                        i2 = floor;
                    } else {
                        i2 = i10;
                    }
                    while (i2 < i9) {
                        double[] dArr6 = dArr5[i2];
                        dArr6[i7] = dArr6[i7] + (dArr4[i2 - i10] * d2);
                        i2++;
                    }
                }
                i7++;
                d = 0.0d;
            }
            i6++;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i3;
        iArr2[0] = i3;
        double[][] dArr7 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        int i11 = floor;
        while (i11 < i5 + 1) {
            int i12 = 0;
            while (i12 < length) {
                double d3 = dArr5[i11][i12];
                if (d3 != 0.0d) {
                    int i13 = i12 + floor;
                    if (i5 < i13) {
                        i13 = i5;
                    }
                    int i14 = i13 + i4;
                    int i15 = i12 - floor;
                    if (floor > i15) {
                        i = floor;
                    } else {
                        i = i15;
                    }
                    for (int i16 = i; i16 < i14; i16++) {
                        double[] dArr8 = dArr7[i11 - floor];
                        int i17 = i16 - floor;
                        dArr8[i17] = dArr8[i17] + (dArr4[i16 - i15] * d3);
                    }
                }
                i12++;
                i4 = 1;
            }
            i11++;
            i4 = 1;
        }
        return dArr7;
    }

    /* renamed from: f */
    public static double[] m136431f(int i, double d) {
        double[] dArr = new double[((i * 2) + 1)];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((double) ((-i2) * i2)) / ((2.0d * d) * d));
        }
        return dArr;
    }

    /* renamed from: g */
    public static C33871a m136432g(Collection<C33879c> collection) {
        Iterator<C33879c> it = collection.iterator();
        C33879c next = it.next();
        double d = next.mo98050a().f82172a;
        double d2 = next.mo98050a().f82172a;
        double d3 = d;
        double d4 = d2;
        double d5 = next.mo98050a().f82173b;
        double d6 = next.mo98050a().f82173b;
        while (it.hasNext()) {
            C33879c next2 = it.next();
            double d7 = next2.mo98050a().f82172a;
            double d8 = next2.mo98050a().f82173b;
            if (d7 < d3) {
                d3 = d7;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 < d5) {
                d5 = d8;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new C33871a(d3, d4, d5, d6);
    }

    /* renamed from: i */
    public static double m136433i(Collection<C33879c> collection, C33871a aVar, int i, int i2) {
        C33871a aVar2 = aVar;
        double d = aVar2.f82166a;
        double d2 = aVar2.f82168c;
        double d3 = aVar2.f82167b;
        double d4 = d2 - d;
        double d5 = aVar2.f82169d - d3;
        if (d4 <= d5) {
            d4 = d5;
        }
        double d6 = ((double) ((int) (((double) (i2 / (i * 2))) + 0.5d))) / d4;
        C1875h hVar = new C1875h();
        double d7 = 0.0d;
        for (C33879c next : collection) {
            double d8 = next.mo98050a().f82172a;
            int i3 = (int) ((next.mo98050a().f82173b - d3) * d6);
            long j = (long) ((int) ((d8 - d) * d6));
            C1875h hVar2 = (C1875h) hVar.mo6223k(j);
            if (hVar2 == null) {
                hVar2 = new C1875h();
                hVar.mo6229t(j, hVar2);
            }
            long j2 = (long) i3;
            Double d9 = (Double) hVar2.mo6223k(j2);
            if (d9 == null) {
                d9 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d9.doubleValue() + next.mo98582b());
            hVar2.mo6229t(j2, valueOf);
            if (valueOf.doubleValue() > d7) {
                d7 = valueOf.doubleValue();
            }
        }
        return d7;
    }

    /* renamed from: p */
    public static Collection<C33879c> m136434p(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng cVar : collection) {
            arrayList.add(new C33879c(cVar));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.Tile mo86552a(int r37, int r38, int r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            double r4 = (double) r3
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r8 / r4
            int r10 = r0.f82198e
            double r11 = (double) r10
            double r11 = r11 * r4
            r13 = 4647714815446351872(0x4080000000000000, double:512.0)
            double r11 = r11 / r13
            double r6 = r6 * r11
            double r6 = r6 + r4
            r13 = 2
            int r10 = r10 * r13
            int r10 = r10 + 512
            double r14 = (double) r10
            double r6 = r6 / r14
            double r14 = (double) r1
            double r14 = r14 * r4
            double r14 = r14 - r11
            r10 = 1
            int r1 = r1 + r10
            double r8 = (double) r1
            double r8 = r8 * r4
            double r19 = r8 + r11
            double r8 = (double) r2
            double r8 = r8 * r4
            double r8 = r8 - r11
            int r1 = r2 + 1
            double r1 = (double) r1
            double r1 = r1 * r4
            double r1 = r1 + r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r21 = 0
            int r5 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r5 >= 0) goto L_0x005a
            com.google.maps.android.geometry.a r4 = new com.google.maps.android.geometry.a
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r22 = r14 + r16
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r21 = r4
            r26 = r8
            r28 = r1
            r21.<init>(r22, r24, r26, r28)
            com.google.maps.android.quadtree.a<com.google.maps.android.heatmaps.c> r5 = r0.f82195b
            java.util.Collection r4 = r5.mo98590f(r4)
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x0057:
            r25 = r16
            goto L_0x0078
        L_0x005a:
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0076
            com.google.maps.android.geometry.a r4 = new com.google.maps.android.geometry.a
            r22 = 0
            double r24 = r19 - r16
            r21 = r4
            r26 = r8
            r28 = r1
            r21.<init>(r22, r24, r26, r28)
            com.google.maps.android.quadtree.a<com.google.maps.android.heatmaps.c> r5 = r0.f82195b
            java.util.Collection r4 = r5.mo98590f(r4)
            goto L_0x0057
        L_0x0076:
            r25 = r21
        L_0x0078:
            com.google.maps.android.geometry.a r5 = new com.google.maps.android.geometry.a
            r16 = r5
            r17 = r14
            r21 = r8
            r23 = r1
            r16.<init>(r17, r19, r21, r23)
            com.google.maps.android.geometry.a r1 = new com.google.maps.android.geometry.a
            com.google.maps.android.geometry.a r2 = r0.f82197d
            double r13 = r2.f82166a
            double r28 = r13 - r11
            double r13 = r2.f82168c
            double r30 = r13 + r11
            double r13 = r2.f82167b
            double r32 = r13 - r11
            double r13 = r2.f82169d
            double r34 = r13 + r11
            r27 = r1
            r27.<init>(r28, r30, r32, r34)
            boolean r1 = r5.mo98564e(r1)
            if (r1 != 0) goto L_0x00a7
            com.google.android.gms.maps.model.Tile r1 = com.google.android.gms.maps.model.C30594l.f73141a
            return r1
        L_0x00a7:
            com.google.maps.android.quadtree.a<com.google.maps.android.heatmaps.c> r1 = r0.f82195b
            java.util.Collection r1 = r1.mo98590f(r5)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00b6
            com.google.android.gms.maps.model.Tile r1 = com.google.android.gms.maps.model.C30594l.f73141a
            return r1
        L_0x00b6:
            int r2 = r0.f82198e
            int r5 = r2 * 2
            int r5 = r5 + 512
            r11 = 2
            int r2 = r2 * r11
            int r2 = r2 + 512
            int[] r11 = new int[r11]
            r11[r10] = r2
            r2 = 0
            r11[r2] = r5
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r11)
            double[][] r2 = (double[][]) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00d3:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00fa
            java.lang.Object r5 = r1.next()
            com.google.maps.android.heatmaps.c r5 = (com.google.maps.android.heatmaps.C33879c) r5
            com.google.maps.android.geometry.b r10 = r5.mo98050a()
            double r11 = r10.f82172a
            double r11 = r11 - r17
            double r11 = r11 / r6
            int r11 = (int) r11
            double r12 = r10.f82173b
            double r12 = r12 - r8
            double r12 = r12 / r6
            int r10 = (int) r12
            r11 = r2[r11]
            r12 = r11[r10]
            double r14 = r5.mo98582b()
            double r12 = r12 + r14
            r11[r10] = r12
            goto L_0x00d3
        L_0x00fa:
            java.util.Iterator r1 = r4.iterator()
        L_0x00fe:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0127
            java.lang.Object r4 = r1.next()
            com.google.maps.android.heatmaps.c r4 = (com.google.maps.android.heatmaps.C33879c) r4
            com.google.maps.android.geometry.b r5 = r4.mo98050a()
            double r10 = r5.f82172a
            double r10 = r10 + r25
            double r10 = r10 - r17
            double r10 = r10 / r6
            int r10 = (int) r10
            double r11 = r5.f82173b
            double r11 = r11 - r8
            double r11 = r11 / r6
            int r5 = (int) r11
            r10 = r2[r10]
            r11 = r10[r5]
            double r13 = r4.mo98582b()
            double r11 = r11 + r13
            r10[r5] = r11
            goto L_0x00fe
        L_0x0127:
            double[] r1 = r0.f82201h
            double[][] r1 = m136430e(r2, r1)
            int[] r2 = r0.f82200g
            double[] r4 = r0.f82203j
            r3 = r4[r3]
            android.graphics.Bitmap r1 = m136428c(r1, r2, r3)
            com.google.android.gms.maps.model.Tile r1 = m136429d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.heatmaps.C33876b.mo86552a(int, int, int):com.google.android.gms.maps.model.Tile");
    }

    /* renamed from: h */
    public final double[] mo98568h(int i) {
        int i2;
        double[] dArr = new double[22];
        if (this.f82204k != 0.0d) {
            for (int i3 = 0; i3 < 22; i3++) {
                dArr[i3] = this.f82204k;
            }
            return dArr;
        }
        int i4 = 5;
        while (true) {
            if (i4 >= 11) {
                break;
            }
            dArr[i4] = m136433i(this.f82196c, this.f82197d, i, (int) (Math.pow(2.0d, (double) (i4 - 3)) * 1280.0d));
            if (i4 == 5) {
                for (int i5 = 0; i5 < i4; i5++) {
                    dArr[i5] = dArr[i4];
                }
            }
            i4++;
        }
        for (i2 = 11; i2 < 22; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    /* renamed from: j */
    public void mo98569j(Collection<LatLng> collection) {
        mo98574o(m136434p(collection));
    }

    /* renamed from: k */
    public void mo98570k(C33873a aVar) {
        this.f82199f = aVar;
        this.f82200g = aVar.mo98567b(this.f82202i);
    }

    /* renamed from: l */
    public void mo98571l(double d) {
        this.f82204k = d;
        mo98574o(this.f82196c);
    }

    /* renamed from: m */
    public void mo98572m(double d) {
        this.f82202i = d;
        mo98570k(this.f82199f);
    }

    /* renamed from: n */
    public void mo98573n(int i) {
        this.f82198e = i;
        this.f82201h = m136431f(i, ((double) i) / 3.0d);
        this.f82203j = mo98568h(this.f82198e);
    }

    /* renamed from: o */
    public void mo98574o(Collection<C33879c> collection) {
        this.f82196c = collection;
        if (!collection.isEmpty()) {
            C33871a g = m136432g(this.f82196c);
            this.f82197d = g;
            this.f82195b = new C33882a<>(g);
            for (C33879c a : this.f82196c) {
                this.f82195b.mo98585a(a);
            }
            this.f82203j = mo98568h(this.f82198e);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    public C33876b(C33878b bVar) {
        this.f82196c = bVar.f82205a;
        this.f82198e = bVar.f82206b;
        this.f82199f = bVar.f82207c;
        this.f82202i = bVar.f82208d;
        this.f82204k = bVar.f82209e;
        int i = this.f82198e;
        this.f82201h = m136431f(i, ((double) i) / 3.0d);
        mo98570k(this.f82199f);
        mo98574o(this.f82196c);
    }
}
