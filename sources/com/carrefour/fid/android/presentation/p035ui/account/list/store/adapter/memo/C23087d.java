package com.carrefour.fid.android.presentation.p035ui.account.list.store.adapter.memo;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.core.type.C36368a;
import com.carrefour.fid.android.databinding.C36890z3;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.store.adapter.memo.d */
public final class C23087d extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f58757b = 8;
    @C12579k

    /* renamed from: a */
    public final C36890z3 f58758a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23087d(@C12579k C36890z3 z3Var) {
        super(z3Var.getRoot());
        Intrinsics.checkNotNullParameter(z3Var, "binding");
        this.f58758a = z3Var;
    }

    /* renamed from: c */
    public final void mo67811c(@C12579k C38495l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "memo");
        this.f58758a.f92021c.setText(lVar.mo122102Z());
        if (Intrinsics.areEqual((Object) lVar.mo122101X(), (Object) C36368a.C36369a.f89966c)) {
            this.f58758a.f92020b.setActivated(false);
            this.itemView.setActivated(false);
            TextView textView = this.f58758a.f92021c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.textAccountListStoreMemo");
            TextViewKt.m118965p(textView);
            return;
        }
        this.f58758a.f92020b.setActivated(true);
        this.itemView.setActivated(true);
        TextView textView2 = this.f58758a.f92021c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.textAccountListStoreMemo");
        TextViewKt.m118959j(textView2);
    }

    @C12579k
    /* renamed from: d */
    public final C36890z3 mo67812d() {
        return this.f58758a;
    }
}
