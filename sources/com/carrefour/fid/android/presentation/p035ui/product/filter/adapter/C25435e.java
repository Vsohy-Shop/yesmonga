package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36794p5;
import com.carrefour.fid.android.presentation.models.TermModel;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.e */
public final class C25435e extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f62587b = 8;
    @C12579k

    /* renamed from: a */
    public final C36794p5 f62588a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25435e(@C12579k C36794p5 p5Var) {
        super(p5Var.getRoot());
        Intrinsics.checkNotNullParameter(p5Var, "binding");
        this.f62588a = p5Var;
    }

    /* renamed from: c */
    public final void mo74128c(@C12579k TermModel termModel, boolean z) {
        Intrinsics.checkNotNullParameter(termModel, FirebaseAnalytics.C32532b.f78927O);
        TextView b = this.f62588a.getRoot();
        b.setActivated(z);
        b.setText(termModel.mo121966h());
        if (z) {
            Intrinsics.checkNotNullExpressionValue(b, "bind$lambda$0");
            String string = this.f62588a.getRoot().getContext().getString(R.string.accessibility_select_selected_filter, new Object[]{termModel.mo121966h()});
            Intrinsics.checkNotNullExpressionValue(string, "binding.root.context.get…lected_filter, term.term)");
            ViewKt.m118994g(b, string);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(b, "bind$lambda$0");
        String string2 = this.f62588a.getRoot().getContext().getString(R.string.accessibility_select_filter, new Object[]{termModel.mo121966h()});
        Intrinsics.checkNotNullExpressionValue(string2, "binding.root.context.get…select_filter, term.term)");
        ViewKt.m118994g(b, string2);
    }

    @C12579k
    /* renamed from: d */
    public final C36794p5 mo74129d() {
        return this.f62588a;
    }
}
