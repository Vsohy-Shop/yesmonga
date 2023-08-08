package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.C8284t2;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,809:1\n474#2,4:810\n478#2,2:818\n482#2:824\n25#3:814\n1114#4,3:815\n1117#4,3:821\n474#5:820\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n*L\n532#1:810,4\n532#1:818,2\n532#1:824\n532#1:814\n532#1:815,3\n532#1:821,3\n532#1:820\n*E\n"})
public final class DateRangePickerKt$VerticalMonthsList$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ C8266q $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ C11300l<Long, C11079d2> $onDateSelected;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8238l $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1(LazyListState lazyListState, int i, StateData stateData, C8266q qVar, C8186d0 d0Var, C8180c0 c0Var, C11300l<? super Long, C11079d2> lVar, C8238l lVar2, C11300l<? super Long, Boolean> lVar3) {
        super(2);
        this.$lazyListState = lazyListState;
        this.$$dirty = i;
        this.$stateData = stateData;
        this.$firstMonth = qVar;
        this.$dateFormatter = d0Var;
        this.$colors = c0Var;
        this.$onDateSelected = lVar;
        this.$today = lVar2;
        this.$dateValidator = lVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(56792252, i2, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:530)");
            }
            oVar2.mo14918M(773894976);
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar2));
                oVar2.mo14893C(wVar);
                N = wVar;
            }
            oVar.mo15002m0();
            final C12074o0 a = ((C8690w) N).mo16831a();
            oVar.mo15002m0();
            C8284t2.C8285a aVar = C8284t2.f20507b;
            final String a2 = C8357u2.m29348a(aVar.mo13024J(), oVar2, 6);
            final String a3 = C8357u2.m29348a(aVar.mo13023I(), oVar2, 6);
            C8767m c = SemanticsModifierKt.m71868c(C8767m.f23478j, false, C80061.f19354f, 1, (Object) null);
            LazyListState lazyListState = this.$lazyListState;
            final StateData stateData = this.$stateData;
            final C8266q qVar = this.$firstMonth;
            final C8186d0 d0Var = this.$dateFormatter;
            final C8180c0 c0Var = this.$colors;
            C11300l<Long, C11079d2> lVar = this.$onDateSelected;
            C8238l lVar2 = this.$today;
            final C11300l<Long, C11079d2> lVar3 = lVar;
            final C8238l lVar4 = lVar2;
            final C11300l<Long, Boolean> lVar5 = this.$dateValidator;
            final int i3 = this.$$dirty;
            final LazyListState lazyListState2 = lazyListState;
            LazyDslKt.m10737b(c, lazyListState, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k LazyListScope lazyListScope) {
                    LazyListScope lazyListScope2 = lazyListScope;
                    Intrinsics.checkNotNullParameter(lazyListScope2, "$this$LazyColumn");
                    int h = stateData.mo11994h();
                    final StateData stateData = stateData;
                    final C8266q qVar = qVar;
                    final C8186d0 d0Var = d0Var;
                    final C8180c0 c0Var = c0Var;
                    final C11300l<Long, C11079d2> lVar = lVar3;
                    final C8238l lVar2 = lVar4;
                    final C11300l<Long, Boolean> lVar3 = lVar5;
                    final int i = i3;
                    final LazyListState lazyListState = lazyListState2;
                    C12074o0 o0Var = a;
                    final C12074o0 o0Var2 = o0Var;
                    final String str = a2;
                    final String str2 = a3;
                    LazyListScope.m10822e(lazyListScope2, h, (C11300l) null, (C11300l) null, C8553b.m31049c(1246706073, true, new C11306r<C2455e, Integer, C8592o, Integer, C11079d2>() {
                        @C8540g
                        @C8570j(applier = "androidx.compose.ui.UiComposable")
                        /* renamed from: a */
                        public final void mo11477a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
                            int i3;
                            int i4;
                            int i5;
                            C2455e eVar2 = eVar;
                            int i6 = i;
                            C8592o oVar2 = oVar;
                            int i7 = i2;
                            Intrinsics.checkNotNullParameter(eVar2, "$this$items");
                            if ((i7 & 14) == 0) {
                                if (oVar2.mo15006n0(eVar2)) {
                                    i5 = 4;
                                } else {
                                    i5 = 2;
                                }
                                i3 = i5 | i7;
                            } else {
                                i3 = i7;
                            }
                            if ((i7 & 112) == 0) {
                                if (oVar2.mo14976f(i6)) {
                                    i4 = 32;
                                } else {
                                    i4 = 16;
                                }
                                i3 |= i4;
                            }
                            if ((i3 & 731) != 146 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(1246706073, i7, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:542)");
                                }
                                C8266q e = stateData.mo11987a().mo12489e(qVar, i6);
                                C8767m.C8768a aVar = C8767m.f23478j;
                                C8767m b = C2455e.m10931b(eVar2, aVar, 0.0f, 1, (Object) null);
                                C8186d0 d0Var = d0Var;
                                StateData stateData = stateData;
                                C8180c0 c0Var = c0Var;
                                C11300l<Long, C11079d2> lVar = lVar;
                                C8238l lVar2 = lVar2;
                                C11300l<Long, Boolean> lVar3 = lVar3;
                                int i8 = i;
                                LazyListState lazyListState = lazyListState;
                                C12074o0 o0Var = o0Var2;
                                String str = str;
                                String str2 = str2;
                                oVar2.mo14918M(-483455358);
                                int i9 = i8;
                                C11300l<Long, Boolean> lVar4 = lVar3;
                                C15560f0 b2 = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
                                oVar2.mo14918M(-1323940314);
                                C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                                C8238l lVar5 = lVar2;
                                C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                                C11300l<Long, C11079d2> lVar6 = lVar;
                                C11289a<ComposeUiNode> a = companion.mo44585a();
                                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(b);
                                C8180c0 c0Var2 = c0Var;
                                if (!(oVar.mo15017r() instanceof C8428d)) {
                                    ComposablesKt.m29519n();
                                }
                                oVar.mo14938T();
                                if (oVar.mo14997l()) {
                                    oVar2.mo14947W(a);
                                } else {
                                    oVar.mo14888A();
                                }
                                oVar.mo14941U();
                                C8592o b3 = Updater.m30180b(oVar);
                                Updater.m30188j(b3, b2, companion.mo44588d());
                                Updater.m30188j(b3, dVar, companion.mo44586b());
                                Updater.m30188j(b3, layoutDirection, companion.mo44587c());
                                Updater.m30188j(b3, c4Var, companion.mo44590f());
                                oVar.mo14972e();
                                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                                oVar2.mo14918M(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
                                String c = d0Var.mo12520c(e, stateData.mo11987a(), C8260p.m27433b(oVar2, 0));
                                if (c == null) {
                                    c = "-";
                                }
                                int i10 = i9;
                                TextKt.m26700c(c, SemanticsModifierKt.m71868c(ClickableKt.m8878e(PaddingKt.m10023j(aVar, DateRangePickerKt.m25667n()), false, (String) null, (C16031g) null, DateRangePickerKt$VerticalMonthsList$1$2$1$1$1.f19357f, 7, (Object) null), false, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$2(lazyListState, o0Var, str, str2), 1, (Object) null), c0Var2.mo12478f(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 0, 0, 131064);
                                int i11 = i10 << 3;
                                int i12 = i10 << 6;
                                int i13 = (i10 << 9) & 3670016;
                                DatePickerKt.m25604j(e, lVar6, lVar5, stateData, true, lVar4, d0Var, c0Var2, oVar, i13 | (i11 & 458752) | (i11 & 112) | C12888a.f31808q | (i12 & 7168) | (29360128 & i12));
                                oVar.mo15002m0();
                                oVar.mo14896D();
                                oVar.mo15002m0();
                                oVar.mo15002m0();
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            mo11477a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                            return C11079d2.f28267a;
                        }
                    }), 6, (Object) null);
                }
            }, oVar, (this.$$dirty >> 3) & 112, 252);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
