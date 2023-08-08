package com.urbanairship.config;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.config.a */
public class C9061a {

    /* renamed from: a */
    public final C9066c f24409a;

    /* renamed from: b */
    public final AirshipConfigOptions f24410b;

    /* renamed from: c */
    public final C9067d f24411c;

    public C9061a(@C0359n0 C9067d dVar, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C9066c cVar) {
        this.f24411c = dVar;
        this.f24410b = airshipConfigOptions;
        this.f24409a = cVar;
    }

    @C0359n0
    /* renamed from: a */
    public AirshipConfigOptions mo17958a() {
        return this.f24410b;
    }

    /* renamed from: b */
    public int mo17959b() {
        return this.f24411c.getPlatform();
    }

    @C0359n0
    /* renamed from: c */
    public C9062b mo17960c() {
        return this.f24409a.mo17980a();
    }
}
