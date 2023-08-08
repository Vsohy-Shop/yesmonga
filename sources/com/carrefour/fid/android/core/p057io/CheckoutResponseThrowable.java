package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/CheckoutResponseThrowable;", "", "", "", "subErrors", "Ljava/util/List;", "d", "()Ljava/util/List;", "event", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "errorCode", "a", "paymentMethod", "c", "message", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.CheckoutResponseThrowable */
public final class CheckoutResponseThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89681a = 8;
    @C12580l
    private final String errorCode;
    @C12580l
    private final String event;
    @C12580l
    private final String paymentMethod;
    @C12580l
    private final List<String> subErrors;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutResponseThrowable(@C12580l List<String> list, @C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "message");
        this.subErrors = list;
        this.event = str2;
        this.errorCode = str3;
        this.paymentMethod = str4;
    }

    @C12580l
    /* renamed from: a */
    public final String mo108359a() {
        return this.errorCode;
    }

    @C12580l
    /* renamed from: b */
    public final String mo108360b() {
        return this.event;
    }

    @C12580l
    /* renamed from: c */
    public final String mo108361c() {
        return this.paymentMethod;
    }

    @C12580l
    /* renamed from: d */
    public final List<String> mo108362d() {
        return this.subErrors;
    }
}
