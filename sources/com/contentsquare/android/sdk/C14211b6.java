package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.b6 */
public final class C14211b6 {

    /* renamed from: a */
    public final int f35105a;

    /* renamed from: b */
    public final int f35106b;

    /* renamed from: c */
    public final int[] f35107c;

    /* renamed from: d */
    public final int f35108d;

    /* renamed from: e */
    public final int f35109e;

    /* renamed from: f */
    public final float f35110f;

    /* renamed from: com.contentsquare.android.sdk.b6$a */
    public static final class C14212a {
        /* renamed from: a */
        public final C14211b6 mo34668a(Bitmap bitmap, C14317f1 f1Var) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(f1Var, "bitmapColorAnalyzer");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            f1Var.mo35103c(iArr);
            return new C14211b6(width, height, iArr, f1Var.mo35102a(), f1Var.mo35105e().size(), f1Var.mo35104d());
        }
    }

    public C14211b6(int i, int i2, int[] iArr, int i3, int i4, float f) {
        Intrinsics.checkNotNullParameter(iArr, "pixels");
        this.f35105a = i;
        this.f35106b = i2;
        this.f35107c = iArr;
        this.f35108d = i3;
        this.f35109e = i4;
        this.f35110f = f;
    }

    /* renamed from: a */
    public final int mo34662a() {
        return this.f35108d;
    }

    /* renamed from: b */
    public final int mo34663b() {
        return this.f35106b;
    }

    /* renamed from: c */
    public final int mo34664c() {
        return this.f35109e;
    }

    /* renamed from: d */
    public final float mo34665d() {
        return this.f35110f;
    }

    /* renamed from: e */
    public final int[] mo34666e() {
        return this.f35107c;
    }

    /* renamed from: f */
    public final int mo34667f() {
        return this.f35105a;
    }
}
