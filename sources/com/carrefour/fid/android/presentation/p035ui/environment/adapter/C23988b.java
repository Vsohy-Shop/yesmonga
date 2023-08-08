package com.carrefour.fid.android.presentation.p035ui.environment.adapter;

import android.widget.Button;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36643a4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.environment.adapter.b */
public final class C23988b extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f60195b = 8;
    @C12579k

    /* renamed from: a */
    public final C36643a4 f60196a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23988b(@C12579k C36643a4 a4Var) {
        super(a4Var.getRoot());
        Intrinsics.checkNotNullParameter(a4Var, "binding");
        this.f60196a = a4Var;
    }

    /* renamed from: c */
    public final void mo70174c(@C0324b1 int i, boolean z) {
        Button b = this.f60196a.getRoot();
        b.setText(b.getContext().getString(i));
        b.setEnabled(!z);
        b.setActivated(z);
    }

    @C12579k
    /* renamed from: d */
    public final C36643a4 mo70175d() {
        return this.f60196a;
    }
}
