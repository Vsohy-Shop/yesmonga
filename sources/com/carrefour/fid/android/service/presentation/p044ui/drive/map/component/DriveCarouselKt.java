package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import android.content.res.Configuration;
import androidx.compose.animation.C2046v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerDefaults;
import com.google.accompanist.pager.PagerState;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Landroidx/compose/ui/m;", "modifier", "Lcom/google/accompanist/pager/PagerState;", "state", "", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "", "distanceForDrive", "Lcom/carrefour/fid/android/domain/models/service/models/a;", "driveLoading", "Lkotlin/Function1;", "Lkotlin/d2;", "onDriveSelected", "DriveCarousel-u-5N7ek", "(Landroidx/compose/ui/m;Lcom/google/accompanist/pager/PagerState;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/o;II)V", "DriveCarousel", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCarousel.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCarouselKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,83:1\n154#2:84\n154#2:85\n174#2:87\n154#2:88\n154#2:89\n76#3:86\n*S KotlinDebug\n*F\n+ 1 DriveCarousel.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCarouselKt\n*L\n34#1:84\n35#1:85\n39#1:87\n47#1:88\n53#1:89\n36#1:86\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCarouselKt */
public final class DriveCarouselKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: DriveCarousel-u-5N7ek  reason: not valid java name */
    public static final void m172910DriveCarouselu5N7ek(@C12580l C8767m mVar, @C12579k PagerState pagerState, @C12579k Map<DrivePoint, Float> map, @C12580l String str, @C12579k C11300l<? super DrivePoint, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(pagerState, "state");
        Intrinsics.checkNotNullParameter(map, "distanceForDrive");
        Intrinsics.checkNotNullParameter(lVar, "onDriveSelected");
        C8592o o = oVar.mo15009o(1451589256);
        if ((i2 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1451589256, i3, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCarousel (DriveCarousel.kt:26)");
        }
        float f = (float) 16;
        float M = C16483g.m74435M(f);
        float M2 = C16483g.m74435M((float) 330);
        C2366i0 e = PaddingKt.m10018e(M, 0.0f, C16483g.m74435M(C11479u.m44444t(((float) ((Configuration) o.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).screenWidthDp) - M2, M)), 0.0f, 10, (Object) null);
        List Q5 = CollectionsKt___CollectionsKt.m40557Q5(map.keySet());
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        int size = Q5.size();
        float M3 = C16483g.m74435M(f);
        C2195g c = PagerDefaults.f37132a.mo41991c(pagerState, C2046v.m8765b(o, 0), SnapperFlingBehaviorDefaults.f28007a.mo21789d(), C16483g.m74435M((float) 0), DriveCarouselKt$DriveCarousel$1.INSTANCE, o, ((i3 >> 3) & 14) | 28224 | (PagerDefaults.f37135d << 15), 0);
        DriveCarouselKt$DriveCarousel$2 driveCarouselKt$DriveCarousel$2 = new DriveCarouselKt$DriveCarousel$2(Q5);
        C8767m mVar2 = aVar;
        C8592o oVar2 = o;
        C8592o oVar3 = oVar2;
        DriveCarouselKt$DriveCarousel$2 driveCarouselKt$DriveCarousel$22 = driveCarouselKt$DriveCarousel$2;
        Pager.m64354a(size, n, pagerState, false, M3, e, (C8734c.C8737c) null, c, driveCarouselKt$DriveCarousel$22, false, C8553b.m31048b(oVar2, -1580332765, true, new DriveCarouselKt$DriveCarousel$3(Q5, str, map, M2, lVar, i)), oVar3, ((i << 3) & 896) | C12888a.f31808q, 6, 584);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveCarouselKt$DriveCarousel$4(mVar2, pagerState, map, str, lVar, i, i2));
        }
    }
}
