package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.product.databinding.C27496k;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.d */
public final class C27786d extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f67366b = 8;
    @C12579k

    /* renamed from: a */
    public final C27496k f67367a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27786d(@C12579k C27496k kVar) {
        super(kVar.getRoot());
        Intrinsics.checkNotNullParameter(kVar, "binding");
        this.f67367a = kVar;
    }

    /* renamed from: c */
    public final void mo80732c(@C12579k OfferFlag offerFlag) {
        Intrinsics.checkNotNullParameter(offerFlag, "offerFlag");
        int y = offerFlag.mo118128y();
        TextView textView = this.f67367a.f66707c;
        textView.setVisibility(0);
        textView.setText(textView.getContext().getString(y));
        int q = offerFlag.mo118125q();
        TextView textView2 = this.f67367a.f66706b;
        textView2.setVisibility(0);
        String string = textView2.getContext().getString(q);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(descriptionId)");
        textView2.setText(StringKt.m118913V(string));
    }

    @C12579k
    /* renamed from: d */
    public final C27496k mo80733d() {
        return this.f67367a;
    }
}
