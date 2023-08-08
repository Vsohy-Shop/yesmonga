package com.carrefour.fid.android.ecosystem.p058ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36828t;
import com.carrefour.fid.android.ecosystem.C38220a;
import com.carrefour.fid.android.shared.util.C28951s;
import com.urbanairship.job.C9314l;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.ecosystem.ui.a */
public final class C38223a extends RecyclerView.Adapter<C38224a> {

    /* renamed from: b */
    public static final int f96854b = 8;
    @C12579k

    /* renamed from: a */
    public List<C38220a> f96855a;

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nEcosystemRecyclerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcosystemRecyclerAdapter.kt\ncom/carrefour/fid/android/ecosystem/ui/EcosystemRecyclerAdapter$EcosystemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,55:1\n262#2,2:56\n*S KotlinDebug\n*F\n+ 1 EcosystemRecyclerAdapter.kt\ncom/carrefour/fid/android/ecosystem/ui/EcosystemRecyclerAdapter$EcosystemViewHolder\n*L\n44#1:56,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.ecosystem.ui.a$a */
    public static final class C38224a extends RecyclerView.C20061e0 {

        /* renamed from: b */
        public static final int f96856b = 8;
        @C12579k

        /* renamed from: a */
        public final C36828t f96857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38224a(@C12579k C36828t tVar) {
            super(tVar.getRoot());
            Intrinsics.checkNotNullParameter(tVar, "binding");
            this.f96857a = tVar;
        }

        /* renamed from: c */
        public final void mo119652c(@C12579k C38220a aVar) {
            int i;
            Intrinsics.checkNotNullParameter(aVar, C9314l.f25417c);
            this.f96857a.f91655c.setText(aVar.mo119641a());
            C36828t tVar = this.f96857a;
            tVar.f91654b.setImageDrawable(C0507a.m2346b(tVar.getRoot().getContext(), aVar.mo119643c()));
            TextView textView = this.f96857a.f91656d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.isInstalledText");
            C28951s sVar = C28951s.f70964a;
            Context context = this.f96857a.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
            if (sVar.mo84283i(context, aVar.mo119642b())) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public C38223a(@C12579k List<C38220a> list) {
        Intrinsics.checkNotNullParameter(list, "ecosystemApps");
        this.f96855a = list;
    }

    public int getItemCount() {
        return this.f96855a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C38224a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo119652c(this.f96855a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C38224a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36828t d = C36828t.m151035d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        return new C38224a(d);
    }

    /* renamed from: m */
    public final void mo119651m(@C12579k List<C38220a> list) {
        Intrinsics.checkNotNullParameter(list, "ecosystemApps");
        this.f96855a = list;
        notifyDataSetChanged();
    }
}
