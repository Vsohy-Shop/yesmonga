package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26024a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p009io.github.aakira.napier.C10848c;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$basketCallback$1 */
public final class CheckoutStep1Fragment$basketCallback$1 implements CheckoutAdapter.C23327a {

    /* renamed from: a */
    public final /* synthetic */ CheckoutStep1Fragment f58998a;

    public CheckoutStep1Fragment$basketCallback$1(CheckoutStep1Fragment checkoutStep1Fragment) {
        this.f58998a = checkoutStep1Fragment;
    }

    /* renamed from: a */
    public void mo68187a() {
        CheckoutAdapter.C23327a.C23328a.m104125a(this);
    }

    /* renamed from: b */
    public void mo68188b(@C12579k OfferProductModel offerProductModel) {
        CheckoutAdapter.C23327a.C23328a.m104128d(this, offerProductModel);
    }

    /* renamed from: c */
    public void mo68189c(@C12579k OfferProductModel offerProductModel) {
        CheckoutAdapter.C23327a.C23328a.m104127c(this, offerProductModel);
    }

    /* renamed from: d */
    public void mo68190d(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "offerProduct");
        this.f58998a.mo68148J(offerProductModel, i + 1);
    }

    /* renamed from: e */
    public void mo68191e(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "offerProduct");
        this.f58998a.mo68150Y(offerProductModel, i + 1);
    }

    /* renamed from: f */
    public void mo68192f(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "offerProduct");
    }

    /* renamed from: g */
    public void mo68193g(boolean z) {
        RecyclerView recyclerView = CheckoutStep1Fragment.m103965Q0(this.f58998a).f91001h;
        CheckoutStep1Fragment checkoutStep1Fragment = this.f58998a;
        recyclerView.mo59479G1(0);
        checkoutStep1Fragment.mo68155c1().sendIntent(new C26024a.C26054e.C26062h(z));
        if (z) {
            this.f58998a.mo68153a1().mo75503u();
        }
    }

    /* renamed from: h */
    public void mo68194h(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "offerProduct");
        this.f58998a.mo68167o0(offerProductModel, i + 1);
    }

    /* renamed from: i */
    public void mo68195i(@C12579k LuckyCartBannerModel luckyCartBannerModel) {
        CheckoutAdapter.C23327a.C23328a.m104126b(this, luckyCartBannerModel);
    }

    /* renamed from: j */
    public void mo68196j(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "offerProduct");
        this.f58998a.mo68150Y(offerProductModel, i + 1);
    }

    /* renamed from: k */
    public void mo68197k() {
        CheckoutStep1Fragment checkoutStep1Fragment = this.f58998a;
        String string = checkoutStep1Fragment.getString(R.string.basket_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.basket_title)");
        String string2 = this.f58998a.getString(R.string.basket_toast_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.basket_toast_subtitle)");
        FragmentKt.m118838z(checkoutStep1Fragment, string, string2, this.f58998a.getString(R.string.general_cancel), CheckoutStep1Fragment$basketCallback$1$handleBasketClear$1.f58999f, this.f58998a.getString(R.string.ok_uppercase), false, new CheckoutStep1Fragment$basketCallback$1$handleBasketClear$2(this.f58998a), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: l */
    public void mo68198l(boolean z) {
        this.f58998a.mo68155c1().sendIntent(new C26024a.C26054e.C26058d(z));
        this.f58998a.mo68153a1().mo75505w(z);
    }
}
