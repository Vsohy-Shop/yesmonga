package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import android.view.View;
import com.carrefour.fid.android.catalogs.databinding.C39428s;
import com.carrefour.fid.android.catalogs.presentation.models.C39454g;
import com.google.android.datatransport.cct.C40045d;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.f */
public final class C39478f extends C39475c {
    @C12579k

    /* renamed from: a */
    public final C39428s f100983a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39478f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39428s r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f100983a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.C39478f.<init>(com.carrefour.fid.android.catalogs.databinding.s):void");
    }

    /* renamed from: e */
    public static final void m161724e(C39454g gVar, View view) {
        Intrinsics.checkNotNullParameter(gVar, "$model");
        C11289a<C11079d2> a = gVar.mo130552a();
        if (a != null) {
            a.invoke();
        }
    }

    /* renamed from: d */
    public final void mo130602d(@C12579k C39454g gVar) {
        Intrinsics.checkNotNullParameter(gVar, C40045d.f102104u);
        this.f100983a.f100899b.setOnClickListener(new C39477e(gVar));
    }

    @C12579k
    /* renamed from: f */
    public final C39428s mo130603f() {
        return this.f100983a;
    }
}
