package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import com.contentsquare.android.sdk.C14742t9;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;

/* renamed from: com.contentsquare.android.sdk.ig */
public final class C14433ig implements C14626q {

    /* renamed from: c */
    public static final C14434a f35657c = new C14434a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public C14855x9 f35658a;

    /* renamed from: b */
    public final C14417i6 f35659b;

    /* renamed from: com.contentsquare.android.sdk.ig$a */
    public static final class C14434a {
        public C14434a() {
        }

        public /* synthetic */ C14434a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14433ig(C14855x9 x9Var, C14417i6 i6Var) {
        Intrinsics.checkNotNullParameter(x9Var, "maskingViewBitmap");
        Intrinsics.checkNotNullParameter(i6Var, "maskingParameter");
        this.f35658a = x9Var;
        this.f35659b = i6Var;
    }

    /* renamed from: a */
    public void mo35558a(C14742t9.C14746d dVar, LinkedList<C14507le> linkedList) {
        boolean z;
        Intrinsics.checkNotNullParameter(dVar, "viewBitmapResult");
        Intrinsics.checkNotNullParameter(linkedList, "viewsFromLeafToRoot");
        boolean z2 = true;
        Bitmap copy = dVar.mo36512b().mo36618a().copy(Bitmap.Config.ARGB_8888, true);
        Iterator<C14507le> it = linkedList.iterator();
        while (it.hasNext()) {
            C14507le next = it.next();
            if (next.mo35845P()) {
                if (z2) {
                    mo35560c(dVar.mo36512b().mo36618a());
                    z = false;
                } else {
                    z = z2;
                }
                Intrinsics.checkNotNullExpressionValue(next, "viewLight");
                C14855x9 b = dVar.mo36512b();
                Intrinsics.checkNotNullExpressionValue(b, "viewBitmapResult.windowDrawableReusableBitmap");
                mo35561d(next, b, this.f35658a.mo36618a(), dVar.mo36515e(), 12);
                z2 = z;
            }
        }
        if (this.f35659b.mo35524d()) {
            for (C14507le leVar : linkedList) {
                if (!leVar.mo35845P()) {
                    C14855x9 b2 = dVar.mo36512b();
                    Intrinsics.checkNotNullExpressionValue(b2, "viewBitmapResult.windowDrawableReusableBitmap");
                    Intrinsics.checkNotNullExpressionValue(copy, "unmaskedViewBitmap");
                    mo35561d(leVar, b2, copy, dVar.mo36515e(), 1);
                }
            }
        }
    }

    /* renamed from: b */
    public Bitmap mo35559b(Bitmap bitmap, C14507le leVar, C14587o9 o9Var) {
        Intrinsics.checkNotNullParameter(bitmap, "viewBitmap");
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        Intrinsics.checkNotNullParameter(o9Var, "recyclableBitmapScale");
        return bitmap;
    }

    /* renamed from: c */
    public final void mo35560c(Bitmap bitmap) {
        this.f35658a.mo36620c(bitmap, C11479u.m44447u(bitmap.getWidth() / 12, 1), C11479u.m44447u(bitmap.getHeight() / 12, 1));
    }

    /* renamed from: d */
    public final void mo35561d(C14507le leVar, C14855x9 x9Var, Bitmap bitmap, float f, int i) {
        x9Var.mo36819l(bitmap, C11409d.m43851L0(((float) leVar.mo35835F()) / f), C11409d.m43851L0(((float) leVar.mo35836G()) / f), C11409d.m43851L0(((float) leVar.mo35842M()) / f), C11409d.m43851L0(((float) leVar.mo35832C()) / f), i);
    }
}
