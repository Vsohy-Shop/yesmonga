package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.w2 */
public final class C12167w2 {

    @C11363r0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n*L\n1#1,18:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.w2$a */
    public static final class C12168a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f29945a;

        public C12168a(C11289a<C11079d2> aVar) {
            this.f29945a = aVar;
        }

        public final void run() {
            this.f29945a.invoke();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Runnable m48737a(@C12579k C11289a<C11079d2> aVar) {
        return new C12168a(aVar);
    }
}
