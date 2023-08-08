package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "a", "(Lcom/carrefour/fid/android/presentation/models/OfferProductModel;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OfferProductModelKt$getTagPriceList$1 extends Lambda implements C11300l<OfferProductModel, CharSequence> {

    /* renamed from: f */
    public static final OfferProductModelKt$getTagPriceList$1 f97590f = new OfferProductModelKt$getTagPriceList$1();

    public OfferProductModelKt$getTagPriceList$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        String n = OfferProductModelKt.m159592n(offerProductModel);
        if (n != null) {
            return n;
        }
        return "-";
    }
}
