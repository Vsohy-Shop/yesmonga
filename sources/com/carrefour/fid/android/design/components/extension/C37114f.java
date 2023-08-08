package com.carrefour.fid.android.design.components.extension;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C20207r;
import androidx.recyclerview.widget.RecyclerView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.extension.f */
public final class C37114f {

    /* renamed from: a */
    public static final int f92909a = 500;

    /* renamed from: b */
    public static final float f92910b = 100.0f;

    /* renamed from: com.carrefour.fid.android.design.components.extension.f$a */
    public static final class C37115a extends C20207r {

        /* renamed from: x */
        public final /* synthetic */ int f92911x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37115a(Context context, int i) {
            super(context);
            this.f92911x = i;
        }

        /* renamed from: A */
        public int mo60651A() {
            return this.f92911x;
        }

        /* renamed from: C */
        public int mo60653C() {
            return this.f92911x;
        }

        /* renamed from: w */
        public float mo60285w(@C12580l DisplayMetrics displayMetrics) {
            return 100.0f / ((float) (displayMetrics != null ? displayMetrics.densityDpi : 500));
        }
    }

    /* renamed from: a */
    public static final C37115a m152156a(Context context, int i) {
        return new C37115a(context, i);
    }

    /* renamed from: b */
    public static /* synthetic */ C37115a m152157b(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return m152156a(context, i);
    }

    @C12580l
    /* renamed from: c */
    public static final C11079d2 m152158c(@C12579k RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        C37115a a = m152156a(context, i2);
        a.mo59709q(i);
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        layoutManager.mo59941g2(a);
        return C11079d2.f28267a;
    }

    /* renamed from: d */
    public static /* synthetic */ C11079d2 m152159d(RecyclerView recyclerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return m152158c(recyclerView, i, i2);
    }
}
