package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39423n;
import com.carrefour.fid.android.catalogs.presentation.models.C39448a;
import com.carrefour.fid.android.design.components.widgets.C37431y;
import com.google.android.datatransport.cct.C40045d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.CatalogListViewHolder */
public final class CatalogListViewHolder extends C39475c {
    @C12579k

    /* renamed from: a */
    public final C39423n f100976a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CatalogListViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39423n r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f100976a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.CatalogListViewHolder.<init>(com.carrefour.fid.android.catalogs.databinding.n):void");
    }

    /* renamed from: c */
    public final void mo130585c(@C12579k C39448a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        this.f100976a.f100889c.setText(aVar.mo130538d());
        CatalogListAdapter catalogListAdapter = new CatalogListAdapter(aVar.mo130536b());
        catalogListAdapter.mo130584n(new CatalogListViewHolder$bind$1(aVar));
        this.f100976a.f100888b.setAdapter(catalogListAdapter);
        C39423n nVar = this.f100976a;
        nVar.f100888b.setLayoutManager(new LinearLayoutManager(nVar.getRoot().getContext(), 0, false));
        this.f100976a.f100888b.mo59589n(new C37431y((int) this.f100976a.getRoot().getContext().getResources().getDimension(C39364b.C39371g.ds_spacing_xs)));
    }

    @C12579k
    /* renamed from: d */
    public final C39423n mo130586d() {
        return this.f100976a;
    }
}
