package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import com.contentsquare.android.sdk.C14742t9;
import java.util.LinkedList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.v8 */
public final class C14798v8 implements C14626q {

    /* renamed from: a */
    public static final C14799a f36696a = new C14799a((DefaultConstructorMarker) null);

    /* renamed from: com.contentsquare.android.sdk.v8$a */
    public static final class C14799a {
        public C14799a() {
        }

        public /* synthetic */ C14799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo35558a(C14742t9.C14746d dVar, LinkedList<C14507le> linkedList) {
        Intrinsics.checkNotNullParameter(dVar, "viewBitmapResult");
        Intrinsics.checkNotNullParameter(linkedList, "viewsFromLeafToRoot");
    }

    /* renamed from: b */
    public Bitmap mo35559b(Bitmap bitmap, C14507le leVar, C14587o9 o9Var) {
        Intrinsics.checkNotNullParameter(bitmap, "viewBitmap");
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        Intrinsics.checkNotNullParameter(o9Var, "recyclableBitmapScale");
        if (!leVar.mo35845P()) {
            return bitmap;
        }
        Bitmap b = o9Var.mo36050b(leVar.mo35838I() == null ? 4 : 2);
        Intrinsics.checkNotNullExpressionValue(b, "recyclableBitmapScale.ge…edDownBitmap(scaledLevel)");
        return b;
    }
}
