package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2683e;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.C3043g;
import androidx.compose.material.C7933t0;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.product.presentation.models.C27647a;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28113a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodProductDetailsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1095:1\n154#2:1096\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3\n*L\n360#1:1096\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ C27854a $basketData;
    final /* synthetic */ C3043g $bottomSheetState;
    final /* synthetic */ boolean $isBottomSheetDisplayed;
    final /* synthetic */ C27899o $productData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3(boolean z, C3043g gVar, int i, C27899o oVar, C27854a aVar, C11300l<? super C27870j, C11079d2> lVar) {
        super(2);
        this.$isBottomSheetDisplayed = z;
        this.$bottomSheetState = gVar;
        this.$$dirty = i;
        this.$productData = oVar;
        this.$basketData = aVar;
        this.$actioner = lVar;
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
                ComposerKt.m29845w0(-1581736459, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreen.<anonymous> (NonFoodProductDetailsScreen.kt:353)");
            }
            if (this.$isBottomSheetDisplayed) {
                oVar2.mo14918M(-1008184000);
                C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
                float M = C16483g.m74435M((float) 80);
                C2683e c = C7933t0.f19075a.mo11076b(oVar2, C7933t0.f19076b).mo10756c();
                final C27854a aVar = this.$basketData;
                final C27899o oVar3 = this.$productData;
                final C11300l<C27870j, C11079d2> lVar = this.$actioner;
                C8552a b = C8553b.m31048b(oVar2, -331137269, true, new C11305q<C2373k, C8592o, Integer, C11079d2>() {
                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    /* renamed from: a */
                    public final void mo80867a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
                        Intrinsics.checkNotNullParameter(kVar, "$this$BottomSheetScaffold");
                        if ((i & 81) != 16 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-331137269, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreen.<anonymous>.<anonymous> (NonFoodProductDetailsScreen.kt:361)");
                            }
                            C27647a a = C28113a.m117737a(aVar.mo80926f(), oVar3.mo81088h());
                            C8767m m = PaddingKt.m10026m(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16), 0.0f, 2, (Object) null);
                            boolean h = aVar.mo80928h();
                            final C11300l<C27870j, C11079d2> lVar = lVar;
                            final C27899o oVar2 = oVar3;
                            final C27854a aVar = aVar;
                            NonFoodBasketComponentKt.m116824a(m, (Prices) null, (Discount) null, h, a, new C11300l<C27647a, C11079d2>() {
                                /* renamed from: a */
                                public final void mo80868a(@C12579k C27647a aVar) {
                                    Intrinsics.checkNotNullParameter(aVar, "it");
                                    NonFoodProductDetailsScreenKt.m116850M(aVar, lVar, oVar2.mo81088h(), oVar2.mo81091j(), aVar.mo80927g(), oVar2.mo81090i());
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    mo80868a((C27647a) obj);
                                    return C11079d2.f28267a;
                                }
                            }, oVar, 6, 6);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        mo80867a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        return C11079d2.f28267a;
                    }
                });
                C3043g gVar = this.$bottomSheetState;
                C8592o oVar4 = oVar2;
                C27899o oVar5 = this.$productData;
                C27854a aVar2 = this.$basketData;
                boolean z = this.$isBottomSheetDisplayed;
                final C27899o oVar6 = oVar5;
                final C27854a aVar3 = aVar2;
                final boolean z2 = z;
                final C11300l<C27870j, C11079d2> lVar2 = this.$actioner;
                final int i3 = this.$$dirty;
                C8592o oVar7 = oVar4;
                BottomSheetScaffoldKt.m13292b(b, n, gVar, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, c, 0.0f, 0, 0, M, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar4, 383036816, true, new C11305q<C2366i0, C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
                        Intrinsics.checkNotNullParameter(i0Var, "it");
                        if ((i & 81) != 16 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(383036816, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreen.<anonymous>.<anonymous> (NonFoodProductDetailsScreen.kt:383)");
                            }
                            C27899o oVar2 = oVar6;
                            C27854a aVar = aVar3;
                            boolean z = z2;
                            C11300l<C27870j, C11079d2> lVar = lVar2;
                            int i2 = i3;
                            NonFoodProductDetailsScreenKt.m116858h(oVar2, aVar, z, lVar, oVar, ((i2 >> 9) & 112) | 8 | ((i2 >> 9) & 896) | ((i2 >> 15) & 7168), 0);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }), oVar, ((this.$$dirty << 6) & 896) | 54, 24960, C22132b.f56831b, 4173560);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-1008182359);
                C27899o oVar8 = this.$productData;
                C27854a aVar4 = this.$basketData;
                boolean z3 = this.$isBottomSheetDisplayed;
                C11300l<C27870j, C11079d2> lVar3 = this.$actioner;
                int i4 = this.$$dirty;
                NonFoodProductDetailsScreenKt.m116858h(oVar8, aVar4, z3, lVar3, oVar, ((i4 >> 9) & 112) | 8 | ((i4 >> 9) & 896) | ((i4 >> 15) & 7168), 0);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
