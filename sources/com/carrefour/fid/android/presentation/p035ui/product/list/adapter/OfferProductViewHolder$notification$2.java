package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.View;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.notification.NotificationView;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/notification/NotificationView;", "kotlin.jvm.PlatformType", "a", "()Lcom/carrefour/fid/android/presentation/components/notification/NotificationView;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferProductViewHolder$notification$2 */
public final class OfferProductViewHolder$notification$2 extends Lambda implements C11289a<NotificationView> {
    final /* synthetic */ View $itemView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferProductViewHolder$notification$2(View view) {
        super(0);
        this.$itemView = view;
    }

    /* renamed from: a */
    public final NotificationView invoke() {
        return (NotificationView) this.$itemView.findViewById(R.id.notification_offer_product);
    }
}
