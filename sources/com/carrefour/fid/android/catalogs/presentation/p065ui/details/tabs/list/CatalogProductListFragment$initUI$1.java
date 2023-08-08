package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a;
import com.carrefour.fid.android.design.components.compose.SearchBarComponentKt;
import com.carrefour.fid.android.design.components.compose.SearchBarVariant;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogProductListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogProductListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/CatalogProductListFragment$initUI$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,180:1\n154#2:181\n*S KotlinDebug\n*F\n+ 1 CatalogProductListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/CatalogProductListFragment$initUI$1\n*L\n127#1:181\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.CatalogProductListFragment$initUI$1 */
public final class CatalogProductListFragment$initUI$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CatalogProductListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogProductListFragment$initUI$1(CatalogProductListFragment catalogProductListFragment) {
        super(2);
        this.this$0 = catalogProductListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1100729332, i2, -1, "com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.CatalogProductListFragment.initUI.<anonymous> (CatalogProductListFragment.kt:124)");
            }
            C8767m o = PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 4), C16483g.m74435M((float) 16), C16483g.m74435M((float) 9), 1, (Object) null);
            SearchBarVariant searchBarVariant = SearchBarVariant.GREY;
            String d = C16018i.m71858d(C39364b.C39383s.general_research_infinitive, oVar, 0);
            final CatalogProductListFragment catalogProductListFragment = this.this$0;
            C395101 r1 = new C11300l<String, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "searchText");
                    if (str.length() < 3) {
                        if (!(str.length() == 0)) {
                            return;
                        }
                    }
                    catalogProductListFragment.mo130670f1(str);
                }
            };
            final CatalogProductListFragment catalogProductListFragment2 = this.this$0;
            C395112 r2 = new C11300l<String, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "searchText");
                    if (str.length() < 3) {
                        if (str.length() > 0) {
                            catalogProductListFragment2.mo130670f1(str);
                        }
                    }
                }
            };
            final CatalogProductListFragment catalogProductListFragment3 = this.this$0;
            SearchBarComponentKt.m151597c(o, searchBarVariant, d, (String) null, false, false, false, r1, r2, new C11289a<C11079d2>() {
                public final void invoke() {
                    Catalog Q0 = catalogProductListFragment3.f101020v;
                    if (Q0 != null) {
                        catalogProductListFragment3.mo130660W0().sendIntent(new C39635a.C39646c.C39650d(Q0));
                    }
                }
            }, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, oVar, 1572912, 0, 3128);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
