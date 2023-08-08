package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import androidx.core.view.C18378u;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.domain.models.criteo.C38004f;
import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.databinding.C27504q;
import com.carrefour.fid.android.product.presentation.mapper.C27642b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.models.listable.C27680a;
import com.carrefour.fid.android.product.presentation.models.listable.C27683c;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.ImageUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCriteoPlpFlagshipViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoPlpFlagshipViewHolder.kt\ncom/carrefour/fid/android/product/presentation/ui/list/other/CriteoPlpFlagshipViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n262#2,2:167\n1549#3:169\n1620#3,3:170\n1#4:173\n*S KotlinDebug\n*F\n+ 1 CriteoPlpFlagshipViewHolder.kt\ncom/carrefour/fid/android/product/presentation/ui/list/other/CriteoPlpFlagshipViewHolder\n*L\n122#1:167,2\n127#1:169\n127#1:170,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpFlagshipViewHolder */
public final class CriteoPlpFlagshipViewHolder extends C28074i {
    @C12579k

    /* renamed from: i */
    public static final C28062a f67979i = new C28062a((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final int f67980j = 8;

    /* renamed from: k */
    public static final long f67981k = 5000;
    @C12579k

    /* renamed from: a */
    public final C27504q f67982a;
    @C12579k

    /* renamed from: b */
    public final C27686f f67983b;
    @C12580l

    /* renamed from: c */
    public final C27680a f67984c;
    @C12579k

    /* renamed from: d */
    public final C11304p<C38005g, Integer, C11079d2> f67985d;
    @C12579k

    /* renamed from: e */
    public final LifecycleCoroutineScope f67986e;
    @C12580l

    /* renamed from: f */
    public C37370b f67987f;
    @C12580l

    /* renamed from: g */
    public C38004f f67988g;
    @C12579k

    /* renamed from: h */
    public final C20227z f67989h = new C20227z();

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpFlagshipViewHolder$a */
    public static final class C28062a {
        public /* synthetic */ C28062a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28062a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CriteoPlpFlagshipViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27504q r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.models.listable.C27686f r4, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.product.presentation.models.listable.C27680a r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super com.carrefour.fid.android.domain.models.criteo.C38005g, ? super java.lang.Integer, kotlin.C11079d2> r6, @org.jetbrains.annotations.C12579k androidx.lifecycle.LifecycleCoroutineScope r7) {
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
            r2.f67982a = r3
            r2.f67983b = r4
            r2.f67984c = r5
            r2.f67985d = r6
            r2.f67986e = r7
            androidx.recyclerview.widget.z r3 = new androidx.recyclerview.widget.z
            r3.<init>()
            r2.f67989h = r3
            r2.mo81632j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.list.other.CriteoPlpFlagshipViewHolder.<init>(com.carrefour.fid.android.product.databinding.q, com.carrefour.fid.android.product.presentation.models.listable.f, com.carrefour.fid.android.product.presentation.models.listable.a, kotlin.jvm.functions.p, androidx.lifecycle.LifecycleCoroutineScope):void");
    }

    /* renamed from: g */
    public static final void m117576g(CriteoPlpFlagshipViewHolder criteoPlpFlagshipViewHolder, C38004f fVar, View view) {
        Intrinsics.checkNotNullParameter(criteoPlpFlagshipViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(fVar, "$flagship");
        C27680a aVar = criteoPlpFlagshipViewHolder.f67984c;
        if (aVar != null) {
            aVar.mo80418b(fVar.mo117464q(), fVar.mo117462o(), fVar.mo117463p());
        }
    }

    /* renamed from: f */
    public final void mo81629f(@C12579k C37369a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "listable");
        if (aVar instanceof C27683c) {
            C27683c cVar = (C27683c) aVar;
            this.f67988g = cVar.mo80432e();
            C38004f e = cVar.mo80432e();
            this.f67982a.f66734b.setOnClickListener(new C28067d(this, e));
            mo81631i(e.mo117464q());
            mo81630h(e.mo117435d(), i, cVar.mo80434f());
            return;
        }
        C28935i iVar = C28935i.f70940a;
        String s = C11342l0.m43547d(aVar.getClass()).mo22848s();
        C28935i.m119705e(iVar, "listable is of type " + s + " instead of ListableCriteoPlpFlagship", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: h */
    public final void mo81630h(List<C38114b> list, int i, int i2) {
        int i3;
        C27686f.C27688b bVar;
        int i4 = i;
        PageControlsComponent pageControlsComponent = this.f67982a.f66736d;
        Intrinsics.checkNotNullExpressionValue(pageControlsComponent, "binding.productListIndicator");
        boolean z = false;
        boolean z2 = true;
        if (list.size() <= 1) {
            z2 = false;
        }
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        pageControlsComponent.setVisibility(i3);
        C27686f fVar = this.f67983b;
        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.models.listable.PlpProductCardCallbacks.BaseCallbacks");
        C27686f.C27687a aVar = (C27686f.C27687a) fVar;
        C27686f fVar2 = this.f67983b;
        if (fVar2 instanceof C27686f.C27688b) {
            bVar = (C27686f.C27688b) fVar2;
        } else {
            bVar = null;
        }
        C37370b bVar2 = this.f67987f;
        if (bVar2 != null) {
            Iterable<C38114b> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38114b bVar3 : iterable) {
                C27670g.C27676f fVar3 = new C27670g.C27676f(bVar3, z);
                Resources resources = this.itemView.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "itemView.context.resources");
                arrayList.add(C27642b.m116299b(fVar3, resources, new CriteoPlpFlagshipViewHolder$bindProductList$1$1(aVar, bVar3, i4), new CriteoPlpFlagshipViewHolder$bindProductList$1$2(aVar, bVar3, i4), new CriteoPlpFlagshipViewHolder$bindProductList$1$3(aVar, bVar3, i4), new CriteoPlpFlagshipViewHolder$bindProductList$1$4(aVar, bVar3, i4), new CriteoPlpFlagshipViewHolder$bindProductList$1$5(bVar, bVar3), new CriteoPlpFlagshipViewHolder$bindProductList$1$6(bVar, bVar3), new CriteoPlpFlagshipViewHolder$bindProductList$1$7(bVar, bVar3), false, false, false, (C11289a) null, C18378u.f47062a, (Object) null));
                i4 = i;
                z = false;
            }
            bVar2.setList(arrayList);
        }
        this.f67982a.f66735c.mo59479G1(i2);
    }

    /* renamed from: i */
    public final void mo81631i(CriteoFormatRendering criteoFormatRendering) {
        if (criteoFormatRendering != null) {
            String n = criteoFormatRendering.mo117351n();
            if (n != null) {
                ImageUtils imageUtils = ImageUtils.f70796a;
                ImageView imageView = this.f67982a.f66734b;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageFlagshipBranding");
                imageUtils.mo84105i(n, imageView);
            }
            Integer o = criteoFormatRendering.mo117352o();
            if (o != null) {
                this.itemView.getBackground().setColorFilter(C17584h.m80560a(o.intValue(), BlendModeCompat.SRC_ATOP));
            }
        }
    }

    /* renamed from: j */
    public final void mo81632j() {
        Context context = this.itemView.getContext();
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        C37370b bVar = new C37370b(new C37353b(resources, theme, (C37390r) null, 4, (DefaultConstructorMarker) null));
        this.f67987f = bVar;
        RecyclerView recyclerView = this.f67982a.f66735c;
        recyclerView.setAdapter(bVar);
        PageControlsComponent pageControlsComponent = this.f67982a.f66736d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
        pageControlsComponent.mo113006u(recyclerView);
        this.f67989h.mo60274b(recyclerView);
        recyclerView.setFocusableInTouchMode(false);
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(RecyclerViewKt.m118875n(recyclerView), C11768d1.m46781c()), new CriteoPlpFlagshipViewHolder$initView$1$1(recyclerView, (C11045c<? super CriteoPlpFlagshipViewHolder$initView$1$1>) null)), this.f67986e);
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(RecyclerViewKt.m118880s(recyclerView, this.f67989h), C11768d1.m46781c()), new CriteoPlpFlagshipViewHolder$initView$1$2(this, (C11045c<? super CriteoPlpFlagshipViewHolder$initView$1$2>) null)), this.f67986e);
        RecyclerViewKt.m118866e(recyclerView, this.f67986e, 5000);
    }
}
