package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.google.accompanist.pager.C15029c;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDriveCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCarousel.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCarouselKt$DriveCarousel$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,83:1\n154#2:84\n*S KotlinDebug\n*F\n+ 1 DriveCarousel.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCarouselKt$DriveCarousel$3\n*L\n68#1:84\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCarouselKt$DriveCarousel$3 */
public final class DriveCarouselKt$DriveCarousel$3 extends Lambda implements C11306r<C15029c, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Map<DrivePoint, Float> $distanceForDrive;
    final /* synthetic */ List<DrivePoint> $driveList;
    final /* synthetic */ String $driveLoading;
    final /* synthetic */ float $itemWidth;
    final /* synthetic */ C11300l<DrivePoint, C11079d2> $onDriveSelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselKt$DriveCarousel$3(List<DrivePoint> list, String str, Map<DrivePoint, Float> map, float f, C11300l<? super DrivePoint, C11079d2> lVar, int i) {
        super(4);
        this.$driveList = list;
        this.$driveLoading = str;
        this.$distanceForDrive = map;
        this.$itemWidth = f;
        this.$onDriveSelected = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C15029c) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C15029c cVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(cVar, "$this$HorizontalPager");
        if ((i2 & 112) == 0) {
            i3 = (oVar.mo14976f(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1580332765, i2, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCarousel.<anonymous> (DriveCarousel.kt:60)");
            }
            final DrivePoint drivePoint = this.$driveList.get(i);
            String storeId = drivePoint.getStoreId();
            String str = this.$driveLoading;
            if (str == null) {
                str = null;
            }
            boolean areEqual = Intrinsics.areEqual((Object) storeId, (Object) str);
            Float f = this.$distanceForDrive.get(drivePoint);
            float floatValue = f != null ? f.floatValue() : 0.0f;
            final String d = C16018i.m71858d(C28330R.string.drive_map_select_button, oVar, 0);
            C8767m E = SizeKt.m10089E(C8767m.f23478j, this.$itemWidth, C16483g.m74435M((float) 172));
            final C11300l<DrivePoint, C11079d2> lVar = this.$onDriveSelected;
            DriveCardKt.DriveCard(SemanticsModifierKt.m71867b(E, true, new C11300l<C16044q, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C16044q) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k C16044q qVar) {
                    Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
                    SemanticsPropertiesKt.m71965J0(qVar, true);
                    String str = d;
                    final C11300l<DrivePoint, C11079d2> lVar = lVar;
                    final DrivePoint drivePoint = drivePoint;
                    SemanticsPropertiesKt.m72015g0(qVar, str, new C11289a<Boolean>() {
                        @C12579k
                        public final Boolean invoke() {
                            lVar.invoke(drivePoint);
                            return Boolean.TRUE;
                        }
                    });
                }
            }), drivePoint, floatValue, areEqual, this.$onDriveSelected, oVar, (57344 & this.$$dirty) | 64, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
