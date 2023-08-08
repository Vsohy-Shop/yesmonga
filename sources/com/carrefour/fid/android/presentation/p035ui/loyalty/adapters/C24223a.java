package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import androidx.viewpager.widget.C20784a;
import com.carrefour.fid.android.databinding.C36718i;
import com.carrefour.fid.android.loyalty.presentation.models.CardTypeModel;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.a */
public final class C24223a extends C20784a {

    /* renamed from: f */
    public static final int f60588f = 8;
    @C12579k

    /* renamed from: e */
    public final List<CardTypeModel> f60589e;

    public C24223a() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public int mo21373e() {
        return this.f60589e.size();
    }

    @C12579k
    /* renamed from: j */
    public Object mo21374j(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        CardTypeModel cardTypeModel = this.f60589e.get(i);
        C36718i d = C36718i.m150601d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f…ntext), container, false)");
        d.f90990b.setImageDrawable(C17318d.m79726i(d.getRoot().getContext(), cardTypeModel.getCardPictureId()));
        d.f90991c.setText(d.getRoot().getContext().getString(cardTypeModel.getTitle()));
        viewGroup.addView(d.getRoot());
        ConstraintLayout b = d.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    /* renamed from: k */
    public boolean mo21375k(@C12579k View view, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(obj, "object");
        return Intrinsics.areEqual((Object) view, obj);
    }

    /* renamed from: v */
    public final void mo70893v(@C12579k List<CardTypeModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (this.f60589e.isEmpty()) {
            Collection collection = list;
            if (!collection.isEmpty()) {
                this.f60589e.addAll(collection);
                mo62413l();
            }
        }
    }

    public C24223a(@C12579k List<CardTypeModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f60589e = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24223a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
