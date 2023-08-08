package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import android.widget.ImageView;
import android.widget.TextView;
import com.carrefour.fid.android.product.databinding.C27494j;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.urbanairship.job.C9314l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.f */
public class C27789f extends C27791h {
    @C12579k

    /* renamed from: c */
    public final ProductDetailsFragment.C27747a f67371c;
    @C12579k

    /* renamed from: d */
    public final C27494j f67372d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27789f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment.C27747a r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.databinding.C27494j r4) {
        /*
            r2 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f67371c = r3
            r2.f67372d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27789f.<init>(com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$a, com.carrefour.fid.android.product.databinding.j):void");
    }

    /* renamed from: c */
    public void mo80735c(@C12579k ProductDetailsComponent productDetailsComponent) {
        Intrinsics.checkNotNullParameter(productDetailsComponent, C9314l.f25417c);
        TextView textView = this.f67372d.f66698c;
        textView.setText(textView.getContext().getString(productDetailsComponent.mo80678e().mo80551q()));
        ImageView imageView = this.f67372d.f66697b;
        Intrinsics.checkNotNullExpressionValue(imageView, "bind$lambda$1");
        ViewKt.m118982G(imageView, !productDetailsComponent.mo83380b(), 0, 2, (Object) null);
        if (productDetailsComponent.mo83380b()) {
            this.f67371c.mo80594a(getBindingAdapterPosition());
        }
    }

    @C12579k
    /* renamed from: d */
    public final C27494j mo80736d() {
        return this.f67372d;
    }
}
