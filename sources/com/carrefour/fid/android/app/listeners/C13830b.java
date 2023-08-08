package com.carrefour.fid.android.app.listeners;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.app.listeners.b */
public final class C13830b implements RecyclerView.C20082q {

    /* renamed from: d */
    public static final int f33743d = 8;
    @C12579k

    /* renamed from: a */
    public final RecyclerView f33744a;
    @C12580l

    /* renamed from: b */
    public final C13831a f33745b;
    @C12580l

    /* renamed from: c */
    public final C13832b f33746c;

    /* renamed from: com.carrefour.fid.android.app.listeners.b$a */
    public interface C13831a {
        /* renamed from: a */
        void mo32762a(int i, @C12579k View view);
    }

    /* renamed from: com.carrefour.fid.android.app.listeners.b$b */
    public interface C13832b {
        /* renamed from: a */
        void mo32763a(int i, @C12579k View view);
    }

    public C13830b(@C12579k RecyclerView recyclerView, @C12580l C13831a aVar, @C12580l C13832b bVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "mRecycler");
        this.f33744a = recyclerView;
        this.f33745b = aVar;
        this.f33746c = bVar;
    }

    /* renamed from: c */
    public static final void m58801c(C13830b bVar, View view) {
        Intrinsics.checkNotNullParameter(bVar, "this$0");
        bVar.mo32761e(view);
    }

    /* renamed from: b */
    public void mo32759b(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setOnClickListener((View.OnClickListener) null);
        view.setOnLongClickListener((View.OnLongClickListener) null);
    }

    /* renamed from: d */
    public void mo32760d(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setOnClickListener(new C13829a(this));
    }

    /* renamed from: e */
    public final void mo32761e(View view) {
        int r0;
        if (view != null && (r0 = this.f33744a.mo59614r0(view)) >= 0) {
            C13831a aVar = this.f33745b;
            if (aVar != null) {
                aVar.mo32762a(r0, view);
            }
            C13832b bVar = this.f33746c;
            if (bVar != null) {
                bVar.mo32763a(r0, view);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13830b(RecyclerView recyclerView, C13831a aVar, C13832b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bVar);
    }
}
