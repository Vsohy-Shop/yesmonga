package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12001k0;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.C12036a;
import kotlinx.coroutines.intrinsics.C12037b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,273:1\n95#2,5:274\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n166#1:274,5\n*E\n"})
/* renamed from: kotlinx.coroutines.j */
public final /* synthetic */ class C12038j {

    /* renamed from: a */
    public static final int f29667a = 0;

    /* renamed from: b */
    public static final int f29668b = 1;

    /* renamed from: c */
    public static final int f29669c = 2;

    @C12579k
    /* renamed from: a */
    public static final <T> C12154u0<T> m48056a(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, @C12579k CoroutineStart coroutineStart, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar) {
        C12159v0 v0Var;
        CoroutineContext e = CoroutineContextKt.m45901e(o0Var, coroutineContext);
        if (coroutineStart.mo23572w()) {
            v0Var = new C12048k2(e, pVar);
        } else {
            v0Var = new C12159v0(e, true);
        }
        v0Var.mo23695R1(coroutineStart, v0Var, pVar);
        return v0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C12154u0 m48057b(C12074o0 o0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C11965h.m47666a(o0Var, coroutineContext, coroutineStart, pVar);
    }

    @C12580l
    /* renamed from: c */
    public static final <T> Object m48058c(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return C11965h.m47673h(coroutineDispatcher, pVar, cVar);
    }

    /* renamed from: d */
    public static final <T> Object m48059d(CoroutineDispatcher coroutineDispatcher, C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, C11045c<? super T> cVar) {
        C11322b0.m43482e(0);
        Object h = C11965h.m47673h(coroutineDispatcher, pVar, cVar);
        C11322b0.m43482e(1);
        return h;
    }

    @C12579k
    /* renamed from: e */
    public static final C11723c2 m48060e(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, @C12579k CoroutineStart coroutineStart, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11701a aVar;
        CoroutineContext e = CoroutineContextKt.m45901e(o0Var, coroutineContext);
        if (coroutineStart.mo23572w()) {
            aVar = new C12058l2(e, pVar);
        } else {
            aVar = new C12178y2(e, true);
        }
        aVar.mo23695R1(coroutineStart, aVar, pVar);
        return aVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C11723c2 m48061f(C12074o0 o0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C11965h.m47669d(o0Var, coroutineContext, coroutineStart, pVar);
    }

    /* JADX INFO: finally extract failed */
    @C12580l
    /* renamed from: g */
    public static final <T> Object m48062g(@C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        CoroutineContext d = CoroutineContextKt.m45900d(context, coroutineContext);
        C11804f2.m46978z(d);
        if (d == context) {
            C12001k0 k0Var = new C12001k0(d, cVar);
            obj = C12037b.m48053e(k0Var, k0Var, pVar);
        } else {
            C11047d.C11049b bVar = C11047d.f28247u0;
            if (Intrinsics.areEqual((Object) d.mo7444b(bVar), (Object) context.mo7444b(bVar))) {
                C12065m3 m3Var = new C12065m3(d, cVar);
                CoroutineContext context2 = m3Var.getContext();
                Object c = ThreadContextKt.m47768c(context2, (Object) null);
                try {
                    Object e = C12037b.m48053e(m3Var, m3Var, pVar);
                    ThreadContextKt.m47766a(context2, c);
                    obj = e;
                } catch (Throwable th) {
                    ThreadContextKt.m47766a(context2, c);
                    throw th;
                }
            } else {
                C12180z0 z0Var = new C12180z0(d, cVar);
                C12036a.m48048f(pVar, z0Var, z0Var, (C11300l) null, 4, (Object) null);
                obj = z0Var.mo24792S1();
            }
        }
        if (obj == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return obj;
    }
}
