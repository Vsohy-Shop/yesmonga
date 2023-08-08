package com.carrefour.fid.android.domain.exceptions;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/exceptions/AddPromoCodeThrowable;", "", "", "promoCode", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "errorCode", "a", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class AddPromoCodeThrowable extends Throwable {
    @C12579k
    private final String errorCode;
    @C12579k
    private final String promoCode;

    public AddPromoCodeThrowable(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        Intrinsics.checkNotNullParameter(str2, "errorCode");
        this.promoCode = str;
        this.errorCode = str2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo114262a() {
        return this.errorCode;
    }

    @C12579k
    /* renamed from: b */
    public final String mo114263b() {
        return this.promoCode;
    }
}
