package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.databinding.C39413d;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.C39524e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.adapter.d */
public final class C39517d extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: a */
    public final C39413d f101037a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39517d(@C12579k C39413d dVar) {
        super(dVar.getRoot());
        Intrinsics.checkNotNullParameter(dVar, "binding");
        this.f101037a = dVar;
    }

    /* renamed from: e */
    public static /* synthetic */ void m161807e(C39517d dVar, C39524e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = null;
        }
        dVar.mo130684d(eVar);
    }

    /* renamed from: h */
    public static /* synthetic */ void m161808h(C39517d dVar, C39524e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = null;
        }
        dVar.mo130686g(eVar);
    }

    /* renamed from: i */
    public static final void m161809i(C39524e eVar, View view) {
        if (eVar != null) {
            eVar.mo130697a();
        }
    }

    /* renamed from: d */
    public final void mo130684d(@C12580l C39524e eVar) {
        mo130686g(eVar);
    }

    @C12579k
    /* renamed from: f */
    public final C39413d mo130685f() {
        return this.f101037a;
    }

    /* renamed from: g */
    public final void mo130686g(C39524e eVar) {
        this.f101037a.f100813e.setOnClickListener(new C39516c(eVar));
    }
}
