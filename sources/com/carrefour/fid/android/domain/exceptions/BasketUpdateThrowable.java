package com.carrefour.fid.android.domain.exceptions;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/exceptions/BasketUpdateThrowable;", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketUpdateThrowable extends Throwable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketUpdateThrowable(@C12579k String str, @C12579k Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(th, "cause");
    }
}
