package kotlin.jvm.internal;

import java.util.Iterator;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.h */
public final class C11333h {
    @C12579k
    /* renamed from: a */
    public static final <T> Iterator<T> m43500a(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return new C11331g(tArr);
    }
}
