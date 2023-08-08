package com.carrefour.fid.android.presentation.p035ui.environment.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36643a4;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.environment.adapter.a */
public final class C23987a extends RecyclerView.Adapter<C23988b> {

    /* renamed from: c */
    public static final int f60192c = 8;
    @C12580l

    /* renamed from: a */
    public final Integer f60193a;
    @C12579k

    /* renamed from: b */
    public final List<C28912a> f60194b = C28912a.f70830d.mo84192b();

    public C23987a(@C12580l Integer num) {
        this.f60193a = num;
    }

    public int getItemCount() {
        return this.f60194b.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C23988b bVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(bVar, "holder");
        int b = this.f60194b.get(i).mo84189b();
        Integer num = this.f60193a;
        if (num != null && num.intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo70174c(b, z);
    }

    @C12579k
    /* renamed from: l */
    public C23988b onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36643a4 d = C36643a4.m150303d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C23988b(d);
    }
}
