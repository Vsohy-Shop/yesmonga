package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12177y1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
@C11363r0({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.b */
public abstract class C11981b<T> extends C11993g0 {
    @C12579k

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f29577a = AtomicReferenceFieldUpdater.newUpdater(C11981b.class, Object.class, "_consensus");
    @C11394v
    @C12580l
    private volatile Object _consensus = C11978a.f29570a;

    @C12579k
    /* renamed from: a */
    public C11981b<?> mo24334a() {
        return this;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo24335b(@C12580l Object obj) {
        Object obj2 = f29577a.get(this);
        if (obj2 == C11978a.f29570a) {
            obj2 = mo24336d(mo23685e(obj));
        }
        mo24325c(obj, obj2);
        return obj2;
    }

    /* renamed from: c */
    public abstract void mo24325c(T t, @C12580l Object obj);

    /* renamed from: d */
    public final Object mo24336d(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29577a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C11978a.f29570a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C16563a.m75000a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    @C12580l
    /* renamed from: e */
    public abstract Object mo23685e(T t);
}
