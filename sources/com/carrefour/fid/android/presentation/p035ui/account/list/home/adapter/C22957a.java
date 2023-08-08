package com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.AccountListCategory;
import com.carrefour.fid.android.databinding.C36872x3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.a */
public final class C22957a extends AccountListHomeViewHolder {
    @C12579k

    /* renamed from: d */
    public static final C22958a f58586d = new C22958a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f58587e = 8;

    /* renamed from: f */
    public static final int f58588f = 1;
    @C12579k

    /* renamed from: c */
    public final C36872x3 f58589c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.a$a */
    public static final class C22958a {
        public /* synthetic */ C22958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C22958a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22957a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36872x3 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.widget.TextView r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f58589c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter.C22957a.<init>(com.carrefour.fid.android.databinding.x3):void");
    }

    /* renamed from: d */
    public final void mo67523d(@C12579k AccountListCategory accountListCategory) {
        Intrinsics.checkNotNullParameter(accountListCategory, "category");
        TextView b = this.f58589c.getRoot();
        b.setText(b.getContext().getString(accountListCategory.mo108405q()));
    }

    @C12579k
    /* renamed from: e */
    public final C36872x3 mo67524e() {
        return this.f58589c;
    }
}
