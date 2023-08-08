package com.carrefour.fid.android.legalnotice.p059ui.fragments.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36673d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.adapter.a */
public final class C38236a extends RecyclerView.Adapter<C38237a> {

    /* renamed from: b */
    public static final int f96902b = 8;
    @C12579k

    /* renamed from: a */
    public List<String> f96903a;

    /* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.adapter.a$a */
    public final class C38237a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36673d4 f96904a;

        /* renamed from: b */
        public final /* synthetic */ C38236a f96905b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38237a(@C12579k C38236a aVar, C36673d4 d4Var) {
            super(d4Var.getRoot());
            Intrinsics.checkNotNullParameter(d4Var, "binding");
            this.f96905b = aVar;
            this.f96904a = d4Var;
        }

        /* renamed from: c */
        public final void mo119704c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            this.f96904a.getRoot().setText(str);
        }

        @C12579k
        /* renamed from: d */
        public final C36673d4 mo119705d() {
            return this.f96904a;
        }
    }

    public C38236a() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public int getItemCount() {
        return this.f96903a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C38237a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo119704c(this.f96903a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C38237a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36673d4 d = C36673d4.m150423d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C38237a(this, d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38236a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    public C38236a(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f96903a = list;
    }
}
