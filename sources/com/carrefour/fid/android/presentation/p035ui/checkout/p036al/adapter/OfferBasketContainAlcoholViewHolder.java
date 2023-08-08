package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36703g4;
import com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25469h;
import com.google.android.datatransport.cct.C40045d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketContainAlcoholViewHolder */
public final class OfferBasketContainAlcoholViewHolder extends C25469h {
    @C12579k

    /* renamed from: d */
    public static final C23333a f59066d = new C23333a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f59067e = 8;

    /* renamed from: f */
    public static final int f59068f = 12;
    @C12579k

    /* renamed from: b */
    public final C36703g4 f59069b;
    @C12579k

    /* renamed from: c */
    public final CheckoutAdapter.C23327a f59070c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketContainAlcoholViewHolder$a */
    public static final class C23333a {
        public /* synthetic */ C23333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23333a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OfferBasketContainAlcoholViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36703g4 r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter.C23327a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.platform.ComposeView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f59069b = r3
            r2.f59070c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.OfferBasketContainAlcoholViewHolder.<init>(com.carrefour.fid.android.databinding.g4, com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter$a):void");
    }

    /* renamed from: d */
    public final void mo68330d(@C12579k OfferBasketContainAlcoholModel offerBasketContainAlcoholModel) {
        Intrinsics.checkNotNullParameter(offerBasketContainAlcoholModel, C40045d.f102104u);
        this.f59069b.f90893b.setContent(C8553b.m31049c(145101970, true, new OfferBasketContainAlcoholViewHolder$bind$1(offerBasketContainAlcoholModel, this)));
    }

    @C12579k
    /* renamed from: e */
    public final C36703g4 mo68331e() {
        return this.f59069b;
    }
}
