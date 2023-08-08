package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.C31029b;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11661u0;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.sequences.C11559m;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12152u;
import kotlinx.coroutines.C12154u0;
import kotlinx.coroutines.C12162w;
import kotlinx.coroutines.C12169x;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.C12179z;
import kotlinx.coroutines.selects.C12124c;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,167:1\n314#2,11:168\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n139#1:168,11\n*E\n"})
public final class TasksKt {

    /* renamed from: kotlinx.coroutines.tasks.TasksKt$a */
    public static final class C12147a implements C12154u0<T> {

        /* renamed from: a */
        public final /* synthetic */ C12169x<T> f29935a;

        public C12147a(C12169x<T> xVar) {
            this.f29935a = xVar;
        }

        @C12579k
        /* renamed from: D */
        public C11962g1 mo23589D(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
            return this.f29935a.mo23589D(lVar);
        }

        @C12579k
        /* renamed from: Q */
        public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
            return this.f29935a.mo7443Q(coroutineContext);
        }

        @C12579k
        /* renamed from: R */
        public C12126e<T> mo24777R() {
            return this.f29935a.mo24777R();
        }

        @C12580l
        /* renamed from: S */
        public Object mo23614S(@C12579k C11045c<? super C11079d2> cVar) {
            return this.f29935a.mo23614S(cVar);
        }

        /* renamed from: a */
        public void mo23621a(@C12580l CancellationException cancellationException) {
            this.f29935a.mo23621a(cancellationException);
        }

