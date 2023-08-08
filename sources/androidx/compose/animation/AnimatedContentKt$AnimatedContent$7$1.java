package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15610w;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,780:1\n25#2:781\n36#2:788\n25#2:795\n1057#3,6:782\n1057#3,6:789\n1057#3,6:796\n1#4:802\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1\n*L\n665#1:781\n669#1:788\n676#1:795\n665#1:782,6\n669#1:789,6\n676#1:796,6\n*E\n"})
public final class AnimatedContentKt$AnimatedContent$7$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11306r<AnimatedVisibilityScope, S, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentScope<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ C11300l<AnimatedContentScope<S>, C2024d> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$7$1(Transition<S> transition, S s, int i, C11300l<? super AnimatedContentScope<S>, C2024d> lVar, AnimatedContentScope<S> animatedContentScope, C11306r<? super AnimatedVisibilityScope, ? super S, ? super C8592o, ? super Integer, C11079d2> rVar, SnapshotStateList<S> snapshotStateList) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s;
        this.$$dirty = i;
        this.$transitionSpec = lVar;
        this.$rootScope = animatedContentScope;
        this.$content = rVar;
        this.$currentlyVisible = snapshotStateList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C2028g gVar;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(885640742, i2, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:663)");
            }
            C11300l<AnimatedContentScope<S>, C2024d> lVar = this.$transitionSpec;
            AnimatedContentScope<S> animatedContentScope = this.$rootScope;
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = lVar.invoke(animatedContentScope);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            final C2024d dVar = (C2024d) N;
            Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual((Object) this.$this_AnimatedContent.mo6704m().mo6409a(), (Object) this.$stateForContent));
            Transition<S> transition = this.$this_AnimatedContent;
            S s = this.$stateForContent;
            C11300l<AnimatedContentScope<S>, C2024d> lVar2 = this.$transitionSpec;
            AnimatedContentScope<S> animatedContentScope2 = this.$rootScope;
            oVar.mo14918M(1157296644);
            boolean n0 = oVar.mo15006n0(valueOf);
            Object N2 = oVar.mo14921N();
            if (n0 || N2 == aVar.mo16277a()) {
                if (Intrinsics.areEqual((Object) transition.mo6704m().mo6409a(), (Object) s)) {
                    gVar = C2028g.f5666a.mo7033a();
                } else {
                    gVar = lVar2.invoke(animatedContentScope2).mo7016a();
                }
                N2 = gVar;
                oVar.mo14893C(N2);
            }
            oVar.mo15002m0();
            C2028g gVar2 = (C2028g) N2;
            S s2 = this.$stateForContent;
            Transition<S> transition2 = this.$this_AnimatedContent;
            oVar.mo14918M(-492369756);
            Object N3 = oVar.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = new AnimatedContentScope.C1897a(Intrinsics.areEqual((Object) s2, (Object) transition2.mo6706o()));
                oVar.mo14893C(N3);
            }
            oVar.mo15002m0();
            AnimatedContentScope.C1897a aVar2 = (AnimatedContentScope.C1897a) N3;
            C2025e c = dVar.mo7018c();
            C8767m a = C15610w.m69384a(C8767m.f23478j, new C11305q<C15568h0, C15557e0, C16476b, C15564g0>() {
                @C12579k
                /* renamed from: a */
                public final C15564g0 mo6390a(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
                    Intrinsics.checkNotNullParameter(h0Var, "$this$layout");
                    Intrinsics.checkNotNullParameter(e0Var, "measurable");
                    final C15611w0 t0 = e0Var.mo44324t0(j);
                    int K0 = t0.mo44471K0();
                    int G0 = t0.mo44468G0();
                    final C2024d dVar = dVar;
                    return C15568h0.m69206r2(h0Var, K0, G0, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
                        /* renamed from: a */
                        public final void mo6392a(@C12579k C15611w0.C15612a aVar) {
                            Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                            aVar.mo44481o(t0, 0, 0, dVar.mo7019d());
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            mo6392a((C15611w0.C15612a) obj);
                            return C11079d2.f28267a;
                        }
                    }, 4, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return mo6390a((C15568h0) obj, (C15557e0) obj2, ((C16476b) obj3).mo47807x());
                }
            });
            aVar2.mo6437l(Intrinsics.areEqual((Object) this.$stateForContent, (Object) this.$this_AnimatedContent.mo6706o()));
            C8767m k3 = a.mo17224k3(aVar2);
            Transition<S> transition3 = this.$this_AnimatedContent;
            final S s3 = this.$stateForContent;
            C18933 r2 = new C11300l<S, Boolean>() {
                @C12579k
                /* renamed from: a */
                public final Boolean invoke(S s) {
                    return Boolean.valueOf(Intrinsics.areEqual((Object) s, (Object) s3));
                }
            };
            final AnimatedContentScope<S> animatedContentScope3 = this.$rootScope;
            final S s4 = this.$stateForContent;
            final C11306r<AnimatedVisibilityScope, S, C8592o, Integer, C11079d2> rVar = this.$content;
            final int i3 = this.$$dirty;
            final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
            AnimatedVisibilityKt.m7739d(transition3, r2, k3, c, gVar2, C8553b.m31048b(oVar, -1894897681, true, new C11305q<AnimatedVisibilityScope, C8592o, Integer, C11079d2>() {
                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                public final void mo6394a(@C12579k AnimatedVisibilityScope animatedVisibilityScope, @C12580l C8592o oVar, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(animatedVisibilityScope, "$this$AnimatedVisibility");
                    if ((i & 14) == 0) {
                        if (oVar.mo15006n0(animatedVisibilityScope)) {
                            i2 = 4;
                        } else {
                            i2 = 2;
                        }
                        i |= i2;
                    }
                    if ((i & 91) != 18 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1894897681, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:690)");
                        }
                        final SnapshotStateList<S> snapshotStateList = snapshotStateList;
                        final S s = s4;
                        final AnimatedContentScope<S> animatedContentScope = animatedContentScope3;
                        int i3 = i & 14;
                        EffectsKt.m29891c(animatedVisibilityScope, new C11300l<C8434e0, C8430d0>() {

                            @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n*L\n1#1,483:1\n695#2,3:484\n*E\n"})
                            /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$7$1$4$1$a */
                            public static final class C1896a implements C8430d0 {

                                /* renamed from: a */
                                public final /* synthetic */ SnapshotStateList f5180a;

                                /* renamed from: b */
                                public final /* synthetic */ Object f5181b;

                                /* renamed from: c */
                                public final /* synthetic */ AnimatedContentScope f5182c;

                                public C1896a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentScope animatedContentScope) {
                                    this.f5180a = snapshotStateList;
                                    this.f5181b = obj;
                                    this.f5182c = animatedContentScope;
                                }

                                /* renamed from: g */
                                public void mo791g() {
                                    this.f5180a.remove(this.f5181b);
                                    this.f5182c.mo6418p().remove(this.f5181b);
                                }
                            }

                            @C12579k
                            /* renamed from: a */
                            public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
                                Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
                                return new C1896a(snapshotStateList, s, animatedContentScope);
                            }
                        }, oVar, i3);
                        animatedContentScope3.mo6418p().put(s4, ((C1915c) animatedVisibilityScope).mo6594e());
                        rVar.invoke(animatedVisibilityScope, s4, oVar, Integer.valueOf(i3 | ((i3 >> 9) & 896)));
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo6394a((AnimatedVisibilityScope) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            }), oVar, 196608 | (this.$$dirty & 14), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
