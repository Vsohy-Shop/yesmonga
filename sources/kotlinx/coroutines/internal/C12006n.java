package kotlinx.coroutines.internal;

import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.n */
public final class C12006n {

    /* renamed from: a */
    public static final boolean f29611a;

    static {
        Object obj;
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        f29611a = Result.m38710j(obj);
    }

    /* renamed from: a */
    public static final boolean m47897a() {
        return f29611a;
    }
}
