package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/ResponseThrowable;", "", "", "code", "I", "a", "()I", "", "message", "<init>", "(ILjava/lang/String;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.ResponseThrowable */
public class ResponseThrowable extends Throwable {

    /* renamed from: a */
    public static final int f70559a = 0;
    private final int code;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResponseThrowable(int i, @C12579k String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "message");
        this.code = i;
    }

    /* renamed from: a */
    public final int mo83810a() {
        return this.code;
    }
}
