package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.content.res.Resources;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.PromotionType;
import com.carrefour.fid.android.databinding.C36891z4;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsAllowanceModel;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.w */
public final class C24897w extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f61698b = 8;
    @C12579k

    /* renamed from: a */
    public final C36891z4 f61699a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24897w(@C12579k C36891z4 z4Var) {
        super(z4Var.getRoot());
        Intrinsics.checkNotNullParameter(z4Var, "binding");
        this.f61699a = z4Var;
    }

    /* renamed from: c */
    public final void mo72647c(@C12579k OrdersOnlineDetailsAllowanceModel ordersOnlineDetailsAllowanceModel) {
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsAllowanceModel, "item");
        C36891z4 z4Var = this.f61699a;
        z4Var.f92024c.setText(z4Var.getRoot().getContext().getString(R.string.order_detail_promo_code, new Object[]{ordersOnlineDetailsAllowanceModel.mo73334m()}));
        C36891z4 z4Var2 = this.f61699a;
        z4Var2.f92023b.setText(z4Var2.getRoot().getContext().getString(R.string.order_detail_promo_amount, new Object[]{C28782t.m119105b(Double.valueOf(ordersOnlineDetailsAllowanceModel.mo73330i()))}));
        String n = ordersOnlineDetailsAllowanceModel.mo73335n();
        if (Intrinsics.areEqual((Object) n, (Object) PromotionType.IMMEDIATE.mo108075q())) {
            C36891z4 z4Var3 = this.f61699a;
            z4Var3.f92023b.setTextColor(z4Var3.getRoot().getContext().getResources().getColor(R.color.ds_red_1, (Resources.Theme) null));
        } else if (Intrinsics.areEqual((Object) n, (Object) PromotionType.DEFERRED.mo108075q())) {
            C36891z4 z4Var4 = this.f61699a;
            z4Var4.f92023b.setTextColor(z4Var4.getRoot().getContext().getResources().getColor(R.color.ds_primary, (Resources.Theme) null));
        }
    }

    @C12579k
    /* renamed from: d */
    public final C36891z4 mo72648d() {
        return this.f61699a;
    }
}
