package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
public final class WithLifecycleStateKt {

    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$a */
    public static final class C19386a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f49757a;

        /* renamed from: b */
        public final /* synthetic */ C19388xfdb59cc4 f49758b;

        public C19386a(Lifecycle lifecycle, C19388xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f49757a = lifecycle;
            this.f49758b = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        public final void run() {
            this.f49757a.mo57464a(this.f49758b);
        }
    }

    @C12580l
    @C11532s0
    /* renamed from: a */
    public static final <R> Object m90628a(@C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state, boolean z, @C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C19388xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new C19388xfdb59cc4(state, lifecycle, pVar, aVar);
        if (z) {
            coroutineDispatcher.mo23563O(EmptyCoroutineContext.f28243a, new C19386a(lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        } else {
            lifecycle.mo57464a(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
        pVar.mo24529C(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(coroutineDispatcher, lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    @C12580l
    /* renamed from: b */
    public static final <R> Object m90629b(@C12579k Lifecycle lifecycle, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @C12580l
    /* renamed from: c */
    public static final <R> Object m90630c(@C12579k C19499w wVar, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        Lifecycle lifecycle = wVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    /* renamed from: d */
    public static final <R> Object m90631d(Lifecycle lifecycle, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    /* renamed from: e */
    public static final <R> Object m90632e(C19499w wVar, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        wVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    @C12580l
    /* renamed from: f */
    public static final <R> Object m90633f(@C12579k Lifecycle lifecycle, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @C12580l
    /* renamed from: g */
    public static final <R> Object m90634g(@C12579k C19499w wVar, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        Lifecycle lifecycle = wVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    /* renamed from: h */
    public static final <R> Object m90635h(Lifecycle lifecycle, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    /* renamed from: i */
    public static final <R> Object m90636i(C19499w wVar, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        wVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    @C12580l
    /* renamed from: j */
    public static final <R> Object m90637j(@C12579k Lifecycle lifecycle, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @C12580l
    /* renamed from: k */
    public static final <R> Object m90638k(@C12579k C19499w wVar, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        Lifecycle lifecycle = wVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    /* renamed from: l */
    public static final <R> Object m90639l(Lifecycle lifecycle, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    /* renamed from: m */
    public static final <R> Object m90640m(C19499w wVar, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        wVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    @C12580l
    /* renamed from: n */
    public static final <R> Object m90641n(@C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        boolean z;
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12064m2 a0 = C11768d1.m46783e().mo23706a0();
            boolean U = a0.mo23565U(cVar.getContext());
            if (!U) {
                if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            }
            return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @C12580l
    /* renamed from: o */
    public static final <R> Object m90642o(@C12579k C19499w wVar, @C12579k Lifecycle.State state, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        boolean z;
        Lifecycle lifecycle = wVar.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12064m2 a0 = C11768d1.m46783e().mo23706a0();
            boolean U = a0.mo23565U(cVar.getContext());
            if (!U) {
                if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            }
            return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    /* renamed from: p */
    public static final <R> Object m90643p(Lifecycle lifecycle, Lifecycle.State state, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        boolean z;
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    /* renamed from: q */
    public static final <R> Object m90644q(C19499w wVar, Lifecycle.State state, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        boolean z;
        wVar.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }

    @C12580l
    @C11532s0
    /* renamed from: r */
    public static final <R> Object m90645r(@C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state, @C12579k C11289a<? extends R> aVar, @C12579k C11045c<? super R> cVar) {
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        boolean U = a0.mo23565U(cVar.getContext());
        if (!U) {
            if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.mo57465b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return m90628a(lifecycle, state, U, a0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @C11532s0
    /* renamed from: s */
    public static final <R> Object m90646s(Lifecycle lifecycle, Lifecycle.State state, C11289a<? extends R> aVar, C11045c<? super R> cVar) {
        C11768d1.m46783e().mo23706a0();
        C11322b0.m43482e(3);
        throw null;
    }
}
