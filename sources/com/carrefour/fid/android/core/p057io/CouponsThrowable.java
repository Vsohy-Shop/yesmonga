package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/CouponsThrowable;", "", "", "nbCoupons", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.CouponsThrowable */
public final class CouponsThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89682a = 0;
    @C12580l
    private final Integer nbCoupons;

    public CouponsThrowable(@C12580l Integer num, @C12580l String str) {
        super(str);
        this.nbCoupons = num;
    }

    @C12580l
    /* renamed from: a */
    public final Integer mo108363a() {
        return this.nbCoupons;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CouponsThrowable(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, str);
    }
}
