package kotlinx.coroutines.flow;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.functions.C11308t;
import kotlin.jvm.functions.C11309u;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,332:1\n272#1,3:334\n272#1,3:337\n261#1:340\n263#1:342\n272#1,3:343\n261#1:346\n263#1:348\n272#1,3:349\n261#1:352\n263#1:354\n272#1,3:355\n106#2:333\n106#2:341\n106#2:347\n106#2:353\n106#2:358\n106#2:359\n106#2:362\n37#3,2:360\n37#3,2:363\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n75#1:334,3\n103#1:337,3\n119#1:340\n119#1:342\n138#1:343,3\n156#1:346\n156#1:348\n177#1:349,3\n197#1:352\n197#1:354\n220#1:355,3\n32#1:333\n119#1:341\n156#1:347\n197#1:353\n237#1:358\n261#1:359\n288#1:362\n287#1:360,2\n306#1:363,2\n*E\n"})
public final /* synthetic */ class FlowKt__ZipKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n33#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$a */
    public static final class C11878a implements C11907e<R> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29421a;

        /* renamed from: b */
        public final /* synthetic */ C11907e f29422b;

        /* renamed from: c */
        public final /* synthetic */ C11305q f29423c;

        public C11878a(C11907e eVar, C11907e eVar2, C11305q qVar) {
            this.f29421a = eVar;
            this.f29422b = eVar2;
            this.f29423c = qVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super R> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object a = CombineKt.m47551a(fVar, new C11907e[]{this.f29421a, this.f29422b}, FlowKt__ZipKt.m47208r(), new FlowKt__ZipKt$combine$1$1(this.f29423c, (C11045c<? super FlowKt__ZipKt$combine$1$1>) null), cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: c */
    public static final <T1, T2, R> C11907e<R> m47193c(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return C11909g.m47379K0(eVar, eVar2, qVar);
    }

    @C12579k
    /* renamed from: d */
    public static final <T1, T2, T3, R> C11907e<R> m47194d(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k @C10863b C11306r<? super T1, ? super T2, ? super T3, ? super C11045c<? super R>, ? extends Object> rVar) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(new C11907e[]{eVar, eVar2, eVar3}, rVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T1, T2, T3, T4, R> C11907e<R> m47195e(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11307s<? super T1, ? super T2, ? super T3, ? super T4, ? super C11045c<? super R>, ? extends Object> sVar) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new C11907e[]{eVar, eVar2, eVar3, eVar4}, sVar);
    }

    @C12579k
    /* renamed from: f */
    public static final <T1, T2, T3, T4, T5, R> C11907e<R> m47196f(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11907e<? extends T5> eVar5, @C12579k C11308t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C11045c<? super R>, ? extends Object> tVar) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new C11907e[]{eVar, eVar2, eVar3, eVar4, eVar5}, tVar);
    }

    @C12579k
    /* renamed from: i */
    public static final <T1, T2, R> C11907e<R> m47199i(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k @C10863b C11306r<? super C11908f<? super R>, ? super T1, ? super T2, ? super C11045c<? super C11079d2>, ? extends Object> rVar) {
        return C11909g.m47376J0(new C11886xd7c321e7(new C11907e[]{eVar, eVar2}, (C11045c) null, rVar));
    }

    @C12579k
    /* renamed from: j */
    public static final <T1, T2, T3, R> C11907e<R> m47200j(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k @C10863b C11307s<? super C11908f<? super R>, ? super T1, ? super T2, ? super T3, ? super C11045c<? super C11079d2>, ? extends Object> sVar) {
        return C11909g.m47376J0(new C11888xd7c321e8(new C11907e[]{eVar, eVar2, eVar3}, (C11045c) null, sVar));
    }

    @C12579k
    /* renamed from: k */
    public static final <T1, T2, T3, T4, R> C11907e<R> m47201k(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k @C10863b C11308t<? super C11908f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super C11045c<? super C11079d2>, ? extends Object> tVar) {
        return C11909g.m47376J0(new C11890xd7c321e9(new C11907e[]{eVar, eVar2, eVar3, eVar4}, (C11045c) null, tVar));
    }

    @C12579k
    /* renamed from: l */
    public static final <T1, T2, T3, T4, T5, R> C11907e<R> m47202l(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11907e<? extends T3> eVar3, @C12579k C11907e<? extends T4> eVar4, @C12579k C11907e<? extends T5> eVar5, @C12579k @C10863b C11309u<? super C11908f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C11045c<? super C11079d2>, ? extends Object> uVar) {
        return C11909g.m47376J0(new C11892xd7c321ea(new C11907e[]{eVar, eVar2, eVar3, eVar4, eVar5}, (C11045c) null, uVar));
    }

    @C11314h(name = "flowCombine")
    @C12579k
    /* renamed from: p */
    public static final <T1, T2, R> C11907e<R> m47206p(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return new C11878a(eVar, eVar2, qVar);
    }

    @C11314h(name = "flowCombineTransform")
    @C12579k
    /* renamed from: q */
    public static final <T1, T2, R> C11907e<R> m47207q(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k @C10863b C11306r<? super C11908f<? super R>, ? super T1, ? super T2, ? super C11045c<? super C11079d2>, ? extends Object> rVar) {
        return C11909g.m47376J0(new C11884xd7c321e6(new C11907e[]{eVar, eVar2}, (C11045c) null, rVar));
    }

    /* renamed from: r */
    public static final <T> C11289a<T[]> m47208r() {
        return FlowKt__ZipKt$nullArrayFactory$1.f29436f;
    }

    @C12579k
    /* renamed from: s */
    public static final <T1, T2, R> C11907e<R> m47209s(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return CombineKt.m47552b(eVar, eVar2, qVar);
    }
}
