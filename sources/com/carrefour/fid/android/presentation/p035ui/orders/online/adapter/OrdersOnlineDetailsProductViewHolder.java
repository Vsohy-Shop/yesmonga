package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36694f5;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25197b;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.util.ImageUtils;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrdersOnlineDetailsProductViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,824:1\n262#2,2:825\n262#2,2:827\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrdersOnlineDetailsProductViewHolder\n*L\n419#1:825,2\n429#1:827,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsProductViewHolder */
public final class OrdersOnlineDetailsProductViewHolder extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24856a f61625c = new C24856a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61626d = 8;

    /* renamed from: e */
    public static final int f61627e = 3;
    @C12579k

    /* renamed from: b */
    public final C36694f5 f61628b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsProductViewHolder$a */
    public static final class C24856a {
        public /* synthetic */ C24856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24856a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OrdersOnlineDetailsProductViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36694f5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61628b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.OrdersOnlineDetailsProductViewHolder.<init>(com.carrefour.fid.android.databinding.f5):void");
    }

    /* renamed from: c */
    public final void mo72600c(@C12579k OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel, @C12580l C24881i.C24882a aVar) {
        int i;
        String str;
        SpannableString spannableString;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsProductModel, "product");
        ImageUtils imageUtils = ImageUtils.f70796a;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        String c = ordersOnlineDetailsProductModel.mo73434c();
        ImageView imageView = this.f61628b.f90814e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageHolderOrderDetailsProduct");
        imageUtils.mo84101e(context, c, imageView, R.drawable.ic_product_placeholder);
        ComposeView composeView = this.f61628b.f90812c;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.holderOrderDetailsDigitalItem");
        int i2 = 8;
        if (ordersOnlineDetailsProductModel.mo73427P()) {
            i = 0;
        } else {
            i = 8;
        }
        composeView.setVisibility(i);
        ComposeView composeView2 = this.f61628b.f90812c;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b;
        composeView2.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView2.setContent(ComposableSingletons$OrdersOnlineDetailsViewHolderKt.f61611a.mo72588b());
        ComposeView composeView3 = this.f61628b.f90813d;
        Intrinsics.checkNotNullExpressionValue(composeView3, "binding.holderOrderDetailsDisplayDigitalItem");
        if (ordersOnlineDetailsProductModel.mo73427P()) {
            i2 = 0;
        }
        composeView3.setVisibility(i2);
        ComposeView composeView4 = this.f61628b.f90813d;
        composeView4.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView4.setContent(C8553b.m31049c(-356905580, true, new OrdersOnlineDetailsProductViewHolder$bind$2$1(aVar, ordersOnlineDetailsProductModel)));
        TextView textView = this.f61628b.f90819j;
        if (C11622t.isBlank(ordersOnlineDetailsProductModel.getName())) {
            str = textView.getContext().getString(R.string.order_details_unavailable);
        } else {
            str = ordersOnlineDetailsProductModel.getName();
        }
        textView.setText(str);
        this.f61628b.f90817h.setText(ordersOnlineDetailsProductModel.mo73420I());
        TextView textView2 = this.f61628b.f90820k;
        if (ordersOnlineDetailsProductModel.mo73426O() > 0) {
            spannableString = new SpannableString(textView2.getContext().getString(R.string.order_details_quantity, new Object[]{Integer.valueOf(ordersOnlineDetailsProductModel.mo73426O()), C25197b.m108890a(ordersOnlineDetailsProductModel.mo73422K())}));
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, "x", 0, false, 6, (Object) null) + 1;
            spannableString.setSpan(new StyleSpan(1), 0, indexOf$default, 18);
            spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(textView2.getContext(), R.color.ds_primary_dark)), 0, indexOf$default, 18);
        } else {
            spannableString = null;
        }
        textView2.setText(spannableString);
        TextView textView3 = this.f61628b.f90815f;
        textView3.setTextColor(textView3.getContext().getColor(R.color.ds_primary_dark));
        Intrinsics.checkNotNullExpressionValue(textView3, "bind$lambda$5");
        TextViewKt.m118962m(textView3, Double.valueOf(ordersOnlineDetailsProductModel.mo73415D()));
        mo72602e(ordersOnlineDetailsProductModel);
    }

    @C12579k
    /* renamed from: d */
    public final C36694f5 mo72601d() {
        return this.f61628b;
    }

    /* renamed from: e */
    public final void mo72602e(OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel) {
        boolean z;
        if (ordersOnlineDetailsProductModel.mo73416E() == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f61628b.f90811b.setVisibility(8);
            this.f61628b.f90816g.setVisibility(8);
            return;
        }
        this.f61628b.f90811b.setVisibility(0);
        TextView textView = this.f61628b.f90818i;
        textView.setText(textView.getContext().getString(R.string.order_details_immediate_discount, new Object[]{C28782t.m119105b(Double.valueOf(ordersOnlineDetailsProductModel.mo73416E()))}));
        TextView textView2 = this.f61628b.f90821l;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.textHolderOrderD…ilsProductTotalPaidAmount");
        TextViewKt.m118962m(textView2, Double.valueOf(ordersOnlineDetailsProductModel.mo73417F()));
        TextView textView3 = this.f61628b.f90815f;
        textView3.setTextColor(textView3.getContext().getColor(R.color.ds_grey_20));
        this.f61628b.f90816g.setVisibility(0);
    }
}
