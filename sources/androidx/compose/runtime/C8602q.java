package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.tooling.C8679a;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.runtime.q */
public abstract class C8602q {

    /* renamed from: a */
    public static final int f23037a = 0;

    /* renamed from: a */
    public abstract void mo15045a(@C12579k C8696y yVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar);

    /* renamed from: b */
    public abstract void mo15046b(@C12579k C8697y0 y0Var);

    /* renamed from: c */
    public void mo15047c() {
    }

    /* renamed from: d */
    public abstract boolean mo15048d();

    @C12579k
    /* renamed from: e */
    public C8452h<C8682u<Object>, C8578k2<Object>> mo15049e() {
        return C8606r.f23042a;
    }

    /* renamed from: f */
    public abstract int mo15050f();

    @C12579k
    /* renamed from: g */
    public abstract CoroutineContext mo15051g();

    @C12579k
    /* renamed from: h */
    public abstract CoroutineContext mo15052h();

    /* renamed from: i */
    public abstract void mo15053i(@C12579k C8697y0 y0Var);

    /* renamed from: j */
    public abstract void mo15054j(@C12579k C8696y yVar);

    /* renamed from: k */
    public abstract void mo15055k(@C12579k RecomposeScopeImpl recomposeScopeImpl);

    /* renamed from: l */
    public abstract void mo15056l(@C12579k C8697y0 y0Var, @C12579k C8694x0 x0Var);

    @C12580l
    /* renamed from: m */
    public C8694x0 mo15057m(@C12579k C8697y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "reference");
        return null;
    }

    /* renamed from: n */
    public void mo15058n(@C12579k Set<C8679a> set) {
        Intrinsics.checkNotNullParameter(set, "table");
    }

    /* renamed from: o */
    public void mo15059o(@C12579k C8592o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
    }

    /* renamed from: p */
    public abstract void mo15060p(@C12579k C8696y yVar);

    /* renamed from: q */
    public void mo15061q() {
    }

    /* renamed from: r */
    public void mo15062r(@C12579k C8592o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
    }

    /* renamed from: s */
    public abstract void mo15063s(@C12579k C8696y yVar);
}
