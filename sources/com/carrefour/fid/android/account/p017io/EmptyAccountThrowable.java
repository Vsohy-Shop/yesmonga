package com.carrefour.fid.android.account.p017io;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/io/EmptyAccountThrowable;", "", "message", "", "(Ljava/lang/String;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.account.io.EmptyAccountThrowable */
public final class EmptyAccountThrowable extends Throwable {
    public EmptyAccountThrowable() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public EmptyAccountThrowable(@C12580l String str) {
        super(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmptyAccountThrowable(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
