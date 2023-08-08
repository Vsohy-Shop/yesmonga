package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.engine.C22234h;
import com.carrefour.fid.android.databinding.C36683e4;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.f */
public final class C25465f extends C25469h {
    @C12579k

    /* renamed from: d */
    public static final C25466a f62687d = new C25466a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f62688e = 8;

    /* renamed from: f */
    public static final int f62689f = 5;
    @C12579k

    /* renamed from: b */
    public final C36683e4 f62690b;
    @C12579k

    /* renamed from: c */
    public final OfferListAdapter.C25454a f62691c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.f$a */
    public static final class C25466a {
        public /* synthetic */ C25466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25466a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25465f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36683e4 r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter.C25454a r4) {
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
            r2.f62690b = r3
            r2.f62691c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25465f.<init>(com.carrefour.fid.android.databinding.e4, com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferListAdapter$a):void");
    }

    /* renamed from: e */
    public static final void m109931e(LuckyCartBannerModel luckyCartBannerModel, C25465f fVar, View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(luckyCartBannerModel, "$banner");
        Intrinsics.checkNotNullParameter(fVar, "this$0");
        if (luckyCartBannerModel.getQuery().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fVar.f62691c.mo68195i(luckyCartBannerModel);
        }
    }

    /* renamed from: d */
    public final void mo74235d(@C12579k LuckyCartBannerModel luckyCartBannerModel) {
        Intrinsics.checkNotNullParameter(luckyCartBannerModel, "banner");
        ((C22090i) C22038b.m100350E(this.itemView.getContext()).mo65605u(luckyCartBannerModel.getImageUrl()).mo66732A(C22234h.f57123a)).mo65675K1(this.f62690b.f90764b);
        this.f62690b.f90764b.setOnClickListener(new C25464e(luckyCartBannerModel, this));
    }

    @C12579k
    /* renamed from: f */
    public final C36683e4 mo74236f() {
        return this.f62690b;
    }

    @C12579k
    /* renamed from: g */
    public final OfferListAdapter.C25454a mo74237g() {
        return this.f62691c;
    }
}
