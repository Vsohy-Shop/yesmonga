package com.carrefour.fid.android.catalogs.presentation.p065ui;

import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39416g;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.google.android.material.tabs.TabLayout;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment$initHeader$1$1 */
public final class CatalogBuilderFragment$initHeader$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $isStoreSectionAvailable;
    final /* synthetic */ C39416g $this_with;
    final /* synthetic */ CatalogBuilderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogBuilderFragment$initHeader$1$1(boolean z, C39416g gVar, CatalogBuilderFragment catalogBuilderFragment) {
        super(2);
        this.$isStoreSectionAvailable = z;
        this.$this_with = gVar;
        this.this$0 = catalogBuilderFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-878024612, i, -1, "com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment.initHeader.<anonymous>.<anonymous> (CatalogBuilderFragment.kt:71)");
            }
            final boolean z = this.$isStoreSectionAvailable;
            final C39416g gVar = this.$this_with;
            final CatalogBuilderFragment catalogBuilderFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 480672889, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    String str;
                    C8592o oVar2 = oVar;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(480672889, i2, -1, "com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment.initHeader.<anonymous>.<anonymous>.<anonymous> (CatalogBuilderFragment.kt:72)");
                        }
                        if (z) {
                            oVar2.mo14918M(796162554);
                            str = C16018i.m71858d(C39364b.C39383s.catalog_title_my_catalogs, oVar2, 0);
                            oVar.mo15002m0();
                        } else {
                            oVar2.mo14918M(796162663);
                            str = C16018i.m71858d(C39364b.C39383s.catalog_title_all_catalogs, oVar2, 0);
                            oVar.mo15002m0();
                        }
                        String d = C16018i.m71858d(C39364b.C39383s.accessibility_back_to_previous_page, oVar2, 0);
                        final C39416g gVar = gVar;
                        final CatalogBuilderFragment catalogBuilderFragment = catalogBuilderFragment;
                        HeaderComponentKt.m151505j(str, (C16361p0) null, 0, 0, 0, (Painter) null, d, new C11289a<C11079d2>() {
                            public final void invoke() {
                                if (gVar.f100818b.getSelectedTabPosition() != 0) {
                                    TabLayout tabLayout = gVar.f100818b;
                                    Intrinsics.checkNotNullExpressionValue(tabLayout, "allCatalogsTagline");
                                    if (tabLayout.getVisibility() == 0) {
                                        TabLayout tabLayout2 = gVar.f100818b;
                                        tabLayout2.mo91286N(tabLayout2.mo91367z(0));
                                        return;
                                    }
                                }
                                C19736g.m91827a(catalogBuilderFragment).mo58152q0();
                            }
                        }, oVar, 0, 62);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
