package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11403m0;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10942h0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.functions.C11308t;
import kotlin.jvm.functions.C11309u;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11471o;
import kotlin.reflect.C11494d;
import kotlin.sequences.C11559m;
import kotlin.time.C11636e;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12145t1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11740d;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.g */
public final class C11909g {
    @C12579k

    /* renamed from: a */
    public static final String f29468a = "kotlinx.coroutines.flow.defaultConcurrency";

    @C12580l
    /* renamed from: A */
    public static final <T> Object m47348A(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        return FlowKt__CollectKt.m47012f(eVar, pVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @C11587t0(expression = "flatMapConcat(mapper)", imports = {}))
    @C12579k
    /* renamed from: A0 */
    public static final <T, R> C11907e<R> m47349A0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.m47125l(eVar, pVar);
    }

    @C12579k
    /* renamed from: A1 */
    public static final <T> C11907e<T> m47350A1(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super T, ? super T, ? super C11045c<? super T>, ? extends Object> qVar) {
        return FlowKt__TransformKt.m47178j(eVar, qVar);
    }

    @C12580l
    /* renamed from: B */
    public static final <T> Object m47351B(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        return FlowKt__LimitKt.m47075b(eVar, pVar, cVar);
    }

    @C12095s1
    @C12579k
    /* renamed from: B0 */
    public static final <T, R> C11907e<R> m47352B0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.m47085a(eVar, pVar);
    }

    @C12145t1
    @C12579k
    /* renamed from: B1 */
    public static final <T> C11907e<T> m47353B1(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__DelayKt.m47031h(eVar, j);
    }

    @C12095s1
    @C12579k
    /* renamed from: C0 */
    public static final <T, R> C11907e<R> m47355C0(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.m47086b(eVar, pVar);
    }

    @C12145t1
    @C12579k
    /* renamed from: C1 */
    public static final <T> C11907e<T> m47356C1(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__DelayKt.m47032i(eVar, j);
    }

    @C12579k
    /* renamed from: D */
    public static final <T1, T2, R> C11907e<R> m47357D(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.m47193c(eVar, eVar2, qVar);
    }

    @C12095s1
    @C12579k
    /* renamed from: D0 */
    public static final <T, R> C11907e<R> m47358D0(@C12579k C11907e<? extends T> eVar, int i, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.m47087c(eVar, i, pVar);
    }

    @C12579k
    /* renamed from: D1 */
    public static final <T, R> C11907e<R> m47359D1(@C12579k C11907e<? extends T> eVar, R r, @C12579k @C10863b C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.m47179k(eVar, r, qVar);
    }

    @C12579k
    /* renamed from: E */
    public static final <T1, T2, T3, R> C11907e<R> m47360E(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k @C10863b C11306r<? super T1, ? super T2, ? super T3, ? super C11045c<? super R>, ? extends Object> rVar) {
        return FlowKt__ZipKt.m47194d(eVar, eVar2, eVar3, rVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @C11587t0(expression = "scan(initial, operation)", imports = {}))
    @C12579k
    /* renamed from: E1 */
    public static final <T, R> C11907e<R> m47362E1(@C12579k C11907e<? extends T> eVar, R r, @C12579k @C10863b C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.m47104B(eVar, r, qVar);
    }

    @C12579k
    /* renamed from: F */
    public static final <T1, T2, T3, T4, R> C11907e<R> m47363F(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11307s<? super T1, ? super T2, ? super T3, ? super T4, ? super C11045c<? super R>, ? extends Object> sVar) {
        return FlowKt__ZipKt.m47195e(eVar, eVar2, eVar3, eVar4, sVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @C11587t0(expression = "flattenConcat()", imports = {}))
    @C12579k
    /* renamed from: F0 */
    public static final <T> C11907e<T> m47364F0(@C12579k C11907e<? extends C11907e<? extends T>> eVar) {
        return FlowKt__MigrationKt.m47126m(eVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @C11587t0(expression = "runningReduce(operation)", imports = {}))
    @C12579k
    /* renamed from: F1 */
    public static final <T> C11907e<T> m47365F1(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super T, ? super T, ? super C11045c<? super T>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.m47105C(eVar, qVar);
    }

    @C12579k
    /* renamed from: G */
    public static final <T1, T2, T3, T4, T5, R> C11907e<R> m47366G(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11907e<? extends T5> eVar5, @C12579k C11308t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C11045c<? super R>, ? extends Object> tVar) {
        return FlowKt__ZipKt.m47196f(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    @C12095s1
    @C12579k
    /* renamed from: G0 */
    public static final <T> C11907e<T> m47367G0(@C12579k C11907e<? extends C11907e<? extends T>> eVar) {
        return FlowKt__MergeKt.m47089e(eVar);
    }

    @C12579k
    /* renamed from: G1 */
    public static final <T> C11944n<T> m47368G1(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var, @C12579k C11948r rVar, int i) {
        return FlowKt__ShareKt.m47163g(eVar, o0Var, rVar, i);
    }

    @C12095s1
    @C12579k
    /* renamed from: H0 */
    public static final <T> C11907e<T> m47370H0(@C12579k C11907e<? extends C11907e<? extends T>> eVar, int i) {
        return FlowKt__MergeKt.m47090f(eVar, i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "this.combine(other, transform)", imports = {}))
    @C12579k
    /* renamed from: I */
    public static final <T1, T2, R> C11907e<R> m47372I(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.m47115b(eVar, eVar2, qVar);
    }

    @C12580l
    /* renamed from: I1 */
    public static final <T> Object m47374I1(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47154j(eVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "combine(this, other, other2, transform)", imports = {}))
    @C12579k
    /* renamed from: J */
    public static final <T1, T2, T3, R> C11907e<R> m47375J(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11306r<? super T1, ? super T2, ? super T3, ? super C11045c<? super R>, ? extends Object> rVar) {
        return FlowKt__MigrationKt.m47116c(eVar, eVar2, eVar3, rVar);
    }

    @C12579k
    /* renamed from: J0 */
    public static final <T> C11907e<T> m47376J0(@C12579k @C10863b C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.m46997n(pVar);
    }

    @C12580l
    /* renamed from: J1 */
    public static final <T> Object m47377J1(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47155k(eVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @C12579k
    /* renamed from: K */
    public static final <T1, T2, T3, T4, R> C11907e<R> m47378K(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11307s<? super T1, ? super T2, ? super T3, ? super T4, ? super C11045c<? super R>, ? extends Object> sVar) {
        return FlowKt__MigrationKt.m47117d(eVar, eVar2, eVar3, eVar4, sVar);
    }

    @C11314h(name = "flowCombine")
    @C12579k
    /* renamed from: K0 */
    public static final <T1, T2, R> C11907e<R> m47379K0(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.m47206p(eVar, eVar2, qVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @C11587t0(expression = "drop(count)", imports = {}))
    @C12579k
    /* renamed from: K1 */
    public static final <T> C11907e<T> m47380K1(@C12579k C11907e<? extends T> eVar, int i) {
        return FlowKt__MigrationKt.m47106D(eVar, i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @C12579k
    /* renamed from: L */
    public static final <T1, T2, T3, T4, T5, R> C11907e<R> m47381L(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11907e<? extends T5> eVar5, @C12579k C11308t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C11045c<? super R>, ? extends Object> tVar) {
        return FlowKt__MigrationKt.m47118e(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    @C11314h(name = "flowCombineTransform")
    @C12579k
    /* renamed from: L0 */
    public static final <T1, T2, R> C11907e<R> m47382L0(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k @C10863b C11306r<? super C11908f<? super R>, ? super T1, ? super T2, ? super C11045c<? super C11079d2>, ? extends Object> rVar) {
        return FlowKt__ZipKt.m47207q(eVar, eVar2, rVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @C11587t0(expression = "onStart { emit(value) }", imports = {}))
    @C12579k
    /* renamed from: L1 */
    public static final <T> C11907e<T> m47383L1(@C12579k C11907e<? extends T> eVar, T t) {
        return FlowKt__MigrationKt.m47107E(eVar, t);
    }

    @C12579k
    /* renamed from: M0 */
    public static final <T> C11907e<T> m47385M0(T t) {
        return FlowKt__BuildersKt.m46998o(t);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @C11587t0(expression = "onStart { emitAll(other) }", imports = {}))
    @C12579k
    /* renamed from: M1 */
    public static final <T> C11907e<T> m47386M1(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        return FlowKt__MigrationKt.m47108F(eVar, eVar2);
    }

    @C12579k
    /* renamed from: N */
    public static final <T1, T2, R> C11907e<R> m47387N(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k @C10863b C11306r<? super C11908f<? super R>, ? super T1, ? super T2, ? super C11045c<? super C11079d2>, ? extends Object> rVar) {
        return FlowKt__ZipKt.m47199i(eVar, eVar2, rVar);
    }

    @C12579k
    /* renamed from: N0 */
    public static final <T> C11907e<T> m47388N0(@C12579k T... tArr) {
        return FlowKt__BuildersKt.m46999p(tArr);
    }

    @C12580l
    /* renamed from: N1 */
    public static final <T> Object m47389N1(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var, @C12579k C11045c<? super C11952u<? extends T>> cVar) {
        return FlowKt__ShareKt.m47165i(eVar, o0Var, cVar);
    }

    @C12579k
    /* renamed from: O */
    public static final <T1, T2, T3, R> C11907e<R> m47390O(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k @C10863b C11307s<? super C11908f<? super R>, ? super T1, ? super T2, ? super T3, ? super C11045c<? super C11079d2>, ? extends Object> sVar) {
        return FlowKt__ZipKt.m47200j(eVar, eVar2, eVar3, sVar);
    }

    @C12579k
    /* renamed from: O0 */
    public static final <T> C11907e<T> m47391O0(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        return C11910h.m47519h(eVar, coroutineContext);
    }

    @C12579k
    /* renamed from: O1 */
    public static final <T> C11952u<T> m47392O1(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var, @C12579k C11948r rVar, T t) {
        return FlowKt__ShareKt.m47166j(eVar, o0Var, rVar, t);
    }

    @C12579k
    /* renamed from: P */
    public static final <T1, T2, T3, T4, R> C11907e<R> m47393P(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k @C10863b C11308t<? super C11908f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super C11045c<? super C11079d2>, ? extends Object> tVar) {
        return FlowKt__ZipKt.m47201k(eVar, eVar2, eVar3, eVar4, tVar);
    }

    @C12580l
    /* renamed from: P0 */
    public static final <T, R> Object m47394P0(@C12579k C11907e<? extends T> eVar, R r, @C12579k C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar, @C12579k C11045c<? super R> cVar) {
        return FlowKt__ReduceKt.m47149e(eVar, r, qVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: P1 */
    public static final <T> void m47395P1(@C12579k C11907e<? extends T> eVar) {
        FlowKt__MigrationKt.m47109G(eVar);
    }

    @C12579k
    /* renamed from: Q */
    public static final <T1, T2, T3, T4, T5, R> C11907e<R> m47396Q(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11907e<? extends T5> eVar5, @C12579k @C10863b C11309u<? super C11908f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C11045c<? super C11079d2>, ? extends Object> uVar) {
        return FlowKt__ZipKt.m47202l(eVar, eVar2, eVar3, eVar4, eVar5, uVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @C11587t0(expression = "collect(action)", imports = {}))
    /* renamed from: Q0 */
    public static final <T> void m47397Q0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        FlowKt__MigrationKt.m47127n(eVar, pVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: Q1 */
    public static final <T> void m47398Q1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        FlowKt__MigrationKt.m47110H(eVar, pVar);
    }

    /* renamed from: R0 */
    public static final int m47400R0() {
        return FlowKt__MergeKt.m47092h();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: R1 */
    public static final <T> void m47401R1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11304p<? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> pVar2) {
        FlowKt__MigrationKt.m47111I(eVar, pVar, pVar2);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @C11587t0(expression = "let(transformer)", imports = {}))
    @C12579k
    /* renamed from: S */
    public static final <T, R> C11907e<R> m47402S(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super C11907e<? extends T>, ? extends C11907e<? extends R>> lVar) {
        return FlowKt__MigrationKt.m47119f(eVar, lVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @C12579k
    /* renamed from: S1 */
    public static final <T> C11907e<T> m47404S1(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.m47112J(eVar, coroutineContext);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @C11587t0(expression = "flatMapConcat(mapper)", imports = {}))
    @C12579k
    /* renamed from: T */
    public static final <T, R> C11907e<R> m47405T(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, ? extends C11907e<? extends R>> lVar) {
        return FlowKt__MigrationKt.m47120g(eVar, lVar);
    }

    @C12580l
    /* renamed from: T0 */
    public static final <T> Object m47406T0(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47151g(eVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @C11587t0(expression = "this.flatMapLatest(transform)", imports = {}))
    @C12579k
    /* renamed from: T1 */
    public static final <T, R> C11907e<R> m47407T1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.m47113K(eVar, pVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @C11587t0(expression = "onCompletion { emit(value) }", imports = {}))
    @C12579k
    /* renamed from: U */
    public static final <T> C11907e<T> m47408U(@C12579k C11907e<? extends T> eVar, T t) {
        return FlowKt__MigrationKt.m47121h(eVar, t);
    }

    @C12580l
    /* renamed from: U0 */
    public static final <T> Object m47409U0(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47152h(eVar, cVar);
    }

    @C12579k
    /* renamed from: U1 */
    public static final <T> C11907e<T> m47410U1(@C12579k C11907e<? extends T> eVar, int i) {
        return FlowKt__LimitKt.m47080g(eVar, i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @C11587t0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @C12579k
    /* renamed from: V */
    public static final <T> C11907e<T> m47411V(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        return FlowKt__MigrationKt.m47122i(eVar, eVar2);
    }

    @C12579k
    /* renamed from: V0 */
    public static final <T> C11723c2 m47412V0(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var) {
        return FlowKt__CollectKt.m47014h(eVar, o0Var);
    }

    @C12579k
    /* renamed from: V1 */
    public static final <T> C11907e<T> m47413V1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.m47081h(eVar, pVar);
    }

    @C12579k
    /* renamed from: W */
    public static final <T> C11907e<T> m47414W(@C12579k C11907e<? extends T> eVar) {
        return C11910h.m47518g(eVar);
    }

    @C12579k
    /* renamed from: W0 */
    public static final <T, R> C11907e<R> m47415W0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.m47174f(eVar, pVar);
    }

    @C12145t1
    @C12579k
    /* renamed from: W1 */
    public static final <T> C11907e<T> m47416W1(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__DelayKt.m47033j(eVar, j);
    }

    @C12579k
    /* renamed from: X */
    public static final <T> C11907e<T> m47417X(@C12579k ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.m47002c(receiveChannel);
    }

    @C12095s1
    @C12579k
    /* renamed from: X0 */
    public static final <T, R> C11907e<R> m47418X0(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.m47095k(eVar, pVar);
    }

    @C12580l
    /* renamed from: X1 */
    public static final <T, C extends Collection<? super T>> Object m47419X1(@C12579k C11907e<? extends T> eVar, @C12579k C c, @C12579k C11045c<? super C> cVar) {
        return FlowKt__CollectionKt.m47017a(eVar, c, cVar);
    }

    @C12580l
    /* renamed from: Y */
    public static final <T> Object m47420Y(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super Integer> cVar) {
        return FlowKt__CountKt.m47022a(eVar, cVar);
    }

    @C12579k
    /* renamed from: Y0 */
    public static final <T, R> C11907e<R> m47421Y0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.m47175g(eVar, pVar);
    }

    @C12580l
    /* renamed from: Y1 */
    public static final <T> Object m47422Y1(@C12579k C11907e<? extends T> eVar, @C12579k List<T> list, @C12579k C11045c<? super List<? extends T>> cVar) {
        return FlowKt__CollectionKt.m47018b(eVar, list, cVar);
    }

    @C12580l
    /* renamed from: Z */
    public static final <T> Object m47423Z(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar, @C12579k C11045c<? super Integer> cVar) {
        return FlowKt__CountKt.m47023b(eVar, pVar, cVar);
    }

    @C12579k
    /* renamed from: Z0 */
    public static final <T> C11907e<T> m47424Z0(@C12579k Iterable<? extends C11907e<? extends T>> iterable) {
        return FlowKt__MergeKt.m47096l(iterable);
    }

    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m47426a(@C12579k Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.m46984a(iterable);
    }

    @C12145t1
    @C12579k
    /* renamed from: a0 */
    public static final <T> C11907e<T> m47427a0(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__DelayKt.m47024a(eVar, j);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @C11587t0(expression = "flattenConcat()", imports = {}))
    @C12579k
    /* renamed from: a1 */
    public static final <T> C11907e<T> m47428a1(@C12579k C11907e<? extends C11907e<? extends T>> eVar) {
        return FlowKt__MigrationKt.m47128o(eVar);
    }

    @C12580l
    /* renamed from: a2 */
    public static final <T> Object m47429a2(@C12579k C11907e<? extends T> eVar, @C12579k Set<T> set, @C12579k C11045c<? super Set<? extends T>> cVar) {
        return FlowKt__CollectionKt.m47020d(eVar, set, cVar);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m47430b(@C12579k Iterator<? extends T> it) {
        return FlowKt__BuildersKt.m46985b(it);
    }

    @C12145t1
    @C11403m0
    @C12579k
    /* renamed from: b0 */
    public static final <T> C11907e<T> m47431b0(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, Long> lVar) {
        return FlowKt__DelayKt.m47025b(eVar, lVar);
    }

    @C12579k
    /* renamed from: b1 */
    public static final <T> C11907e<T> m47432b1(@C12579k C11907e<? extends T>... eVarArr) {
        return FlowKt__MergeKt.m47097m(eVarArr);
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C11907e<T> m47434c(@C12579k C11289a<? extends T> aVar) {
        return FlowKt__BuildersKt.m46986c(aVar);
    }

    @C12145t1
    @C12579k
    /* renamed from: c0 */
    public static final <T> C11907e<T> m47435c0(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__DelayKt.m47026c(eVar, j);
    }

    @C12579k
    /* renamed from: c1 */
    public static final Void m47436c1() {
        return FlowKt__MigrationKt.m47129p();
    }

    @C12579k
    /* renamed from: c2 */
    public static final <T, R> C11907e<R> m47437c2(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.m47058g(eVar, qVar);
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m47438d(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar) {
        return FlowKt__BuildersKt.m46987d(lVar);
    }

    @C12145t1
    @C11314h(name = "debounceDuration")
    @C11403m0
    @C12579k
    /* renamed from: d0 */
    public static final <T> C11907e<T> m47439d0(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, C11636e> lVar) {
        return FlowKt__DelayKt.m47027d(eVar, lVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @C12579k
    /* renamed from: d1 */
    public static final <T> C11907e<T> m47440d1(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.m47130q(eVar, coroutineContext);
    }

    @C12095s1
    @C12579k
    /* renamed from: d2 */
    public static final <T, R> C11907e<R> m47441d2(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return FlowKt__MergeKt.m47098n(eVar, qVar);
    }

    @C12579k
    /* renamed from: e */
    public static final C11907e<Integer> m47442e(@C12579k C11466l lVar) {
        return FlowKt__BuildersKt.m46988e(lVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @C11587t0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @C12579k
    /* renamed from: e0 */
    public static final <T> C11907e<T> m47443e0(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__MigrationKt.m47123j(eVar, j);
    }

    @C12579k
    /* renamed from: e1 */
    public static final <T> C11907e<T> m47444e1(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super C11908f<? super T>, ? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.m47055d(eVar, qVar);
    }

    @C12579k
    /* renamed from: e2 */
    public static final <T, R> C11907e<R> m47445e2(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.m47082i(eVar, qVar);
    }

    @C12579k
    /* renamed from: f */
    public static final C11907e<Long> m47446f(@C12579k C11471o oVar) {
        return FlowKt__BuildersKt.m46989f(oVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @C11587t0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @C12579k
    /* renamed from: f0 */
    public static final <T> C11907e<T> m47447f0(@C12579k C11907e<? extends T> eVar, long j) {
        return FlowKt__MigrationKt.m47124k(eVar, j);
    }

    @C12579k
    /* renamed from: f1 */
    public static final <T> C11907e<T> m47448f1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__TransformKt.m47176h(eVar, pVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: f2 */
    public static final <T, R> C11907e<R> m47449f2(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.m47059h(eVar, qVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m47450g(@C12579k C11559m<? extends T> mVar) {
        return FlowKt__BuildersKt.m46990g(mVar);
    }

    @C12579k
    /* renamed from: g0 */
    public static final <T> C11907e<T> m47451g0(@C12579k C11907e<? extends T> eVar) {
        return FlowKt__DistinctKt.m47047a(eVar);
    }

    @C12579k
    /* renamed from: g1 */
    public static final <T> C11907e<T> m47452g1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.m47056e(eVar, pVar);
    }

    @C12579k
    /* renamed from: g2 */
    public static final <T> C11907e<C10942h0<T>> m47453g2(@C12579k C11907e<? extends T> eVar) {
        return FlowKt__TransformKt.m47180l(eVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47454h(@C12579k C11740d<T> dVar) {
        return FlowKt__ChannelsKt.m47001b(dVar);
    }

    @C12579k
    /* renamed from: h0 */
    public static final <T> C11907e<T> m47455h0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super T, Boolean> pVar) {
        return FlowKt__DistinctKt.m47048b(eVar, pVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @C11587t0(expression = "catch { emitAll(fallback) }", imports = {}))
    @C12579k
    /* renamed from: h1 */
    public static final <T> C11907e<T> m47456h1(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        return FlowKt__MigrationKt.m47131r(eVar, eVar2);
    }

    @C12579k
    /* renamed from: h2 */
    public static final <T1, T2, R> C11907e<R> m47457h2(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.m47209s(eVar, eVar2, qVar);
    }

    @C12579k
    /* renamed from: i */
    public static final C11907e<Integer> m47458i(@C12579k int[] iArr) {
        return FlowKt__BuildersKt.m46991h(iArr);
    }

    @C12579k
    /* renamed from: i0 */
    public static final <T, K> C11907e<T> m47459i0(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        return FlowKt__DistinctKt.m47049c(eVar, lVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @C11587t0(expression = "catch { emitAll(fallback) }", imports = {}))
    @C12579k
    /* renamed from: i1 */
    public static final <T> C11907e<T> m47460i1(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        return FlowKt__MigrationKt.m47132s(eVar, eVar2);
    }

    @C12579k
    /* renamed from: j */
    public static final C11907e<Long> m47461j(@C12579k long[] jArr) {
        return FlowKt__BuildersKt.m46992i(jArr);
    }

    @C12579k
    /* renamed from: j0 */
    public static final <T> C11907e<T> m47462j0(@C12579k C11907e<? extends T> eVar, int i) {
        return FlowKt__LimitKt.m47077d(eVar, i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @C11587t0(expression = "catch { emit(fallback) }", imports = {}))
    @C12579k
    /* renamed from: j1 */
    public static final <T> C11907e<T> m47463j1(@C12579k C11907e<? extends T> eVar, T t) {
        return FlowKt__MigrationKt.m47133t(eVar, t);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> C11907e<T> m47464k(@C12579k T[] tArr) {
        return FlowKt__BuildersKt.m46993j(tArr);
    }

    @C12579k
    /* renamed from: k0 */
    public static final <T> C11907e<T> m47465k0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.m47078e(eVar, pVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @C11587t0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @C12579k
    /* renamed from: k1 */
    public static final <T> C11907e<T> m47466k1(@C12579k C11907e<? extends T> eVar, T t, @C12579k C11300l<? super Throwable, Boolean> lVar) {
        return FlowKt__MigrationKt.m47134u(eVar, t, lVar);
    }

    @C12579k
    /* renamed from: l */
    public static final <T> C11944n<T> m47467l(@C12579k C11911i<T> iVar) {
        return FlowKt__ShareKt.m47157a(iVar);
    }

    @C12580l
    /* renamed from: l0 */
    public static final <T> Object m47468l0(@C12579k C11908f<? super T> fVar, @C12579k ReceiveChannel<? extends T> receiveChannel, @C12579k C11045c<? super C11079d2> cVar) {
        return FlowKt__ChannelsKt.m47003d(fVar, receiveChannel, cVar);
    }

    @C12579k
    /* renamed from: m */
    public static final <T> C11952u<T> m47470m(@C12579k C11940j<T> jVar) {
        return FlowKt__ShareKt.m47158b(jVar);
    }

    @C12580l
    /* renamed from: m0 */
    public static final <T> Object m47471m0(@C12579k C11908f<? super T> fVar, @C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super C11079d2> cVar) {
        return FlowKt__CollectKt.m47013g(fVar, eVar, cVar);
    }

    @C12579k
    /* renamed from: m1 */
    public static final <T> C11907e<T> m47472m1(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.m47057f(eVar, pVar);
    }

    @C12579k
    /* renamed from: n0 */
    public static final <T> C11907e<T> m47474n0() {
        return FlowKt__BuildersKt.m46996m();
    }

    @C12579k
    /* renamed from: n1 */
    public static final <T> C11944n<T> m47475n1(@C12579k C11944n<? extends T> nVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__ShareKt.m47162f(nVar, pVar);
    }

    @C12579k
    /* renamed from: o */
    public static final <T> C11907e<T> m47476o(@C12579k C11907e<? extends T> eVar, int i, @C12579k BufferOverflow bufferOverflow) {
        return C11910h.m47513b(eVar, i, bufferOverflow);
    }

    /* renamed from: o0 */
    public static final void m47477o0(@C12579k C11908f<?> fVar) {
        FlowKt__EmittersKt.m47053b(fVar);
    }

    @C12579k
    /* renamed from: o1 */
    public static final <T> ReceiveChannel<T> m47478o1(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var) {
        return FlowKt__ChannelsKt.m47005f(eVar, o0Var);
    }

    @C12579k
    /* renamed from: p0 */
    public static final <T> C11907e<T> m47480p0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.m47169a(eVar, pVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.shareIn(scope, 0)", imports = {}))
    @C12579k
    /* renamed from: p1 */
    public static final <T> C11907e<T> m47481p1(@C12579k C11907e<? extends T> eVar) {
        return FlowKt__MigrationKt.m47136w(eVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @C12579k
    /* renamed from: q1 */
    public static final <T> C11907e<T> m47484q1(@C12579k C11907e<? extends T> eVar, int i) {
        return FlowKt__MigrationKt.m47137x(eVar, i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @C11587t0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @C12579k
    /* renamed from: r */
    public static final <T> C11907e<T> m47485r(@C12579k C11907e<? extends T> eVar) {
        return FlowKt__MigrationKt.m47114a(eVar);
    }

    @C12579k
    /* renamed from: r0 */
    public static final <R> C11907e<R> m47486r0(@C12579k C11907e<?> eVar, @C12579k C11494d<R> dVar) {
        return FlowKt__TransformKt.m47171c(eVar, dVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @C12579k
    /* renamed from: r1 */
    public static final <T> C11907e<T> m47487r1(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.m47138y(eVar, coroutineContext);
    }

    @C12579k
    /* renamed from: s */
    public static final <T> C11907e<T> m47488s(@C12579k @C10863b C11304p<? super C11760r<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.m46994k(pVar);
    }

    @C12579k
    /* renamed from: s0 */
    public static final <T> C11907e<T> m47489s0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.m47172d(eVar, pVar);
    }

    @C12579k
    /* renamed from: s1 */
    public static final <T> C11907e<T> m47490s1(@C12579k ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.m47006g(receiveChannel);
    }

    @C12579k
    /* renamed from: t */
    public static final <T> C11907e<T> m47491t(@C12579k C11907e<? extends T> eVar) {
        return C11910h.m47516e(eVar);
    }

    @C12579k
    /* renamed from: t0 */
    public static final <T> C11907e<T> m47492t0(@C12579k C11907e<? extends T> eVar) {
        return FlowKt__TransformKt.m47173e(eVar);
    }

    @C12580l
    /* renamed from: t1 */
    public static final <S, T extends S> Object m47493t1(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super S, ? super T, ? super C11045c<? super S>, ? extends Object> qVar, @C12579k C11045c<? super S> cVar) {
        return FlowKt__ReduceKt.m47153i(eVar, qVar, cVar);
    }

    @C12579k
    /* renamed from: u */
    public static final <T> C11907e<T> m47494u(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super C11908f<? super T>, ? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.m47065a(eVar, qVar);
    }

    @C12580l
    /* renamed from: u0 */
    public static final <T> Object m47495u0(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47145a(eVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @C12579k
    /* renamed from: u1 */
    public static final <T> C11907e<T> m47496u1(@C12579k C11907e<? extends T> eVar) {
        return FlowKt__MigrationKt.m47139z(eVar);
    }

    @C12580l
    /* renamed from: v */
    public static final <T> Object m47497v(@C12579k C11907e<? extends T> eVar, @C12579k C11908f<? super T> fVar, @C12579k C11045c<? super Throwable> cVar) {
        return FlowKt__ErrorsKt.m47066b(eVar, fVar, cVar);
    }

    @C12580l
    /* renamed from: v0 */
    public static final <T> Object m47498v0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47146b(eVar, pVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @C12579k
    /* renamed from: v1 */
    public static final <T> C11907e<T> m47499v1(@C12579k C11907e<? extends T> eVar, int i) {
        return FlowKt__MigrationKt.m47103A(eVar, i);
    }

    @C12579k
    /* renamed from: w */
    public static final <T> C11907e<T> m47500w(@C12579k @C10863b C11304p<? super C11760r<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.m46995l(pVar);
    }

    @C12580l
    /* renamed from: w0 */
    public static final <T> Object m47501w0(@C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47147c(eVar, cVar);
    }

    @C12579k
    /* renamed from: w1 */
    public static final <T> C11907e<T> m47502w1(@C12579k C11907e<? extends T> eVar, long j, @C12579k C11304p<? super Throwable, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__ErrorsKt.m47069e(eVar, j, pVar);
    }

    @C12580l
    /* renamed from: x */
    public static final Object m47503x(@C12579k C11907e<?> eVar, @C12579k C11045c<? super C11079d2> cVar) {
        return FlowKt__CollectKt.m47007a(eVar, cVar);
    }

    @C12580l
    /* renamed from: x0 */
    public static final <T> Object m47504x0(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return FlowKt__ReduceKt.m47148d(eVar, pVar, cVar);
    }

    @C12579k
    /* renamed from: y0 */
    public static final ReceiveChannel<C11079d2> m47507y0(@C12579k C12074o0 o0Var, long j, long j2) {
        return FlowKt__DelayKt.m47029f(o0Var, j, j2);
    }

    @C12579k
    /* renamed from: y1 */
    public static final <T> C11907e<T> m47508y1(@C12579k C11907e<? extends T> eVar, @C12579k C11306r<? super C11908f<? super T>, ? super Throwable, ? super Long, ? super C11045c<? super Boolean>, ? extends Object> rVar) {
        return FlowKt__ErrorsKt.m47071g(eVar, rVar);
    }

    @C12580l
    /* renamed from: z */
    public static final <T> Object m47509z(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super Integer, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12579k C11045c<? super C11079d2> cVar) {
        return FlowKt__CollectKt.m47010d(eVar, qVar, cVar);
    }

    @C12579k
    /* renamed from: z1 */
    public static final <T, R> C11907e<R> m47511z1(@C12579k C11907e<? extends T> eVar, R r, @C12579k @C10863b C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.m47177i(eVar, r, qVar);
    }
}
