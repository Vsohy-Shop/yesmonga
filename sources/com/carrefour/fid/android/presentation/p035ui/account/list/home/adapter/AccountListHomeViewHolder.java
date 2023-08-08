package com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.AccountListHomeViewHolder */
public abstract class AccountListHomeViewHolder extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f58584b = 8;
    @C12579k

    /* renamed from: a */
    public final C11677z f58585a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListHomeViewHolder(@C12579k View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.f58585a = C10864b0.m38748c(new AccountListHomeViewHolder$label$2(view));
    }

    @C12579k
    /* renamed from: c */
    public final TextView mo67521c() {
        return (TextView) this.f58585a.getValue();
    }
}
