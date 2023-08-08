package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nModalBottomSheetComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ModalBottomSheetComponentKt$ModalBottomSheetComponent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,36:1\n154#2:37\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ModalBottomSheetComponentKt$ModalBottomSheetComponent$1\n*L\n29#1:37\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponentKt$ModalBottomSheetComponent$1 */
public final class ModalBottomSheetComponentKt$ModalBottomSheetComponent$1 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $sheetContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetComponentKt$ModalBottomSheetComponent$1(ModalBottomSheetState modalBottomSheetState, int i, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(3);
        this.$modalBottomSheetState = modalBottomSheetState;
        this.$$dirty = i;
        this.$sheetContent = qVar;
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1549142592, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponent.<anonymous> (ModalBottomSheetComponent.kt:21)");
            }
            float f = (float) 16;
            float f2 = (float) 0;
            C2693n i3 = C2694o.m12167i(C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f2), C16483g.m74435M(f2));
            final C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$sheetContent;
            final int i4 = this.$$dirty;
            C8552a b = C8553b.m31048b(oVar2, 865610322, true, new C11305q<C2373k, C8592o, Integer, C11079d2>() {
                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                public final void mo80819a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(kVar, "$this$ModalBottomSheetLayout");
                    if ((i & 14) == 0) {
                        if (oVar.mo15006n0(kVar)) {
                            i2 = 4;
                        } else {
                            i2 = 2;
                        }
                        i |= i2;
                    }
                    if ((i & 91) != 18 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(865610322, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponent.<anonymous>.<anonymous> (ModalBottomSheetComponent.kt:23)");
                        }
                        qVar.invoke(kVar, oVar, Integer.valueOf((i & 14) | ((i4 >> 3) & 112)));
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo80819a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            });
            ModalBottomSheetState modalBottomSheetState = this.$modalBottomSheetState;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            final int i5 = this.$$dirty;
            ModalBottomSheetKt.m13582c(b, (C8767m) null, modalBottomSheetState, i3, 0.0f, 0, 0, 0, C8553b.m31048b(oVar2, -754480422, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-754480422, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponent.<anonymous>.<anonymous> (ModalBottomSheetComponent.kt:30)");
                        }
                        pVar.invoke(oVar, Integer.valueOf((i5 >> 9) & 14));
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, (ModalBottomSheetState.f7719e << 6) | 100663302 | ((this.$$dirty << 6) & 896), C14092c.f34607h0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
