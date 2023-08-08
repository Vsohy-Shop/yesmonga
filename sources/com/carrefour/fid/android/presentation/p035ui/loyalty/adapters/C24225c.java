package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36735j6;
import com.carrefour.fid.android.loyalty.presentation.models.BenefitsModel;
import com.carrefour.fid.android.loyalty.presentation.models.OperationHistoryModel;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.utils.C22698a;
import com.google.android.material.badge.C31132a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.c */
public final class C24225c extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: b */
    public static final int f60592b = 8;
    @C12579k

    /* renamed from: a */
    public final List<OperationHistoryModel> f60593a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.c$a */
    public final class C24226a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36735j6 f60594a;

        /* renamed from: b */
        public final /* synthetic */ C24225c f60595b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24226a(@C12579k C24225c cVar, C36735j6 j6Var) {
            super(j6Var.getRoot());
            Intrinsics.checkNotNullParameter(j6Var, "binding");
            this.f60595b = cVar;
            this.f60594a = j6Var;
        }

        /* renamed from: c */
        public final void mo70894c(@C12579k OperationHistoryModel operationHistoryModel) {
            boolean z;
            String str;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(operationHistoryModel, "cardOperation");
            TextView textView = this.f60594a.f91076b;
            C28932h.C28933a aVar = C28932h.f70914a;
            textView.setText(aVar.mo84239i(aVar.mo84230U(operationHistoryModel.getLoyaltyTransactionDate())));
            this.f60594a.f91077c.setText(operationHistoryModel.getLocality());
            BenefitsModel benefits = operationHistoryModel.getBenefits();
            if (benefits != null) {
                TextView textView2 = this.f60594a.f91078d;
                boolean z4 = false;
                if (benefits.getAcquiredBenefits().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (benefits.getUsedBenefits().length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        C22698a aVar2 = C22698a.f58147a;
                        str = StringsKt__IndentKt.trimMargin$default(C31132a.f74628J0 + C28782t.m119105b(Double.valueOf(aVar2.mo67072a(benefits.getAcquiredBenefits()))) + "\n                        | " + C28782t.m119105b(Double.valueOf(aVar2.mo67072a(benefits.getUsedBenefits()))) + "\n                        ", (String) null, 1, (Object) null);
                        textView2.setText(str);
                    }
                }
                if (benefits.getAcquiredBenefits().length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = " " + C28782t.m119105b(Double.valueOf(Double.parseDouble(benefits.getUsedBenefits())));
                } else {
                    if (benefits.getUsedBenefits().length() == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        str = C31132a.f74628J0 + C28782t.m119105b(Double.valueOf(Double.parseDouble(benefits.getAcquiredBenefits())));
                    } else {
                        str = "";
                    }
                }
                textView2.setText(str);
            }
        }

        @C12579k
        /* renamed from: d */
        public final C36735j6 mo70895d() {
            return this.f60594a;
        }
    }

    public C24225c(@C12579k List<OperationHistoryModel> list) {
        Intrinsics.checkNotNullParameter(list, "cardOperation");
        this.f60593a = list;
    }

    public int getItemCount() {
        return this.f60593a.size();
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        ((C24226a) e0Var).mo70894c(this.f60593a.get(i));
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36735j6 d = C36735j6.m150669d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C24226a(this, d);
    }
}
