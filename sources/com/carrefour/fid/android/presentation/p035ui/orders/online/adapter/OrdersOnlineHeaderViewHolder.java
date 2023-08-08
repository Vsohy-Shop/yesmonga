package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36754l5;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24879h;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineHeaderViewHolder */
public final class OrdersOnlineHeaderViewHolder extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: c */
    public static final C24860a f61633c = new C24860a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61634d = 8;

    /* renamed from: e */
    public static final int f61635e = 2;
    @C12579k

    /* renamed from: a */
    public final C36754l5 f61636a;
    @C12579k

    /* renamed from: b */
    public final C24879h.C24880a f61637b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineHeaderViewHolder$a */
    public static final class C24860a {
        public /* synthetic */ C24860a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24860a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOnlineHeaderViewHolder(@C12579k C36754l5 l5Var, @C12579k C24879h.C24880a aVar) {
        super(l5Var.getRoot());
        Intrinsics.checkNotNullParameter(l5Var, "binding");
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        this.f61636a = l5Var;
        this.f61637b = aVar;
    }

    /* renamed from: c */
    public final void mo72607c() {
        ComposeView composeView = this.f61636a.f91218b;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(-1210694606, true, new OrdersOnlineHeaderViewHolder$bind$1$1(this)));
    }

    @C12579k
    /* renamed from: d */
    public final C36754l5 mo72608d() {
        return this.f61636a;
    }

    @C12579k
    /* renamed from: e */
    public final C24879h.C24880a mo72609e() {
        return this.f61637b;
    }
}
