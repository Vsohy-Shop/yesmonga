package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36654b5;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24802h;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.p */
public final class C24762p extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24763a f61437b = new C24763a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61438c = 8;

    /* renamed from: d */
    public static final int f61439d = 5;
    @C12579k

    /* renamed from: a */
    public final C36654b5 f61440a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.p$a */
    public static final class C24763a {
        public /* synthetic */ C24763a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24763a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24762p(@C12579k C36654b5 b5Var) {
        super(b5Var.getRoot());
        Intrinsics.checkNotNullParameter(b5Var, "binding");
        this.f61440a = b5Var;
    }

    /* renamed from: c */
    public final void mo72290c(@C12579k C24802h hVar, boolean z) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(hVar, "item");
        this.f61440a.f90612g.setText(StringKt.m118921b0(hVar.mo72470h()));
        this.f61440a.f90610e.setText(C28782t.m119105b(Double.valueOf(hVar.mo72468f())));
        TextView textView = this.f61440a.f90611f;
        Double g = hVar.mo72469g();
        if (g != null) {
            str = C28782t.m119105b(g);
        } else {
            str = null;
        }
        textView.setText(str);
        View view = this.f61440a.f90613h;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    @C12579k
    /* renamed from: d */
    public final C36654b5 mo72291d() {
        return this.f61440a;
    }
}
