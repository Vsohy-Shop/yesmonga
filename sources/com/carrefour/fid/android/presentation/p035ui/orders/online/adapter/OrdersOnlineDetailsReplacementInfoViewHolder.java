package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36674d5;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.shared.extension.ViewKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsReplacementInfoViewHolder */
public final class OrdersOnlineDetailsReplacementInfoViewHolder extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24859a f61629c = new C24859a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61630d = 8;

    /* renamed from: e */
    public static final int f61631e = 1;
    @C12579k

    /* renamed from: b */
    public final C36674d5 f61632b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsReplacementInfoViewHolder$a */
    public static final class C24859a {
        public /* synthetic */ C24859a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24859a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OrdersOnlineDetailsReplacementInfoViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36674d5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61632b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.OrdersOnlineDetailsReplacementInfoViewHolder.<init>(com.carrefour.fid.android.databinding.d5):void");
    }

    /* renamed from: e */
    public static final void m108264e(OrdersOnlineDetailsReplacementInfoViewHolder ordersOnlineDetailsReplacementInfoViewHolder, C24881i.C24882a aVar, View view) {
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsReplacementInfoViewHolder, "this$0");
        if (ordersOnlineDetailsReplacementInfoViewHolder.f61632b.f90724d.isShown()) {
            ImageView imageView = ordersOnlineDetailsReplacementInfoViewHolder.f61632b.f90723c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageHolderOrder…ailsOnlineReplacementInfo");
            ViewKt.m118982G(imageView, false, 0, 2, (Object) null);
            TextView textView = ordersOnlineDetailsReplacementInfoViewHolder.f61632b.f90724d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.textHolderOrderD…ailsOnlineReplacementInfo");
            ViewKt.m118999l(textView, false, 0.0d, (C11289a) null, 7, (Object) null);
            return;
        }
        ImageView imageView2 = ordersOnlineDetailsReplacementInfoViewHolder.f61632b.f90723c;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.imageHolderOrder…ailsOnlineReplacementInfo");
        ViewKt.m118982G(imageView2, true, 0, 2, (Object) null);
        TextView textView2 = ordersOnlineDetailsReplacementInfoViewHolder.f61632b.f90724d;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.textHolderOrderD…ailsOnlineReplacementInfo");
        ViewKt.m119006s(textView2, false, 0.0d, new OrdersOnlineDetailsReplacementInfoViewHolder$bind$1$1(aVar, ordersOnlineDetailsReplacementInfoViewHolder), 3, (Object) null);
    }

    /* renamed from: d */
    public final void mo72605d(@C12580l C24881i.C24882a aVar) {
        this.f61632b.f90722b.setOnClickListener(new C24898x(this, aVar));
    }

    @C12579k
    /* renamed from: f */
    public final C36674d5 mo72606f() {
        return this.f61632b;
    }
}
