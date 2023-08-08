package com.carrefour.fid.android.domain.exceptions;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/exceptions/BasketFacilitySwitchThrowable;", "", "cause", "(Ljava/lang/Throwable;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketFacilitySwitchThrowable extends Throwable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketFacilitySwitchThrowable(@C12579k Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "cause");
    }
}
