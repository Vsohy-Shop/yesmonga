package com.carrefour.fid.android.loyalty.core.p061io;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/io/PrimeFidThrowable;", "", "nbrPrimes", "", "message", "", "(ILjava/lang/String;)V", "getNbrPrimes", "()I", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.loyalty.core.io.PrimeFidThrowable */
public final class PrimeFidThrowable extends Throwable {
    private final int nbrPrimes;

    public PrimeFidThrowable(int i, @C12580l String str) {
        super(str);
        this.nbrPrimes = i;
    }

    public final int getNbrPrimes() {
        return this.nbrPrimes;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrimeFidThrowable(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }
}
