package com.carrefour.fid.android.account.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.network.C28799a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.headers.a */
public final class C13196a implements C28799a {
    @C12579k

    /* renamed from: a */
    public final C28640a f32360a;

    @Inject
    public C13196a(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f32360a = aVar;
    }

    /* renamed from: e */
    public static /* synthetic */ C28640a m57179e(C13196a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return aVar.mo31316d(z, z2);
    }

    @C12579k
    /* renamed from: a */
    public HashMap<String, String> mo31313a(boolean z) {
        return m57179e(this, z, false, 2, (Object) null).mo83538C();
    }

    @C12579k
    /* renamed from: c */
    public HashMap<String, String> mo31314b(boolean z, boolean z2) {
        return mo31316d(z, z2).mo83548l().mo83560x().mo83538C();
    }

    /* renamed from: d */
    public final C28640a mo31316d(boolean z, boolean z2) {
        if (z) {
            this.f32360a.mo83556t();
        }
        if (z2) {
            this.f32360a.mo83545h();
        }
        this.f32360a.mo83555s();
        return this.f32360a;
    }
}
