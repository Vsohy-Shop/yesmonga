package com.contentsquare.android.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.k3 */
public final class C14464k3 {

    /* renamed from: i */
    public static final C14465a f35722i = new C14465a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f35723a;

    /* renamed from: b */
    public final int f35724b;

    /* renamed from: c */
    public final int f35725c;

    /* renamed from: d */
    public final boolean f35726d;

    /* renamed from: e */
    public String f35727e;

    /* renamed from: f */
    public String f35728f;

    /* renamed from: g */
    public final String f35729g;

    /* renamed from: h */
    public final C14166a0 f35730h;

    /* renamed from: com.contentsquare.android.sdk.k3$a */
    public static final class C14465a {
        public C14465a() {
        }

        public /* synthetic */ C14465a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0056, code lost:
        r5 = r5.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14464k3(com.contentsquare.android.sdk.C14166a0 r4, com.contentsquare.android.sdk.C14507le r5, com.contentsquare.android.sdk.C14211b6 r6) {
        /*
            r3 = this;
            java.lang.String r0 = "perceptualHash"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "viewLight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "bitmapPixel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r3.<init>()
            r3.f35730h = r4
            boolean r0 = r5.mo35845P()
            r3.f35726d = r0
            int r1 = r6.mo34662a()
            r3.f35725c = r1
            int r2 = r6.mo34667f()
            int r2 = r3.mo35704a(r2)
            r3.f35723a = r2
            int r6 = r6.mo34663b()
            int r6 = r3.mo35704a(r6)
            r3.f35724b = r6
            int r4 = r4.hashCode()
            int r4 = r4 * 31
            int r4 = r4 + r1
            int r4 = r4 * 31
            int r4 = r4 + r2
            int r4 = r4 * 31
            int r4 = r4 + r6
            int r4 = r4 * 31
            int r4 = r4 + r0
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            com.contentsquare.android.sdk.e0$a r6 = com.contentsquare.android.sdk.C14285e0.f35276b
            java.lang.String r6 = r6.mo35010b(r5)
            r3.f35727e = r6
            java.lang.CharSequence r5 = r5.mo35838I()
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r5 = ""
        L_0x005e:
            r3.f35728f = r5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            java.lang.String r6 = "."
            if (r5 == 0) goto L_0x0082
            java.lang.String r5 = r3.f35727e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r6)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            goto L_0x00a6
        L_0x0082:
            java.lang.String r5 = r3.f35728f
            int r5 = r5.hashCode()
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r0 = r3.f35727e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r6)
            r1.append(r0)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
        L_0x00a6:
            r3.f35729g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14464k3.<init>(com.contentsquare.android.sdk.a0, com.contentsquare.android.sdk.le, com.contentsquare.android.sdk.b6):void");
    }

    /* renamed from: a */
    public final int mo35704a(int i) {
        if (i >= 0 && 1 > i) {
            return 0;
        }
        int i2 = 2;
        if (1 <= i && 2 > i) {
            return 1;
        }
        if (2 > i || 4 <= i) {
            i2 = 8;
            if (4 <= i && 8 > i) {
                return 4;
            }
            if (8 > i || 16 <= i) {
                i2 = 32;
                if (16 <= i && 32 > i) {
                    return 16;
                }
                if (32 > i || 64 <= i) {
                    i2 = 128;
                    if (64 <= i && 128 > i) {
                        return 64;
                    }
                    if (128 > i || 256 <= i) {
                        i2 = 512;
                        if (256 <= i && 512 > i) {
                            return 256;
                        }
                        if (512 > i || 1024 <= i) {
                            i2 = 2048;
                            if (1024 <= i && 2048 > i) {
                                return 1024;
                            }
                            if (2048 > i || 4096 <= i) {
                                return 4096;
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final int mo35705b(long j, long j2) {
        int i = 0;
        for (int i2 = 0; i2 < 64; i2++) {
            i += (int) (((j >>> i2) & 1) ^ (1 & (j2 >>> i2)));
        }
        return i;
    }

    /* renamed from: c */
    public final String mo35706c() {
        return this.f35729g;
    }

    /* renamed from: d */
    public final boolean mo35707d(C14464k3 k3Var, int i) {
        int i2 = this.f35725c;
        int i3 = i2 >>> 24;
        int i4 = (i2 >> 16) & 255;
        int i5 = (i2 >> 8) & 255;
        int i6 = i2 & 255;
        int i7 = k3Var.f35725c;
        return Math.abs(i3 - (i7 >>> 24)) <= i && Math.abs(i4 - ((i7 >> 16) & 255)) <= i && Math.abs(i5 - ((i7 >> 8) & 255)) <= i && Math.abs(i6 - (i7 & 255)) <= i;
    }

    /* renamed from: e */
    public final boolean mo35708e(C14464k3 k3Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(k3Var, "otherBitmapHash");
        boolean z = k3Var.f35726d == this.f35726d;
        if (!(this.f35723a == k3Var.f35723a && this.f35724b == k3Var.f35724b)) {
            z = false;
        }
        if (!mo35707d(k3Var, i2)) {
            z = false;
        }
        if ((!Intrinsics.areEqual((Object) this.f35728f, (Object) k3Var.f35728f)) || (!Intrinsics.areEqual((Object) this.f35727e, (Object) k3Var.f35727e))) {
            z = false;
        }
        if (mo35705b(this.f35730h.mo34477a(), k3Var.f35730h.mo34477a()) > i || mo35705b(this.f35730h.mo34478b(), k3Var.f35730h.mo34478b()) > i) {
            return false;
        }
        return z;
    }
}
