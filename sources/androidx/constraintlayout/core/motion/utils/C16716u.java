package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.u */
public class C16716u {

    /* renamed from: m */
    public static final int f42114m = 4;

    /* renamed from: n */
    public static final int f42115n = 10;

    /* renamed from: o */
    public static final int f42116o = 10;

    /* renamed from: p */
    public static final int f42117p = 5;

    /* renamed from: a */
    public int[] f42118a = new int[10];

    /* renamed from: b */
    public int[] f42119b = new int[10];

    /* renamed from: c */
    public int f42120c = 0;

    /* renamed from: d */
    public int[] f42121d = new int[10];

    /* renamed from: e */
    public float[] f42122e = new float[10];

    /* renamed from: f */
    public int f42123f = 0;

    /* renamed from: g */
    public int[] f42124g = new int[5];

    /* renamed from: h */
    public String[] f42125h = new String[5];

    /* renamed from: i */
    public int f42126i = 0;

    /* renamed from: j */
    public int[] f42127j = new int[4];

    /* renamed from: k */
    public boolean[] f42128k = new boolean[4];

    /* renamed from: l */
    public int f42129l = 0;

    /* renamed from: a */
    public void mo49106a(int i, float f) {
        int i2 = this.f42123f;
        int[] iArr = this.f42121d;
        if (i2 >= iArr.length) {
            this.f42121d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f42122e;
            this.f42122e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f42121d;
        int i3 = this.f42123f;
        iArr2[i3] = i;
        float[] fArr2 = this.f42122e;
        this.f42123f = i3 + 1;
        fArr2[i3] = f;
    }

    /* renamed from: b */
    public void mo49107b(int i, int i2) {
        int i3 = this.f42120c;
        int[] iArr = this.f42118a;
        if (i3 >= iArr.length) {
            this.f42118a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f42119b;
            this.f42119b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f42118a;
        int i4 = this.f42120c;
        iArr3[i4] = i;
        int[] iArr4 = this.f42119b;
        this.f42120c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: c */
    public void mo49108c(int i, String str) {
        int i2 = this.f42126i;
        int[] iArr = this.f42124g;
        if (i2 >= iArr.length) {
            this.f42124g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f42125h;
            this.f42125h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f42124g;
        int i3 = this.f42126i;
        iArr2[i3] = i;
        String[] strArr2 = this.f42125h;
        this.f42126i = i3 + 1;
        strArr2[i3] = str;
    }

    /* renamed from: d */
    public void mo49109d(int i, boolean z) {
        int i2 = this.f42129l;
        int[] iArr = this.f42127j;
        if (i2 >= iArr.length) {
            this.f42127j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f42128k;
            this.f42128k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f42127j;
        int i3 = this.f42129l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f42128k;
        this.f42129l = i3 + 1;
        zArr2[i3] = z;
    }

    /* renamed from: e */
    public void mo49110e(int i, String str) {
        if (str != null) {
            mo49108c(i, str);
        }
    }

    /* renamed from: f */
    public void mo49111f(C16716u uVar) {
        for (int i = 0; i < this.f42120c; i++) {
            uVar.mo49107b(this.f42118a[i], this.f42119b[i]);
        }
        for (int i2 = 0; i2 < this.f42123f; i2++) {
            uVar.mo49106a(this.f42121d[i2], this.f42122e[i2]);
        }
        for (int i3 = 0; i3 < this.f42126i; i3++) {
            uVar.mo49108c(this.f42124g[i3], this.f42125h[i3]);
        }
        for (int i4 = 0; i4 < this.f42129l; i4++) {
            uVar.mo49109d(this.f42127j[i4], this.f42128k[i4]);
        }
    }

    /* renamed from: g */
    public void mo49112g(C16717v vVar) {
        for (int i = 0; i < this.f42120c; i++) {
            vVar.mo48820b(this.f42118a[i], this.f42119b[i]);
        }
        for (int i2 = 0; i2 < this.f42123f; i2++) {
            vVar.mo48822c(this.f42121d[i2], this.f42122e[i2]);
        }
        for (int i3 = 0; i3 < this.f42126i; i3++) {
            vVar.mo48826e(this.f42124g[i3], this.f42125h[i3]);
        }
        for (int i4 = 0; i4 < this.f42129l; i4++) {
            vVar.mo48824d(this.f42127j[i4], this.f42128k[i4]);
        }
    }

    /* renamed from: h */
    public void mo49113h() {
        this.f42129l = 0;
        this.f42126i = 0;
        this.f42123f = 0;
        this.f42120c = 0;
    }

    /* renamed from: i */
    public int mo49114i(int i) {
        for (int i2 = 0; i2 < this.f42120c; i2++) {
            if (this.f42118a[i2] == i) {
                return this.f42119b[i2];
            }
        }
        return -1;
    }
}
