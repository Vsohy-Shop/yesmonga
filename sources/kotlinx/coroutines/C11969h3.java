package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kotlinx.coroutines.h3 */
public final /* synthetic */ class C11969h3 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f29547a;

    /* renamed from: b */
    public final /* synthetic */ String f29548b;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f29549c;

    public /* synthetic */ C11969h3(int i, String str, AtomicInteger atomicInteger) {
        this.f29547a = i;
        this.f29548b = str;
        this.f29549c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return C11975i3.m47723c(this.f29547a, this.f29548b, this.f29549c, runnable);
    }
}
