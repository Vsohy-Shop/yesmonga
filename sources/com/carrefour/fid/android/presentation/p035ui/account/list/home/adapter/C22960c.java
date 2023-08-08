package com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.core.type.AccountListCategory;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36872x3;
import com.carrefour.fid.android.databinding.C36881y3;
import com.carrefour.fid.android.presentation.models.C38453a;
import com.carrefour.fid.android.presentation.models.extension.C38462a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.c */
public final class C22960c extends RecyclerView.Adapter<AccountListHomeViewHolder> {

    /* renamed from: c */
    public static final int f58592c = 8;
    @C12579k

    /* renamed from: a */
    public final C22961a f58593a;
    @C12579k

    /* renamed from: b */
    public final List<C38453a> f58594b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.adapter.c$a */
    public interface C22961a {
        /* renamed from: a */
        void mo67515a(@C12579k AccountListType accountListType);
    }

    public C22960c(@C12579k C22961a aVar, @C12579k List<C38453a> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f58593a = aVar;
        this.f58594b = list;
        setHasStableIds(true);
    }

    /* renamed from: m */
    public static final void m103364m(C22960c cVar, int i, View view) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        C22961a aVar = cVar.f58593a;
        AccountListType f = cVar.f58594b.get(i).mo121994f();
        Intrinsics.checkNotNull(f, "null cannot be cast to non-null type com.carrefour.fid.android.core.type.AccountListType");
        aVar.mo67515a(f);
    }

    public int getItemCount() {
        return this.f58594b.size();
    }

    public long getItemId(int i) {
        return (long) this.f58594b.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        return C38462a.m159615b(this.f58594b.get(i)) ? 1 : 2;
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k AccountListHomeViewHolder accountListHomeViewHolder, int i) {
        Intrinsics.checkNotNullParameter(accountListHomeViewHolder, "holder");
        if (accountListHomeViewHolder instanceof C22957a) {
            AccountListCategory e = this.f58594b.get(i).mo121992e();
            Intrinsics.checkNotNull(e, "null cannot be cast to non-null type com.carrefour.fid.android.core.type.AccountListCategory");
            ((C22957a) accountListHomeViewHolder).mo67523d(e);
        } else if (accountListHomeViewHolder instanceof C22962d) {
            AccountListType f = this.f58594b.get(i).mo121994f();
            Intrinsics.checkNotNull(f, "null cannot be cast to non-null type com.carrefour.fid.android.core.type.AccountListType");
            ((C22962d) accountListHomeViewHolder).mo67528d(f);
            accountListHomeViewHolder.itemView.setOnClickListener(new C22959b(this, i));
        } else {
            throw new Throwable("Wrong holder (" + accountListHomeViewHolder + ")");
        }
    }

    @C12579k
    /* renamed from: n */
    public AccountListHomeViewHolder onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 1) {
            C36872x3 d = C36872x3.m151205d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
            return new C22957a(d);
        } else if (i == 2) {
            C36881y3 d2 = C36881y3.m151241d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …rent, false\n            )");
            return new C22962d(d2);
        } else {
            throw new Throwable("Unavailable viewType (" + i + ")");
        }
    }
}
