package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.databinding.C39423n;
import com.carrefour.fid.android.catalogs.databinding.C39425p;
import com.carrefour.fid.android.catalogs.databinding.C39426q;
import com.carrefour.fid.android.catalogs.databinding.C39427r;
import com.carrefour.fid.android.catalogs.databinding.C39428s;
import com.carrefour.fid.android.catalogs.databinding.C39429t;
import com.carrefour.fid.android.catalogs.presentation.models.C39448a;
import com.carrefour.fid.android.catalogs.presentation.models.C39449b;
import com.carrefour.fid.android.catalogs.presentation.models.C39450c;
import com.carrefour.fid.android.catalogs.presentation.models.C39451d;
import com.carrefour.fid.android.catalogs.presentation.models.C39453f;
import com.carrefour.fid.android.catalogs.presentation.models.C39454g;
import com.carrefour.fid.android.catalogs.presentation.models.C39455h;
import com.carrefour.fid.android.catalogs.presentation.models.C39456i;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.b */
public final class C39474b extends RecyclerView.Adapter<C39475c> {
    @C12579k

    /* renamed from: a */
    public List<? extends C39449b> f100980a = CollectionsKt__CollectionsKt.m40441E();

    public int getItemCount() {
        return this.f100980a.size();
    }

    public int getItemViewType(int i) {
        return C11342l0.m43547d(this.f100980a.get(i).getClass()).hashCode();
    }

    @C12579k
    public final List<C39449b> getList() {
        return this.f100980a;
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C39475c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "holder");
        if (cVar instanceof C39479g) {
            Object obj = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.StoreSectionModel");
            ((C39479g) cVar).mo130604c((C39456i) obj);
        } else if (cVar instanceof CatalogListViewHolder) {
            Object obj2 = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.CatalogListSectionModel");
            ((CatalogListViewHolder) cVar).mo130585c((C39448a) obj2);
        } else if (cVar instanceof StoreCatalogListViewHolder) {
            Object obj3 = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.StoreCatalogListSectionModel");
            ((StoreCatalogListViewHolder) cVar).mo130592c((C39455h) obj3);
        } else if (cVar instanceof HubProductCatalogViewHolder) {
            Object obj4 = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.HubProductCatalogSectionModel");
            ((HubProductCatalogViewHolder) cVar).mo130588c((C39451d) obj4);
        } else if (cVar instanceof C39478f) {
            Object obj5 = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.SeeAllCatalogsSectionModel");
            ((C39478f) cVar).mo130602d((C39454g) obj5);
        } else if (cVar instanceof MessageComponentViewHolder) {
            Object obj6 = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.MessageSectionModel");
            ((MessageComponentViewHolder) cVar).mo130590c((C39453f) obj6);
        } else if (cVar instanceof C39476d) {
            Object obj7 = this.f100980a.get(i);
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.models.CriteoSectionModel");
            ((C39476d) cVar).mo130599c((C39450c) obj7);
        }
    }

    @C12579k
    /* renamed from: l */
    public C39475c onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == C11342l0.m43547d(C39456i.class).hashCode()) {
            C39429t d = C39429t.m161607d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
            return new C39479g(d);
        } else if (i == C11342l0.m43547d(C39448a.class).hashCode()) {
            C39423n d2 = C39423n.m161583d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …rent, false\n            )");
            return new CatalogListViewHolder(d2);
        } else if (i == C11342l0.m43547d(C39455h.class).hashCode()) {
            C39423n d3 = C39423n.m161583d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …rent, false\n            )");
            return new StoreCatalogListViewHolder(d3);
        } else if (i == C11342l0.m43547d(C39451d.class).hashCode()) {
            C39427r d4 = C39427r.m161599d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d4, "inflate(\n               …rent, false\n            )");
            return new HubProductCatalogViewHolder(d4);
        } else if (i == C11342l0.m43547d(C39454g.class).hashCode()) {
            C39428s d5 = C39428s.m161603d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d5, "inflate(\n               …rent, false\n            )");
            return new C39478f(d5);
        } else if (i == C11342l0.m43547d(C39453f.class).hashCode()) {
            C39426q d6 = C39426q.m161595d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d6, "inflate(\n               …rent, false\n            )");
            return new MessageComponentViewHolder(d6);
        } else if (i == C11342l0.m43547d(C39450c.class).hashCode()) {
            C39425p d7 = C39425p.m161591d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d7, "inflate(\n               …rent, false\n            )");
            return new C39476d(d7);
        } else {
            throw new IllegalStateException("Unknown view type: " + i);
        }
    }

    public final void setList(@C12579k List<? extends C39449b> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f100980a = list;
        notifyDataSetChanged();
    }
}
