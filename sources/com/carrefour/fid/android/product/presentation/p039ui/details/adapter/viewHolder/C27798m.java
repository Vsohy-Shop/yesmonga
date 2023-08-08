package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27512y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.m */
public final class C27798m extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f67382b = 8;
    @C12579k

    /* renamed from: a */
    public final C27512y f67383a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27798m(@C12579k C27512y yVar) {
        super(yVar.getRoot());
        Intrinsics.checkNotNullParameter(yVar, "binding");
        this.f67383a = yVar;
    }

    /* renamed from: c */
    public final void mo80746c(@C12579k String str, @C12579k String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(str, "nutritionalLabel");
        Intrinsics.checkNotNullParameter(str2, "nutritionalValue");
        this.f67383a.f66781d.setText(str);
        C27512y yVar = this.f67383a;
        TextView textView = yVar.f66782e;
        if (C11622t.equals(str, yVar.getRoot().getContext().getString(C27609f.C27627r.pdp_label_energ), true) || C11622t.equals(str, this.f67383a.getRoot().getContext().getString(C27609f.C27627r.variety), true) || C11622t.equals(str, this.f67383a.getRoot().getContext().getString(C27609f.C27627r.category), true)) {
            str3 = new String();
        } else {
            str3 = this.f67383a.getRoot().getContext().getString(C27609f.C27627r.pdp_label_nutri_unit);
            Intrinsics.checkNotNullExpressionValue(str3, "{\n                bindin…nutri_unit)\n            }");
        }
        textView.setText(str2 + str3);
    }

    @C12579k
    /* renamed from: d */
    public final C27512y mo80747d() {
        return this.f67383a;
    }
}
