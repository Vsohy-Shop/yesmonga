package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.carrefour.fid.android.databinding.C36713h4;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import com.carrefour.fid.android.presentation.models.CriteoBaseFormatModel;
import com.carrefour.fid.android.presentation.models.CriteoButterFlyModel;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/CriteoButterflyViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n1#2:620\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoButterflyViewHolder */
public final class CriteoButterflyViewHolder extends C25469h {
    @C12579k

    /* renamed from: f */
    public static final C25452a f62618f = new C25452a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f62619g = 8;

    /* renamed from: h */
    public static final int f62620h = 4;
    @C12579k

    /* renamed from: b */
    public final C36713h4 f62621b;
    @C12579k

    /* renamed from: c */
    public final C24646a f62622c;
    @C12580l

    /* renamed from: d */
    public final C25412b f62623d;
    @C12579k

    /* renamed from: e */
    public final C11300l<CriteoBaseFormatModel, C11079d2> f62624e;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoButterflyViewHolder$a */
    public static final class C25452a {
        public /* synthetic */ C25452a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25452a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CriteoButterflyViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36713h4 r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.models.C24646a r4, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.models.CriteoBaseFormatModel, kotlin.C11079d2> r6) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "productCardCallbacks"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onProductSelectedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.widget.LinearLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f62621b = r3
            r2.f62622c = r4
            r2.f62623d = r5
            r2.f62624e = r6
            androidx.recyclerview.widget.RecyclerView r3 = r3.f90961e
            com.carrefour.fid.android.design.components.divider.b r4 = new com.carrefour.fid.android.design.components.divider.b
            android.view.View r5 = r2.itemView
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165416(0x7f0700e8, float:1.7945048E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r6 = 0
            r0 = 2
            r4.<init>(r0, r5, r6)
            r3.mo59589n(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.list.adapter.CriteoButterflyViewHolder.<init>(com.carrefour.fid.android.databinding.h4, com.carrefour.fid.android.presentation.ui.models.a, com.carrefour.fid.android.presentation.ui.product.adapter.b, kotlin.jvm.functions.l):void");
    }

    /* renamed from: g */
    public static final void m109811g(CriteoButterflyViewHolder criteoButterflyViewHolder, CriteoButterFlyModel criteoButterFlyModel, View view) {
        Intrinsics.checkNotNullParameter(criteoButterflyViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(criteoButterFlyModel, "$butterfly");
        C25412b bVar = criteoButterflyViewHolder.f62623d;
        if (bVar != null) {
            bVar.mo68181b(criteoButterFlyModel.mo121466e(), criteoButterFlyModel.mo121462b(), criteoButterFlyModel.mo121463c());
        }
    }

    /* renamed from: f */
    public final void mo74149f(@C12579k CriteoButterFlyModel criteoButterFlyModel, int i) {
        C24646a.C24648b bVar;
        CriteoButterflyViewHolder$bind$5$1 criteoButterflyViewHolder$bind$5$1;
        CriteoButterflyViewHolder$bind$6$1 criteoButterflyViewHolder$bind$6$1;
        CriteoButterflyViewHolder$bind$7$1 criteoButterflyViewHolder$bind$7$1;
        CriteoButterFlyModel criteoButterFlyModel2 = criteoButterFlyModel;
        int i2 = i;
        Intrinsics.checkNotNullParameter(criteoButterFlyModel2, "butterfly");
        if (criteoButterFlyModel.mo121461a().size() > criteoButterFlyModel.mo121467f()) {
            CriteoProductModel criteoProductModel = criteoButterFlyModel.mo121461a().get(criteoButterFlyModel.mo121467f());
            C24646a aVar = this.f62622c;
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.models.ProductCardCallbacks.BaseCallbacks");
            C24646a.C24647a aVar2 = (C24646a.C24647a) aVar;
            C24646a aVar3 = this.f62622c;
            if (aVar3 instanceof C24646a.C24648b) {
                bVar = (C24646a.C24648b) aVar3;
            } else {
                bVar = null;
            }
            this.f62621b.getRoot().setLayoutTransition((LayoutTransition) null);
            this.f62621b.f90960d.setLayoutTransition((LayoutTransition) null);
            C36713h4 h4Var = this.f62621b;
            ProductCardSComponent productCardSComponent = h4Var.f90960d;
            Resources resources = h4Var.getRoot().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "binding.root.resources");
            CriteoButterflyViewHolder$bind$1 criteoButterflyViewHolder$bind$1 = new CriteoButterflyViewHolder$bind$1(aVar2, criteoProductModel, i2);
            CriteoButterflyViewHolder$bind$2 criteoButterflyViewHolder$bind$2 = new CriteoButterflyViewHolder$bind$2(aVar2, criteoProductModel, i2);
            CriteoButterflyViewHolder$bind$3 criteoButterflyViewHolder$bind$3 = new CriteoButterflyViewHolder$bind$3(aVar2, criteoProductModel, i2);
            CriteoButterflyViewHolder$bind$4 criteoButterflyViewHolder$bind$4 = new CriteoButterflyViewHolder$bind$4(aVar2, criteoProductModel, i2);
            if (bVar != null) {
                criteoButterflyViewHolder$bind$5$1 = new CriteoButterflyViewHolder$bind$5$1(bVar, criteoProductModel);
            } else {
                criteoButterflyViewHolder$bind$5$1 = null;
            }
            if (bVar != null) {
                criteoButterflyViewHolder$bind$6$1 = new CriteoButterflyViewHolder$bind$6$1(bVar, criteoProductModel);
            } else {
                criteoButterflyViewHolder$bind$6$1 = null;
            }
            if (bVar != null) {
                criteoButterflyViewHolder$bind$7$1 = new CriteoButterflyViewHolder$bind$7$1(bVar, criteoProductModel);
            } else {
                criteoButterflyViewHolder$bind$7$1 = null;
            }
            productCardSComponent.mo113691E(C38510j.m159764b(criteoProductModel, resources, criteoButterflyViewHolder$bind$1, criteoButterflyViewHolder$bind$2, criteoButterflyViewHolder$bind$3, criteoButterflyViewHolder$bind$4, criteoButterflyViewHolder$bind$5$1, criteoButterflyViewHolder$bind$6$1, criteoButterflyViewHolder$bind$7$1, false, false, false, false, (C11289a) null, 7680, (Object) null));
            CriteoFormatRenderingDomain e = criteoButterFlyModel.mo121466e();
            if (e != null) {
                Integer a = e.mo115723a();
                if (a != null) {
                    this.f62621b.f90958b.setBackgroundColor(a.intValue());
                }
                String f = e.mo115729f();
                if (f != null) {
                    C22038b.m100351F(this.f62621b.f90959c).mo65605u(f).mo65675K1(this.f62621b.f90959c);
                }
                String b = e.mo115724b();
                if (b != null) {
                    ((C22090i) C22038b.m100351F(this.f62621b.f90958b).mo65605u(b).mo66796k()).mo65675K1(this.f62621b.f90958b);
                }
                Integer c = e.mo115725c();
                if (c != null) {
                    this.itemView.getBackground().setColorFilter(C17584h.m80560a(c.intValue(), BlendModeCompat.SRC_ATOP));
                }
                RecyclerView recyclerView = this.f62621b.f90961e;
                if (criteoButterFlyModel.mo121461a().size() > 1) {
                    recyclerView.setVisibility(0);
                    recyclerView.setAdapter(new C25460b(criteoButterFlyModel.mo121477j(), e, criteoButterFlyModel.mo121467f(), new CriteoButterflyViewHolder$bind$8$5$1(criteoButterFlyModel, this, bVar, aVar2, i)));
                } else {
                    recyclerView.setVisibility(8);
                }
            }
            this.f62621b.f90959c.setOnClickListener(new C25462c(this, criteoButterFlyModel2));
        }
    }
}
