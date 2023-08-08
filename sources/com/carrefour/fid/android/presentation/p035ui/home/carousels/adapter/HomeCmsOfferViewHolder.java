package com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import com.carrefour.fid.android.databinding.C36663c4;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nHomeCmsOfferViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCmsOfferViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/home/carousels/adapter/HomeCmsOfferViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.adapter.HomeCmsOfferViewHolder */
public final class HomeCmsOfferViewHolder extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f60339b = 8;
    @C12579k

    /* renamed from: a */
    public final C36663c4 f60340a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeCmsOfferViewHolder(@C12579k C36663c4 c4Var) {
        super(c4Var.getRoot());
        Intrinsics.checkNotNullParameter(c4Var, "binding");
        this.f60340a = c4Var;
    }

    /* renamed from: c */
    public final void mo70497c(@C12579k SlideOfferCellModel slideOfferCellModel, @C12579k C11300l<? super SlideOfferCellModel, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(slideOfferCellModel, "item");
        Intrinsics.checkNotNullParameter(lVar, "itemClickListener");
        this.f60340a.f90647b.mo112861w(slideOfferCellModel.getUrlImage());
        String alt = slideOfferCellModel.getAlt();
        if (alt != null) {
            this.f60340a.f90647b.mo112860v(alt);
        }
        this.f60340a.f90647b.setOnClickListener(new HomeCmsOfferViewHolder$bind$2(lVar, slideOfferCellModel));
    }
}
