package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.lazy.grid.C2485c;
import androidx.compose.foundation.lazy.grid.C2496k;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.C8284t2;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1920:1\n76#2:1921\n474#3,4:1922\n478#3,2:1930\n482#3:1936\n25#4:1926\n1114#5,3:1927\n1117#5,3:1933\n474#6:1932\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n*L\n1650#1:1921\n1654#1:1922,4\n1654#1:1930,2\n1654#1:1936\n1654#1:1926\n1654#1:1927,3\n1654#1:1933,3\n1654#1:1932\n*E\n"})
public final class DatePickerKt$YearPicker$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Integer, C11079d2> $onYearSelected;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPicker$1(StateData stateData, C8180c0 c0Var, C8767m mVar, C11300l<? super Integer, C11079d2> lVar, int i) {
        super(2);
        this.$stateData = stateData;
        this.$colors = c0Var;
        this.$modifier = mVar;
        this.$onYearSelected = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        long j;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-145469688, i2, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1636)");
            }
            final int o = this.$stateData.mo11988b().mo12922o();
            final int o2 = this.$stateData.mo11990d().mo12922o();
            LazyGridState a = LazyGridStateKt.m11132a(Integer.max(0, (o2 - this.$stateData.mo11995i().mo23049r()) - 3), 0, oVar2, 0, 2);
            oVar2.mo14918M(-969349200);
            long c = this.$colors.mo12474c();
            C8215i1 i1Var = C8215i1.f20180a;
            if (C15240j2.m66082y(c, i1Var.mo12652a(oVar2, 6).mo14802A())) {
                j = ColorSchemeKt.m25523j(i1Var.mo12652a(oVar2, 6), ((C16483g) oVar2.mo15032w(SurfaceKt.m26358g())).mo47823t0());
            } else {
                j = this.$colors.mo12474c();
            }
            long j2 = j;
            oVar.mo15002m0();
            oVar2.mo14918M(773894976);
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar2));
                oVar2.mo14893C(wVar);
                N = wVar;
            }
            oVar.mo15002m0();
            C12074o0 a2 = ((C8690w) N).mo16831a();
            oVar.mo15002m0();
            C8284t2.C8285a aVar = C8284t2.f20507b;
            String a3 = C8357u2.m29348a(aVar.mo13071t(), oVar2, 6);
            final String a4 = C8357u2.m29348a(aVar.mo13072u(), oVar2, 6);
            C2485c.C2487b bVar = new C2485c.C2487b(3);
            C8767m c2 = SemanticsModifierKt.m71868c(BackgroundKt.m8825d(this.$modifier, j2, (C15218g4) null, 2, (Object) null), false, C79941.f19333f, 1, (Object) null);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e n = arrangement.mo7629n();
            Arrangement.C2271e z = arrangement.mo7638z(DatePickerKt.f19320g);
            final StateData stateData = this.$stateData;
            C11300l<Integer, C11079d2> lVar = this.$onYearSelected;
            final C11300l<Integer, C11079d2> lVar2 = lVar;
            final int i3 = this.$$dirty;
            final C8180c0 c0Var = this.$colors;
            final LazyGridState lazyGridState = a;
            final C12074o0 o0Var = a2;
            final String str = a3;
            LazyGridDslKt.m10975b(bVar, c2, a, (C2366i0) null, false, z, n, (C2195g) null, false, new C11300l<LazyGridScope, C11079d2>() {
                /* renamed from: a */
                public final void mo11421a(@C12579k LazyGridScope lazyGridScope) {
                    LazyGridScope lazyGridScope2 = lazyGridScope;
                    Intrinsics.checkNotNullParameter(lazyGridScope2, "$this$LazyVerticalGrid");
                    int S1 = CollectionsKt___CollectionsKt.m40563S1(stateData.mo11995i());
                    final StateData stateData = stateData;
                    final int i = o2;
                    final int i2 = o;
                    final C11300l<Integer, C11079d2> lVar = lVar2;
                    final int i3 = i3;
                    final C8180c0 c0Var = c0Var;
                    final LazyGridState lazyGridState = lazyGridState;
                    final C12074o0 o0Var = o0Var;
                    final String str = str;
                    final String str2 = a4;
                    LazyGridScope.m11051c(lazyGridScope2, S1, (C11300l) null, (C11304p) null, (C11300l) null, C8553b.m31049c(1369226173, true, new C11306r<C2496k, Integer, C8592o, Integer, C11079d2>() {
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.jvm.functions.a} */
                        /* JADX WARNING: Multi-variable type inference failed */
                        @androidx.compose.runtime.C8540g
                        @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo11422a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.grid.C2496k r14, int r15, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r16, int r17) {
                            /*
                                r13 = this;
                                r0 = r13
                                r3 = r15
                                r8 = r16
                                r1 = r17
                                java.lang.String r2 = "$this$items"
                                r4 = r14
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
                                r2 = r1 & 112(0x70, float:1.57E-43)
                                if (r2 != 0) goto L_0x001d
                                boolean r2 = r8.mo14976f(r15)
                                if (r2 == 0) goto L_0x0019
                                r2 = 32
                                goto L_0x001b
                            L_0x0019:
                                r2 = 16
                            L_0x001b:
                                r2 = r2 | r1
                                goto L_0x001e
                            L_0x001d:
                                r2 = r1
                            L_0x001e:
                                r2 = r2 & 721(0x2d1, float:1.01E-42)
                                r4 = 144(0x90, float:2.02E-43)
                                if (r2 != r4) goto L_0x0030
                                boolean r2 = r16.mo15011p()
                                if (r2 != 0) goto L_0x002b
                                goto L_0x0030
                            L_0x002b:
                                r16.mo14958a0()
                                goto L_0x0100
                            L_0x0030:
                                boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
                                if (r2 == 0) goto L_0x003f
                                r2 = -1
                                java.lang.String r4 = "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1669)"
                                r5 = 1369226173(0x519cbbbd, float:8.4145578E10)
                                androidx.compose.runtime.ComposerKt.m29845w0(r5, r1, r2, r4)
                            L_0x003f:
                                androidx.compose.material3.StateData r1 = r8
                                kotlin.ranges.l r1 = r1.mo11995i()
                                int r1 = r1.mo23049r()
                                int r7 = r3 + r1
                                java.lang.String r9 = androidx.compose.material3.DatePickerKt.m25593M(r7)
                                androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
                                androidx.compose.material3.tokens.i r2 = androidx.compose.material3.tokens.C8310i.f21329a
                                float r4 = r2.mo13716K()
                                float r2 = r2.mo13715J()
                                androidx.compose.ui.m r10 = androidx.compose.foundation.layout.SizeKt.m10123w(r1, r4, r2)
                                androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1 r11 = new androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1
                                androidx.compose.foundation.lazy.grid.LazyGridState r2 = r14
                                kotlinx.coroutines.o0 r4 = r15
                                java.lang.String r5 = r16
                                java.lang.String r6 = r17
                                r1 = r11
                                r3 = r15
                                r1.<init>(r2, r3, r4, r5, r6)
                                r1 = 0
                                r2 = 0
                                r3 = 1
                                androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r10, r2, r11, r3, r1)
                                int r4 = r9
                                if (r7 != r4) goto L_0x007b
                                r4 = r3
                                goto L_0x007c
                            L_0x007b:
                                r4 = r2
                            L_0x007c:
                                int r5 = r10
                                if (r7 != r5) goto L_0x0082
                                r5 = r3
                                goto L_0x0083
                            L_0x0082:
                                r5 = r2
                            L_0x0083:
                                kotlin.jvm.functions.l<java.lang.Integer, kotlin.d2> r6 = r11
                                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                                kotlin.jvm.functions.l<java.lang.Integer, kotlin.d2> r11 = r11
                                r12 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                                r8.mo14918M(r12)
                                boolean r6 = r8.mo15006n0(r6)
                                boolean r10 = r8.mo15006n0(r10)
                                r6 = r6 | r10
                                java.lang.Object r10 = r16.mo14921N()
                                if (r6 != 0) goto L_0x00a8
                                androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
                                java.lang.Object r6 = r6.mo16277a()
                                if (r10 != r6) goto L_0x00b0
                            L_0x00a8:
                                androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$2$1 r10 = new androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$2$1
                                r10.<init>(r11, r7)
                                r8.mo14893C(r10)
                            L_0x00b0:
                                r16.mo15002m0()
                                r6 = r10
                                kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
                                androidx.compose.material3.t2$a r7 = androidx.compose.material3.C8284t2.f20507b
                                int r7 = r7.mo13069r()
                                r10 = 6
                                java.lang.String r7 = androidx.compose.material3.C8357u2.m29348a(r7, r8, r10)
                                java.lang.Object[] r10 = new java.lang.Object[r3]
                                r10[r2] = r9
                                java.lang.Object[] r2 = java.util.Arrays.copyOf(r10, r3)
                                java.lang.String r7 = java.lang.String.format(r7, r2)
                                java.lang.String r2 = "format(this, *args)"
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
                                androidx.compose.material3.c0 r10 = r13
                                androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$3 r2 = new androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$3
                                r2.<init>(r9)
                                r9 = 2095319565(0x7ce40a0d, float:9.47238E36)
                                androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r9, r3, r2)
                                int r2 = r12
                                int r2 = r2 << 9
                                r3 = 458752(0x70000, float:6.42848E-40)
                                r2 = r2 & r3
                                r3 = 1572864(0x180000, float:2.204052E-39)
                                r11 = r2 | r3
                                r2 = r4
                                r3 = r5
                                r4 = r6
                                r5 = r7
                                r6 = r10
                                r7 = r9
                                r8 = r16
                                r9 = r11
                                androidx.compose.material3.DatePickerKt.m25608n(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                                if (r1 == 0) goto L_0x0100
                                androidx.compose.runtime.ComposerKt.m29843v0()
                            L_0x0100:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$YearPicker$1.C79972.C79981.mo11422a(androidx.compose.foundation.lazy.grid.k, int, androidx.compose.runtime.o, int):void");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            mo11422a((C2496k) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                            return C11079d2.f28267a;
                        }
                    }), 14, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo11421a((LazyGridScope) obj);
                    return C11079d2.f28267a;
                }
            }, oVar, 1769472, C14092c.f34519G0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
