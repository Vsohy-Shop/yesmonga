package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.catalogs.CatalogComponent;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.CatalogListAdapter */
public final class CatalogListAdapter extends RecyclerView.Adapter<C39471a> {
    @C12579k

    /* renamed from: a */
    public final List<Catalog> f100973a;
    @C12580l

    /* renamed from: b */
    public C11300l<? super Catalog, C11079d2> f100974b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.CatalogListAdapter$a */
    public static final class C39471a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public static final int f100975a = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39471a(@C12579k View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }
    }

    public CatalogListAdapter(@C12579k List<Catalog> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f100973a = list;
    }

    public int getItemCount() {
        return this.f100973a.size();
    }

    @C12579k
    public final List<Catalog> getList() {
        return this.f100973a;
    }

    @C12580l
    /* renamed from: k */
    public final C11300l<Catalog, C11079d2> mo130581k() {
        return this.f100974b;
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C39471a aVar, int i) {
        CatalogComponent catalogComponent;
        Intrinsics.checkNotNullParameter(aVar, "holder");
        View view = aVar.itemView;
        if (view instanceof CatalogComponent) {
            catalogComponent = (CatalogComponent) view;
        } else {
            catalogComponent = null;
        }
        if (catalogComponent != null) {
            Context context = ((CatalogComponent) aVar.itemView).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "holder.itemView.context");
            catalogComponent.mo113299v(C39473a.m161718a(this.f100973a.get(i), context));
            catalogComponent.setOnCatalogDetailClickListener(new CatalogListAdapter$onBindViewHolder$1$1(this, i));
        }
    }

    @C12579k
    /* renamed from: m */
    public C39471a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        CatalogComponent catalogComponent = new CatalogComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        catalogComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new C39471a(catalogComponent);
    }

    /* renamed from: n */
    public final void mo130584n(@C12580l C11300l<? super Catalog, C11079d2> lVar) {
        this.f100974b = lVar;
    }
}
