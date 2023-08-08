package com.carrefour.fid.android.storelocator.utils;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.utils.a */
public final class C28992a {
    @C12579k

    /* renamed from: a */
    public static final C28992a f71082a = new C28992a();

    /* renamed from: b */
    public static final int f71083b = 0;

    @C12579k
    /* renamed from: a */
    public final Intent mo84427a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "address");
        return new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + str));
    }
}
