package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.View;
import android.widget.ImageButton;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "a", "()Landroid/widget/ImageButton;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferProductViewHolder$buttonPurchase$2 */
public final class OfferProductViewHolder$buttonPurchase$2 extends Lambda implements C11289a<ImageButton> {
    final /* synthetic */ View $itemView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferProductViewHolder$buttonPurchase$2(View view) {
        super(0);
        this.$itemView = view;
    }

    /* renamed from: a */
    public final ImageButton invoke() {
        return (ImageButton) this.$itemView.findViewById(R.id.button_offer_product_purchase);
    }
}
