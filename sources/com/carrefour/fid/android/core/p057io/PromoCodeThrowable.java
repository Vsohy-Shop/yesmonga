package com.carrefour.fid.android.core.p057io;

import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/PromoCodeThrowable;", "", "", "promoCode", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "errorCode", "a", "", "messageResourceId", "I", "b", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.PromoCodeThrowable */
public final class PromoCodeThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89701a = 0;
    @C12579k
    private final String errorCode;
    private final int messageResourceId;
    @C12579k
    private final String promoCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeThrowable(@C12579k String str, @C12579k String str2, @C0324b1 int i) {
        super(str2);
        Intrinsics.checkNotNullParameter(str, "promoCode");
        Intrinsics.checkNotNullParameter(str2, "errorCode");
        this.promoCode = str;
        this.errorCode = str2;
        this.messageResourceId = i;
    }

    @C12579k
    /* renamed from: a */
    public final String mo108372a() {
        return this.errorCode;
    }

    /* renamed from: b */
    public final int mo108373b() {
        return this.messageResourceId;
    }

    @C12579k
    /* renamed from: c */
    public final String mo108374c() {
        return this.promoCode;
    }
}
