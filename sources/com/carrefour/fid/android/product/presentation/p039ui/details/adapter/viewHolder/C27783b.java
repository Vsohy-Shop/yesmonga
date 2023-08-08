package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.databinding.C27498l;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27769a;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductAdvice;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import com.urbanairship.job.C9314l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.b */
public final class C27783b extends C27790g {
    @C12579k

    /* renamed from: d */
    public static final C27784a f67361d = new C27784a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f67362e = 5;
    @C12579k

    /* renamed from: c */
    public final C27498l f67363c;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.b$a */
    public static final class C27784a {
        public /* synthetic */ C27784a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27784a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27783b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27498l r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f67363c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27783b.<init>(com.carrefour.fid.android.product.databinding.l):void");
    }

    /* renamed from: c */
    public void mo80728c(@C12579k ProductDetailsComponent productDetailsComponent, boolean z) {
        Intrinsics.checkNotNullParameter(productDetailsComponent, C9314l.f25417c);
        RecyclerView recyclerView = this.f67363c.f66713b;
        recyclerView.setVisibility(0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(productDetailsComponent.mo80676d());
        Intrinsics.checkNotNull(w2, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductAdvice");
        recyclerView.setAdapter(new C27769a(((ProductAdvice) w2).mo80639a()));
    }

    @C12579k
    /* renamed from: d */
    public final C27498l mo80729d() {
        return this.f67363c;
    }
}
