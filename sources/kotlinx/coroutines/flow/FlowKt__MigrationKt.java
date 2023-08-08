package kotlinx.coroutines.flow;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.functions.C11308t;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,496:1\n193#2:497\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n435#1:497\n*E\n"})
public final /* synthetic */ class FlowKt__MigrationKt {
    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @C12579k
    /* renamed from: A */
    public static final <T> C11907e<T> m47103A(@C12579k C11907e<? extends T> eVar, int i) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @C11587t0(expression = "scan(initial, operation)", imports = {}))
    @C12579k
    /* renamed from: B */
    public static final <T, R> C11907e<R> m47104B(@C12579k C11907e<? extends T> eVar, R r, @C12579k @C10863b C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @C11587t0(expression = "runningReduce(operation)", imports = {}))
    @C12579k
    /* renamed from: C */
    public static final <T> C11907e<T> m47105C(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super T, ? super T, ? super C11045c<? super T>, ? extends Object> qVar) {
        return C11909g.m47350A1(eVar, qVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @C11587t0(expression = "drop(count)", imports = {}))
    @C12579k
    /* renamed from: D */
    public static final <T> C11907e<T> m47106D(@C12579k C11907e<? extends T> eVar, int i) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @C11587t0(expression = "onStart { emit(value) }", imports = {}))
    @C12579k
    /* renamed from: E */
    public static final <T> C11907e<T> m47107E(@C12579k C11907e<? extends T> eVar, T t) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @C11587t0(expression = "onStart { emitAll(other) }", imports = {}))
    @C12579k
    /* renamed from: F */
    public static final <T> C11907e<T> m47108F(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: G */
    public static final <T> void m47109G(@C12579k C11907e<? extends T> eVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: H */
    public static final <T> void m47110H(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: I */
    public static final <T> void m47111I(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11304p<? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> pVar2) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @C12579k
    /* renamed from: J */
    public static final <T> C11907e<T> m47112J(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @C11587t0(expression = "this.flatMapLatest(transform)", imports = {}))
    @C12579k
    /* renamed from: K */
    public static final <T, R> C11907e<R> m47113K(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return C11909g.m47441d2(eVar, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, (C11045c) null));
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @C11587t0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m47114a(@C12579k C11907e<? extends T> eVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "this.combine(other, transform)", imports = {}))
    @C12579k
    /* renamed from: b */
    public static final <T1, T2, R> C11907e<R> m47115b(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return C11909g.m47357D(eVar, eVar2, qVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "combine(this, other, other2, transform)", imports = {}))
    @C12579k
    /* renamed from: c */
    public static final <T1, T2, T3, R> C11907e<R> m47116c(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11306r<? super T1, ? super T2, ? super T3, ? super C11045c<? super R>, ? extends Object> rVar) {
        return C11909g.m47360E(eVar, eVar2, eVar3, rVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @C12579k
    /* renamed from: d */
    public static final <T1, T2, T3, T4, R> C11907e<R> m47117d(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11307s<? super T1, ? super T2, ? super T3, ? super T4, ? super C11045c<? super R>, ? extends Object> sVar) {
        return C11909g.m47363F(eVar, eVar2, eVar3, eVar4, sVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @C11587t0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @C12579k
    /* renamed from: e */
    public static final <T1, T2, T3, T4, T5, R> C11907e<R> m47118e(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11907e<? extends T5> eVar5, @C12579k C11308t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C11045c<? super R>, ? extends Object> tVar) {
        return C11909g.m47366G(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @C11587t0(expression = "let(transformer)", imports = {}))
    @C12579k
    /* renamed from: f */
    public static final <T, R> C11907e<R> m47119f(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super C11907e<? extends T>, ? extends C11907e<? extends R>> lVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @C11587t0(expression = "flatMapConcat(mapper)", imports = {}))
    @C12579k
    /* renamed from: g */
    public static final <T, R> C11907e<R> m47120g(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, ? extends C11907e<? extends R>> lVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @C11587t0(expression = "onCompletion { emit(value) }", imports = {}))
    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47121h(@C12579k C11907e<? extends T> eVar, T t) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @C11587t0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @C12579k
    /* renamed from: i */
    public static final <T> C11907e<T> m47122i(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @C11587t0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @C12579k
    /* renamed from: j */
    public static final <T> C11907e<T> m47123j(@C12579k C11907e<? extends T> eVar, long j) {
        return C11909g.m47448f1(eVar, new FlowKt__MigrationKt$delayEach$1(j, (C11045c<? super FlowKt__MigrationKt$delayEach$1>) null));
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @C11587t0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @C12579k
    /* renamed from: k */
    public static final <T> C11907e<T> m47124k(@C12579k C11907e<? extends T> eVar, long j) {
        return C11909g.m47472m1(eVar, new FlowKt__MigrationKt$delayFlow$1(j, (C11045c<? super FlowKt__MigrationKt$delayFlow$1>) null));
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @C11587t0(expression = "flatMapConcat(mapper)", imports = {}))
    @C12579k
    /* renamed from: l */
    public static final <T, R> C11907e<R> m47125l(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @C11587t0(expression = "flattenConcat()", imports = {}))
    @C12579k
    /* renamed from: m */
    public static final <T> C11907e<T> m47126m(@C12579k C11907e<? extends C11907e<? extends T>> eVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @C11587t0(expression = "collect(action)", imports = {}))
    /* renamed from: n */
    public static final <T> void m47127n(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @C11587t0(expression = "flattenConcat()", imports = {}))
    @C12579k
    /* renamed from: o */
    public static final <T> C11907e<T> m47128o(@C12579k C11907e<? extends C11907e<? extends T>> eVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: p */
    public static final Void m47129p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @C12579k
    /* renamed from: q */
    public static final <T> C11907e<T> m47130q(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @C11587t0(expression = "catch { emitAll(fallback) }", imports = {}))
    @C12579k
    /* renamed from: r */
    public static final <T> C11907e<T> m47131r(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @C11587t0(expression = "catch { emitAll(fallback) }", imports = {}))
    @C12579k
    /* renamed from: s */
    public static final <T> C11907e<T> m47132s(@C12579k C11907e<? extends T> eVar, @C12579k C11907e<? extends T> eVar2) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @C11587t0(expression = "catch { emit(fallback) }", imports = {}))
    @C12579k
    /* renamed from: t */
    public static final <T> C11907e<T> m47133t(@C12579k C11907e<? extends T> eVar, T t) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @C11587t0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @C12579k
    /* renamed from: u */
    public static final <T> C11907e<T> m47134u(@C12579k C11907e<? extends T> eVar, T t, @C12579k C11300l<? super Throwable, Boolean> lVar) {
        return C11909g.m47494u(eVar, new FlowKt__MigrationKt$onErrorReturn$2(lVar, t, (C11045c<? super FlowKt__MigrationKt$onErrorReturn$2>) null));
    }

    /* renamed from: v */
    public static /* synthetic */ C11907e m47135v(C11907e eVar, Object obj, C11300l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = FlowKt__MigrationKt$onErrorReturn$1.f29361f;
        }
        return C11909g.m47466k1(eVar, obj, lVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.shareIn(scope, 0)", imports = {}))
    @C12579k
    /* renamed from: w */
    public static final <T> C11907e<T> m47136w(@C12579k C11907e<? extends T> eVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @C12579k
    /* renamed from: x */
    public static final <T> C11907e<T> m47137x(@C12579k C11907e<? extends T> eVar, int i) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @C12579k
    /* renamed from: y */
    public static final <T> C11907e<T> m47138y(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @C11587t0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @C12579k
    /* renamed from: z */
    public static final <T> C11907e<T> m47139z(@C12579k C11907e<? extends T> eVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }
}
