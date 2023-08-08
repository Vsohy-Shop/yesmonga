package com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39414e;
import com.carrefour.fid.android.catalogs.databinding.C39415f;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.adapter.e */
public final class C39601e extends RecyclerView.Adapter<C39599c> {
    @C12579k

    /* renamed from: a */
    public List<Catalog> f101171a;
    @C12580l

    /* renamed from: b */
    public C11300l<? super Catalog, C11079d2> f101172b;

    public C39601e(@C12579k List<Catalog> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f101171a = list;
    }

    /* renamed from: p */
    public static final void m161952p(C39601e eVar, Catalog catalog, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(catalog, "$catalog");
        C11300l<? super Catalog, C11079d2> lVar = eVar.f101172b;
        if (lVar != null) {
            lVar.invoke(catalog);
        }
    }

    public int getItemCount() {
        if (this.f101171a.size() == 1) {
            return this.f101171a.size();
        }
        if (this.f101171a.isEmpty()) {
            return 0;
        }
        return this.f101171a.size() + 2;
    }

    public int getItemViewType(int i) {
        if (this.f101171a.size() == 1) {
            return 0;
        }
        if (i == 0 || i == getItemCount() - 1) {
            return 1;
        }
        return 0;
    }

    @C12579k
    /* renamed from: l */
    public final Catalog mo130818l(int i) {
        return this.f101171a.get(i - 1);
    }

    @C12580l
    /* renamed from: m */
    public final C11300l<Catalog, C11079d2> mo130819m() {
        return this.f101172b;
    }

    /* renamed from: n */
    public final void mo130820n(@C12579k List<Catalog> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f101171a = list;
        notifyDataSetChanged();
    }

    /* renamed from: o */
    public void onBindViewHolder(@C12579k C39599c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "holder");
        if (cVar instanceof C39598b) {
            if (i <= this.f101171a.size() && i > 0) {
                i--;
            }
            Catalog catalog = this.f101171a.get(i);
            ImageView imageView = ((C39598b) cVar).mo130816c().f100815b;
            imageView.setOnClickListener(new C39600d(this, catalog));
            C22038b.m100350E(imageView.getContext()).mo65605u(catalog.mo117069r()).mo65688b(new C22561h().mo66763S0(C39364b.C39372h.ic_placeholder_cata)).mo65675K1(imageView);
        }
    }

    @C12579k
    /* renamed from: q */
    public C39599c onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 1) {
            C39415f d = C39415f.m161551d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C39597a(d);
        }
        C39414e d2 = C39414e.m161547d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …rent, false\n            )");
        return new C39598b(d2);
    }

    /* renamed from: r */
    public final void mo130823r(@C12580l C11300l<? super Catalog, C11079d2> lVar) {
        this.f101172b = lVar;
    }
}
