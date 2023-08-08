package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt;
import com.carrefour.fid.android.domain.models.product.Product;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.QuantityListBottomSheetComponentKt$QuantityListBottomSheetComponent$1 */
public final class C23542xfb465848 extends Lambda implements C11305q<C2373k, C8592o, Integer, C11079d2> {
    final /* synthetic */ C23547a $bottomSheetData;
    final /* synthetic */ C11304p<Product, Integer, C11079d2> $onNewQuantitySelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23542xfb465848(C23547a aVar, C11304p<? super Product, ? super Integer, C11079d2> pVar) {
        super(3);
        this.$bottomSheetData = aVar;
        this.$onNewQuantitySelected = pVar;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo68989a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
        int i2 = i;
        Intrinsics.checkNotNullParameter(kVar, "$this$ModalBottomSheetLayout");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1589838283, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.QuantityListBottomSheetComponent.<anonymous> (QuantityListBottomSheetComponent.kt:45)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.backdrop_handle, oVar, 0), (String) null, SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C8734c.f23406a.mo17066i(), (C15541c) null, 0.0f, (C15249k2) null, oVar, 3512, 112);
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            int j = this.$bottomSheetData.mo69003j();
            int h = this.$bottomSheetData.mo69000h();
            int k = this.$bottomSheetData.mo69004k();
            int i3 = this.$bottomSheetData.mo69002i();
            final C23547a aVar2 = this.$bottomSheetData;
            final C11304p<Product, Integer, C11079d2> pVar = this.$onNewQuantitySelected;
            ListQuantityComponentKt.m151522a(n, h, j, k, i3, new C11300l<Integer, C11079d2>() {
                /* renamed from: a */
                public final void mo68990a(int i) {
                    if (aVar2.mo69005l() != null) {
                        pVar.invoke(aVar2.mo69005l(), Integer.valueOf(i));
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo68990a(((Number) obj).intValue());
                    return C11079d2.f28267a;
                }
            }, oVar, 6, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo68989a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
