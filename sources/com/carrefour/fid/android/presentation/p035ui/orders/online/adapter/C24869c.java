package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36813r4;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25236d;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.util.ImageUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.c */
public final class C24869c extends C24896v {
    @C12579k

    /* renamed from: c */
    public static final C24870a f61649c = new C24870a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61650d = 8;

    /* renamed from: e */
    public static final int f61651e = 4;
    @C12579k

    /* renamed from: b */
    public final C36813r4 f61652b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.c$a */
    public static final class C24870a {
        public /* synthetic */ C24870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24870a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24869c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36813r4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f61652b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24869c.<init>(com.carrefour.fid.android.databinding.r4):void");
    }

    /* renamed from: c */
    public final void mo72618c(@C12579k C25236d dVar) {
        int i;
        Intrinsics.checkNotNullParameter(dVar, "product");
        ImageUtils imageUtils = ImageUtils.f70796a;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        String c = dVar.mo73434c();
        ImageView imageView = this.f61652b.f91575b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageHolderOrderDetailsProduct");
        imageUtils.mo84101e(context, c, imageView, R.drawable.ic_product_placeholder);
        TextView textView = this.f61652b.f91581h;
        String name = dVar.getName();
        if (C11622t.isBlank(name)) {
            name = textView.getContext().getString(R.string.order_details_unavailable);
            Intrinsics.checkNotNullExpressionValue(name, "context.getString(R.stri…rder_details_unavailable)");
        }
        textView.setText(name);
        this.f61652b.f91580g.setText(dVar.mo73552e());
        C36813r4 r4Var = this.f61652b;
        r4Var.f91579f.setText(r4Var.f91577d.getResources().getQuantityString(R.plurals.order_missing_product_original_quantity, dVar.mo73555h(), new Object[]{Integer.valueOf(dVar.mo73555h())}));
        TextView textView2 = this.f61652b.f91577d;
        Resources resources = textView2.getResources();
        Integer f = dVar.mo73553f();
        if (f != null) {
            i = f.intValue();
        } else {
            i = 0;
        }
        textView2.setText(resources.getQuantityString(R.plurals.order_missing_product_prepared_quantity, i, new Object[]{dVar.mo73553f()}));
        TextView textView3 = this.f61652b.f91578e;
        Intrinsics.checkNotNullExpressionValue(textView3, "bind$lambda$2");
        TextViewKt.m118962m(textView3, Double.valueOf(dVar.mo73550b()));
        TextViewKt.m118965p(textView3);
        Integer f2 = dVar.mo73553f();
        if (f2 != null && f2.intValue() == 0) {
            this.f61652b.f91576c.setVisibility(8);
            return;
        }
        TextView textView4 = this.f61652b.f91576c;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.textHolderOrderDetailsNewProductAmount");
        TextViewKt.m118962m(textView4, Double.valueOf(dVar.mo73549a()));
        this.f61652b.f91576c.setVisibility(0);
    }

    @C12579k
    /* renamed from: d */
    public final C36813r4 mo72619d() {
        return this.f61652b;
    }
}
