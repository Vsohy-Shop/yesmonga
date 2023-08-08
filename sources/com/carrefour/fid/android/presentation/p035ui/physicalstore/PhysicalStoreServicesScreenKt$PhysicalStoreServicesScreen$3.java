package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPhysicalStoreServicesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreServicesScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n154#2:131\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreServicesScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$3\n*L\n86#1:131\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$3 */
public final class PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ List<StoreService> $services;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$3(List<StoreService> list) {
        super(3);
        this.$services = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if ((i & 14) == 0) {
            i2 = (oVar.mo15006n0(i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2144154193, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesScreen.<anonymous> (PhysicalStoreServicesScreen.kt:82)");
            }
            C8767m j = PaddingKt.m10023j(C8767m.f23478j, i0Var);
            C2366i0 a = PaddingKt.m10014a(C16483g.m74435M((float) 16));
            final List<StoreService> list = this.$services;
            LazyDslKt.m10737b(j, (LazyListState) null, a, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k LazyListScope lazyListScope) {
                    Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
                    List<StoreService> list = list;
                    C253281 r1 = C253281.f62383f;
                    lazyListScope.mo8310k(list.size(), r1 != null ? new C25324x114c92e7(r1, list) : null, new C25325x114c92e8(list), C8553b.m31049c(-1091073711, true, new C25326x114c92e9(list, list)));
                }
            }, oVar, C22132b.f56831b, 250);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
