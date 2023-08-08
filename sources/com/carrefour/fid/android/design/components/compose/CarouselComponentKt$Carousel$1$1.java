package com.carrefour.fid.android.design.components.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.libs.pager.C37465b;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCarouselComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselComponent.kt\ncom/carrefour/fid/android/design/components/compose/CarouselComponentKt$Carousel$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,256:1\n50#2:257\n49#2:258\n1114#3,6:259\n*S KotlinDebug\n*F\n+ 1 CarouselComponent.kt\ncom/carrefour/fid/android/design/components/compose/CarouselComponentKt$Carousel$1$1\n*L\n111#1:257\n111#1:258\n111#1:259,6\n*E\n"})
public final class CarouselComponentKt$Carousel$1$1 extends Lambda implements C11306r<C37465b, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<Integer, C11079d2> $onImageClick;
    final /* synthetic */ List<String> $urls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$Carousel$1$1(List<String> list, C11300l<? super Integer, C11079d2> lVar, int i) {
        super(4);
        this.$urls = list;
        this.$onImageClick = lVar;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo111973a(@C12579k C37465b bVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        C8767m mVar;
        int i4;
        int i5 = i;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(bVar, "$this$HorizontalPager");
        if ((i2 & 112) == 0) {
            if (oVar2.mo14976f(i5)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if ((i3 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1134144133, i3, -1, "com.carrefour.fid.android.design.components.compose.Carousel.<anonymous>.<anonymous> (CarouselComponent.kt:104)");
            }
            String str = this.$urls.get(i5);
            C8767m.C8768a aVar = C8767m.f23478j;
            oVar2.mo14918M(2073313829);
            C11300l<Integer, C11079d2> lVar = this.$onImageClick;
            if (lVar != null) {
                Integer valueOf = Integer.valueOf(i);
                C11300l<Integer, C11079d2> lVar2 = this.$onImageClick;
                oVar2.mo14918M(511388516);
                boolean n0 = oVar2.mo15006n0(lVar) | oVar2.mo15006n0(valueOf);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new CarouselComponentKt$Carousel$1$1$1$1(lVar2, i5);
                    oVar2.mo14893C(N);
                }
                oVar.mo15002m0();
                mVar = ClickableKt.m8878e(aVar, false, (String) null, (C16031g) null, (C11289a) N, 7, (Object) null);
            } else {
                mVar = aVar;
            }
            oVar.mo15002m0();
            C35325c.m145645b(str, aVar.mo17224k3(mVar), (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, C15541c.f38696a.mo44373i(), (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, C36896b.C36904h.ds_ic_placeholder, ComposableSingletons$CarouselComponentKt.f92161a.mo112047a(), (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2>) null, oVar, 1572864, 3072, 53180);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo111973a((C37465b) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
