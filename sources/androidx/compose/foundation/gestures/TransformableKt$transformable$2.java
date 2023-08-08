package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n25#2:181\n25#2:188\n1114#3,6:182\n1114#3,6:189\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$2\n*L\n68#1:181\n89#1:188\n68#1:182,6\n89#1:189,6\n*E\n"})
public final class TransformableKt$transformable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ C2211q $state;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1", mo22502f = "Transformable.kt", mo22503i = {0, 0, 1}, mo22504l = {72, 75}, mo22505m = "invokeSuspend", mo22506n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect"}, mo22507s = {"L$0", "L$1", "L$0"})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1 */
    public static final class C21761 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21761 r0 = new C21761(gVar, qVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[SYNTHETIC, Splitter:B:22:0x0063] */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k T r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.o0 r1 = (kotlinx.coroutines.C12074o0) r1
                kotlin.C11661u0.m45747n(r12)     // Catch:{ CancellationException -> 0x0015 }
            L_0x0015:
                r12 = r1
                goto L_0x0038
            L_0x0017:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001f:
                java.lang.Object r1 = r11.L$2
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r4 = r11.L$1
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                java.lang.Object r5 = r11.L$0
                kotlinx.coroutines.o0 r5 = (kotlinx.coroutines.C12074o0) r5
                kotlin.C11661u0.m45747n(r12)
                r6 = r4
                r4 = r11
                goto L_0x005b
            L_0x0031:
                kotlin.C11661u0.m45747n(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.o0 r12 = (kotlinx.coroutines.C12074o0) r12
            L_0x0038:
                r1 = r11
            L_0x0039:
                boolean r4 = kotlinx.coroutines.C12079p0.m48270k(r12)
                if (r4 == 0) goto L_0x0081
                kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                r4.<init>()
                kotlinx.coroutines.channels.g<androidx.compose.foundation.gestures.o> r5 = r0
                r1.L$0 = r12
                r1.L$1 = r4
                r1.L$2 = r4
                r1.label = r3
                java.lang.Object r5 = r5.mo23824c0(r1)
                if (r5 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r6 = r4
                r4 = r1
                r1 = r6
                r10 = r5
                r5 = r12
                r12 = r10
            L_0x005b:
                r1.element = r12
                T r12 = r6.element
                boolean r12 = r12 instanceof androidx.compose.foundation.gestures.C2205o.C2207b
                if (r12 == 0) goto L_0x007e
                androidx.compose.foundation.gestures.q r12 = r2     // Catch:{ CancellationException -> 0x007e }
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch:{ CancellationException -> 0x007e }
                androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1 r7 = new androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1     // Catch:{ CancellationException -> 0x007e }
                kotlinx.coroutines.channels.g<androidx.compose.foundation.gestures.o> r8 = r0     // Catch:{ CancellationException -> 0x007e }
                r9 = 0
                r7.<init>(r6, r8, r9)     // Catch:{ CancellationException -> 0x007e }
                r4.L$0 = r5     // Catch:{ CancellationException -> 0x007e }
                r4.L$1 = r9     // Catch:{ CancellationException -> 0x007e }
                r4.L$2 = r9     // Catch:{ CancellationException -> 0x007e }
                r4.label = r2     // Catch:{ CancellationException -> 0x007e }
                java.lang.Object r12 = r12.mo7364c(r1, r7, r4)     // Catch:{ CancellationException -> 0x007e }
                if (r12 != r0) goto L_0x007e
                return r0
            L_0x007e:
                r1 = r4
                r12 = r5
                goto L_0x0039
            L_0x0081:
                kotlin.d2 r12 = kotlin.C11079d2.f28267a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$2.C21761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C21761) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$2(boolean z, boolean z2, C2211q qVar) {
        super(3);
        this.$lockRotationOnZoomPan = z;
        this.$enabled = z2;
        this.$state = qVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7508a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        C8767m mVar2;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1509335853);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1509335853, i, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
        }
        C8578k2 t = C8415c2.m30251t(Boolean.valueOf(this.$lockRotationOnZoomPan), oVar, 0);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        final C11744g gVar = (C11744g) N;
        oVar.mo14918M(-2015617726);
        if (this.$enabled) {
            final C2211q qVar = this.$state;
            EffectsKt.m29896h(qVar, new C21761((C11045c<? super C21761>) null), oVar, 64);
        }
        oVar.mo15002m0();
        oVar.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new TransformableKt$transformable$2$block$1$1(t, gVar, (C11045c<? super TransformableKt$transformable$2$block$1$1>) null);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C11304p pVar = (C11304p) N2;
        if (this.$enabled) {
            mVar2 = SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, C11079d2.f28267a, pVar);
        } else {
            mVar2 = C8767m.f23478j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return mVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7508a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
