package com.carrefour.fid.android.presentation.components.home;

import android.view.View;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.presentation.components.home.c */
public final /* synthetic */ class C38372c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LuckyCartBannerModel f97169a;

    /* renamed from: b */
    public final /* synthetic */ C11289a f97170b;

    public /* synthetic */ C38372c(LuckyCartBannerModel luckyCartBannerModel, C11289a aVar) {
        this.f97169a = luckyCartBannerModel;
        this.f97170b = aVar;
    }

    public final void onClick(View view) {
        LuckyCartBannerView.m158873x(this.f97169a, this.f97170b, view);
    }
}
