package com.carrefour.fid.android.navigation;

import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "kotlin.jvm.PlatformType", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavActivity$onCreate$1$4 extends Lambda implements C11300l<Catalog, C11079d2> {
    final /* synthetic */ BottomNavActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavActivity$onCreate$1$4(BottomNavActivity bottomNavActivity) {
        super(1);
        this.this$0 = bottomNavActivity;
    }

    /* renamed from: a */
    public final void mo121173a(Catalog catalog) {
        BottomNavActivity bottomNavActivity = this.this$0;
        Intrinsics.checkNotNullExpressionValue(catalog, "it");
        bottomNavActivity.mo121114Q1(catalog);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo121173a((Catalog) obj);
        return C11079d2.f28267a;
    }
}
