package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import com.carrefour.fid.android.catalogs.databinding.C39429t;
import com.carrefour.fid.android.catalogs.domain.utils.StoreUtils;
import com.carrefour.fid.android.catalogs.presentation.models.C39456i;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.components.widgets.FavoriteStoreComponent;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.google.android.datatransport.cct.C40045d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.g */
public final class C39479g extends C39475c {
    @C12579k

    /* renamed from: a */
    public final C39429t f100984a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39479g(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39429t r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f100984a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.C39479g.<init>(com.carrefour.fid.android.catalogs.databinding.t):void");
    }

    /* renamed from: c */
    public final void mo130604c(@C12579k C39456i iVar) {
        C37396r1 r1Var;
        Intrinsics.checkNotNullParameter(iVar, C40045d.f102104u);
        FavoriteStoreComponent favoriteStoreComponent = this.f100984a.f100901b;
        C38163l a = iVar.mo130555a();
        if (a != null) {
            String E = a.mo119361E();
            StoreUtils storeUtils = StoreUtils.INSTANCE;
            r1Var = new C37396r1(E, storeUtils.isStoreOpen(a), storeUtils.getTimeRange(a));
        } else {
            r1Var = null;
        }
        favoriteStoreComponent.mo112878v(r1Var);
    }

    @C12579k
    /* renamed from: d */
    public final C39429t mo130605d() {
        return this.f100984a;
    }
}
