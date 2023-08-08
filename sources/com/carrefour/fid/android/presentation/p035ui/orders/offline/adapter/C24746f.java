package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36843u4;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24795a;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineDetailsBottomViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsBottomViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/adapter/OrdersOfflineDetailsBottomViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,29:1\n262#2,2:30\n262#2,2:32\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineDetailsBottomViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/adapter/OrdersOfflineDetailsBottomViewHolder\n*L\n20#1:30,2\n26#1:32,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.f */
public final class C24746f extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24747a f61407b = new C24747a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61408c = 8;

    /* renamed from: d */
    public static final int f61409d = 2;
    @C12579k

    /* renamed from: a */
    public final C36843u4 f61410a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.f$a */
    public static final class C24747a {
        public /* synthetic */ C24747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24747a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24746f(@C12579k C36843u4 u4Var) {
        super(u4Var.getRoot());
        Intrinsics.checkNotNullParameter(u4Var, "binding");
        this.f61410a = u4Var;
    }

    /* renamed from: c */
    public final void mo72271c(@C12579k C24795a aVar) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(aVar, "item");
        this.f61410a.f91749c.setText(aVar.mo72386h());
        Group group = this.f61410a.f91748b;
        Intrinsics.checkNotNullExpressionValue(group, "binding.groupHolderOrder…tailsBottomAmountDiscount");
        int i2 = 0;
        if (aVar.mo72388i() == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        group.setVisibility(i);
        this.f61410a.f91750d.setText(C28782t.m119105b(Double.valueOf(aVar.mo72388i())));
        this.f61410a.f91753g.setText(aVar.mo72389j());
        TextView textView = this.f61410a.f91751e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.textHolderOrderOfflineDetailsBottomPaidBy");
        if (!aVar.mo72390k()) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    @C12579k
    /* renamed from: d */
    public final C36843u4 mo72272d() {
        return this.f61410a;
    }
}
