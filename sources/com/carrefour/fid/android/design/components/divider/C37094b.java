package com.carrefour.fid.android.design.components.divider;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.divider.b */
public final class C37094b extends RecyclerView.C20075n {

    /* renamed from: d */
    public static final int f92879d = 0;

    /* renamed from: a */
    public final int f92880a;

    /* renamed from: b */
    public final int f92881b;

    /* renamed from: c */
    public final boolean f92882c;

    public C37094b(int i, int i2, boolean z) {
        this.f92880a = i;
        this.f92881b = i2;
        this.f92882c = z;
    }

    /* renamed from: g */
    public void mo59102g(@C12579k Rect rect, @C12579k View view, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        int p0 = recyclerView.mo59608p0(view);
        int i = this.f92880a;
        int i2 = p0 % i;
        if (this.f92882c) {
            int i3 = this.f92881b;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (p0 < i) {
                rect.top = i3;
            }
            rect.bottom = i3;
            return;
        }
        int i4 = this.f92881b;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (p0 >= i) {
            rect.top = i4;
        }
    }
}
