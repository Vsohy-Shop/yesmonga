package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.selects.C12124c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.o2 */
public final class C12076o2 extends C11043a implements C11723c2 {
    @C12579k

    /* renamed from: b */
    public static final C12076o2 f29720b = new C12076o2();
    @C12579k

    /* renamed from: c */
    public static final String f29721c = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public C12076o2() {
        super(C11723c2.f29067w0);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: O */
    public static /* synthetic */ void m48190O() {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: T */
    public static /* synthetic */ void m48191T() {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: U */
    public static /* synthetic */ void m48192U() {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: V */
    public static /* synthetic */ void m48193V() {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: X */
    public static /* synthetic */ void m48194X() {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: a0 */
    public static /* synthetic */ void m48195a0() {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @C12579k
    /* renamed from: D */
    public C11962g1 mo23589D(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        return C12081p2.f29727a;
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @C12580l
    /* renamed from: S */
    public Object mo23614S(@C12579k C11045c<? super C11079d2> cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: a */
    public void mo23621a(@C12580l CancellationException cancellationException) {
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: c */
    public /* synthetic */ boolean mo23624c(Throwable th) {
        return false;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo23621a((CancellationException) null);
    }

    /* renamed from: d */
    public boolean mo23627d() {
        return true;
    }

    @C12579k
    /* renamed from: f0 */
    public C12124c mo23630f0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @C12580l
    public C11723c2 getParent() {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    /* renamed from: j */
    public boolean mo23636j() {
        return false;
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @C12579k
    /* renamed from: q0 */
    public C12152u mo23644q0(@C12579k C12162w wVar) {
        return C12081p2.f29727a;
    }

    @C12579k
    /* renamed from: r */
    public C11559m<C11723c2> mo23646r() {
        return SequencesKt__SequencesKt.m44590g();
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @C12579k
    /* renamed from: t */
    public C11962g1 mo23650t(boolean z, boolean z2, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        return C12081p2.f29727a;
    }

    @C12579k
    public String toString() {
        return "NonCancellable";
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @C12579k
    /* renamed from: u */
    public CancellationException mo23653u() {
        throw new IllegalStateException("This job is always active");
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @C12579k
    /* renamed from: z */
    public C11723c2 mo23665z(@C12579k C11723c2 c2Var) {
        return C11723c2.C11724a.m46192j(this, c2Var);
    }
}
