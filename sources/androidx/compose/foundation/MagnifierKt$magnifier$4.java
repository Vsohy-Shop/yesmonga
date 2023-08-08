package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16491k;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
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
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "i", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,394:1\n76#2:395\n76#2:396\n25#3:397\n25#3:404\n25#3:411\n25#3:418\n36#3:425\n36#3:432\n1114#4,6:398\n1114#4,6:405\n1114#4,6:412\n1114#4,6:419\n1114#4,6:426\n1114#4,6:433\n76#5:439\n102#5,2:440\n76#5:442\n76#5:443\n76#5:444\n76#5:445\n76#5:446\n76#5:447\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n*L\n274#1:395\n275#1:396\n276#1:397\n281#1:404\n291#1:411\n296#1:418\n374#1:425\n386#1:432\n276#1:398,6\n281#1:405,6\n291#1:412,6\n296#1:419,6\n374#1:426,6\n386#1:433,6\n276#1:439\n276#1:440,2\n277#1:442\n278#1:443\n279#1:444\n280#1:445\n281#1:446\n291#1:447\n*E\n"})
public final class MagnifierKt$magnifier$4 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11300l<C16479d, C15094f> $magnifierCenter;
    final /* synthetic */ C11300l<C16491k, C11079d2> $onSizeChanged;
    final /* synthetic */ C2628n0 $platformMagnifierFactory;
    final /* synthetic */ C11300l<C16479d, C15094f> $sourceCenter;
    final /* synthetic */ C2116e0 $style;
    final /* synthetic */ float $zoom;

    @C11067d(mo22501c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", mo22502f = "Magnifier.kt", mo22503i = {0}, mo22504l = {365}, mo22505m = "invokeSuspend", mo22506n = {"magnifier"}, mo22507s = {"L$0"})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1 */
    public static final class C20891 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C20891 r1 = new C20891(n0Var, e0Var3, view, dVar, f3, iVar2, t4, k2Var4, k2Var5, k2Var6, z0Var3, k2Var7, cVar);
            r1.L$0 = obj;
            return r1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: androidx.compose.foundation.m0} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r2 = r1.label
                r3 = 1
                if (r2 == 0) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r0 = r1.L$0
                r2 = r0
                androidx.compose.foundation.m0 r2 = (androidx.compose.foundation.C2626m0) r2
                kotlin.C11661u0.m45747n(r20)     // Catch:{ all -> 0x0017 }
                goto L_0x0095
            L_0x0017:
                r0 = move-exception
                goto L_0x009d
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0022:
                kotlin.C11661u0.m45747n(r20)
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.o0 r2 = (kotlinx.coroutines.C12074o0) r2
                androidx.compose.foundation.n0 r4 = r5
                androidx.compose.foundation.e0 r5 = r6
                android.view.View r6 = r7
                androidx.compose.ui.unit.d r7 = r8
                float r8 = r9
                androidx.compose.foundation.m0 r4 = r4.mo7315a(r5, r6, r7, r8)
                kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
                r5.<init>()
                long r6 = r4.mo9043a()
                androidx.compose.ui.unit.d r8 = r8
                androidx.compose.runtime.k2<kotlin.jvm.functions.l<androidx.compose.ui.unit.k, kotlin.d2>> r9 = r11
                kotlin.jvm.functions.l r9 = androidx.compose.foundation.MagnifierKt$magnifier$4.m8999p(r9)
                if (r9 == 0) goto L_0x0059
                long r10 = androidx.compose.p004ui.unit.C16502r.m74673f(r6)
                long r10 = r8.mo7428n(r10)
                androidx.compose.ui.unit.k r8 = androidx.compose.p004ui.unit.C16491k.m74545c(r10)
                r9.invoke(r8)
            L_0x0059:
                r5.element = r6
                kotlinx.coroutines.flow.i<kotlin.d2> r6 = r10
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$1 r7 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$1
                r8 = 0
                r7.<init>(r4, r8)
                kotlinx.coroutines.flow.e r6 = kotlinx.coroutines.flow.C11909g.m47448f1(r6, r7)
                kotlinx.coroutines.flow.C11909g.m47412V0(r6, r2)
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$2 r2 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$2     // Catch:{ all -> 0x009b }
                androidx.compose.ui.unit.d r11 = r8     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.k2<java.lang.Boolean> r12 = r12     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.k2<androidx.compose.ui.geometry.f> r13 = r13     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.k2<kotlin.jvm.functions.l<androidx.compose.ui.unit.d, androidx.compose.ui.geometry.f>> r14 = r14     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.z0<androidx.compose.ui.geometry.f> r15 = r15     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.k2<java.lang.Float> r6 = r16     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.k2<kotlin.jvm.functions.l<androidx.compose.ui.unit.k, kotlin.d2>> r7 = r11     // Catch:{ all -> 0x009b }
                r9 = r2
                r10 = r4
                r16 = r6
                r17 = r5
                r18 = r7
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x009b }
                kotlinx.coroutines.flow.e r2 = androidx.compose.runtime.C8415c2.m30253v(r2)     // Catch:{ all -> 0x009b }
                r1.L$0 = r4     // Catch:{ all -> 0x009b }
                r1.label = r3     // Catch:{ all -> 0x009b }
                java.lang.Object r2 = kotlinx.coroutines.flow.C11909g.m47503x(r2, r1)     // Catch:{ all -> 0x009b }
                if (r2 != r0) goto L_0x0094
                return r0
            L_0x0094:
                r2 = r4
            L_0x0095:
                r2.dismiss()
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            L_0x009b:
                r0 = move-exception
                r2 = r4
            L_0x009d:
                r2.dismiss()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierKt$magnifier$4.C20891.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C20891) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4(C11300l<? super C16479d, C15094f> lVar, C11300l<? super C16479d, C15094f> lVar2, float f, C11300l<? super C16491k, C11079d2> lVar3, C2628n0 n0Var, C2116e0 e0Var) {
        super(3);
        this.$sourceCenter = lVar;
        this.$magnifierCenter = lVar2;
        this.$zoom = f;
        this.$onSizeChanged = lVar3;
        this.$platformMagnifierFactory = n0Var;
        this.$style = e0Var;
    }

    /* renamed from: j */
    public static final long m8993j(C8700z0<C15094f> z0Var) {
        return z0Var.getValue().mo42242A();
    }

    /* renamed from: k */
    public static final boolean m8994k(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: l */
    public static final void m8995l(C8700z0<C15094f> z0Var, long j) {
        z0Var.setValue(C15094f.m64868d(j));
    }

    /* renamed from: m */
    public static final C11300l<C16479d, C15094f> m8996m(C8578k2<? extends C11300l<? super C16479d, C15094f>> k2Var) {
        return (C11300l) k2Var.getValue();
    }

    /* renamed from: n */
    public static final C11300l<C16479d, C15094f> m8997n(C8578k2<? extends C11300l<? super C16479d, C15094f>> k2Var) {
        return (C11300l) k2Var.getValue();
    }

    /* renamed from: o */
    public static final float m8998o(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: p */
    public static final C11300l<C16491k, C11079d2> m8999p(C8578k2<? extends C11300l<? super C16491k, C11079d2>> k2Var) {
        return (C11300l) k2Var.getValue();
    }

    /* renamed from: q */
    public static final long m9000q(C8578k2<C15094f> k2Var) {
        return k2Var.getValue().mo42242A();
    }

    @C8540g
    @C12579k
    /* renamed from: i */
    public final C8767m mo7203i(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        float f;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar2.mo14918M(-454877003);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-454877003, i, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
        }
        final View view = (View) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        final C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
        oVar2.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = C8539f2.m30981g(C15094f.m64868d(C15094f.f37256b.mo42247c()), (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        C8578k2<T> t = C8415c2.m30251t(this.$sourceCenter, oVar2, 0);
        C8578k2<T> t2 = C8415c2.m30251t(this.$magnifierCenter, oVar2, 0);
        C8578k2 t3 = C8415c2.m30251t(Float.valueOf(this.$zoom), oVar2, 0);
        final C8578k2<T> t4 = C8415c2.m30251t(this.$onSizeChanged, oVar2, 0);
        oVar2.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = C8415c2.m30235d(new MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(dVar, t, z0Var));
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8578k2 k2Var = (C8578k2) N2;
        oVar2.mo14918M(-492369756);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = C8415c2.m30235d(new MagnifierKt$magnifier$4$isMagnifierShown$2$1(k2Var));
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        C8578k2 k2Var2 = (C8578k2) N3;
        oVar2.mo14918M(-492369756);
        Object N4 = oVar.mo14921N();
        if (N4 == aVar.mo16277a()) {
            N4 = C11945o.m47610b(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
            oVar2.mo14893C(N4);
        }
        oVar.mo15002m0();
        final C11911i iVar = (C11911i) N4;
        if (this.$platformMagnifierFactory.mo7316b()) {
            f = 0.0f;
        } else {
            f = this.$zoom;
        }
        C2116e0 e0Var = this.$style;
        Object[] objArr = {view, dVar, Float.valueOf(f), e0Var, Boolean.valueOf(Intrinsics.areEqual((Object) e0Var, (Object) C2116e0.f5798g.mo7298c()))};
        final C2628n0 n0Var = this.$platformMagnifierFactory;
        C2116e0 e0Var2 = this.$style;
        float f2 = this.$zoom;
        C20891 r0 = r4;
        final C2116e0 e0Var3 = e0Var2;
        Object[] objArr2 = objArr;
        final float f3 = f2;
        final C11911i iVar2 = iVar;
        C8578k2 k2Var3 = k2Var;
        final C8578k2 k2Var4 = k2Var2;
        final C8578k2 k2Var5 = k2Var3;
        C8700z0 z0Var2 = z0Var;
        final C8578k2<T> k2Var6 = t2;
        final C8700z0 z0Var3 = z0Var2;
        final C8578k2 k2Var7 = t3;
        C20891 r4 = new C20891((C11045c<? super C20891>) null);
        EffectsKt.m29898j(objArr2, r0, oVar2, 72);
        oVar2.mo14918M(1157296644);
        C8700z0 z0Var4 = z0Var2;
        boolean n0 = oVar2.mo15006n0(z0Var4);
        Object N5 = oVar.mo14921N();
        if (n0 || N5 == aVar.mo16277a()) {
            N5 = new MagnifierKt$magnifier$4$2$1(z0Var4);
            oVar2.mo14893C(N5);
        }
        oVar.mo15002m0();
        C8767m a = DrawModifierKt.m32436a(OnGloballyPositionedModifierKt.m68999a(mVar, (C11300l) N5), new C11300l<C15187e, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C15187e) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k C15187e eVar) {
                Intrinsics.checkNotNullParameter(eVar, "$this$drawBehind");
                iVar.mo24198a(C11079d2.f28267a);
            }
        });
        oVar2.mo14918M(1157296644);
        C8578k2 k2Var8 = k2Var3;
        boolean n02 = oVar2.mo15006n0(k2Var8);
        Object N6 = oVar.mo14921N();
        if (n02 || N6 == aVar.mo16277a()) {
            N6 = new MagnifierKt$magnifier$4$4$1(k2Var8);
            oVar2.mo14893C(N6);
        }
        oVar.mo15002m0();
        C8767m c = SemanticsModifierKt.m71868c(a, false, (C11300l) N6, 1, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7203i((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
