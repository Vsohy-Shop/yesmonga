package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.InfoProductsReplacementType;
import com.carrefour.fid.android.core.type.OrderCategoryType;
import com.carrefour.fid.android.databinding.C36803q4;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25235c;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.j */
public final class C24883j extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24884a f61673c = new C24884a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61674d = 8;

    /* renamed from: e */
    public static final int f61675e = 2;
    @C12579k

    /* renamed from: b */
    public final C36803q4 f61676b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.j$a */
    public static final class C24884a {
        public /* synthetic */ C24884a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24884a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24883j(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36803q4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61676b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24883j.<init>(com.carrefour.fid.android.databinding.q4):void");
    }

    /* renamed from: c */
    public final void mo72634c(@C12579k C25235c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C28547h2.f69318f);
        if (cVar.mo73546k()) {
            C36803q4 q4Var = this.f61676b;
            q4Var.f91538c.setText(q4Var.getRoot().getContext().getString(OrderCategoryType.MISSING_PRODUCTS.mo108569q()));
            this.f61676b.f91540e.mo72591i(R.string.order_missing_product_in_list_title, R.string.order_missing_product_in_list_description);
            this.f61676b.f91539d.setVisibility(0);
        } else {
            String i = cVar.mo73544i();
            OrderCategoryType orderCategoryType = OrderCategoryType.MISSING_PRODUCTS;
            if (Intrinsics.areEqual((Object) i, (Object) orderCategoryType.toString())) {
                C36803q4 q4Var2 = this.f61676b;
                q4Var2.f91538c.setText(q4Var2.getRoot().getContext().getString(orderCategoryType.mo108569q()));
                this.f61676b.f91539d.setVisibility(0);
            } else {
                String i2 = cVar.mo73544i();
                OrderCategoryType orderCategoryType2 = OrderCategoryType.REPLACEMENT_PRODUCTS;
                if (Intrinsics.areEqual((Object) i2, (Object) orderCategoryType2.toString())) {
                    C36803q4 q4Var3 = this.f61676b;
                    q4Var3.f91538c.setText(q4Var3.getRoot().getContext().getString(orderCategoryType2.mo108569q()));
                    if (cVar.mo73545j() != InfoProductsReplacementType.Unknown) {
                        this.f61676b.f91540e.mo72591i(cVar.mo73545j().mo108509r(), cVar.mo73545j().mo108508q());
                    }
                    this.f61676b.f91539d.setVisibility(8);
                } else {
                    this.f61676b.f91540e.setVisibility(8);
                    this.f61676b.f91539d.setVisibility(8);
                    this.f61676b.f91538c.setText(cVar.mo73544i());
                }
            }
        }
        this.f61676b.f91537b.setText(String.valueOf(cVar.mo73542h()));
    }

    @C12579k
    /* renamed from: d */
    public final C36803q4 mo72635d() {
        return this.f61676b;
    }
}
