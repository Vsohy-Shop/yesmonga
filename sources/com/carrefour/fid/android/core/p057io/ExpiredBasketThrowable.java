package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/ExpiredBasketThrowable;", "", "cause", "(Ljava/lang/Throwable;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.ExpiredBasketThrowable */
public final class ExpiredBasketThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89684a = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpiredBasketThrowable(@C12579k Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "cause");
    }
}
