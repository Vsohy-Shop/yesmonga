package com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.adapter.c */
public final class C24123c extends RecyclerView.C20075n {

    /* renamed from: b */
    public static final int f60349b = 0;

    /* renamed from: a */
    public final int f60350a;

    public C24123c(int i) {
        this.f60350a = i;
    }

    /* renamed from: g */
    public void mo59102g(@C12579k Rect rect, @C12579k View view, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = false;
        if (adapter != null && recyclerView.mo59608p0(view) + 1 == adapter.getItemCount()) {
            z = true;
        }
        if (!z) {
            rect.bottom = this.f60350a;
        } else {
            rect.bottom = this.f60350a;
        }
    }
}
