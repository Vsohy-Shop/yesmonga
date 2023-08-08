package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CoroutineContextKt {
    @C12579k

    /* renamed from: a */
    public static final String f28998a = " @";

    /* renamed from: a */
    public static final CoroutineContext m45897a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean c = m45899c(coroutineContext);
        boolean c2 = m45899c(coroutineContext2);
        if (!c && !c2) {
            return coroutineContext.mo7443Q(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f28243a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.mo7446l(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(objectRef, z));
        if (c2) {
            objectRef.element = ((CoroutineContext) objectRef.element).mo7446l(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.f28999f);
        }
        return coroutineContext3.mo7443Q((CoroutineContext) objectRef.element);
    }

    @C12580l
    /* renamed from: b */
    public static final String m45898b(@C12579k CoroutineContext coroutineContext) {
        return null;
    }

    /* renamed from: c */
    public static final boolean m45899c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.mo7446l(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.f29000f)).booleanValue();
    }

    @C12177y1
    @C12579k
    /* renamed from: d */
    public static final CoroutineContext m45900d(@C12579k CoroutineContext coroutineContext, @C12579k CoroutineContext coroutineContext2) {
        if (!m45899c(coroutineContext2)) {
            return coroutineContext.mo7443Q(coroutineContext2);
        }
        return m45897a(coroutineContext, coroutineContext2, false);
    }

    @C12095s1
    @C12579k
    /* renamed from: e */
    public static final CoroutineContext m45901e(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext) {
        CoroutineContext a = m45897a(o0Var.getCoroutineContext(), coroutineContext, true);
        if (a == C11768d1.m46779a() || a.mo7444b(C11047d.f28247u0) != null) {
            return a;
        }
        return a.mo7443Q(C11768d1.m46779a());
    }

    @C12580l
    /* renamed from: f */
    public static final C12065m3<?> m45902f(@C12579k C11066c cVar) {
        while (!(cVar instanceof C12180z0) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof C12065m3) {
                return (C12065m3) cVar;
            }
        }
        return null;
    }

    @C12580l
    /* renamed from: g */
    public static final C12065m3<?> m45903g(@C12579k C11045c<?> cVar, @C12579k CoroutineContext coroutineContext, @C12580l Object obj) {
        boolean z;
        if (!(cVar instanceof C11066c)) {
            return null;
        }
        if (coroutineContext.mo7444b(C12071n3.f29711a) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C12065m3<?> f = m45902f((C11066c) cVar);
        if (f != null) {
            f.mo24521T1(coroutineContext, obj);
        }
        return f;
    }

    /* renamed from: h */
    public static final <T> T m45904h(@C12579k C11045c<?> cVar, @C12580l Object obj, @C12579k C11289a<? extends T> aVar) {
        C12065m3<?> m3Var;
        CoroutineContext context = cVar.getContext();
        Object c = ThreadContextKt.m47768c(context, obj);
        if (c != ThreadContextKt.f29563a) {
            m3Var = m45903g(cVar, context, c);
        } else {
            m3Var = null;
        }
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            if (m3Var == null || m3Var.mo24520S1()) {
                ThreadContextKt.m47766a(context, c);
            }
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: i */
    public static final <T> T m45905i(@C12579k CoroutineContext coroutineContext, @C12580l Object obj, @C12579k C11289a<? extends T> aVar) {
        Object c = ThreadContextKt.m47768c(coroutineContext, obj);
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            ThreadContextKt.m47766a(coroutineContext, c);
            C11322b0.m43480c(1);
        }
    }
}
