package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.carrefour.fid.android.databinding.C36723i4;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import com.carrefour.fid.android.presentation.models.CriteoBaseFormatModel;
import com.carrefour.fid.android.presentation.models.CriteoFlagshipModel;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/CriteoFlagshipViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n262#2,2:620\n1549#3:622\n1620#3,3:623\n1#4:626\n*S KotlinDebug\n*F\n+ 1 OfferListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/CriteoFlagshipViewHolder\n*L\n597#1:620,2\n602#1:622\n602#1:623,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder */
public final class CriteoFlagshipViewHolder extends C25469h {
    @C12579k

    /* renamed from: j */
    public static final C25453a f62625j = new C25453a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final int f62626k = 8;

    /* renamed from: l */
    public static final int f62627l = 6;

    /* renamed from: m */
    public static final long f62628m = 5000;
    @C12579k

    /* renamed from: b */
    public final C36723i4 f62629b;
    @C12579k

    /* renamed from: c */
    public final C24646a f62630c;
    @C12580l

    /* renamed from: d */
    public final C25412b f62631d;
    @C12579k

    /* renamed from: e */
    public final C11300l<CriteoBaseFormatModel, C11079d2> f62632e;
    @C12579k

    /* renamed from: f */
    public final LifecycleCoroutineScope f62633f;
    @C12580l

    /* renamed from: g */
    public C37370b f62634g;
    @C12580l

    /* renamed from: h */
    public CriteoFlagshipModel f62635h;
    @C12579k

