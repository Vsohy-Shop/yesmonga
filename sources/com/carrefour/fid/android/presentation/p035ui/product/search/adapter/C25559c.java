package com.carrefour.fid.android.presentation.p035ui.product.search.adapter;

import android.text.Html;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36814r5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.adapter.c */
public final class C25559c extends C25561e {

    /* renamed from: e */
    public static final int f62819e = 8;
    @C12579k

    /* renamed from: d */
    public final C36814r5 f62820d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25559c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36814r5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.TextView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f62820d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.search.adapter.C25559c.<init>(com.carrefour.fid.android.databinding.r5):void");
    }

    /* renamed from: c */
    public void mo74398c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        TextView b = this.f62820d.getRoot();
        b.setText(str);
        Intrinsics.checkNotNullExpressionValue(b, "bind$lambda$0");
        String string = b.getContext().getString(R.string.accessibility_product_search_list, new Object[]{str});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…oduct_search_list, value)");
        ViewKt.m152121c(b, string, false, 2, (Object) null);
    }

    /* renamed from: d */
    public void mo74399d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f62820d.getRoot().setText(Html.fromHtml(C11622t.replace$default(C11622t.replace$default(str, "<em>", "<b><em>", false, 4, (Object) null), "</em>", "</em></b>", false, 4, (Object) null), 63));
    }

    @C12579k
    /* renamed from: e */
    public final C36814r5 mo74400e() {
        return this.f62820d;
    }
}
