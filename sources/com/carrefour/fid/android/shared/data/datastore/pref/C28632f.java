package com.carrefour.fid.android.shared.data.datastore.pref;

import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.data.datastore.pref.f */
public final class C28632f {
    @C12579k

    /* renamed from: a */
    public static final C28632f f70212a = new C28632f();
    @C12579k

    /* renamed from: b */
    public static final C18602a.C18603a<Boolean> f70213b = C18606c.m84359a("PRIMES_FID_FIRST_LAUNCH");
    @C12579k

    /* renamed from: c */
    public static final C18602a.C18603a<String> f70214c = C18606c.m84364f(C28633g.f70221e);
    @C12579k

    /* renamed from: d */
    public static final C18602a.C18603a<Boolean> f70215d = C18606c.m84359a("HAS_PRIME_FID");

    /* renamed from: e */
    public static final int f70216e = 8;

    @C12579k
    /* renamed from: a */
    public final C18602a.C18603a<Boolean> mo83524a() {
        return f70215d;
    }

    @C12579k
    /* renamed from: b */
    public final C18602a.C18603a<String> mo83525b() {
        return f70214c;
    }

    @C12579k
    /* renamed from: c */
    public final C18602a.C18603a<Boolean> mo83526c() {
        return f70213b;
    }
}
