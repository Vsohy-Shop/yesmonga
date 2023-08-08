package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11395k;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PausingDispatcherKt {
    @C11395k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: a */
    public static final <T> Object m90571a(@C12579k Lifecycle lifecycle, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m90577g(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    @C11395k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: b */
    public static final <T> Object m90572b(@C12579k C19499w wVar, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m90571a(wVar.getLifecycle(), pVar, cVar);
    }

    @C11395k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: c */
    public static final <T> Object m90573c(@C12579k Lifecycle lifecycle, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m90577g(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    @C11395k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: d */
    public static final <T> Object m90574d(@C12579k C19499w wVar, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m90573c(wVar.getLifecycle(), pVar, cVar);
    }

    @C11395k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: e */
    public static final <T> Object m90575e(@C12579k Lifecycle lifecycle, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m90577g(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }

    @C11395k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: f */
    public static final <T> Object m90576f(@C12579k C19499w wVar, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return m90575e(wVar.getLifecycle(), pVar, cVar);
    }

    @C11395k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @C12580l
    /* renamed from: g */
    public static final <T> Object m90577g(@C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return C11965h.m47673h(C11768d1.m46783e().mo23706a0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, (C11045c<? super PausingDispatcherKt$whenStateAtLeast$2>) null), cVar);
    }
}
