package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceContent$1$1 */
public final class ReinsuranceStatefulKt$ReinsuranceContent$1$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27900p, C11079d2> $actioner;
    final /* synthetic */ ReinsuranceType $reinsuranceType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReinsuranceStatefulKt$ReinsuranceContent$1$1(ReinsuranceType reinsuranceType, int i, C11300l<? super C27900p, C11079d2> lVar) {
        super(1);
        this.$reinsuranceType = reinsuranceType;
        this.$$dirty = i;
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final ReinsuranceType reinsuranceType = this.$reinsuranceType;
        final int i = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(1316273119, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                Intrinsics.checkNotNullParameter(eVar, "$this$item");
                if ((i & 81) != 16 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(1316273119, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceContent.<anonymous>.<anonymous>.<anonymous> (ReinsuranceStateful.kt:51)");
                    }
                    ReinsuranceStatefulKt.m116903b(reinsuranceType, oVar, (i >> 3) & 14);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 3, (Object) null);
        final C11300l<C27900p, C11079d2> lVar = this.$actioner;
        final int i2 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(632570582, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                Intrinsics.checkNotNullParameter(eVar, "$this$item");
                if ((i & 81) != 16 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(632570582, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceContent.<anonymous>.<anonymous>.<anonymous> (ReinsuranceStateful.kt:54)");
                    }
                    ReinsuranceStatefulKt.m116902a(lVar, oVar, i2 & 14);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 3, (Object) null);
    }
}
