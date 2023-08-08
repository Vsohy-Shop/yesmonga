package com.carrefour.fid.android.presentation.p035ui.home.shop.adapter;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36309h;
import com.carrefour.fid.android.databinding.C36755l6;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.util.ImageUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.adapter.b */
public final class C24204b extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f60532b = 8;
    @C12579k

    /* renamed from: a */
    public final C36755l6 f60533a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24204b(@C12579k C36755l6 l6Var) {
        super(l6Var.getRoot());
        Intrinsics.checkNotNullParameter(l6Var, "binding");
        this.f60533a = l6Var;
    }

    /* renamed from: c */
    public final void mo70825c(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        ImageUtils imageUtils = ImageUtils.f70796a;
        Context context = this.f60533a.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
        String d = C36309h.m148964d(offerProductModel, (String) null, 1, (Object) null);
        ImageView imageView = this.f60533a.f91220b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.productImage");
        imageUtils.mo84101e(context, d, imageView, R.drawable.ic_product_placeholder);
    }

    @C12579k
    /* renamed from: d */
    public final C36755l6 mo70826d() {
        return this.f60533a;
    }
}
