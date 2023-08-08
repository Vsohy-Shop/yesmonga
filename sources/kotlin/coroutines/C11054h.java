package kotlin.coroutines;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
@C11532s0
/* renamed from: kotlin.coroutines.h */
public final class C11054h<T> implements C11045c<T>, C11066c {
    @C12579k

    /* renamed from: b */
    public static final C11055a f28251b = new C11055a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater<C11054h<?>, Object> f28252c = AtomicReferenceFieldUpdater.newUpdater(C11054h.class, Object.class, "result");
    @C12579k

    /* renamed from: a */
    public final C11045c<T> f28253a;
    @C12580l
    private volatile Object result;

    /* renamed from: kotlin.coroutines.h$a */
    public static final class C11055a {
        public /* synthetic */ C11055a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m42603a() {
        }

        public C11055a() {
        }
    }

    public C11054h(@C12579k C11045c<? super T> cVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "delegate");
        this.f28253a = cVar;
        this.result = obj;
    }

    @C12580l
    @C11532s0
    /* renamed from: a */
    public final Object mo22492a() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (C16563a.m75000a(f28252c, this, coroutineSingletons, C11063b.m42612h())) {
                return C11063b.m42612h();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return C11063b.m42612h();
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    @C12580l
    public C11066c getCallerFrame() {
        C11045c<T> cVar = this.f28253a;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12579k
    public CoroutineContext getContext() {
        return this.f28253a.getContext();
    }

    @C12580l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(@C12579k Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (C16563a.m75000a(f28252c, this, coroutineSingletons, obj)) {
                    return;
                }
            } else if (obj2 != C11063b.m42612h()) {
                throw new IllegalStateException("Already resumed");
            } else if (C16563a.m75000a(f28252c, this, C11063b.m42612h(), CoroutineSingletons.RESUMED)) {
                this.f28253a.resumeWith(obj);
                return;
            }
        }
    }

    @C12579k
    public String toString() {
        return "SafeContinuation for " + this.f28253a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11532s0
    public C11054h(@C12579k C11045c<? super T> cVar) {
        this(cVar, CoroutineSingletons.UNDECIDED);
        Intrinsics.checkNotNullParameter(cVar, "delegate");
    }
}
