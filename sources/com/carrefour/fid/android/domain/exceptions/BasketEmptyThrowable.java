package com.carrefour.fid.android.domain.exceptions;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/exceptions/BasketEmptyThrowable;", "", "", "id", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BasketEmptyThrowable extends Throwable {
    @C12579k

    /* renamed from: id */
    private final String f94230id;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketEmptyThrowable(@C12579k String str) {
        super("The basket id " + str + " is empty");
        Intrinsics.checkNotNullParameter(str, "id");
        this.f94230id = str;
    }

    @C12579k
    /* renamed from: a */
    public final String mo114264a() {
        return this.f94230id;
    }
}
