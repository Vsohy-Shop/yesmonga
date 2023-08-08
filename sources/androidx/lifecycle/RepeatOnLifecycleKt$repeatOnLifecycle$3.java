package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", mo22502f = "RepeatOnLifecycle.kt", mo22503i = {}, mo22504l = {84}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C12074o0, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", mo22502f = "RepeatOnLifecycle.kt", mo22503i = {0, 0}, mo22504l = {166}, mo22505m = "invokeSuspend", mo22506n = {"launchedJob", "observer"}, mo22507s = {"L$0", "L$1"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    public static final class C193791 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C193791(lifecycle, state, o0Var, pVar, cVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r2 = r1.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                java.lang.Object r0 = r1.L$5
                kotlin.jvm.functions.p r0 = (kotlin.jvm.functions.C11304p) r0
                java.lang.Object r0 = r1.L$4
                kotlinx.coroutines.o0 r0 = (kotlinx.coroutines.C12074o0) r0
                java.lang.Object r0 = r1.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.L$1
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                java.lang.Object r0 = r1.L$0
                r5 = r0
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                kotlin.C11661u0.m45747n(r17)     // Catch:{ all -> 0x002d }
                goto L_0x00ac
            L_0x002d:
                r0 = move-exception
                goto L_0x00c7
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                kotlin.C11661u0.m45747n(r17)
                androidx.lifecycle.Lifecycle r2 = r4
                androidx.lifecycle.Lifecycle$State r2 = r2.mo57465b()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L_0x0048
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            L_0x0048:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
                r13.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r5     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle r14 = r4     // Catch:{ all -> 0x00c4 }
                kotlinx.coroutines.o0 r8 = r6     // Catch:{ all -> 0x00c4 }
                kotlin.jvm.functions.p<kotlinx.coroutines.o0, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r12 = r7     // Catch:{ all -> 0x00c4 }
                r1.L$0 = r2     // Catch:{ all -> 0x00c4 }
                r1.L$1 = r13     // Catch:{ all -> 0x00c4 }
                r1.L$2 = r5     // Catch:{ all -> 0x00c4 }
                r1.L$3 = r14     // Catch:{ all -> 0x00c4 }
                r1.L$4 = r8     // Catch:{ all -> 0x00c4 }
                r1.L$5 = r12     // Catch:{ all -> 0x00c4 }
                r1.label = r4     // Catch:{ all -> 0x00c4 }
                kotlinx.coroutines.p r15 = new kotlinx.coroutines.p     // Catch:{ all -> 0x00c4 }
                kotlin.coroutines.c r6 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r16)     // Catch:{ all -> 0x00c4 }
                r15.<init>(r6, r4)     // Catch:{ all -> 0x00c4 }
                r15.mo24537e0()     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle$Event$a r6 = androidx.lifecycle.Lifecycle.C19372Event.Companion     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle$Event r7 = r6.mo57473d(r5)     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle$Event r9 = r6.mo57470a(r5)     // Catch:{ all -> 0x00c4 }
                r5 = 0
                kotlinx.coroutines.sync.a r11 = kotlinx.coroutines.sync.MutexKt.m48606b(r5, r4, r3)     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r10 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00c4 }
                r5 = r10
                r6 = r7
                r7 = r2
                r3 = r10
                r10 = r15
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c4 }
                r13.element = r3     // Catch:{ all -> 0x00c4 }
                java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)     // Catch:{ all -> 0x00c4 }
                r10 = r3
                androidx.lifecycle.t r10 = (androidx.lifecycle.C19470t) r10     // Catch:{ all -> 0x00c4 }
                r14.mo57464a(r10)     // Catch:{ all -> 0x00c4 }
                java.lang.Object r3 = r15.mo24572y()     // Catch:{ all -> 0x00c4 }
                java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()     // Catch:{ all -> 0x00c4 }
                if (r3 != r5) goto L_0x00a7
                kotlin.coroutines.jvm.internal.C11069f.m42638c(r16)     // Catch:{ all -> 0x00c4 }
            L_0x00a7:
                if (r3 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                r5 = r2
                r2 = r13
            L_0x00ac:
                T r0 = r5.element
                kotlinx.coroutines.c2 r0 = (kotlinx.coroutines.C11723c2) r0
                if (r0 == 0) goto L_0x00b6
                r3 = 0
                kotlinx.coroutines.C11723c2.C11724a.m46184b(r0, r3, r4, r3)
            L_0x00b6:
                T r0 = r2.element
                androidx.lifecycle.t r0 = (androidx.lifecycle.C19470t) r0
                if (r0 == 0) goto L_0x00c1
                androidx.lifecycle.Lifecycle r2 = r4
                r2.mo57467d(r0)
            L_0x00c1:
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            L_0x00c4:
                r0 = move-exception
                r5 = r2
                r2 = r13
            L_0x00c7:
                T r3 = r5.element
                kotlinx.coroutines.c2 r3 = (kotlinx.coroutines.C11723c2) r3
                if (r3 == 0) goto L_0x00d1
                r5 = 0
                kotlinx.coroutines.C11723c2.C11724a.m46184b(r3, r5, r4, r5)
            L_0x00d1:
                T r2 = r2.element
                androidx.lifecycle.t r2 = (androidx.lifecycle.C19470t) r2
                if (r2 == 0) goto L_0x00dc
                androidx.lifecycle.Lifecycle r3 = r4
                r3.mo57467d(r2)
            L_0x00dc:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C193791.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C193791) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C12074o0 o0Var = (C12074o0) this.L$0;
            C12064m2 a0 = C11768d1.m46783e().mo23706a0();
            final Lifecycle lifecycle = this.$this_repeatOnLifecycle;
            final Lifecycle.State state = this.$state;
            final C11304p<C12074o0, C11045c<? super C11079d2>, Object> pVar = this.$block;
            C193791 r3 = new C193791((C11045c<? super C193791>) null);
            this.label = 1;
            if (C11965h.m47673h(a0, r3, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
