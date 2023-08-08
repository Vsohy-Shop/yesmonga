package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.C12139a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/lifecycle/w;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "(Landroidx/lifecycle/w;Landroidx/lifecycle/Lifecycle$Event;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C19470t {

    /* renamed from: a */
    public final /* synthetic */ Lifecycle.C19372Event f49718a;

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<C11723c2> f49719b;

    /* renamed from: c */
    public final /* synthetic */ C12074o0 f49720c;

    /* renamed from: d */
    public final /* synthetic */ Lifecycle.C19372Event f49721d;

    /* renamed from: e */
    public final /* synthetic */ C12072o<C11079d2> f49722e;

    /* renamed from: f */
    public final /* synthetic */ C12139a f49723f;

    /* renamed from: g */
    public final /* synthetic */ C11304p<C12074o0, C11045c<? super C11079d2>, Object> f49724g;

    @C11067d(mo22501c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo22502f = "RepeatOnLifecycle.kt", mo22503i = {0, 1}, mo22504l = {171, 110}, mo22505m = "invokeSuspend", mo22506n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, mo22507s = {"L$0", "L$0"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
    public static final class C193801 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        Object L$0;
        Object L$1;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C193801(aVar, pVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Throwable th;
            C12139a aVar;
            C12139a aVar2;
            C11304p<C12074o0, C11045c<? super C11079d2>, Object> pVar;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                aVar2 = aVar;
                pVar = pVar;
                this.L$0 = aVar2;
                this.L$1 = pVar;
                this.label = 1;
                if (aVar2.mo24739f((Object) null, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                pVar = (C11304p) this.L$1;
                C11661u0.m45747n(obj);
                aVar2 = (C12139a) this.L$0;
            } else if (i == 2) {
                aVar = (C12139a) this.L$0;
                try {
                    C11661u0.m45747n(obj);
                    C11079d2 d2Var = C11079d2.f28267a;
                    aVar.mo24740g((Object) null);
                    return d2Var;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, (C11045c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1>) null);
                this.L$0 = aVar2;
                this.L$1 = null;
                this.label = 2;
                if (C12079p0.m48266g(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == h) {
                    return h;
                }
                aVar = aVar2;
                C11079d2 d2Var2 = C11079d2.f28267a;
                aVar.mo24740g((Object) null);
                return d2Var2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                aVar = aVar2;
                th = th4;
                aVar.mo24740g((Object) null);
                throw th;
            }
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C193801) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.C19372Event event, Ref.ObjectRef<C11723c2> objectRef, C12074o0 o0Var, Lifecycle.C19372Event event2, C12072o<? super C11079d2> oVar, C12139a aVar, C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        this.f49718a = event;
        this.f49719b = objectRef;
        this.f49720c = o0Var;
        this.f49721d = event2;
        this.f49722e = oVar;
        this.f49723f = aVar;
        this.f49724g = pVar;
    }

    /* renamed from: i */
    public final void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == this.f49718a) {
            Ref.ObjectRef<C11723c2> objectRef = this.f49719b;
            C12074o0 o0Var = this.f49720c;
            final C12139a aVar = this.f49723f;
            final C11304p<C12074o0, C11045c<? super C11079d2>, Object> pVar = this.f49724g;
            objectRef.element = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C193801((C11045c<? super C193801>) null), 3, (Object) null);
            return;
        }
        if (event == this.f49721d) {
            C11723c2 c2Var = (C11723c2) this.f49719b.element;
            if (c2Var != null) {
                C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
            }
            this.f49719b.element = null;
        }
        if (event == Lifecycle.C19372Event.ON_DESTROY) {
            C12072o<C11079d2> oVar = this.f49722e;
            Result.C10852a aVar2 = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }
}
