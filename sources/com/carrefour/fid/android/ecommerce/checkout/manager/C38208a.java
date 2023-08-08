package com.carrefour.fid.android.ecommerce.checkout.manager;

import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.ecommerce.checkout.manager.a */
public final class C38208a {

    /* renamed from: b */
    public static final int f96776b = 8;
    @C12579k

    /* renamed from: a */
    public final List<String> f96777a = new ArrayList();

    /* renamed from: a */
    public final void mo119633a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.f96777a.add(str);
    }

    /* renamed from: b */
    public final boolean mo119634b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        return this.f96777a.contains(str);
    }
}
