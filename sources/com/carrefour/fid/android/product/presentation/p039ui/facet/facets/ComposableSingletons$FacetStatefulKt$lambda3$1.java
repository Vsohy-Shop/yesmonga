package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.product.C38102a;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.ComposableSingletons$FacetStatefulKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$FacetStatefulKt$lambda3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$FacetStatefulKt$lambda3$1 f67824f = new ComposableSingletons$FacetStatefulKt$lambda3$1();

    public ComposableSingletons$FacetStatefulKt$lambda3$1() {
        super(2);
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
                ComposerKt.m29845w0(1442438339, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.ComposableSingletons$FacetStatefulKt.lambda-3.<anonymous> (FacetStateful.kt:383)");
            }
            FacetStatefulKt.m117373a(new C28892e.C28895c(new Facet(CollectionsKt__CollectionsKt.m40448L(new Filter.CheckboxFilter(C38102a.m157521b("marque"), "Marque", false, C10976s.m41419k(new Term(C38112f.m157658b("Intermarché"), true, (DefaultConstructorMarker) null)), true, (DefaultConstructorMarker) null), new Filter.CheckboxFilter(C38102a.m157521b("label_qualite"), "Label Qualité", false, CollectionsKt__CollectionsKt.m40441E(), true, (DefaultConstructorMarker) null)), CollectionsKt__CollectionsKt.m40448L(new Sort(C38111e.m157650b("pertinance"), "Pertinance", false, (DefaultConstructorMarker) null), new Sort(C38111e.m157650b("prix_croissant"), "Prix croissant", true, (DefaultConstructorMarker) null), new Sort(C38111e.m157650b("prix_decroissant"), "Prix décroissant", false, (DefaultConstructorMarker) null)), 42, false, false)), C279751.f67825f, oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
