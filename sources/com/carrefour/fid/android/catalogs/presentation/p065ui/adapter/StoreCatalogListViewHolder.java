package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39423n;
import com.carrefour.fid.android.catalogs.presentation.models.C39455h;
import com.carrefour.fid.android.design.components.widgets.C37431y;
import com.google.android.datatransport.cct.C40045d;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCatalogListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogListViewHolder.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/adapter/StoreCatalogListViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,167:1\n262#2,2:168\n*S KotlinDebug\n*F\n+ 1 CatalogListViewHolder.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/adapter/StoreCatalogListViewHolder\n*L\n76#1:168,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.StoreCatalogListViewHolder */
public final class StoreCatalogListViewHolder extends C39475c {
    @C12579k

    /* renamed from: a */
    public final C39423n f100979a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoreCatalogListViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39423n r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f100979a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.StoreCatalogListViewHolder.<init>(com.carrefour.fid.android.catalogs.databinding.n):void");
    }

    /* renamed from: c */
    public final void mo130592c(@C12579k C39455h hVar) {
        Intrinsics.checkNotNullParameter(hVar, C40045d.f102104u);
        TextView textView = this.f100979a.f100889c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        textView.setVisibility(8);
        CatalogListAdapter catalogListAdapter = new CatalogListAdapter(hVar.mo130553a());
        catalogListAdapter.mo130584n(new StoreCatalogListViewHolder$bind$1(hVar));
        this.f100979a.f100888b.setItemAnimator((RecyclerView.C20069l) null);
        C39423n nVar = this.f100979a;
        nVar.f100888b.setLayoutManager(new GridLayoutManager(nVar.getRoot().getContext(), 2));
        this.f100979a.f100888b.mo59589n(new C37431y((int) this.f100979a.getRoot().getContext().getResources().getDimension(C39364b.C39371g.ds_spacing_xs)));
        this.f100979a.f100888b.setAdapter(catalogListAdapter);
    }

    @C12579k
    /* renamed from: d */
    public final C39423n mo130593d() {
        return this.f100979a;
    }
}
