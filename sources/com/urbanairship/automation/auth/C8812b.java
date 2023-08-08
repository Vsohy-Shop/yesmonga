package com.urbanairship.automation.auth;

import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.channel.C9008d;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9669o0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.auth.b */
public class C8812b {

    /* renamed from: a */
    public final Object f23586a;

    /* renamed from: b */
    public final C8810a f23587b;

    /* renamed from: c */
    public final C9008d f23588c;

    /* renamed from: d */
    public final C9656j f23589d;

    /* renamed from: e */
    public C8813c f23590e;

    public C8812b(@C0359n0 C9061a aVar, @C0359n0 C9008d dVar) {
        this(new C8810a(aVar), dVar, C9656j.f26468a);
    }

    /* renamed from: a */
    public final void mo17324a(C8813c cVar) {
        synchronized (this.f23586a) {
            this.f23590e = cVar;
        }
    }

    @C0363p0
    /* renamed from: b */
    public final String mo17325b(@C0359n0 String str) {
        synchronized (this.f23586a) {
            if (this.f23590e == null) {
                return null;
            }
            if (this.f23589d.mo19623a() >= this.f23590e.mo17329b()) {
                return null;
            }
            if (!C9669o0.m36223d(str, this.f23590e.mo17328a())) {
                return null;
            }
            String c = this.f23590e.mo17330c();
            return c;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: c */
    public String mo17326c() throws AuthException {
        String Z = this.f23588c.mo17793Z();
        if (Z != null) {
            String b = mo17325b(Z);
            if (b != null) {
                return b;
            }
            try {
                C9116c<C8813c> c = this.f23587b.mo17321c(Z);
                if (c.mo18144f() == null || !c.mo18150l()) {
                    throw new AuthException("Failed to generate token. Response: " + c);
                }
                mo17324a(c.mo18144f());
                return c.mo18144f().mo17330c();
            } catch (RequestException e) {
                throw new AuthException("Failed to generate token.", e);
            }
        } else {
            throw new AuthException("Unable to create token, channel not created");
        }
    }

    /* renamed from: d */
    public void mo17327d(@C0359n0 String str) {
        synchronized (this.f23586a) {
            if (str.equals(this.f23590e.mo17330c())) {
                this.f23590e = null;
            }
        }
    }

    @C0344h1
    public C8812b(@C0359n0 C8810a aVar, @C0359n0 C9008d dVar, @C0359n0 C9656j jVar) {
        this.f23586a = new Object();
        this.f23587b = aVar;
        this.f23588c = dVar;
        this.f23589d = jVar;
    }
}
