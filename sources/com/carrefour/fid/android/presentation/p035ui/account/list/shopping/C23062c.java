package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36733j4;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37375a;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25467g;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListShoppingViewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListShoppingViewBinder.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/AccountListShoppingViewBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.c */
public final class C23062c implements C37390r {

    /* renamed from: d */
    public static final int f58699d = 8;
    @C12579k

    /* renamed from: a */
    public final RecyclerView f58700a;

    /* renamed from: b */
    public final int f58701b;

    /* renamed from: c */
    public final int f58702c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.c$a */
    public static final class C23063a extends C20157j.C20163f<C37369a> {
        /* renamed from: d */
        public boolean mo60477a(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if (!(aVar instanceof OfferDepartmentModel) || !(aVar2 instanceof OfferDepartmentModel)) {
                return false;
            }
            OfferDepartmentModel offerDepartmentModel = (OfferDepartmentModel) aVar;
            OfferDepartmentModel offerDepartmentModel2 = (OfferDepartmentModel) aVar2;
            if (!Intrinsics.areEqual((Object) offerDepartmentModel.mo121689Q(), (Object) offerDepartmentModel2.mo121689Q()) || offerDepartmentModel.mo121688M() != offerDepartmentModel2.mo121688M()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo60478b(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if (!(aVar instanceof OfferDepartmentModel) || !(aVar2 instanceof OfferDepartmentModel)) {
                return false;
            }
            return Intrinsics.areEqual((Object) ((OfferDepartmentModel) aVar).mo121690W(), (Object) ((OfferDepartmentModel) aVar2).mo121690W());
        }
    }

    public C23062c(@C12579k RecyclerView recyclerView, @C12579k Resources resources, @C12579k Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        this.f58700a = recyclerView;
        this.f58701b = resources.getDimensionPixelSize(R.dimen.ds_border_width_1);
        this.f58702c = resources.getColor(R.color.ds_grey_60, theme);
    }

    @C12580l
    /* renamed from: a */
    public C37375a mo67717a(int i) {
        if (i == 2) {
            return new C37375a.C37376a().mo113959d(this.f58701b).mo113957b(this.f58702c).mo113956a();
        }
        return null;
    }

    /* renamed from: b */
    public int mo67718b(@C12579k C37369a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        if (aVar instanceof OfferDepartmentModel) {
            return 2;
        }
        return -1;
    }

    @C12580l
    /* renamed from: c */
    public RecyclerView.C20061e0 mo67719c(int i, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (i != 2) {
            return null;
        }
        C36733j4 d = C36733j4.m150661d(LayoutInflater.from(this.f58700a.getContext()), this.f58700a, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …lse\n                    )");
        return new C25467g(d);
    }

    @C12579k
    /* renamed from: d */
    public C20157j.C20163f<C37369a> mo67720d() {
        return new C23063a();
    }

    /* renamed from: e */
    public boolean mo67721e(@C12579k C37369a aVar, @C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(e0Var, "viewHolder");
        if (!(aVar instanceof OfferDepartmentModel)) {
            return false;
        }
        ((C25467g) e0Var).mo74238c((OfferDepartmentModel) aVar);
        C11079d2 d2Var = C11079d2.f28267a;
        return true;
    }
}
