package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.content.res.ColorStateList;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36882y4;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24800f;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.l */
public final class C24756l extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24757a f61426b = new C24757a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61427c = 8;

    /* renamed from: d */
    public static final int f61428d = 1;
    @C12579k

    /* renamed from: a */
    public final C36882y4 f61429a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.l$a */
    public static final class C24757a {
        public /* synthetic */ C24757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24757a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24756l(@C12579k C36882y4 y4Var) {
        super(y4Var.getRoot());
        Intrinsics.checkNotNullParameter(y4Var, "binding");
        this.f61429a = y4Var;
    }

    /* renamed from: c */
    public final void mo72282c(@C12579k C24800f fVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(fVar, "item");
        this.f61429a.f91974d.setText(fVar.mo72445m());
        if (StringsKt__StringsKt.contains$default((CharSequence) fVar.mo72445m(), (CharSequence) C24758m.f61430a, false, 2, (Object) null)) {
            this.f61429a.f91972b.setText(C28782t.m119105b(Double.valueOf(fVar.mo72443k())));
            this.f61429a.f91975e.setVisibility(8);
            this.f61429a.f91973c.setVisibility(8);
            return;
        }
        this.f61429a.f91972b.setText(fVar.mo72442j());
        if (fVar.mo72448p().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f61429a.f91975e.setVisibility(0);
            this.f61429a.f91975e.setText(this.itemView.getContext().getString(R.string.order_detail_command_weight, new Object[]{fVar.mo72448p(), fVar.mo72444l()}));
        } else if (fVar.mo72446n() == 0 || C11622t.equals(fVar.mo72442j(), C28539g.f69263u, true)) {
            this.f61429a.f91975e.setVisibility(8);
        } else {
            this.f61429a.f91975e.setVisibility(0);
            this.f61429a.f91975e.setText(this.itemView.getContext().getString(R.string.order_details_quantity, new Object[]{Integer.valueOf(fVar.mo72446n()), fVar.mo72444l()}));
        }
        if (fVar.mo72443k() == 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (C11622t.equals(fVar.mo72442j(), C28539g.f69263u, true)) {
                this.f61429a.f91974d.setText(this.itemView.getContext().getString(R.string.order_details_quantity_product_name, new Object[]{Integer.valueOf(fVar.mo72446n()), fVar.mo72445m()}));
            }
            this.f61429a.f91973c.setVisibility(0);
            this.f61429a.f91973c.setText(this.itemView.getContext().getString(R.string.order_detail_command_immediate_discount, new Object[]{C28782t.m119105b(Double.valueOf(fVar.mo72443k()))}));
            this.f61429a.f91973c.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(this.itemView.getContext(), R.color.dark_cream)));
            return;
        }
        this.f61429a.f91973c.setVisibility(8);
    }

    @C12579k
    /* renamed from: d */
    public final C36882y4 mo72283d() {
        return this.f61429a;
    }
}
