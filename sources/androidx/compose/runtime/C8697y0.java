package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8595o0
@C8567o(parameters = 0)
/* renamed from: androidx.compose.runtime.y0 */
public final class C8697y0 {

    /* renamed from: h */
    public static final int f23281h = 8;
    @C12579k

    /* renamed from: a */
    public final C8691w0<Object> f23282a;
    @C12580l

    /* renamed from: b */
    public final Object f23283b;
    @C12579k

    /* renamed from: c */
    public final C8696y f23284c;
    @C12579k

    /* renamed from: d */
    public final C8692w1 f23285d;
    @C12579k

    /* renamed from: e */
    public final C8412c f23286e;
    @C12579k

    /* renamed from: f */
    public final List<Pair<RecomposeScopeImpl, C8419d<Object>>> f23287f;
    @C12579k

    /* renamed from: g */
    public final C8452h<C8682u<Object>, C8578k2<Object>> f23288g;

    public C8697y0(@C12579k C8691w0<Object> w0Var, @C12580l Object obj, @C12579k C8696y yVar, @C12579k C8692w1 w1Var, @C12579k C8412c cVar, @C12579k List<Pair<RecomposeScopeImpl, C8419d<Object>>> list, @C12579k C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar) {
        Intrinsics.checkNotNullParameter(w0Var, "content");
        Intrinsics.checkNotNullParameter(yVar, "composition");
        Intrinsics.checkNotNullParameter(w1Var, "slotTable");
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        Intrinsics.checkNotNullParameter(list, "invalidations");
        Intrinsics.checkNotNullParameter(hVar, "locals");
        this.f23282a = w0Var;
        this.f23283b = obj;
        this.f23284c = yVar;
        this.f23285d = w1Var;
        this.f23286e = cVar;
        this.f23287f = list;
        this.f23288g = hVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8412c mo16876a() {
        return this.f23286e;
    }

    @C12579k
    /* renamed from: b */
    public final C8696y mo16877b() {
        return this.f23284c;
    }

    @C12579k
    /* renamed from: c */
    public final C8691w0<Object> mo16878c() {
        return this.f23282a;
    }

    @C12579k
    /* renamed from: d */
    public final List<Pair<RecomposeScopeImpl, C8419d<Object>>> mo16879d() {
        return this.f23287f;
    }

    @C12579k
    /* renamed from: e */
    public final C8452h<C8682u<Object>, C8578k2<Object>> mo16880e() {
        return this.f23288g;
    }

    @C12580l
    /* renamed from: f */
    public final Object mo16881f() {
        return this.f23283b;
    }

    @C12579k
    /* renamed from: g */
    public final C8692w1 mo16882g() {
        return this.f23285d;
    }
}
