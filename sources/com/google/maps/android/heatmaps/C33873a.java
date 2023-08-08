package com.google.maps.android.heatmaps;

import android.graphics.Color;
import java.util.HashMap;

/* renamed from: com.google.maps.android.heatmaps.a */
public class C33873a {

    /* renamed from: d */
    public static final int f82174d = 1000;

    /* renamed from: a */
    public final int f82175a;

    /* renamed from: b */
    public int[] f82176b;

    /* renamed from: c */
    public float[] f82177c;

    /* renamed from: com.google.maps.android.heatmaps.a$b */
    public class C33875b {

        /* renamed from: a */
        public final int f82178a;

        /* renamed from: b */
        public final int f82179b;

        /* renamed from: c */
        public final float f82180c;

        public C33875b(int i, int i2, float f) {
            this.f82178a = i;
            this.f82179b = i2;
            this.f82180c = f;
        }
    }

    public C33873a(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    /* renamed from: c */
    public static int m136421c(int i, int i2, float f) {
        int alpha = (int) ((((float) (Color.alpha(i2) - Color.alpha(i))) * f) + ((float) Color.alpha(i)));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        float f2 = fArr[0];
        float f3 = fArr2[0];
        if (f2 - f3 > 180.0f) {
            fArr2[0] = f3 + 360.0f;
        } else if (f3 - f2 > 180.0f) {
            fArr[0] = f2 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            float f4 = fArr2[i3];
            float f5 = fArr[i3];
            fArr3[i3] = ((f4 - f5) * f) + f5;
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    /* renamed from: a */
    public final HashMap<Integer, C33875b> mo98566a() {
        HashMap<Integer, C33875b> hashMap = new HashMap<>();
        if (this.f82177c[0] != 0.0f) {
            hashMap.put(0, new C33875b(Color.argb(0, Color.red(this.f82176b[0]), Color.green(this.f82176b[0]), Color.blue(this.f82176b[0])), this.f82176b[0], ((float) this.f82175a) * this.f82177c[0]));
        }
        for (int i = 1; i < this.f82176b.length; i++) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf((int) (((float) this.f82175a) * this.f82177c[i2]));
            int[] iArr = this.f82176b;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float[] fArr = this.f82177c;
            hashMap.put(valueOf, new C33875b(i3, i4, (fArr[i] - fArr[i2]) * ((float) this.f82175a)));
        }
        float[] fArr2 = this.f82177c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (((float) this.f82175a) * fArr2[length]));
            int i5 = this.f82176b[length];
            hashMap.put(valueOf2, new C33875b(i5, i5, ((float) this.f82175a) * (1.0f - this.f82177c[length])));
        }
        return hashMap;
    }

    /* renamed from: b */
    public int[] mo98567b(double d) {
        HashMap<Integer, C33875b> a = mo98566a();
        int[] iArr = new int[this.f82175a];
        C33875b bVar = a.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.f82175a; i2++) {
            if (a.containsKey(Integer.valueOf(i2))) {
                bVar = a.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = m136421c(bVar.f82178a, bVar.f82179b, ((float) (i2 - i)) / bVar.f82180c);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.f82175a; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = Color.argb((int) (((double) Color.alpha(i4)) * d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }

    public C33873a(int[] iArr, float[] fArr, int i) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        } else if (iArr.length != 0) {
            int i2 = 1;
            while (i2 < fArr.length) {
                if (fArr[i2] > fArr[i2 - 1]) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("startPoints should be in increasing order");
                }
            }
            this.f82175a = i;
            int[] iArr2 = new int[iArr.length];
            this.f82176b = iArr2;
            this.f82177c = new float[fArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(fArr, 0, this.f82177c, 0, fArr.length);
        } else {
            throw new IllegalArgumentException("No colors have been defined");
        }
    }
}
