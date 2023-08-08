package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import android.widget.TextView;
import com.carrefour.fid.android.product.databinding.C27492i;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDescription;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import com.urbanairship.job.C9314l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.k */
public final class C27795k extends C27790g {
    @C12579k

    /* renamed from: d */
    public static final C27796a f67378d = new C27796a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f67379e = 1;
    @C12579k

    /* renamed from: c */
    public final C27492i f67380c;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.k$a */
    public static final class C27796a {
        public /* synthetic */ C27796a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27796a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27795k(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27492i r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.TextView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f67380c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27795k.<init>(com.carrefour.fid.android.product.databinding.i):void");
    }

    /* renamed from: c */
    public void mo80728c(@C12579k ProductDetailsComponent productDetailsComponent, boolean z) {
        Intrinsics.checkNotNullParameter(productDetailsComponent, C9314l.f25417c);
        TextView textView = this.f67380c.f66692b;
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(productDetailsComponent.mo80676d());
        Intrinsics.checkNotNull(w2, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductDescription");
        textView.setText(((ProductDescription) w2).mo80668a());
    }

    @C12579k
    /* renamed from: d */
    public final C27492i mo80743d() {
        return this.f67380c;
    }
}
