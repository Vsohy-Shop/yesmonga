package com.contentsquare.android.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.u0 */
public final class C14757u0 {

    /* renamed from: a */
    public static final C14758a f36531a = new C14758a((DefaultConstructorMarker) null);

    /* renamed from: com.contentsquare.android.sdk.u0$a */
    public static final class C14758a {
        public C14758a() {
        }

        public /* synthetic */ C14758a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final C14166a0 mo36544a(C14211b6 b6Var) {
        Intrinsics.checkNotNullParameter(b6Var, "bitmapPixel");
        int a = b6Var.mo34662a();
        long j = (long) (a >>> 24);
        long j2 = (long) 3;
        long j3 = ((((long) ((a >> 16) & 255)) + ((long) ((a >> 8) & 255))) + ((long) (a & 255))) / j2;
        int[] e = b6Var.mo34666e();
        int length = e.length;
        int i = 0;
        long j4 = 0;
        long j5 = 0;
        while (i < length) {
            int i2 = e[i];
            int[] iArr = e;
            int i3 = length;
            long j6 = j5;
            long j7 = j3;
            long j8 = ((((long) ((i2 >> 16) & 255)) + ((long) ((i2 >> 8) & 255))) + ((long) (i2 & 255))) / j2;
            j4 += ((long) (i2 >>> 24)) > j ? 1 << i : 0;
            j5 = j6 + (j8 > j7 ? 1 << i : 0);
            i++;
            e = iArr;
            length = i3;
            j3 = j7;
        }
        return new C14166a0(j4, j5);
    }
}
