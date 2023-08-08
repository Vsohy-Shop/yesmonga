package com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36881y3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.d */
public final class C22962d extends AccountListHomeViewHolder {
    @C12579k

    /* renamed from: d */
    public static final C22963a f58595d = new C22963a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f58596e = 8;

    /* renamed from: f */
    public static final int f58597f = 2;
    @C12579k

    /* renamed from: c */
    public final C36881y3 f58598c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.d$a */
    public static final class C22963a {
        public /* synthetic */ C22963a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C22963a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22962d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36881y3 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.TextView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f58598c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter.C22962d.<init>(com.carrefour.fid.android.databinding.y3):void");
    }

    /* renamed from: d */
    public final void mo67528d(@C12579k AccountListType accountListType) {
        Intrinsics.checkNotNullParameter(accountListType, "item");
        TextView b = this.f58598c.getRoot();
        b.setText(b.getContext().getString(accountListType.mo108407b()));
        b.setCompoundDrawablesRelativeWithIntrinsicBounds(accountListType.mo108406a(), 0, R.drawable.ic_right_arrow_twilight, 0);
    }

    @C12579k
    /* renamed from: e */
    public final C36881y3 mo67529e() {
        return this.f58598c;
    }
}
