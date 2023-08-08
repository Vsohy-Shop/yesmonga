package com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import com.carrefour.fid.android.databinding.C36663c4;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.adapter.a */
public final class C24120a extends RecyclerView.Adapter<HomeCmsOfferViewHolder> {

    /* renamed from: c */
    public static final int f60341c = 8;
    @C12579k

    /* renamed from: a */
    public final List<SlideOfferCellModel> f60342a;
    @C12579k

    /* renamed from: b */
    public final C11300l<SlideOfferCellModel, C11079d2> f60343b;

    public C24120a(@C12579k List<SlideOfferCellModel> list, @C12579k C11300l<? super SlideOfferCellModel, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(lVar, "itemClickListener");
        this.f60342a = list;
        this.f60343b = lVar;
    }

    public int getItemCount() {
        return this.f60342a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k HomeCmsOfferViewHolder homeCmsOfferViewHolder, int i) {
        Intrinsics.checkNotNullParameter(homeCmsOfferViewHolder, "holder");
        homeCmsOfferViewHolder.mo70497c(this.f60342a.get(i), this.f60343b);
    }

    @C12579k
    /* renamed from: l */
    public HomeCmsOfferViewHolder onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36663c4 d = C36663c4.m150383d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
        return new HomeCmsOfferViewHolder(d);
    }
}
