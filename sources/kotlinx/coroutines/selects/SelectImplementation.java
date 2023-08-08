package kotlinx.coroutines.selects;

import androidx.concurrent.futures.C16563a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.internal.C11112h;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12060m;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.internal.C12003l0;
import kotlinx.coroutines.selects.C12122b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
@C11532s0
public class SelectImplementation<R> extends C12060m implements C12122b<R>, C12132k<R> {
    @C12579k

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f29850f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state");
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f29851a;
    @C12580l

    /* renamed from: b */
    public List<SelectImplementation<R>.a> f29852b = new ArrayList(2);
    @C12580l

    /* renamed from: c */
    public Object f29853c;

    /* renamed from: d */
    public int f29854d = -1;
    @C12580l

    /* renamed from: e */
    public Object f29855e = SelectKt.f29873i;
    @C11394v
    @C12580l
    private volatile Object state = SelectKt.f29870f;

    @C11363r0({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$a */
    public final class C12119a {
        @C12579k
        @C11287e

        /* renamed from: a */
        public final Object f29856a;
        @C12579k

        /* renamed from: b */
        public final C11305q<Object, C12131j<?>, Object, C11079d2> f29857b;
        @C12579k

        /* renamed from: c */
        public final C11305q<Object, Object, Object, Object> f29858c;
        @C12580l

        /* renamed from: d */
        public final Object f29859d;
        @C12579k

        /* renamed from: e */
        public final Object f29860e;
        @C12580l
        @C11287e

        /* renamed from: f */
        public final C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> f29861f;
        @C12580l
        @C11287e

        /* renamed from: g */
        public Object f29862g;
        @C11287e

        /* renamed from: h */
        public int f29863h = -1;

        public C12119a(@C12579k Object obj, @C12579k C11305q<Object, ? super C12131j<?>, Object, C11079d2> qVar, @C12579k C11305q<Object, Object, Object, ? extends Object> qVar2, @C12580l Object obj2, @C12579k Object obj3, @C12580l C11305q<? super C12131j<?>, Object, Object, ? extends C11300l<? super Throwable, C11079d2>> qVar3) {
            this.f29856a = obj;
            this.f29857b = qVar;
            this.f29858c = qVar2;
            this.f29859d = obj2;
            this.f29860e = obj3;
            this.f29861f = qVar3;
        }

        @C12580l
        /* renamed from: a */
        public final C11300l<Throwable, C11079d2> mo24719a(@C12579k C12131j<?> jVar, @C12580l Object obj) {
            C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> qVar = this.f29861f;
            if (qVar != null) {
                return qVar.invoke(jVar, this.f29859d, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void mo24720b() {
            Object obj = this.f29862g;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            C11962g1 g1Var = null;
            if (obj instanceof C12003l0) {
                ((C12003l0) obj).mo23933q(this.f29863h, (Throwable) null, selectImplementation.getContext());
                return;
            }
            if (obj instanceof C11962g1) {
                g1Var = (C11962g1) obj;
            }
            if (g1Var != null) {
                g1Var.mo23720g();
            }
        }

        @C12580l
        /* renamed from: c */
        public final Object mo24721c(@C12580l Object obj, @C12579k C11045c<? super R> cVar) {
            Object obj2 = this.f29860e;
            if (this.f29859d == SelectKt.m48510l()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((C11300l) obj2).invoke(cVar);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((C11304p) obj2).invoke(obj, cVar);
        }

        @C12580l
        /* renamed from: d */
        public final Object mo24722d(@C12580l Object obj) {
            return this.f29858c.invoke(this.f29856a, this.f29859d, obj);
        }

        /* renamed from: e */
        public final boolean mo24723e(@C12579k SelectImplementation<R> selectImplementation) {
            this.f29857b.invoke(this.f29856a, selectImplementation, this.f29859d);
            if (selectImplementation.f29855e == SelectKt.f29873i) {
                return true;
            }
            return false;
        }
    }

    public SelectImplementation(@C12579k CoroutineContext coroutineContext) {
        this.f29851a = coroutineContext;
    }

    /* renamed from: G */
    public static /* synthetic */ void m48456G(SelectImplementation selectImplementation, C12119a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            selectImplementation.mo24698F(aVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    @C11532s0
    /* renamed from: x */
    public static /* synthetic */ <R> Object m48466x(SelectImplementation<R> selectImplementation, C11045c<? super R> cVar) {
        if (selectImplementation.mo24695C()) {
            return selectImplementation.mo24715v(cVar);
        }
        return selectImplementation.mo24717y(cVar);
    }

    /* renamed from: A */
    public final boolean mo24693A() {
        Object obj = f29850f.get(this);
        if (obj == SelectKt.f29870f || (obj instanceof List)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo24694B() {
        if (f29850f.get(this) == SelectKt.f29872h) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final boolean mo24695C() {
        return f29850f.get(this) instanceof C12119a;
    }

    /* renamed from: D */
    public final void mo24696D(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo24697E(kotlinx.coroutines.selects.SelectImplementation<R>.a r5, java.lang.Object r6, kotlin.coroutines.C11045c<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.C12120xf491fb2a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.C12120xf491fb2a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            java.lang.Object r6 = r5.mo24722d(r6)
            r0.label = r3
            java.lang.Object r7 = r5.mo24721c(r6, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.mo24697E(kotlinx.coroutines.selects.SelectImplementation$a, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @C11314h(name = "register")
    /* renamed from: F */
    public final void mo24698F(@C12579k SelectImplementation<R>.a aVar, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29850f;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof C12119a)) {
            if (!z) {
                mo24713t(aVar.f29856a);
            }
            if (aVar.mo24723e(this)) {
                if (!z) {
                    List<SelectImplementation<R>.a> list = this.f29852b;
                    Intrinsics.checkNotNull(list);
                    list.add(aVar);
                }
                aVar.f29862g = this.f29853c;
                aVar.f29863h = this.f29854d;
                this.f29853c = null;
                this.f29854d = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, aVar);
        }
    }

    /* renamed from: H */
    public final void mo24699H(Object obj) {
        SelectImplementation<R>.a z = mo24718z(obj);
        Intrinsics.checkNotNull(z);
        z.f29862g = null;
        z.f29863h = -1;
        mo24698F(z, true);
    }

    @C12579k
    /* renamed from: I */
    public final TrySelectDetailedResult mo24700I(@C12579k Object obj, @C12580l Object obj2) {
        return SelectKt.m48502d(mo24701J(obj, obj2));
    }

    /* renamed from: J */
    public final int mo24701J(Object obj, Object obj2) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29850f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof C12072o) {
                SelectImplementation<R>.a z2 = mo24718z(obj);
                if (z2 == null) {
                    continue;
                } else {
                    C11300l<Throwable, C11079d2> a = z2.mo24719a(this, obj2);
                    if (C16563a.m75000a(atomicReferenceFieldUpdater, this, obj3, z2)) {
                        this.f29855e = obj2;
                        if (SelectKt.m48513o((C12072o) obj3, a)) {
                            return 0;
                        }
                        this.f29855e = null;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.areEqual(obj3, (Object) SelectKt.f29871g)) {
                    z = true;
                } else {
                    z = obj3 instanceof C12119a;
                }
                if (z) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, (Object) SelectKt.f29872h)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, (Object) SelectKt.f29870f)) {
                    if (C16563a.m75000a(atomicReferenceFieldUpdater, this, obj3, C10976s.m41419k(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (C16563a.m75000a(atomicReferenceFieldUpdater, this, obj3, CollectionsKt___CollectionsKt.m40723z4((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo24702K(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* renamed from: L */
    public final Object mo24703L(C11045c<? super C11079d2> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        AtomicReferenceFieldUpdater o = f29850f;
        while (true) {
            Object obj = o.get(this);
            if (obj == SelectKt.f29870f) {
                if (C16563a.m75000a(f29850f, this, obj, pVar)) {
                    pVar.mo24529C(this);
                    break;
                }
            } else if (obj instanceof List) {
                if (C16563a.m75000a(f29850f, this, obj, SelectKt.f29870f)) {
                    List list = (List) obj;
                    for (Object r : (Iterable) obj) {
                        mo24699H(r);
                    }
                }
            } else if (obj instanceof C12119a) {
                pVar.mo24532O(C11079d2.f28267a, ((C12119a) obj).mo24719a(this, this.f29855e));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: a */
    public void mo24704a(@C12579k C12124c cVar, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
        m48456G(this, new C12119a(cVar.mo24731d(), cVar.mo24728a(), cVar.mo24730c(), SelectKt.m48510l(), lVar, cVar.mo24729b()), false, 1, (Object) null);
    }

    /* renamed from: b */
    public void mo23862b(@C12579k C12003l0<?> l0Var, int i) {
        this.f29853c = l0Var;
        this.f29854d = i;
    }

    /* renamed from: c */
    public <P, Q> void mo24705c(@C12579k C12128g<? super P, ? extends Q> gVar, P p, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar) {
        m48456G(this, new C12119a(gVar.mo24731d(), gVar.mo24728a(), gVar.mo24730c(), p, pVar, gVar.mo24729b()), false, 1, (Object) null);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @C11587t0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @C12095s1
    @C11112h
    /* renamed from: d */
    public void mo24706d(long j, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
        C12122b.C12123a.m48529b(this, j, lVar);
    }

    /* renamed from: e */
    public void mo24707e(@C12580l Object obj) {
        this.f29855e = obj;
    }

    /* renamed from: f */
    public void mo24708f(@C12579k C11962g1 g1Var) {
        this.f29853c = g1Var;
    }

    /* renamed from: g */
    public <P, Q> void mo24709g(@C12579k C12128g<? super P, ? extends Q> gVar, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar) {
        C12122b.C12123a.m48528a(this, gVar, pVar);
    }

    @C12579k
    public CoroutineContext getContext() {
        return this.f29851a;
    }

    /* renamed from: h */
    public boolean mo24711h(@C12579k Object obj, @C12580l Object obj2) {
        return mo24701J(obj, obj2) == 0;
    }

    /* renamed from: i */
    public <Q> void mo24712i(@C12579k C12126e<? extends Q> eVar, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar) {
        m48456G(this, new C12119a(eVar.mo24731d(), eVar.mo24728a(), eVar.mo24730c(), (Object) null, pVar, eVar.mo24729b()), false, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24071j((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: j */
    public void mo24071j(@C12580l Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29850f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f29871g) {
                return;
            }
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, this, obj, SelectKt.f29872h));
        List<SelectImplementation<R>.a> list = this.f29852b;
        if (list != null) {
            for (C12119a b : list) {
                b.mo24720b();
            }
            this.f29855e = SelectKt.f29873i;
            this.f29852b = null;
        }
    }

    /* renamed from: t */
    public final void mo24713t(Object obj) {
        boolean z;
        List<SelectImplementation<R>.a> list = this.f29852b;
        Intrinsics.checkNotNull(list);
        Iterable iterable = list;
        boolean z2 = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C12119a) it.next()).f29856a == obj) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z2) {
            throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
        }
    }

    /* renamed from: u */
    public final void mo24714u(SelectImplementation<R>.a aVar) {
        List<SelectImplementation<R>.a> list = this.f29852b;
        if (list != null) {
            for (SelectImplementation<R>.a aVar2 : list) {
                if (aVar2 != aVar) {
                    aVar2.mo24720b();
                }
            }
            f29850f.set(this, SelectKt.f29871g);
            this.f29855e = SelectKt.f29873i;
            this.f29852b = null;
        }
    }

    /* renamed from: v */
    public final Object mo24715v(C11045c<? super R> cVar) {
        Object obj = f29850f.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C12119a aVar = (C12119a) obj;
        Object obj2 = this.f29855e;
        mo24714u(aVar);
        return aVar.mo24721c(aVar.mo24722d(obj2), cVar);
    }

    @C12580l
    @C11532s0
    /* renamed from: w */
    public Object mo24716w(@C12579k C11045c<? super R> cVar) {
        return m48466x(this, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:19:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo24717y(kotlin.coroutines.C11045c<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0057
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004b
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.mo24703L(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.mo24715v(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.mo24717y(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlinx.coroutines.selects.SelectImplementation<R>$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.selects.SelectImplementation<R>$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlinx.coroutines.selects.SelectImplementation$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.selects.SelectImplementation<R>$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.selects.SelectImplementation<R>.a mo24718z(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>$a> r0 = r4.f29852b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlinx.coroutines.selects.SelectImplementation$a r3 = (kotlinx.coroutines.selects.SelectImplementation.C12119a) r3
            java.lang.Object r3 = r3.f29856a
            if (r3 != r5) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x000c
            r1 = r2
        L_0x0023:
            kotlinx.coroutines.selects.SelectImplementation$a r1 = (kotlinx.coroutines.selects.SelectImplementation.C12119a) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.mo24718z(java.lang.Object):kotlinx.coroutines.selects.SelectImplementation$a");
    }
}
