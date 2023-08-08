package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.model.PictoModel;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryPictoFormatter;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryPictoFormatterKt;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"", "isLoading", "", "minOrder", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "deliveryType", "Lkotlin/d2;", "BlocPictoComponent", "(ZLjava/lang/Double;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Landroidx/compose/runtime/o;II)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBlocPictoComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlocPictoComponent.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlocPictoComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n76#2:39\n76#2:47\n75#3,6:40\n81#3:72\n85#3:79\n75#4:46\n76#4,11:48\n89#4:78\n460#5,13:59\n473#5,3:75\n1855#6,2:73\n*S KotlinDebug\n*F\n+ 1 BlocPictoComponent.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlocPictoComponentKt\n*L\n18#1:39\n25#1:47\n25#1:40,6\n25#1:72\n25#1:79\n25#1:46\n25#1:48,11\n25#1:78\n25#1:59,13\n25#1:75,3\n30#1:73,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlocPictoComponentKt */
public final class BlocPictoComponentKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlocPictoComponentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.service.presentation.model.DeliveryType[] r0 = com.carrefour.fid.android.service.presentation.model.DeliveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.H1h3     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.BlocPictoComponentKt.WhenMappings.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void BlocPictoComponent(boolean z, @C12580l Double d, @C12579k DeliveryType deliveryType, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        List<PictoModel> list;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(deliveryType, NavArgumentsKt.DELIVERY_TYPE);
        C8592o o = oVar.mo15009o(1305216054);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(d)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo15006n0(deliveryType)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                z = false;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1305216054, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlocPictoComponent (BlocPictoComponent.kt:11)");
            }
            DeliverySummaryPictoFormatter deliverySummaryPictoFormatter = (DeliverySummaryPictoFormatter) o.mo15032w(DeliverySummaryPictoFormatterKt.getLocalDeliverySummaryPictoFormatter());
            int i8 = WhenMappings.$EnumSwitchMapping$0[deliveryType.ordinal()];
            if (i8 == 1) {
                list = deliverySummaryPictoFormatter.clcvPictoFormater(d);
            } else if (i8 == 2) {
                list = deliverySummaryPictoFormatter.h1h3PictoFormater(d);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C8767m b = C37019o.m151909b(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), z, (C15218g4) null, 2, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(b);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, d2, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            o.mo14918M(2019482242);
            for (PictoModel ItemPictoComponent : list) {
                ItemPictoComponentKt.ItemPictoComponent(C2411u0.m10660e(rowScopeInstance, C8767m.f23478j, 1.0f, false, 2, (Object) null), ItemPictoComponent, o, 64);
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        boolean z2 = z;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BlocPictoComponentKt$BlocPictoComponent$2(z2, d, deliveryType, i, i2));
        }
    }
}
