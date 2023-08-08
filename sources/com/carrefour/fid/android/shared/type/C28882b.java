package com.carrefour.fid.android.shared.type;

import com.carrefour.fid.android.shared.type.C28879a;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nEither.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Either.kt\ncom/carrefour/fid/android/shared/type/EitherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.type.b */
public final class C28882b {
    @C12579k
    /* renamed from: a */
    public static final <T> C28879a<T, Throwable> m119445a(@C12579k Object obj) {
        if (Result.m38709i(obj)) {
            Throwable e = Result.m38705e(obj);
            if (e != null) {
                return new C28879a.C28880a(e);
            }
            throw new IllegalStateException("Result is Failure, it must have an exception.".toString());
        } else if (Result.m38705e(obj) == null) {
            return new C28879a.C28881b(obj);
        } else {
            throw new IllegalStateException("Result is Success, it must have value, even nullable.".toString());
        }
    }
}
