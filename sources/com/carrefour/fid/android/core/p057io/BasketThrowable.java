package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketErrorType;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/BasketThrowable;", "", "Lcom/carrefour/fid/android/core/type/BasketErrorType;", "error", "Lcom/carrefour/fid/android/core/type/BasketErrorType;", "a", "()Lcom/carrefour/fid/android/core/type/BasketErrorType;", "<init>", "(Lcom/carrefour/fid/android/core/type/BasketErrorType;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.BasketThrowable */
public final class BasketThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89666a = 0;
    @C12579k
    private final BasketErrorType error;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketThrowable(@C12579k BasketErrorType basketErrorType) {
        super(basketErrorType.name());
        Intrinsics.checkNotNullParameter(basketErrorType, "error");
        this.error = basketErrorType;
    }

    @C12579k
    /* renamed from: a */
    public final BasketErrorType mo108318a() {
        return this.error;
    }
}
