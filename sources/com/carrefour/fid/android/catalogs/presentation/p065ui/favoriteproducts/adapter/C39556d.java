package com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.databinding.C39410a;
import com.carrefour.fid.android.catalogs.databinding.C39413d;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.adapter.d */
public final class C39556d extends RecyclerView.Adapter<C39558e> {
    @C12579k

    /* renamed from: a */
    public final C39557a f101099a;
    @C12579k

    /* renamed from: b */
    public final List<C39452e> f101100b;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.adapter.d$a */
    public interface C39557a {
        /* renamed from: P */
        void mo130729P(@C12579k CatalogProduct catalogProduct);

        /* renamed from: m */
        void mo130735m(@C12579k CatalogProduct catalogProduct);

        /* renamed from: v */
        void mo130736v();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39556d(C39557a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: p */
    public static final void m161876p(C39556d dVar, View view) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        view.setEnabled(false);
        dVar.f101099a.mo130736v();
    }

    /* renamed from: q */
    public static final void m161877q(C39559f fVar, C39556d dVar, C39452e eVar, View view) {
        Intrinsics.checkNotNullParameter(fVar, "$this_apply");
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(eVar, "$catalogProduct");
        view.setEnabled(false);
        fVar.itemView.setEnabled(false);
        dVar.f101099a.mo130735m(eVar.mo130545e());
    }

    /* renamed from: r */
    public static final void m161878r(C39556d dVar, C39452e eVar, View view) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(eVar, "$catalogProduct");
        view.setEnabled(false);
        dVar.f101099a.mo130729P(eVar.mo130545e());
    }

    public int getItemCount() {
        return this.f101100b.size() + 1;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    /* renamed from: n */
    public final void mo130744n() {
        if (!this.f101100b.isEmpty()) {
            this.f101100b.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: o */
    public void onBindViewHolder(@C12579k C39558e eVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "holderFavoriteProduct");
        if (eVar instanceof C39561g) {
            View view = eVar.itemView;
            view.setEnabled(true);
            view.setOnClickListener(new C39553a(this));
        } else if (eVar instanceof C39559f) {
            C39559f fVar = (C39559f) eVar;
            C39452e eVar2 = this.f101100b.get(i - 1);
            fVar.mo130748c(eVar2);
            ImageButton imageButton = fVar.mo130749d().f100790b;
            imageButton.setEnabled(true);
            imageButton.setOnClickListener(new C39554b(fVar, this, eVar2));
            View view2 = fVar.itemView;
            view2.setEnabled(true);
            view2.setOnClickListener(new C39555c(this, eVar2));
        }
    }

    @C12579k
    /* renamed from: s */
    public C39558e onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 1) {
            C39413d d = C39413d.m161543d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               ….context), parent, false)");
            return new C39561g(d);
        } else if (i == 2) {
            C39410a d2 = C39410a.m161531d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …rent, false\n            )");
            return new C39559f(d2);
        } else {
            throw new Throwable("Unavailable viewType (" + i + ")");
        }
    }

    /* renamed from: t */
    public final void mo130747t(@C12579k List<C39452e> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<C39452e> list2 = this.f101100b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C39556d(@C12579k C39557a aVar, @C12579k List<C39452e> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f101099a = aVar;
        this.f101100b = list;
        setHasStableIds(true);
    }
}
