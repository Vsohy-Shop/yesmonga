package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1Fragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.RecommendedProductsAdapter;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/adapter/RecommendedProductsAdapter;", "a", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/adapter/RecommendedProductsAdapter;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$mostRelevantProductsAdapter$2 */
public final class CheckoutStep1Fragment$mostRelevantProductsAdapter$2 extends Lambda implements C11289a<RecommendedProductsAdapter> {
    final /* synthetic */ CheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1Fragment$mostRelevantProductsAdapter$2(CheckoutStep1Fragment checkoutStep1Fragment) {
        super(0);
        this.this$0 = checkoutStep1Fragment;
    }

    @C12579k
    /* renamed from: a */
    public final RecommendedProductsAdapter invoke() {
        CheckoutStep1Fragment.C23272b R0 = this.this$0.f58985x;
        final CheckoutStep1Fragment checkoutStep1Fragment = this.this$0;
        C232851 r3 = new C11304p<OfferProductModel, Integer, C11079d2>() {
            /* renamed from: a */
            public final void mo68211a(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
                checkoutStep1Fragment.mo68158f1(offerProductModel, i + 1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo68211a((OfferProductModel) obj, ((Number) obj2).intValue());
                return C11079d2.f28267a;
            }
        };
        final CheckoutStep1Fragment checkoutStep1Fragment2 = this.this$0;
        C232862 r4 = new C11304p<OfferProductModel, Integer, C11079d2>() {
            /* renamed from: a */
            public final void mo68212a(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
                checkoutStep1Fragment2.mo68148J(offerProductModel, i + 1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo68212a((OfferProductModel) obj, ((Number) obj2).intValue());
                return C11079d2.f28267a;
            }
        };
        final CheckoutStep1Fragment checkoutStep1Fragment3 = this.this$0;
        return new RecommendedProductsAdapter((List) null, R0, r3, r4, new C11304p<OfferProductModel, Integer, C11079d2>() {
            /* renamed from: a */
            public final void mo68213a(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
                checkoutStep1Fragment3.mo68147D(offerProductModel, i + 1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo68213a((OfferProductModel) obj, ((Number) obj2).intValue());
                return C11079d2.f28267a;
            }
        }, 1, (DefaultConstructorMarker) null);
    }
}
