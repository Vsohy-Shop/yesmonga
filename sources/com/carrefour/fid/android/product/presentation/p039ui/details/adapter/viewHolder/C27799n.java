package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.databinding.C27500m;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27781j;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductTraceability;
import com.urbanairship.job.C9314l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.n */
public final class C27799n extends C27790g {
    @C12579k

    /* renamed from: d */
    public static final C27800a f67384d = new C27800a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f67385e = 3;
    @C12579k

    /* renamed from: c */
    public final C27500m f67386c;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.n$a */
    public static final class C27800a {
        public /* synthetic */ C27800a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27800a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27799n(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27500m r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f67386c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27799n.<init>(com.carrefour.fid.android.product.databinding.m):void");
    }

    /* renamed from: c */
    public void mo80728c(@C12579k ProductDetailsComponent productDetailsComponent, boolean z) {
        Intrinsics.checkNotNullParameter(productDetailsComponent, C9314l.f25417c);
        RecyclerView recyclerView = this.f67386c.f66723b;
        recyclerView.setVisibility(0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(productDetailsComponent.mo80676d());
        Intrinsics.checkNotNull(w2, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductTraceability");
        recyclerView.setAdapter(new C27781j(((ProductTraceability) w2).mo80686a()));
    }

    @C12579k
    /* renamed from: d */
    public final C27500m mo80748d() {
        return this.f67386c;
    }
}
