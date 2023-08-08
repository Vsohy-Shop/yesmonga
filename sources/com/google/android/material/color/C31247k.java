package com.google.android.material.color;

import androidx.recyclerview.widget.C20190n;
import java.util.Arrays;

/* renamed from: com.google.android.material.color.k */
public final class C31247k {

    /* renamed from: a */
    public static final float[] f75230a = {95.047f, 100.0f, 108.883f};

    /* renamed from: a */
    public static int m125864a(int i) {
        return i & 255;
    }

    /* renamed from: b */
    public static float m125865b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (((float) Math.pow((double) f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    /* renamed from: c */
    public static int m125866c(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: d */
    public static String m125867d(int i) {
        int m = m125876m(i);
        int a = m125864a(i);
        return String.format("#%02x%02x%02x", new Object[]{Integer.valueOf(m), Integer.valueOf(m125866c(i)), Integer.valueOf(a)});
    }

    /* renamed from: e */
    public static int m125868e(double d, double d2, double d3) {
        double d4;
        double d5 = (d + 16.0d) / 116.0d;
        double d6 = (d2 / 500.0d) + d5;
        double d7 = d5 - (d3 / 200.0d);
        double d8 = d6 * d6 * d6;
        if (d8 <= 0.008856451679035631d) {
            d8 = ((d6 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        if (d > 8.0d) {
            d4 = d5 * d5 * d5;
        } else {
            d4 = d / 903.2962962962963d;
        }
        double d9 = d7 * d7 * d7;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((d7 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = f75230a;
        return m125872i((float) (d8 * ((double) fArr[0])), (float) (d4 * ((double) fArr[1])), (float) (d9 * ((double) fArr[2])));
    }

    /* renamed from: f */
    public static int m125869f(float f) {
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (f > 8.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = f5;
        } else {
            f2 = f / 903.2963f;
        }
        if (z) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f75230a;
        return m125871h(new float[]{f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]});
    }

    /* renamed from: g */
    public static int m125870g(int i, int i2, int i3) {
        return (((((i & 255) << 16) | -16777216) | ((i2 & 255) << 8)) | (i3 & 255)) >>> 0;
    }

    /* renamed from: h */
    public static int m125871h(float[] fArr) {
        return m125872i(fArr[0], fArr[1], fArr[2]);
    }

    /* renamed from: i */
    public static int m125872i(float f, float f2, float f3) {
        float f4 = f / 100.0f;
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        float f7 = (3.2406f * f4) + (-1.5372f * f5) + (-0.4986f * f6);
        float f8 = (f4 * 0.0557f) + (f5 * -0.204f) + (f6 * 1.057f);
        return m125870g(Math.max(Math.min(255, Math.round(m125865b(f7) * 255.0f)), 0), Math.max(Math.min(255, Math.round(m125865b((-0.9689f * f4) + (1.8758f * f5) + (0.0415f * f6)) * 255.0f)), 0), Math.max(Math.min(255, Math.round(m125865b(f8) * 255.0f)), 0));
    }

    /* renamed from: j */
    public static double[] m125873j(int i) {
        double d;
        double d2;
        double d3;
        float[] o = m125878o(i);
        float f = o[1];
        float[] fArr = f75230a;
        double d4 = (double) (f / fArr[1]);
        if (d4 > 0.008856451679035631d) {
            d = Math.cbrt(d4);
        } else {
            d = ((d4 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d5 = (double) (o[0] / fArr[0]);
        if (d5 > 0.008856451679035631d) {
            d2 = Math.cbrt(d5);
        } else {
            d2 = ((d5 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d6 = (double) (o[2] / fArr[2]);
        if (d6 > 0.008856451679035631d) {
            d3 = Math.cbrt(d6);
        } else {
            d3 = ((d6 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        return new double[]{(116.0d * d) - 16.0d, (d2 - d) * 500.0d, (d - d3) * 200.0d};
    }

    /* renamed from: k */
    public static float m125874k(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: l */
    public static float m125875l(int i) {
        return (float) m125873j(i)[0];
    }

    /* renamed from: m */
    public static int m125876m(int i) {
        return (i & C20190n.f52063W) >> 16;
    }

    /* renamed from: n */
    public static final float[] m125877n() {
        return Arrays.copyOf(f75230a, 3);
    }

    /* renamed from: o */
    public static float[] m125878o(int i) {
        float k = m125874k(((float) m125876m(i)) / 255.0f) * 100.0f;
        float k2 = m125874k(((float) m125866c(i)) / 255.0f) * 100.0f;
        float k3 = m125874k(((float) m125864a(i)) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * k) + (0.35762063f * k2) + (0.18051042f * k3), (0.2126f * k) + (0.7152f * k2) + (0.0722f * k3), (k * 0.01932141f) + (k2 * 0.11916382f) + (k3 * 0.9503448f)};
    }

    /* renamed from: p */
    public static float m125879p(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
