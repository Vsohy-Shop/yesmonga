package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.C11532s0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.coroutines.debug.internal.c */
public final class C11787c {
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f29243a;
    @C12580l

    /* renamed from: b */
    public final C11066c f29244b;

    /* renamed from: c */
    public final long f29245c;
    @C12579k

    /* renamed from: d */
    public final List<StackTraceElement> f29246d;
    @C12579k

    /* renamed from: e */
    public final String f29247e;
    @C12580l

    /* renamed from: f */
    public final Thread f29248f;
    @C12580l

    /* renamed from: g */
    public final C11066c f29249g;
    @C12579k

    /* renamed from: h */
    public final List<StackTraceElement> f29250h;

    public C11787c(@C12579k DebugCoroutineInfoImpl debugCoroutineInfoImpl, @C12579k CoroutineContext coroutineContext) {
        this.f29243a = coroutineContext;
        this.f29244b = debugCoroutineInfoImpl.mo23986d();
        this.f29245c = debugCoroutineInfoImpl.f29215b;
        this.f29246d = debugCoroutineInfoImpl.mo23987e();
        this.f29247e = debugCoroutineInfoImpl.mo23989g();
        this.f29248f = debugCoroutineInfoImpl.lastObservedThread;
        this.f29249g = debugCoroutineInfoImpl.mo23988f();
        this.f29250h = debugCoroutineInfoImpl.mo23990h();
    }

    @C12579k
    /* renamed from: a */
    public final CoroutineContext mo24058a() {
        return this.f29243a;
    }

    @C12580l
    /* renamed from: b */
    public final C11066c mo24059b() {
        return this.f29244b;
    }

    @C12579k
    /* renamed from: c */
    public final List<StackTraceElement> mo24060c() {
        return this.f29246d;
    }

    @C12580l
    /* renamed from: d */
    public final C11066c mo24061d() {
        return this.f29249g;
    }

    @C12580l
    /* renamed from: e */
    public final Thread mo24062e() {
        return this.f29248f;
    }

    /* renamed from: f */
    public final long mo24063f() {
        return this.f29245c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo24064g() {
        return this.f29247e;
    }

    @C11314h(name = "lastObservedStackTrace")
    @C12579k
    /* renamed from: h */
    public final List<StackTraceElement> mo24065h() {
        return this.f29250h;
    }
}
