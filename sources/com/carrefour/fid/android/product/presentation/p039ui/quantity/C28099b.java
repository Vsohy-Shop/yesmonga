package com.carrefour.fid.android.product.presentation.p039ui.quantity;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.C20157j;
import com.carrefour.fid.android.domain.models.offer.Offer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.quantity.b */
public final class C28099b extends C20157j.C20163f<Offer> {

    /* renamed from: a */
    public static final int f68063a = 0;

    /* renamed from: d */
    public boolean mo60477a(@C12579k Offer offer, @C12579k Offer offer2) {
        Intrinsics.checkNotNullParameter(offer, "oldItem");
        Intrinsics.checkNotNullParameter(offer2, "newItem");
        return Intrinsics.areEqual((Object) offer, (Object) offer2);
    }

    /* renamed from: e */
    public boolean mo60478b(@C12579k Offer offer, @C12579k Offer offer2) {
        Intrinsics.checkNotNullParameter(offer, "oldItem");
        Intrinsics.checkNotNullParameter(offer2, "newItem");
        return Intrinsics.areEqual((Object) offer.mo118001J(), (Object) offer2.mo118001J());
    }
}
