package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/CriteoResponseThrowable;", "", "", "", "errors", "Ljava/util/List;", "a", "()Ljava/util/List;", "status", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.CriteoResponseThrowable */
public final class CriteoResponseThrowable extends Throwable {

    /* renamed from: a */
    public static final int f70474a = 8;
    @C12580l
    private final List<String> errors;

    public CriteoResponseThrowable(@C12580l List<String> list, @C12580l String str) {
        super(str);
        this.errors = list;
    }

    @C12580l
    /* renamed from: a */
    public final List<String> mo83795a() {
        return this.errors;
    }
}
