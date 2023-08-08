package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import android.view.View;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.engine.C22234h;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.product.databinding.C27502o;
import com.carrefour.fid.android.product.presentation.models.listable.C27684d;
import com.carrefour.fid.android.shared.util.C28935i;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.h */
public final class C28072h extends C28074i {
    @C12579k

    /* renamed from: c */
    public static final C28073a f68010c = new C28073a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f68011d = 5;
    @C12579k

    /* renamed from: a */
    public final C27502o f68012a;
    @C12579k

    /* renamed from: b */
    public final C11300l<C27684d, C11079d2> f68013b;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.h$a */
    public static final class C28073a {
        public /* synthetic */ C28073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28073a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28072h(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27502o r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.models.listable.C27684d, kotlin.C11079d2> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.widget.ImageView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f68012a = r3
            r2.f68013b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.list.other.C28072h.<init>(com.carrefour.fid.android.product.databinding.o, kotlin.jvm.functions.l):void");
    }

    /* renamed from: e */
    public static final void m117604e(C37369a aVar, C28072h hVar, View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$banner");
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        if (((C27684d) aVar).mo80448j().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hVar.f68013b.invoke(aVar);
        }
    }

    /* renamed from: d */
    public final void mo81651d(@C12579k C37369a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "banner");
        if (aVar instanceof C27684d) {
            ((C22090i) C22038b.m100350E(this.itemView.getContext()).mo65605u(((C27684d) aVar).mo80445h()).mo66732A(C22234h.f57123a)).mo65675K1(this.f68012a.f66727b);
            this.f68012a.f66727b.setOnClickListener(new C28071g(aVar, this));
            return;
        }
        C28935i iVar = C28935i.f70940a;
        String s = C11342l0.m43547d(aVar.getClass()).mo22848s();
        C28935i.m119705e(iVar, "banner is of type " + s + " instead of ListableLuckyCartBanner", (Throwable) null, 0, 6, (Object) null);
    }
}
