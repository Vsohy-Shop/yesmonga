package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.databinding.C36853v4;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineDetailsFidelityCardViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsFidelityCardViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/adapter/OrdersOfflineDetailsFidelityCardViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.g */
public final class C24748g extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24749a f61411b = new C24749a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61412c = 8;

    /* renamed from: d */
    public static final int f61413d = 4;
    @C12579k

    /* renamed from: a */
    public final C36853v4 f61414a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.g$a */
    public static final class C24749a {
        public /* synthetic */ C24749a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24749a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24748g(@C12579k C36853v4 v4Var) {
        super(v4Var.getRoot());
        Intrinsics.checkNotNullParameter(v4Var, "binding");
        this.f61414a = v4Var;
    }

    /* renamed from: c */
    public final void mo72273c(@C12579k String str, double d) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        LoyaltyCardType a = LoyaltyCardType.f89888a.mo108568a(LoyaltyUtils.INSTANCE.getTypeCard(str));
        if (a != LoyaltyCardType.NOT_EXIST) {
            this.f61414a.f91801b.setImageResource(a.mo108566r());
            this.f61414a.f91803d.setText(str);
            TextView textView = this.f61414a.f91802c;
            Context context = this.itemView.getContext();
            if (a == LoyaltyCardType.PASS) {
                i = R.string.order_detail_command_pass_card_fidelity;
            } else {
                i = R.string.order_detail_command_card_fidelity;
            }
            textView.setText(context.getString(i));
        }
        Double valueOf = Double.valueOf(d);
        if (valueOf.doubleValue() > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            double doubleValue = valueOf.doubleValue();
            this.f61414a.f91804e.setVisibility(0);
            this.f61414a.f91805f.setText(C28782t.m119105b(Double.valueOf(doubleValue)));
        }
    }

    @C12579k
    /* renamed from: d */
    public final C36853v4 mo72274d() {
        return this.f61414a;
    }
}
