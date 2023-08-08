package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.j */
public final class C25242j implements C25237e {

    /* renamed from: d */
    public static final int f62254d = 0;

    /* renamed from: a */
    public final int f62255a;
    @C12579k

    /* renamed from: b */
    public final String f62256b;

    /* renamed from: c */
    public final double f62257c;

    public C25242j(int i, @C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, "price");
        this.f62255a = i;
        this.f62256b = str;
        this.f62257c = d;
    }

    /* renamed from: a */
    public final double mo73580a() {
        return this.f62257c;
    }

    @C12579k
    /* renamed from: b */
    public final String mo73581b() {
        return this.f62256b;
    }

    /* renamed from: d */
    public final int mo73582d() {
        return this.f62255a;
    }
}
