package kotlin.concurrent;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ThreadsKt")
@C11363r0({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* renamed from: kotlin.concurrent.b */
public final class C11024b {

    /* renamed from: kotlin.concurrent.b$a */
    public static final class C11025a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f28233a;

        public C11025a(C11289a<C11079d2> aVar) {
            this.f28233a = aVar;
        }

        public void run() {
            this.f28233a.invoke();
        }
    }

    @C11110f
    /* renamed from: a */
    public static final <T> T m42517a(ThreadLocal<T> threadLocal, C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(threadLocal, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "default");
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T invoke = aVar.invoke();
        threadLocal.set(invoke);
        return invoke;
    }

    @C12579k
    /* renamed from: b */
    public static final Thread m42518b(boolean z, boolean z2, @C12580l ClassLoader classLoader, @C12580l String str, int i, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        C11025a aVar2 = new C11025a(aVar);
        if (z2) {
            aVar2.setDaemon(true);
        }
        if (i > 0) {
            aVar2.setPriority(i);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar2.start();
        }
        return aVar2;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m42519c(boolean z, boolean z2, ClassLoader classLoader, String str, int i, C11289a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return m42518b(z3, z4, classLoader2, str2, i, aVar);
    }
}
