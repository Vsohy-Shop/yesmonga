package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36734j5;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.loyalty.core.type.CardTypeKt;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.OrderLoyaltyCardsBottomSheetDialogFragment;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.b */
public final class C24739b extends RecyclerView.Adapter<C24740a> {

    /* renamed from: c */
    public static final int f61394c = 8;
    @C12579k

    /* renamed from: a */
    public final List<String> f61395a;
    @C12579k

    /* renamed from: b */
    public final C11300l<String, C11079d2> f61396b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.b$a */
    public final class C24740a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36734j5 f61397a;

        /* renamed from: b */
        public final /* synthetic */ C24739b f61398b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24740a(@C12579k C24739b bVar, C36734j5 j5Var) {
            super(j5Var.getRoot());
            Intrinsics.checkNotNullParameter(j5Var, "binding");
            this.f61398b = bVar;
            this.f61397a = j5Var;
        }

        /* renamed from: e */
        public static final void m107915e(C24739b bVar, String str, View view) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            Intrinsics.checkNotNullParameter(str, "$loyaltyCardNumber");
            bVar.f61396b.invoke(str);
        }

        /* renamed from: d */
        public final void mo72264d(@C12579k String str) {
            boolean z;
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            if (CardTypeKt.getLoyaltyCardType(str) == CardType.PASS) {
                z = true;
            } else {
                z = false;
            }
            this.f61397a.f91073d.setText(str);
            ImageView imageView = this.f61397a.f91072c;
            if (z) {
                i = R.drawable.ds_gr_horizontal_black_pass_card;
            } else {
                i = R.drawable.ic_carte_fidelite;
            }
            imageView.setImageResource(i);
            TextView textView = this.f61397a.f91074e;
            if (z) {
                i2 = R.string.order_detail_command_pass_card_fidelity;
            } else {
                i2 = R.string.order_detail_command_card_fidelity;
            }
            textView.setText(i2);
            this.itemView.setOnClickListener(new C24738a(this.f61398b, str));
        }

        @C12579k
        /* renamed from: f */
        public final C36734j5 mo72265f() {
            return this.f61397a;
        }
    }

    public C24739b(@C12579k List<String> list, @C12579k C11300l<? super String, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, OrderLoyaltyCardsBottomSheetDialogFragment.f61346x);
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f61395a = list;
        this.f61396b = lVar;
    }

    public int getItemCount() {
        return this.f61395a.size();
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C24740a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo72264d(this.f61395a.get(i));
    }

    @C12579k
    /* renamed from: m */
    public C24740a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36734j5 d = C36734j5.m150665d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        return new C24740a(this, d);
    }
}
