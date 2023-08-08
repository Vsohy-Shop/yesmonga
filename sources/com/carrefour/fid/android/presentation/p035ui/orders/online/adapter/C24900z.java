package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36179j;
import com.carrefour.fid.android.databinding.C36704g5;
import com.carrefour.fid.android.databinding.C36714h5;
import com.carrefour.fid.android.databinding.C36833t4;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25241i;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.util.ImageUtils;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrdersOnlineDetailsReplacementProductViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,824:1\n262#2,2:825\n262#2,2:827\n262#2,2:829\n262#2,2:831\n262#2,2:833\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrdersOnlineDetailsReplacementProductViewHolder\n*L\n617#1:825,2\n618#1:827,2\n619#1:829,2\n620#1:831,2\n621#1:833,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.z */
public final class C24900z extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24901a f61704c = new C24901a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61705d = 8;

    /* renamed from: e */
    public static final int f61706e = 5;
    @C12579k

    /* renamed from: b */
    public final C36704g5 f61707b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.z$a */
    public static final class C24901a {
        public /* synthetic */ C24901a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24901a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24900z(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36704g5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61707b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24900z.<init>(com.carrefour.fid.android.databinding.g5):void");
    }

    /* renamed from: e */
    public static final void m108322e(C25241i iVar, C36714h5 h5Var, View view) {
        Intrinsics.checkNotNullParameter(iVar, "$product");
        Intrinsics.checkNotNullParameter(h5Var, "$this_apply");
        if (Intrinsics.areEqual((Object) iVar.mo73574l(), (Object) C36179j.f89328c)) {
            h5Var.f90965d.mo121254G(R.string.order_detail_replacement_tool_tip_cheaper);
        } else {
            h5Var.f90965d.mo121254G(R.string.order_detail_replacement_tool_tip_expensive);
        }
    }

    /* renamed from: d */
    public final void mo72651d(@C12579k C25241i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "product");
        C36833t4 t4Var = this.f61707b.f90895b;
        ImageUtils imageUtils = ImageUtils.f70796a;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        String c = iVar.mo73434c();
        ImageView imageView = t4Var.f91678b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageHolderOrderDetailsNoDeliveryProduct");
        imageUtils.mo84101e(context, c, imageView, R.drawable.ic_product_placeholder);
        TextView textView = t4Var.f91681e;
        String a = iVar.mo73577o().mo73558a();
        if (C11622t.isBlank(a)) {
            a = textView.getContext().getString(R.string.order_details_unavailable);
            Intrinsics.checkNotNullExpressionValue(a, "context.getString(R.stri…rder_details_unavailable)");
        }
        textView.setText(a);
        t4Var.f91680d.setText(iVar.mo73577o().mo73560c());
        TextView textView2 = t4Var.f91682f;
        int e = iVar.mo73577o().mo73562e();
        textView2.setText(e + " x");
        TextView textView3 = t4Var.f91679c;
        Intrinsics.checkNotNullExpressionValue(textView3, "bind$lambda$3$lambda$2");
        TextViewKt.m118962m(textView3, Double.valueOf(iVar.mo73577o().mo73559b()));
        TextViewKt.m118965p(textView3);
        C36714h5 h5Var = this.f61707b.f90896c;
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
        String c2 = iVar.mo73434c();
        ImageView imageView2 = h5Var.f90964c;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageHolderOrderDetailsReplacementProduct");
        imageUtils.mo84101e(context2, c2, imageView2, R.drawable.ic_product_placeholder);
        TextView textView4 = h5Var.f90968g;
        String name = iVar.getName();
        if (C11622t.isBlank(name)) {
            name = textView4.getContext().getString(R.string.order_details_unavailable);
            Intrinsics.checkNotNullExpressionValue(name, "context.getString(R.stri…rder_details_unavailable)");
        }
        textView4.setText(name);
        h5Var.f90967f.setText(iVar.mo73570h());
        TextView textView5 = h5Var.f90969h;
        Integer i = iVar.mo73571i();
        textView5.setText(i + " x");
        TextView textView6 = h5Var.f90966e;
        Intrinsics.checkNotNullExpressionValue(textView6, "bind$lambda$8$lambda$6");
        TextViewKt.m118962m(textView6, Double.valueOf(iVar.mo73567e()));
        TextViewKt.m118965p(textView6);
        if (Intrinsics.areEqual((Object) iVar.mo73574l(), (Object) C36179j.f89330e)) {
            TextView textView7 = h5Var.f90973l;
            Intrinsics.checkNotNullExpressionValue(textView7, "textHolderOrderReplacementReceiptAmount");
            TextViewKt.m118962m(textView7, Double.valueOf(iVar.mo73567e()));
            TextView textView8 = h5Var.f90973l;
            Intrinsics.checkNotNullExpressionValue(textView8, "textHolderOrderReplacementReceiptAmount");
            textView8.setVisibility(0);
            TextView textView9 = h5Var.f90970i;
            Intrinsics.checkNotNullExpressionValue(textView9, "textHolderOrderReplacementDifferenceAmount");
            textView9.setVisibility(8);
            TextView textView10 = h5Var.f90971j;
            Intrinsics.checkNotNullExpressionValue(textView10, "textHolderOrderReplacementDifferenceTitle");
            textView10.setVisibility(8);
            ImageView imageView3 = h5Var.f90963b;
            Intrinsics.checkNotNullExpressionValue(imageView3, "imageHolderInfoReplacementDifference");
            imageView3.setVisibility(8);
            TextView textView11 = h5Var.f90972k;
            Intrinsics.checkNotNullExpressionValue(textView11, "textHolderOrderReplacementReceipt");
            textView11.setVisibility(0);
            return;
        }
        TextView textView12 = h5Var.f90973l;
        Intrinsics.checkNotNullExpressionValue(textView12, "textHolderOrderReplacementReceiptAmount");
        TextViewKt.m118962m(textView12, iVar.mo73573k());
        TextView textView13 = h5Var.f90970i;
        Intrinsics.checkNotNullExpressionValue(textView13, "textHolderOrderReplacementDifferenceAmount");
        TextViewKt.m118962m(textView13, iVar.mo73575m());
        String l = iVar.mo73574l();
        if (Intrinsics.areEqual((Object) l, (Object) C36179j.f89328c)) {
            h5Var.f90971j.setText(R.string.order_replacement_product_not_billed);
        } else if (Intrinsics.areEqual((Object) l, (Object) C36179j.f89329d)) {
            h5Var.f90971j.setText(R.string.order_replacement_product_difference);
        } else {
            h5Var.f90963b.setVisibility(8);
            h5Var.f90971j.setVisibility(8);
        }
        h5Var.f90963b.setOnClickListener(new C24899y(iVar, h5Var));
    }

    @C12579k
    /* renamed from: f */
    public final C36704g5 mo72652f() {
        return this.f61707b;
    }
}
