package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36733j4;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.g */
public final class C25467g extends C25469h {
    @C12579k

    /* renamed from: c */
    public static final C25468a f62692c = new C25468a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f62693d = 8;

    /* renamed from: e */
    public static final int f62694e = 2;
    @C12579k

    /* renamed from: b */
    public final C36733j4 f62695b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.g$a */
    public static final class C25468a {
        public /* synthetic */ C25468a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25468a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25467g(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36733j4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.LinearLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f62695b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25467g.<init>(com.carrefour.fid.android.databinding.j4):void");
    }

    /* renamed from: c */
    public final void mo74238c(@C12579k OfferDepartmentModel offerDepartmentModel) {
        Intrinsics.checkNotNullParameter(offerDepartmentModel, C28547h2.f69318f);
        TextView textView = this.f62695b.f91069c;
        String Q = offerDepartmentModel.mo121689Q();
        if (Q == null) {
            Q = textView.getResources().getQuantityString(R.plurals.unavailable_product_category, offerDepartmentModel.mo121688M());
        }
        textView.setText(Q);
        this.f62695b.f91068b.setText(String.valueOf(offerDepartmentModel.mo121688M()));
    }

    @C12579k
    /* renamed from: d */
    public final C36733j4 mo74239d() {
        return this.f62695b;
    }
}
