package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36804q5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.models.extension.C38482q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.h */
public final class C25438h extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f62593b = 8;
    @C12579k

    /* renamed from: a */
    public final C36804q5 f62594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25438h(@C12579k C36804q5 q5Var) {
        super(q5Var.getRoot());
        Intrinsics.checkNotNullParameter(q5Var, "binding");
        this.f62594a = q5Var;
    }

    /* renamed from: c */
    public final void mo74133c(@C12579k SortModel sortModel, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(sortModel, "sort");
        Context context = this.f62594a.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
        String a = C38482q.m159663a(sortModel, context);
        this.f62594a.getRoot().setText(a);
        if (z) {
            str = this.f62594a.getRoot().getContext().getString(R.string.accessibility_select_selected_filter, new Object[]{a});
        } else {
            str = this.f62594a.getRoot().getContext().getString(R.string.accessibility_select_filter, new Object[]{a});
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (isItemSelected) {\n  …_filter, label)\n        }");
        TextView b = this.f62594a.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        ViewKt.m152121c(b, str, false, 2, (Object) null);
    }

    @C12579k
    /* renamed from: d */
    public final C36804q5 mo74134d() {
        return this.f62594a;
    }
}
