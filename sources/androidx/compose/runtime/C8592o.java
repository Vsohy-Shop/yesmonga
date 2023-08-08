package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C8679a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.o */
public interface C8592o {
    @C12579k

    /* renamed from: a */
    public static final C8593a f23032a = C8593a.f23033a;

    /* renamed from: androidx.compose.runtime.o$a */
    public static final class C8593a {

        /* renamed from: a */
        public static final /* synthetic */ C8593a f23033a = new C8593a();
        @C12579k

        /* renamed from: b */
        public static final Object f23034b = new C8594a();

        /* renamed from: androidx.compose.runtime.o$a$a */
        public static final class C8594a {
            @C12579k
            public String toString() {
                return "Empty";
            }
        }

        @C12579k
        /* renamed from: a */
        public final Object mo16277a() {
            return f23034b;
        }

        @C8599p0
        /* renamed from: b */
        public final void mo16278b(@C12579k C8693x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "tracer");
            ComposerKt.f22631a = xVar;
        }
    }

    @C8579l
    /* renamed from: B */
    static /* synthetic */ void m31125B() {
    }

    @C8595o0
    /* renamed from: F */
    static /* synthetic */ void m31126F() {
    }

    @C8595o0
    /* renamed from: S */
    static /* synthetic */ void m31127S() {
    }

    @C8579l
    /* renamed from: Z */
    static /* synthetic */ void m31128Z() {
    }

    @C8579l
    /* renamed from: b0 */
    static /* synthetic */ void m31129b0() {
    }

    @C8579l
    /* renamed from: h */
    static /* synthetic */ void m31130h() {
    }

    @C8579l
    /* renamed from: h0 */
    static /* synthetic */ void m31131h0() {
    }

    @C8579l
    /* renamed from: o0 */
    static /* synthetic */ void m31132o0() {
    }

    @C8595o0
    /* renamed from: x */
    static /* synthetic */ void m31133x() {
    }

    @C8579l
    /* renamed from: A */
    void mo14888A();

    @C8579l
    /* renamed from: C */
    void mo14893C(@C12580l Object obj);

    @C8579l
    /* renamed from: D */
    void mo14896D();

    @C8579l
    /* renamed from: E */
    void mo14899E();

    @C8595o0
    /* renamed from: G */
    void mo14903G(@C12579k C8691w0<?> w0Var, @C12580l Object obj);

    /* renamed from: H */
    void mo14906H();

    @C8595o0
    /* renamed from: I */
    void mo14908I(@C12579k C11289a<C11079d2> aVar);

    /* renamed from: J */
    void mo14909J();

    @C12580l
    /* renamed from: K */
    C8586m1 mo14912K();

    @C8579l
    /* renamed from: L */
    void mo14915L();

    @C8579l
    /* renamed from: M */
    void mo14918M(int i);

    @C8579l
    @C12580l
    /* renamed from: N */
    Object mo14921N();

    @C12579k
    /* renamed from: O */
    C8679a mo14924O();

    @C8579l
    /* renamed from: P */
    boolean mo14927P(@C12580l Object obj) {
        return mo15006n0(obj);
    }

    @C8579l
    /* renamed from: Q */
    void mo14930Q();

    @C8579l
    /* renamed from: R */
    void mo14933R(int i, @C12580l Object obj);

    @C8579l
    /* renamed from: T */
    void mo14938T();

    @C8579l
    /* renamed from: U */
    void mo14941U();

    @C8579l
    /* renamed from: V */
    void mo14944V(int i, @C12580l Object obj);

    @C8579l
    /* renamed from: W */
    <T> void mo14947W(@C12579k C11289a<? extends T> aVar);

    @C12580l
    /* renamed from: X */
    Object mo14950X();

    /* renamed from: Y */
    void mo14953Y(@C12579k String str);

    /* renamed from: a */
    int mo14957a();

    @C8579l
    /* renamed from: a0 */
    void mo14958a0();

    @C8579l
    /* renamed from: b */
    boolean mo14961b(boolean z) {
        return mo14961b(z);
    }

    @C8579l
    /* renamed from: c */
    boolean mo14964c(short s) {
        return mo14964c(s);
    }

    /* renamed from: c0 */
    void mo14965c0(int i, @C12579k String str);

    @C8579l
    /* renamed from: d */
    boolean mo14968d(float f) {
        return mo14968d(f);
    }

    @C12579k
    /* renamed from: d0 */
    C8696y mo14969d0();

    @C8579l
    /* renamed from: e */
    void mo14972e();

    @C8595o0
    /* renamed from: e0 */
    void mo14973e0();

    @C8579l
    /* renamed from: f */
    boolean mo14976f(int i) {
        return mo14976f(i);
    }

    /* renamed from: f0 */
    boolean mo14977f0();

    @C8579l
    /* renamed from: g */
    boolean mo14980g(long j) {
        return mo14980g(j);
    }

    @C8595o0
    /* renamed from: g0 */
    void mo14981g0(@C12579k C8586m1 m1Var);

    @C8579l
    /* renamed from: i */
    boolean mo14985i(byte b) {
        return mo14985i(b);
    }

    /* renamed from: i0 */
    int mo14986i0();

    @C8579l
    /* renamed from: j */
    boolean mo14989j(char c) {
        return mo14989j(c);
    }

    @C8595o0
    @C12579k
    /* renamed from: j0 */
    C8602q mo14990j0();

    @C8579l
    /* renamed from: k */
    boolean mo14993k(double d) {
        return mo14993k(d);
    }

    /* renamed from: k0 */
    void mo14994k0();

    /* renamed from: l */
    boolean mo14997l();

    @C8579l
    /* renamed from: l0 */
    void mo14998l0();

    @C8579l
    /* renamed from: m */
    void mo15001m(boolean z);

    @C8579l
    /* renamed from: m0 */
    void mo15002m0();

    @C8579l
    /* renamed from: n */
    void mo15005n();

    @C8579l
    /* renamed from: n0 */
    boolean mo15006n0(@C12580l Object obj);

    @C8579l
    @C12579k
    /* renamed from: o */
    C8592o mo15009o(int i);

    /* renamed from: p */
    boolean mo15011p();

    @C8595o0
    /* renamed from: p0 */
    void mo15012p0(@C12579k C8572j1<?>[] j1VarArr);

    @C8595o0
    /* renamed from: q */
    void mo15014q(@C12579k List<Pair<C8697y0, C8697y0>> list);

    @C12579k
    /* renamed from: r */
    C8428d<?> mo15017r();

    @C8579l
    @C12580l
    /* renamed from: s */
    C8678t1 mo15020s();

    @C8579l
    @C12579k
    /* renamed from: t */
    Object mo15023t(@C12580l Object obj, @C12580l Object obj2);

    @C8579l
    /* renamed from: u */
    void mo15026u();

    @C8579l
    /* renamed from: v */
    <V, T> void mo15029v(V v, @C12579k C11304p<? super T, ? super V, C11079d2> pVar);

    @C8595o0
    /* renamed from: w */
    <T> T mo15032w(@C12579k C8682u<T> uVar);

    @C8579l
    /* renamed from: y */
    void mo15037y(int i);

    @C12579k
    /* renamed from: z */
    CoroutineContext mo15040z();
}
