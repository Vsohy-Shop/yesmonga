package com.carrefour.fid.android.domain.exceptions;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/exceptions/BasketItemQuantityExceededThrowable;", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "gtin", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BasketItemQuantityExceededThrowable extends Throwable {
    @C12579k
    private final String gtin;

    public /* synthetic */ BasketItemQuantityExceededThrowable(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo114266a() {
        return this.gtin;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketItemQuantityExceededThrowable(String str) {
        super("Quantity limit exceeded for " + str);
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.gtin = str;
    }
}
