package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import com.carrefour.fid.android.catalogs.databinding.C39427r;
import com.carrefour.fid.android.catalogs.presentation.models.C39451d;
import com.carrefour.fid.android.design.components.widgets.C37422x;
import com.google.android.datatransport.cct.C40045d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.HubProductCatalogViewHolder */
public final class HubProductCatalogViewHolder extends C39475c {
    @C12579k

    /* renamed from: a */
    public final C39427r f100977a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HubProductCatalogViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39427r r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f100977a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.HubProductCatalogViewHolder.<init>(com.carrefour.fid.android.catalogs.databinding.r):void");
    }

    /* renamed from: c */
    public final void mo130588c(@C12579k C39451d dVar) {
        Intrinsics.checkNotNullParameter(dVar, C40045d.f102104u);
        this.f100977a.f100897b.mo112884L(C37422x.C37425c.f94046b);
        this.f100977a.f100897b.setOnClickListener(new HubProductCatalogViewHolder$bind$1(dVar));
    }

    @C12579k
    /* renamed from: d */
    public final C39427r mo130589d() {
        return this.f100977a;
    }
}
