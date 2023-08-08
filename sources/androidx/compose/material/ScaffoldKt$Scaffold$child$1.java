package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$Scaffold$child$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $bottomBar;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$child$1(long j, long j2, int i, boolean z, int i2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i3, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar2, C3036d1 d1Var) {
        super(3);
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$$dirty1 = i;
        this.$isFloatingActionButtonDocked = z;
        this.$floatingActionButtonPosition = i2;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$floatingActionButton = pVar2;
        this.$bottomBar = pVar3;
        this.$$dirty = i3;
        this.$snackbarHost = qVar2;
        this.$scaffoldState = d1Var;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo10365a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C8767m mVar2 = mVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar2, "childModifier");
        if ((i & 14) == 0) {
            if (oVar2.mo15006n0(mVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1823402604, i2, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
            }
            long j = this.$backgroundColor;
            long j2 = this.$contentColor;
            final boolean z = this.$isFloatingActionButtonDocked;
            final int i4 = this.$floatingActionButtonPosition;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
            C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = this.$content;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$floatingActionButton;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$bottomBar;
            int i5 = this.$$dirty;
            int i6 = this.$$dirty1;
            long j3 = j2;
            long j4 = j;
            C29701 r4 = r11;
            final C11305q<C2366i0, C8592o, Integer, C11079d2> qVar2 = qVar;
            final C11304p<C8592o, Integer, C11079d2> pVar4 = pVar2;
            final C11304p<C8592o, Integer, C11079d2> pVar5 = pVar3;
            final int i7 = i5;
            final int i8 = i6;
            final C11305q<SnackbarHostState, C8592o, Integer, C11079d2> qVar3 = this.$snackbarHost;
            final C3036d1 d1Var = this.$scaffoldState;
            C29701 r11 = new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1128984656, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                        }
                        boolean z = z;
                        int i2 = i4;
                        C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = qVar2;
                        final C11305q<SnackbarHostState, C8592o, Integer, C11079d2> qVar2 = qVar3;
                        final C3036d1 d1Var = d1Var;
                        final int i3 = i7;
                        C8552a b = C8553b.m31048b(oVar, 533782017, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(533782017, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                    }
                                    qVar2.invoke(d1Var.mo10747b(), oVar, Integer.valueOf((i3 >> 9) & 112));
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        });
                        C11304p<C8592o, Integer, C11079d2> pVar2 = pVar4;
                        C11304p<C8592o, Integer, C11079d2> pVar3 = pVar5;
                        int i4 = i7;
                        ScaffoldKt.m13748b(z, i2, pVar, qVar, b, pVar2, pVar3, oVar, ((i4 >> 21) & 14) | C12888a.f31808q | ((i4 >> 15) & 112) | (i4 & 896) | ((i8 >> 12) & 7168) | (458752 & i4) | ((i4 << 9) & 3670016));
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            };
            C8552a b = C8553b.m31048b(oVar2, -1128984656, true, r4);
            int i9 = 1572864 | (i2 & 14);
            int i10 = this.$$dirty1;
            SurfaceKt.m13879b(mVar, (C15218g4) null, j4, j3, (C2223i) null, 0.0f, b, oVar, i9 | ((i10 >> 9) & 896) | ((i10 >> 9) & 7168), 50);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10365a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
