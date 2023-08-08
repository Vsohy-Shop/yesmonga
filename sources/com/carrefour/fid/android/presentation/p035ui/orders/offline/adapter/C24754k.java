package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36873x4;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24799e;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.k */
public final class C24754k extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24755a f61422b = new C24755a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61423c = 8;

    /* renamed from: d */
    public static final int f61424d = 3;
    @C12579k

    /* renamed from: a */
    public final C36873x4 f61425a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.k$a */
    public static final class C24755a {
        public /* synthetic */ C24755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24755a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24754k(@C12579k C36873x4 x4Var) {
        super(x4Var.getRoot());
        Intrinsics.checkNotNullParameter(x4Var, "binding");
        this.f61425a = x4Var;
    }

    /* renamed from: c */
    public final void mo72280c(@C12579k C24799e eVar) {
        String str;
        Intrinsics.checkNotNullParameter(eVar, "item");
        double g = eVar.mo72425g();
        TextView textView = this.f61425a.f91906c;
        if (g < 0.0d) {
            str = this.itemView.getContext().getString(R.string.order_detail_command_return_cash);
        } else {
            str = eVar.mo72428i();
        }
        textView.setText(str);
        this.f61425a.f91905b.setText(C28782t.m119105b(Double.valueOf(g)));
    }

    @C12579k
    /* renamed from: d */
    public final C36873x4 mo72281d() {
        return this.f61425a;
    }
}
