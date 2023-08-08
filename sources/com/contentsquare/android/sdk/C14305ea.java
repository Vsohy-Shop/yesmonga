package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.ea */
public final class C14305ea {

    /* renamed from: b */
    public static final C14306a f35328b = new C14306a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14792v5 f35329a;

    /* renamed from: com.contentsquare.android.sdk.ea$a */
    public static final class C14306a {
        public C14306a() {
        }

        public /* synthetic */ C14306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14305ea() {
        this((C14792v5) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final Bitmap mo35076a(Bitmap bitmap, C14211b6 b6Var) {
        Intrinsics.checkNotNullParameter(bitmap, "viewBitmap");
        Intrinsics.checkNotNullParameter(b6Var, "bitmapPixel");
        int a = b6Var.mo34662a() | -16777216;
        if ((b6Var.mo34662a() >>> 24) == 0) {
            return bitmap;
        }
        this.f35329a.mo36621d(bitmap, bitmap.getWidth(), bitmap.getHeight(), a);
        return this.f35329a.mo36618a();
    }

    public C14305ea(C14792v5 v5Var) {
        Intrinsics.checkNotNullParameter(v5Var, "reusableViewBitmap");
        this.f35329a = v5Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14305ea(C14792v5 v5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C14792v5(8, 8, (C14442j5) null, (Canvas) null, 12, (DefaultConstructorMarker) null) : v5Var);
    }
}
