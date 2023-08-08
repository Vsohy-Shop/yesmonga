package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/BasketMinAmountNotReachedThrowable;", "", "", "amount", "D", "a", "()D", "", "isDelivery", "Z", "b", "()Z", "<init>", "(DZ)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.BasketMinAmountNotReachedThrowable */
public final class BasketMinAmountNotReachedThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89659a = 0;
    private final double amount;
    private final boolean isDelivery;

    public BasketMinAmountNotReachedThrowable(double d, boolean z) {
        super("Min amount (" + d + ") still to be reached");
        this.amount = d;
        this.isDelivery = z;
    }

    /* renamed from: a */
    public final double mo108316a() {
        return this.amount;
    }

    /* renamed from: b */
    public final boolean mo108317b() {
        return this.isDelivery;
    }
}
