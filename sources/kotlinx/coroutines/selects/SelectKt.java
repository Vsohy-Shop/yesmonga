package kotlinx.coroutines.selects;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SelectKt {
    @C12579k

    /* renamed from: a */
    public static final C11305q<Object, Object, Object, Object> f29865a = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.f29875f;

    /* renamed from: b */
    public static final int f29866b = 0;

    /* renamed from: c */
    public static final int f29867c = 1;

    /* renamed from: d */
    public static final int f29868d = 2;

    /* renamed from: e */
    public static final int f29869e = 3;
    @C12579k

    /* renamed from: f */
    public static final C12009o0 f29870f = new C12009o0("STATE_REG");
    @C12579k

    /* renamed from: g */
    public static final C12009o0 f29871g = new C12009o0("STATE_COMPLETED");
    @C12579k

    /* renamed from: h */
    public static final C12009o0 f29872h = new C12009o0("STATE_CANCELLED");
    @C12579k

    /* renamed from: i */
    public static final C12009o0 f29873i = new C12009o0("NO_RESULT");
    @C12579k

    /* renamed from: j */
    public static final C12009o0 f29874j = new C12009o0("PARAM_CLAUSE_0");

    @C12177y1
    /* renamed from: a */
    public static /* synthetic */ void m48499a() {
    }

    @C12177y1
    /* renamed from: b */
    public static /* synthetic */ void m48500b() {
    }

    @C12177y1
    /* renamed from: c */
    public static /* synthetic */ void m48501c() {
    }

    /* renamed from: d */
    public static final TrySelectDetailedResult m48502d(int i) {
        if (i == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    @C12579k
    /* renamed from: l */
    public static final C12009o0 m48510l() {
        return f29874j;
    }

    @C12580l
    /* renamed from: m */
    public static final <R> Object m48511m(@C12579k C11300l<? super C12122b<? super R>, C11079d2> lVar, @C12579k C11045c<? super R> cVar) {
        SelectImplementation selectImplementation = new SelectImplementation(cVar.getContext());
        lVar.invoke(selectImplementation);
        return selectImplementation.mo24716w(cVar);
    }

    /* renamed from: n */
    public static final <R> Object m48512n(C11300l<? super C12122b<? super R>, C11079d2> lVar, C11045c<? super R> cVar) {
        C11322b0.m43482e(3);
        throw null;
    }

    /* renamed from: o */
    public static final boolean m48513o(C12072o<? super C11079d2> oVar, C11300l<? super Throwable, C11079d2> lVar) {
        Object a0 = oVar.mo24533a0(C11079d2.f28267a, (Object) null, lVar);
        if (a0 == null) {
            return false;
        }
        oVar.mo24540o0(a0);
        return true;
    }
}