    /* renamed from: i */
    public final C20227z f62636i = new C20227z();

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder$a */
    public static final class C25453a {
        public /* synthetic */ C25453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25453a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CriteoFlagshipViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36723i4 r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.models.C24646a r4, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.models.CriteoBaseFormatModel, kotlin.C11079d2> r6, @org.jetbrains.annotations.C12579k androidx.lifecycle.LifecycleCoroutineScope r7) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "productCardCallbacks"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onCriteoProductSelectedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "lifecycleScope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.widget.LinearLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f62629b = r3
            r2.f62630c = r4
            r2.f62631d = r5
            r2.f62632e = r6
            r2.f62633f = r7
            androidx.recyclerview.widget.z r3 = new androidx.recyclerview.widget.z
            r3.<init>()
            r2.f62636i = r3
            r2.mo74159i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.list.adapter.CriteoFlagshipViewHolder.<init>(com.carrefour.fid.android.databinding.i4, com.carrefour.fid.android.presentation.ui.models.a, com.carrefour.fid.android.presentation.ui.product.adapter.b, kotlin.jvm.functions.l, androidx.lifecycle.LifecycleCoroutineScope):void");
    }

    /* renamed from: g */
    public static final void m109823g(CriteoFlagshipViewHolder criteoFlagshipViewHolder, CriteoFlagshipModel criteoFlagshipModel, View view) {
        Intrinsics.checkNotNullParameter(criteoFlagshipViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(criteoFlagshipModel, "$flagship");
        C25412b bVar = criteoFlagshipViewHolder.f62631d;
        if (bVar != null) {
            bVar.mo68181b(criteoFlagshipModel.mo121466e(), criteoFlagshipModel.mo121462b(), criteoFlagshipModel.mo121463c());
        }
    }

    /* renamed from: f */
    public final void mo74157f(@C12579k CriteoFlagshipModel criteoFlagshipModel, int i) {
        Intrinsics.checkNotNullParameter(criteoFlagshipModel, "flagship");
        this.f62635h = criteoFlagshipModel;
        CriteoFormatRenderingDomain e = criteoFlagshipModel.mo121466e();
        if (e != null) {
            String b = e.mo115724b();
            if (b != null) {
                C22038b.m100351F(this.f62629b.f91014b).mo65605u(b).mo65675K1(this.f62629b.f91014b);
            }
            Integer c = e.mo115725c();
            if (c != null) {
                this.itemView.getBackground().setColorFilter(C17584h.m80560a(c.intValue(), BlendModeCompat.SRC_ATOP));
            }
        }
        this.f62629b.f91014b.setOnClickListener(new C25463d(this, criteoFlagshipModel));
        mo74158h(criteoFlagshipModel.mo121461a(), i);
    }

    /* renamed from: h */
    public final void mo74158h(List<CriteoProductModel> list, int i) {
        C24646a.C24648b bVar;
        int i2 = i;
        PageControlsComponent pageControlsComponent = this.f62629b.f91016d;
        Intrinsics.checkNotNullExpressionValue(pageControlsComponent, "binding.productListIndicator");
        int i3 = 0;
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        if (!z) {
            i3 = 8;
        }
        pageControlsComponent.setVisibility(i3);
        C24646a aVar = this.f62630c;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.models.ProductCardCallbacks.BaseCallbacks");
        C24646a.C24647a aVar2 = (C24646a.C24647a) aVar;
        C24646a aVar3 = this.f62630c;
        if (aVar3 instanceof C24646a.C24648b) {
            bVar = (C24646a.C24648b) aVar3;
        } else {
            bVar = null;
        }
        C37370b bVar2 = this.f62634g;
        if (bVar2 != null) {
            Iterable<CriteoProductModel> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (CriteoProductModel criteoProductModel : iterable) {
                Resources resources = this.itemView.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "itemView.context.resources");
                arrayList.add(C38510j.m159764b(criteoProductModel, resources, new CriteoFlagshipViewHolder$bindProductList$1$1(aVar2, criteoProductModel, i2), new CriteoFlagshipViewHolder$bindProductList$1$2(aVar2, criteoProductModel, i2), new CriteoFlagshipViewHolder$bindProductList$1$3(aVar2, criteoProductModel, i2), new CriteoFlagshipViewHolder$bindProductList$1$4(aVar2, criteoProductModel, i2), new CriteoFlagshipViewHolder$bindProductList$1$5(bVar, criteoProductModel), new CriteoFlagshipViewHolder$bindProductList$1$6(bVar, criteoProductModel), new CriteoFlagshipViewHolder$bindProductList$1$7(bVar, criteoProductModel), false, false, false, false, (C11289a) null, 7680, (Object) null));
            }
            bVar2.setList(arrayList);
        }
        CriteoFlagshipModel criteoFlagshipModel = this.f62635h;
        if (criteoFlagshipModel != null) {
            this.f62629b.f91015c.mo59479G1(Integer.valueOf(criteoFlagshipModel.mo121467f()).intValue());
        }
    }

    /* renamed from: i */
    public final void mo74159i() {
        Context context = this.itemView.getContext();
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        C37370b bVar = new C37370b(new C37353b(resources, theme, (C37390r) null, 4, (DefaultConstructorMarker) null));
        this.f62634g = bVar;
        RecyclerView recyclerView = this.f62629b.f91015c;
        recyclerView.setAdapter(bVar);
        PageControlsComponent pageControlsComponent = this.f62629b.f91016d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
        pageControlsComponent.mo113006u(recyclerView);
        this.f62636i.mo60274b(recyclerView);
        recyclerView.setFocusableInTouchMode(false);
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(RecyclerViewKt.m118875n(recyclerView), C11768d1.m46781c()), new CriteoFlagshipViewHolder$initView$1$1(recyclerView, (C11045c<? super CriteoFlagshipViewHolder$initView$1$1>) null)), this.f62633f);
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(RecyclerViewKt.m118880s(recyclerView, this.f62636i), C11768d1.m46781c()), new CriteoFlagshipViewHolder$initView$1$2(this, (C11045c<? super CriteoFlagshipViewHolder$initView$1$2>) null)), this.f62633f);
        RecyclerViewKt.m118866e(recyclerView, this.f62633f, 5000);
    }
}
