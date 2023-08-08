package com.usabilla.sdk.ubform.p008di;

import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.di.e */
public final class C9822e {
    @C12579k

    /* renamed from: a */
    public final Map<Class<?>, C9824g<?>> f26876a = new HashMap();

    /* renamed from: a */
    public final /* synthetic */ <T> void mo20152a(C11300l<? super C9818a, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Map<Class<?>, C9824g<?>> b = mo20153b();
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        b.put(Object.class, new C9824g(lVar));
    }

    @C12579k
    /* renamed from: b */
    public final Map<Class<?>, C9824g<?>> mo20153b() {
        return this.f26876a;
    }
}
