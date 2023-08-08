package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.product.NutritionalItem;
import com.carrefour.fid.android.product.databinding.C27490h;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27776f;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27780i;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductComposition;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.urbanairship.job.C9314l;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.j */
public final class C27793j extends C27790g {
    @C12579k

    /* renamed from: e */
    public static final C27794a f67374e = new C27794a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f67375f = 2;
    @C12579k

    /* renamed from: c */
    public final ProductDetailsFragment.C27747a f67376c;
    @C12579k

    /* renamed from: d */
    public final C27490h f67377d;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.j$a */
    public static final class C27794a {
        public /* synthetic */ C27794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27794a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27793j(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment.C27747a r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27490h r4) {
        /*
            r2 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.widget.LinearLayout r0 = r4.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f67376c = r3
            r2.f67377d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27793j.<init>(com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$a, com.carrefour.fid.android.product.databinding.h):void");
    }

    /* renamed from: i */
    public static final void m116750i(C27793j jVar, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        jVar.f67376c.mo80595b();
    }

    /* renamed from: c */
    public void mo80728c(@C12579k ProductDetailsComponent productDetailsComponent, boolean z) {
        Intrinsics.checkNotNullParameter(productDetailsComponent, C9314l.f25417c);
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(productDetailsComponent.mo80676d());
        Intrinsics.checkNotNull(w2, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductComposition");
        ProductComposition productComposition = (ProductComposition) w2;
        TextView textView = this.f67377d.f66684h;
        textView.setVisibility(0);
        textView.setText(textView.getContext().getString(productComposition.mo80660g().mo80623q()));
        TextView textView2 = this.f67377d.f66686j;
        textView2.setVisibility(0);
        textView2.setText(productComposition.mo80659f());
        mo80739f(productComposition);
        mo80740g(productComposition);
        mo80742j(productComposition);
        mo80741h(productComposition);
    }

    @C12579k
    /* renamed from: e */
    public final C27490h mo80738e() {
        return this.f67377d;
    }

    /* renamed from: f */
    public final void mo80739f(ProductComposition productComposition) {
        if (!C11622t.isBlank(productComposition.mo80653a())) {
            TextView textView = this.f67377d.f66681e;
            textView.setVisibility(0);
            textView.setText(textView.getContext().getString(productComposition.mo80654b().mo80623q()));
            TextView textView2 = this.f67377d.f66680d;
            textView2.setVisibility(0);
            textView2.setText(productComposition.mo80653a());
        }
    }

    /* renamed from: g */
    public final void mo80740g(ProductComposition productComposition) {
        if (!productComposition.mo80655c().isEmpty()) {
            TextView textView = this.f67377d.f66682f;
            textView.setVisibility(0);
            textView.setText(textView.getContext().getString(productComposition.mo80656d().mo80623q()));
            RecyclerView recyclerView = this.f67377d.f66678b;
            recyclerView.setVisibility(0);
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
            flexboxLayoutManager.setAlignItems(0);
            flexboxLayoutManager.setFlexDirection(0);
            flexboxLayoutManager.setJustifyContent(0);
            recyclerView.setLayoutManager(flexboxLayoutManager);
            recyclerView.setAdapter(new C27780i(productComposition.mo80655c()));
        }
    }

    /* renamed from: h */
    public final void mo80741h(ProductComposition productComposition) {
        if (productComposition.mo80658e() == null || !productComposition.mo80658e().mo80629d()) {
            this.f67377d.f66687k.getRoot().setVisibility(8);
            this.f67377d.f66683g.setVisibility(8);
            return;
        }
        this.f67377d.f66687k.getRoot().setVisibility(0);
        this.f67377d.f66683g.setVisibility(0);
        this.f67377d.f66687k.f66676f.setOnClickListener(new C27792i(this));
    }

    /* renamed from: j */
    public final void mo80742j(ProductComposition productComposition) {
        List<NutritionalItem> h = productComposition.mo80661h();
        if (h != null) {
            TextView textView = this.f67377d.f66685i;
            textView.setVisibility(0);
            textView.setText(textView.getContext().getString(productComposition.mo80662i().mo80623q()));
            RecyclerView recyclerView = this.f67377d.f66679c;
            recyclerView.setVisibility(0);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(new C27776f(h));
        }
    }
}
