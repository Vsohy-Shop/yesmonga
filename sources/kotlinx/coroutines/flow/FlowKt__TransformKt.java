package kotlinx.coroutines.flow;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.collections.C10942h0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.C11494d;
import kotlinx.coroutines.flow.internal.C11936l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,136:1\n21#1:143\n23#1:147\n21#1:148\n23#1:152\n50#2:137\n55#2:139\n50#2:140\n55#2:142\n50#2:144\n55#2:146\n50#2:149\n55#2:151\n50#2:153\n55#2:155\n50#2:156\n55#2:158\n50#2:159\n55#2:161\n50#2:163\n55#2:165\n106#3:138\n106#3:141\n106#3:145\n106#3:150\n106#3:154\n106#3:157\n106#3:160\n106#3:162\n106#3:164\n106#3:166\n106#3:167\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n36#1:143\n36#1:147\n41#1:148\n41#1:152\n21#1:137\n21#1:139\n28#1:140\n28#1:142\n36#1:144\n36#1:146\n41#1:149\n41#1:151\n46#1:153\n46#1:155\n53#1:156\n53#1:158\n60#1:159\n60#1:161\n78#1:163\n78#1:165\n21#1:138\n28#1:141\n36#1:145\n41#1:150\n46#1:154\n53#1:157\n60#1:160\n68#1:162\n78#1:164\n105#1:166\n125#1:167\n*E\n"})
public final /* synthetic */ class FlowKt__TransformKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,112:1\n126#2,10:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a */
    public static final class C11854a implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29379a;

        /* renamed from: b */
        public final /* synthetic */ C11305q f29380b;

        public C11854a(C11907e eVar, C11305q qVar) {
            this.f29379a = eVar;
            this.f29380b = qVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = C11936l.f29516a;
            Object collect = this.f29379a.collect(new FlowKt__TransformKt$runningReduce$1$1(objectRef, this.f29380b, fVar), cVar);
            if (collect == C11063b.m42612h()) {
                return collect;
            }
            return C11079d2.f28267a;
        }
    }

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,112:1\n69#2,5:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$b */
    public static final class C11855b implements C11907e<C10942h0<? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29381a;

        public C11855b(C11907e eVar) {
            this.f29381a = eVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super C10942h0<? extends T>> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object collect = this.f29381a.collect(new FlowKt__TransformKt$withIndex$1$1(fVar, new Ref.IntRef()), cVar);
            if (collect == C11063b.m42612h()) {
                return collect;
            }
            return C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m47169a(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: c */
    public static final <R> C11907e<R> m47171c(@C12579k C11907e<?> eVar, @C12579k C11494d<R> dVar) {
        return new FlowKt__TransformKt$filterIsInstance$$inlined$filter$2(eVar, dVar);
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m47172d(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47173e(@C12579k C11907e<? extends T> eVar) {
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(eVar);
    }

    @C12579k
    /* renamed from: f */
    public static final <T, R> C11907e<R> m47174f(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T, R> C11907e<R> m47175g(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47176h(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: i */
    public static final <T, R> C11907e<R> m47177i(@C12579k C11907e<? extends T> eVar, R r, @C12579k @C10863b C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r, eVar, qVar);
    }

    @C12579k
    /* renamed from: j */
    public static final <T> C11907e<T> m47178j(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super T, ? super T, ? super C11045c<? super T>, ? extends Object> qVar) {
        return new C11854a(eVar, qVar);
    }

    @C12579k
    /* renamed from: k */
    public static final <T, R> C11907e<R> m47179k(@C12579k C11907e<? extends T> eVar, R r, @C12579k @C10863b C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        return C11909g.m47511z1(eVar, r, qVar);
    }

    @C12579k
    /* renamed from: l */
    public static final <T> C11907e<C10942h0<T>> m47180l(@C12579k C11907e<? extends T> eVar) {
        return new C11855b(eVar);
    }
}
