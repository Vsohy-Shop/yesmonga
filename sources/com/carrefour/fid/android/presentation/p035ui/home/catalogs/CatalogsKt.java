package com.carrefour.fid.android.presentation.p035ui.home.catalogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.BannerComponentKt;
import com.carrefour.fid.android.design.components.compose.C36987g;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.contentsquare.android.api.C14092c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.home.catalogs.CatalogsKt */
public final class CatalogsKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106262a(String str, C11289a<C11079d2> aVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        String str2 = str;
        C11289a<C11079d2> aVar2 = aVar;
        int i5 = i;
        C8592o o = oVar.mo15009o(180053190);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(180053190, i2, -1, "com.carrefour.fid.android.presentation.ui.home.catalogs.CatalogsBanner (Catalogs.kt:37)");
            }
            oVar2 = o;
            BannerComponentKt.m151326b(PaddingKt.m10024k(BackgroundKt.m8825d(C8767m.f23478j, C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C37474a.f94133a.mo114202y()), C16018i.m71858d(R.string.home_quick_access_catalogs_title, o, 0), str, (String) null, R.drawable.ds_ic_catalogs_img, C36987g.f92392a, C16009b.m71825a(R.color.ds_red_extra_light, o, 0), 0.0f, aVar, o, ((i2 << 6) & 896) | (C36987g.f92393b << 15) | ((i2 << 21) & 234881024), C14092c.f34527J);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CatalogsKt$CatalogsBanner$1(str2, aVar2, i5));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106263b(@C12579k HomePageViewModel homePageViewModel, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i) {
        HomePageViewModel homePageViewModel2 = homePageViewModel;
        C11289a<C11079d2> aVar2 = aVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(homePageViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar2, "onCatalogBannerClicked");
        C8592o o = oVar.mo15009o(32387907);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(32387907, i2, -1, "com.carrefour.fid.android.presentation.ui.home.catalogs.CatalogsStateful (Catalogs.kt:18)");
        }
        if (((C26406a.C26449c) C8415c2.m30232a(homePageViewModel.getUiState(), new C26406a.C26449c((C26406a.C26449c.C26476i) null, (StoreServiceType) null, false, (C26406a.C26449c.C26456c) null, (List) null, (List) null, (List) null, (C26406a.C26449c.C26469g) null, (C26406a.C26449c.C26472h) null, (C26406a.C26449c.C26460d) null, (C26406a.C26449c.C26453b) null, (C26406a.C26449c.C26466f) null, (C26406a.C26449c.C26463e) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null), (CoroutineContext) null, o, 72, 2).getValue()).mo76953D() instanceof C26406a.C26449c.C26460d.C26462b) {
            o.mo14918M(1458796130);
            m106262a(C16018i.m71858d(R.string.home_quick_access_catalogs_description, o, 0), aVar2, o, i2 & 112);
            o.mo15002m0();
        } else {
            o.mo14918M(1458796260);
            m106262a(C16018i.m71858d(R.string.home_quick_access_catalogs_description_store_set, o, 0), aVar2, o, i2 & 112);
            o.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CatalogsKt$CatalogsStateful$1(homePageViewModel2, aVar2, i2));
        }
    }
}
