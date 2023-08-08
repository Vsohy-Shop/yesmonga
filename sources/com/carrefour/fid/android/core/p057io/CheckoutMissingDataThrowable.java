package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/CheckoutMissingDataThrowable;", "", "", "messageResourceId", "I", "b", "()I", "", "errorType", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "cause", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable */
public final class CheckoutMissingDataThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89679a = 0;
    @C12579k
    private final String errorType;
    private final int messageResourceId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckoutMissingDataThrowable(@androidx.annotation.C0324b1 int r2, @org.jetbrains.annotations.C12579k java.lang.String r3, @org.jetbrains.annotations.C12580l java.lang.Throwable r4) {
        /*
            r1 = this;
            java.lang.String r0 = "errorType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L_0x000c
            java.lang.String r0 = r4.getMessage()
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r1.<init>(r0, r4)
            r1.messageResourceId = r2
            r1.errorType = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.p057io.CheckoutMissingDataThrowable.<init>(int, java.lang.String, java.lang.Throwable):void");
    }

    @C12579k
    /* renamed from: a */
    public final String mo108354a() {
        return this.errorType;
    }

    /* renamed from: b */
    public final int mo108355b() {
        return this.messageResourceId;
    }
}
