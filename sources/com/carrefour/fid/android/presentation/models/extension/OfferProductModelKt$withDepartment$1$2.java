package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "it", "", "a", "(Lcom/carrefour/fid/android/presentation/models/OfferProductModel;)Ljava/lang/Comparable;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OfferProductModelKt$withDepartment$1$2 extends Lambda implements C11300l<OfferProductModel, Comparable<?>> {

    /* renamed from: f */
    public static final OfferProductModelKt$withDepartment$1$2 f97593f = new OfferProductModelKt$withDepartment$1$2();

    public OfferProductModelKt$withDepartment$1$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final Comparable<?> invoke(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "it");
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            return o0.mo121898z();
        }
        return null;
    }
}
