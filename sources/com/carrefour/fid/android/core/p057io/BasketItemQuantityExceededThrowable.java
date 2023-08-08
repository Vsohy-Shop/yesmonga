package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/BasketItemQuantityExceededThrowable;", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "a", "()Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "<init>", "(Lcom/carrefour/fid/android/presentation/models/OfferProductModel;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.BasketItemQuantityExceededThrowable */
public final class BasketItemQuantityExceededThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89656a = 8;
    @C12579k
    private final OfferProductModel offer;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BasketItemQuantityExceededThrowable(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferProductModel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "offer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r4.mo121517o0()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.mo121889s()
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Quantity limit exceeded for "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            r3.offer = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.p057io.BasketItemQuantityExceededThrowable.<init>(com.carrefour.fid.android.presentation.models.OfferProductModel):void");
    }

    @C12579k
    /* renamed from: a */
    public final OfferProductModel mo108315a() {
        return this.offer;
    }
}
