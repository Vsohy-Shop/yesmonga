package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import androidx.core.view.C18378u;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.domain.models.criteo.C38003e;
import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27503p;
import com.carrefour.fid.android.product.presentation.mapper.C27642b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.models.listable.C27680a;
import com.carrefour.fid.android.product.presentation.models.listable.C27682b;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import com.carrefour.fid.android.shared.constant.C28607x;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.ImageUtils;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpButterflyViewHolder */
public final class CriteoPlpButterflyViewHolder extends C28074i {
    @C12579k

    /* renamed from: e */
    public static final C28061a f67973e = new C28061a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f67974f = 7;
    @C12579k

    /* renamed from: a */
    public final C27503p f67975a;
    @C12579k

    /* renamed from: b */
    public final C27686f f67976b;
    @C12580l

    /* renamed from: c */
    public final C27680a f67977c;
    @C12579k

    /* renamed from: d */
    public final C11304p<C38005g, Integer, C11079d2> f67978d;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpButterflyViewHolder$a */
    public static final class C28061a {
        public /* synthetic */ C28061a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28061a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CriteoPlpButterflyViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27503p r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.models.listable.C27686f r4, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.product.presentation.models.listable.C27680a r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super com.carrefour.fid.android.domain.models.criteo.C38005g, ? super java.lang.Integer, kotlin.C11079d2> r6) {
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
            r2.f67975a = r3
            r2.f67976b = r4
            r2.f67977c = r5
            r2.f67978d = r6
            androidx.recyclerview.widget.RecyclerView r3 = r3.f66732e
            com.carrefour.fid.android.design.components.divider.b r4 = new com.carrefour.fid.android.design.components.divider.b
            android.view.View r5 = r2.itemView
            android.content.res.Resources r5 = r5.getResources()
            int r6 = com.carrefour.fid.android.product.C27609f.C27616g.ds_spacing_xs
            int r5 = r5.getDimensionPixelSize(r6)
            r6 = 0
            r0 = 2
            r4.<init>(r0, r5, r6)
            r3.mo59589n(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.list.other.CriteoPlpButterflyViewHolder.<init>(com.carrefour.fid.android.product.databinding.p, com.carrefour.fid.android.product.presentation.models.listable.f, com.carrefour.fid.android.product.presentation.models.listable.a, kotlin.jvm.functions.p):void");
    }

    /* renamed from: f */
    public static final void m117565f(CriteoPlpButterflyViewHolder criteoPlpButterflyViewHolder, C38003e eVar, View view) {
        Intrinsics.checkNotNullParameter(criteoPlpButterflyViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(eVar, "$butterfly");
        C27680a aVar = criteoPlpButterflyViewHolder.f67977c;
        if (aVar != null) {
            aVar.mo80418b(eVar.mo117450s(), eVar.mo117448q(), eVar.mo117449r());
        }
    }

    /* renamed from: e */
    public final void mo81622e(@C12579k C37369a aVar, int i) {
        C27686f.C27688b bVar;
        String str;
        Intrinsics.checkNotNullParameter(aVar, "listable");
        if (aVar instanceof C27682b) {
            C27682b bVar2 = (C27682b) aVar;
            C38003e e = bVar2.mo80422e();
            if (e.mo117432a().size() > bVar2.mo80424f()) {
                if (i == C28607x.m118508a()[0] - 1) {
                    C27680a aVar2 = this.f67977c;
                    if (aVar2 != null) {
                        aVar2.mo80417a(e.mo117434c());
                    }
                    C27680a aVar3 = this.f67977c;
                    if (aVar3 != null) {
                        C38012n nVar = (C38012n) CollectionsKt___CollectionsKt.m40479B2(e.mo117432a());
                        if (nVar != null) {
                            str = nVar.mo117557m();
                        } else {
                            str = null;
                        }
                        aVar3.mo80417a(str);
                    }
                }
                C27686f fVar = this.f67976b;
                Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.models.listable.PlpProductCardCallbacks.BaseCallbacks");
                C27686f.C27687a aVar4 = (C27686f.C27687a) fVar;
                C27686f fVar2 = this.f67976b;
                if (fVar2 instanceof C27686f.C27688b) {
                    bVar = (C27686f.C27688b) fVar2;
                } else {
                    bVar = null;
                }
                this.f67975a.getRoot().setLayoutTransition((LayoutTransition) null);
                this.f67975a.f66731d.setLayoutTransition((LayoutTransition) null);
                this.f67975a.f66730c.setOnClickListener(new C28066c(this, e));
                CriteoFormatRendering s = e.mo117450s();
                if (s != null) {
                    List<String> p = e.mo117447p();
                    CriteoFormatRendering s2 = e.mo117450s();
                    Intrinsics.checkNotNull(s2, "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering");
                    mo81624h(s, new C28064b(p, s2, bVar2.mo80424f(), new CriteoPlpButterflyViewHolder$bind$2$butterflyAdapter$1(this, e)), e.mo117432a().size());
                }
                C38114b bVar3 = (C38114b) CollectionsKt___CollectionsKt.m40559R2(e.mo117435d(), bVar2.mo80424f());
                if (bVar3 != null) {
                    mo81623g(bVar3, i, aVar4, bVar);
                    return;
                }
                return;
            }
            return;
        }
        C28935i.m119705e(C28935i.f70940a, "listable is of type " + C11342l0.m43547d(aVar.getClass()).mo22848s() + " instead of ListableCriteoPlpButterfly", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: g */
    public final void mo81623g(C38114b bVar, int i, C27686f.C27687a aVar, C27686f.C27688b bVar2) {
        C38114b bVar3 = bVar;
        int i2 = i;
        C27686f.C27687a aVar2 = aVar;
        C27686f.C27688b bVar4 = bVar2;
        ProductCardSComponent productCardSComponent = this.f67975a.f66731d;
        C27670g.C27676f fVar = new C27670g.C27676f(bVar3, false);
        Resources resources = this.f67975a.getRoot().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "binding.root.resources");
        productCardSComponent.mo113691E(C27642b.m116299b(fVar, resources, new CriteoPlpButterflyViewHolder$bindItemData$1(aVar2, bVar3, i2), new CriteoPlpButterflyViewHolder$bindItemData$2(aVar2, bVar3, i2), new CriteoPlpButterflyViewHolder$bindItemData$3(aVar2, bVar3, i2), new CriteoPlpButterflyViewHolder$bindItemData$4(aVar2, bVar3, i2), new CriteoPlpButterflyViewHolder$bindItemData$5(bVar4, bVar3), new CriteoPlpButterflyViewHolder$bindItemData$6(bVar4, bVar3), new CriteoPlpButterflyViewHolder$bindItemData$7(bVar4, bVar3), false, false, false, (C11289a) null, C18378u.f47062a, (Object) null));
    }

    /* renamed from: h */
    public final void mo81624h(CriteoFormatRendering criteoFormatRendering, C28064b bVar, int i) {
        Integer m = criteoFormatRendering.mo117350m();
        if (m != null) {
            this.f67975a.f66729b.setBackgroundColor(m.intValue());
        }
        String r = criteoFormatRendering.mo117355r();
        if (r != null) {
            ImageUtils imageUtils = ImageUtils.f70796a;
            ImageView imageView = this.f67975a.f66730c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageButterflyLogo");
            imageUtils.mo84106j(r, imageView, C27609f.C27617h.ic_logo_carrefour);
        }
        String n = criteoFormatRendering.mo117351n();
        if (n != null) {
            ImageUtils imageUtils2 = ImageUtils.f70796a;
            ImageView imageView2 = this.f67975a.f66729b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.imageButterflyBackground");
            imageUtils2.mo84099c(n, imageView2);
        }
        Integer o = criteoFormatRendering.mo117352o();
        if (o != null) {
            this.itemView.getBackground().setColorFilter(C17584h.m80560a(o.intValue(), BlendModeCompat.SRC_ATOP));
        }
        RecyclerView recyclerView = this.f67975a.f66732e;
        if (i > 1) {
            recyclerView.setVisibility(0);
            recyclerView.setAdapter(bVar);
            return;
        }
        recyclerView.setVisibility(8);
    }
}
