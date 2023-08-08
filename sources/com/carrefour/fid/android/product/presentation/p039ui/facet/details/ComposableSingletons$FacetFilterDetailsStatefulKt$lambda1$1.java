package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.product.C38102a;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Term;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.ComposableSingletons$FacetFilterDetailsStatefulKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$FacetFilterDetailsStatefulKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$FacetFilterDetailsStatefulKt$lambda1$1 f67797f = new ComposableSingletons$FacetFilterDetailsStatefulKt$lambda1$1();

    public ComposableSingletons$FacetFilterDetailsStatefulKt$lambda1$1() {
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
                ComposerKt.m29845w0(-1686347881, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.ComposableSingletons$FacetFilterDetailsStatefulKt.lambda-1.<anonymous> (FacetFilterDetailsStateful.kt:304)");
            }
            Facet facet = new Facet(CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E(), 1, false, false);
            FacetFilterDetailsStatefulKt.m117340b(facet, new Filter.CheckboxFilter(C38102a.m157521b("marque"), "Marque", false, CollectionsKt__CollectionsKt.m40448L(new Term(C38112f.m157658b("0% matière grasse*"), false, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Casher*"), false, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Produit frais"), true, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Pur jus"), false, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Sans gluten"), false, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Sans sucre ajoutés*"), true, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Sans sucres*"), true, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Végétarien"), false, (DefaultConstructorMarker) null), new Term(C38112f.m157658b("Carnivore"), true, (DefaultConstructorMarker) null)), true, (DefaultConstructorMarker) null), false, false, C279561.f67798f, oVar, 28104);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
