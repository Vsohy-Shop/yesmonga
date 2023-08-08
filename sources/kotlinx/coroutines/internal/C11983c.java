package kotlinx.coroutines.internal;

import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.internal.c */
public final class C11983c extends C11998j {
    @C12579k

    /* renamed from: a */
    public static final C11983c f29580a = new C11983c();
    @C12579k

    /* renamed from: b */
    public static final C11984a f29581b = new C11984a();

    /* renamed from: kotlinx.coroutines.internal.c$a */
    public static final class C11984a extends ClassValue<C11300l<? super Throwable, ? extends Throwable>> {
        @C12579k
        /* renamed from: b */
        public C11300l<Throwable, Throwable> mo24337a(@C12580l Class<?> cls) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return ExceptionsConstructorKt.m47725b(cls);
        }
    }

    @C12579k
    /* renamed from: a */
    public C11300l<Throwable, Throwable> mo24333a(@C12579k Class<? extends Throwable> cls) {
        return (C11300l) f29581b.get(cls);
    }
}
