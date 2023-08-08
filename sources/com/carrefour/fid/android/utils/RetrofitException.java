package com.carrefour.fid.android.utils;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/utils/RetrofitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "I", "a", "()I", "Lokhttp3/ResponseBody;", "responseBody", "Lokhttp3/ResponseBody;", "b", "()Lokhttp3/ResponseBody;", "<init>", "(ILokhttp3/ResponseBody;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class RetrofitException extends Exception {

    /* renamed from: a */
    public static final int f58145a = 8;
    private final int code;
    @C12580l
    private final ResponseBody responseBody;

    public RetrofitException(int i, @C12580l ResponseBody responseBody2) {
        this.code = i;
        this.responseBody = responseBody2;
    }

    /* renamed from: a */
    public final int mo67069a() {
        return this.code;
    }

    @C12580l
    /* renamed from: b */
    public final ResponseBody mo67070b() {
        return this.responseBody;
    }
}