        @C12580l
        /* renamed from: b */
        public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
            return this.f29935a.mo7444b(bVar);
        }

        @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        /* renamed from: c */
        public /* synthetic */ boolean mo23624c(Throwable th) {
            return this.f29935a.mo23624c(th);
        }

        @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.f29935a.cancel();
        }

        /* renamed from: d */
        public boolean mo23627d() {
            return this.f29935a.mo23627d();
        }

        @C12579k
        /* renamed from: f */
        public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
            return this.f29935a.mo7445f(bVar);
        }

        @C12579k
        /* renamed from: f0 */
        public C12124c mo23630f0() {
            return this.f29935a.mo23630f0();
        }

        @C12579k
        public CoroutineContext.C11042b<?> getKey() {
            return this.f29935a.getKey();
        }

        @C12580l
        public C11723c2 getParent() {
            return this.f29935a.getParent();
        }

        public boolean isCancelled() {
            return this.f29935a.isCancelled();
        }

        /* renamed from: j */
        public boolean mo23636j() {
            return this.f29935a.mo23636j();
        }

        /* renamed from: l */
        public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return this.f29935a.mo7446l(r, pVar);
        }

        @C12095s1
        /* renamed from: n */
        public T mo24778n() {
            return this.f29935a.mo24778n();
        }

        @C12177y1
        @C12579k
        /* renamed from: q0 */
        public C12152u mo23644q0(@C12579k C12162w wVar) {
            return this.f29935a.mo23644q0(wVar);
        }

        @C12579k
        /* renamed from: r */
        public C11559m<C11723c2> mo23646r() {
            return this.f29935a.mo23646r();
        }

        @C12580l
        @C12095s1
        /* renamed from: s */
        public Throwable mo24779s() {
            return this.f29935a.mo24779s();
        }

        public boolean start() {
            return this.f29935a.start();
        }

        @C12177y1
        @C12579k
        /* renamed from: t */
        public C11962g1 mo23650t(boolean z, boolean z2, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
            return this.f29935a.mo23650t(z, z2, lVar);
        }

        @C12177y1
        @C12579k
        /* renamed from: u */
        public CancellationException mo23653u() {
            return this.f29935a.mo23653u();
        }

        @C12580l
        /* renamed from: v */
        public Object mo24780v(@C12579k C11045c<? super T> cVar) {
            return this.f29935a.mo24780v(cVar);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: z */
        public C11723c2 mo23665z(@C12579k C11723c2 c2Var) {
            return this.f29935a.mo23665z(c2Var);
        }
    }

    /* renamed from: kotlinx.coroutines.tasks.TasksKt$b */
    public static final class C12148b<TResult> implements C31035e {

        /* renamed from: a */
        public final /* synthetic */ C12072o<T> f29936a;

        public C12148b(C12072o<? super T> oVar) {
            this.f29936a = oVar;
        }

        public final void onComplete(@C12579k C31047k<T> kVar) {
            Exception q = kVar.mo87733q();
            if (q != null) {
                C12072o<T> oVar = this.f29936a;
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(C11661u0.m45734a(q)));
            } else if (kVar.mo87736t()) {
                C12072o.C12073a.m48184a(this.f29936a, (Throwable) null, 1, (Object) null);
            } else {
                C12072o<T> oVar2 = this.f29936a;
                Result.C10852a aVar2 = Result.f28060a;
                oVar2.resumeWith(Result.m38702b(kVar.mo87734r()));
            }
        }
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C12154u0<T> m48667c(@C12579k C31047k<T> kVar) {
        return m48669e(kVar, (C31029b) null);
    }

    @C12095s1
    @C12579k
    /* renamed from: d */
    public static final <T> C12154u0<T> m48668d(@C12579k C31047k<T> kVar, @C12579k C31029b bVar) {
        return m48669e(kVar, bVar);
    }

    /* renamed from: e */
    public static final <T> C12154u0<T> m48669e(C31047k<T> kVar, C31029b bVar) {
        C12169x c = C12179z.m48761c((C11723c2) null, 1, (Object) null);
        if (kVar.mo87737u()) {
            Exception q = kVar.mo87733q();
            if (q != null) {
                c.mo24790i(q);
            } else if (kVar.mo87736t()) {
                C11723c2.C11724a.m46184b(c, (CancellationException) null, 1, (Object) null);
            } else {
                c.mo24789G(kVar.mo87734r());
            }
        } else {
            kVar.mo87722f(C12149a.f29937a, new C12150b(c));
        }
        if (bVar != null) {
            c.mo23589D(new TasksKt$asDeferredImpl$2(bVar));
        }
        return new C12147a(c);
    }

    /* renamed from: f */
    public static final void m48670f(C12169x xVar, C31047k kVar) {
        Exception q = kVar.mo87733q();
        if (q != null) {
            xVar.mo24790i(q);
        } else if (kVar.mo87736t()) {
            C11723c2.C11724a.m46184b(xVar, (CancellationException) null, 1, (Object) null);
        } else {
            xVar.mo24789G(kVar.mo87734r());
        }
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C31047k<T> m48671g(@C12579k C12154u0<? extends T> u0Var) {
        C31029b bVar = new C31029b();
        C31049l lVar = new C31049l(bVar.mo87709b());
        u0Var.mo23589D(new TasksKt$asTask$1(bVar, u0Var, lVar));
        return lVar.mo87741a();
    }

    @C12580l
    @C12095s1
    /* renamed from: h */
    public static final <T> Object m48672h(@C12579k C31047k<T> kVar, @C12579k C31029b bVar, @C12579k C11045c<? super T> cVar) {
        return m48674j(kVar, bVar, cVar);
    }

    @C12580l
    /* renamed from: i */
    public static final <T> Object m48673i(@C12579k C31047k<T> kVar, @C12579k C11045c<? super T> cVar) {
        return m48674j(kVar, (C31029b) null, cVar);
    }

    /* renamed from: j */
    public static final <T> Object m48674j(C31047k<T> kVar, C31029b bVar, C11045c<? super T> cVar) {
        if (kVar.mo87737u()) {
            Exception q = kVar.mo87733q();
            if (q != null) {
                throw q;
            } else if (!kVar.mo87736t()) {
                return kVar.mo87734r();
            } else {
                throw new CancellationException("Task " + kVar + " was cancelled normally.");
            }
        } else {
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
            pVar.mo24537e0();
            kVar.mo87722f(C12149a.f29937a, new C12148b(pVar));
            if (bVar != null) {
                pVar.mo24529C(new TasksKt$awaitImpl$2$2(bVar));
            }
            Object y = pVar.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return y;
        }
    }
}
