package com.urbanairship.iam.assets;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.iam.InAppMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;

/* renamed from: com.urbanairship.iam.assets.d */
public class C9135d {

    /* renamed from: d */
    public static final int f24743d = 0;

    /* renamed from: e */
    public static final int f24744e = 1;

    /* renamed from: f */
    public static final int f24745f = 2;
    @C0363p0

    /* renamed from: a */
    public C9138f f24746a;
    @C0363p0

    /* renamed from: b */
    public C9137e f24747b;
    @C0359n0

    /* renamed from: c */
    public final C9134c f24748c;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.assets.d$a */
    public @interface C9136a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9135d(@C0359n0 Context context) {
        this.f24748c = new C9134c(context);
        this.f24746a = new C9132a();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public Assets mo18247a(@C0359n0 String str) {
        return this.f24748c.mo18244b(str);
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public void mo18248b(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage) {
        boolean z;
        C9137e eVar = this.f24747b;
        if (eVar == null || !eVar.mo18254a(str, inAppMessage)) {
            z = true;
        } else {
            z = false;
        }
        this.f24748c.mo18246d(str, z);
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public void mo18249c(@C0359n0 String str) {
        this.f24748c.mo18246d(str, true);
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public int mo18250d(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage) {
        C9138f fVar = this.f24746a;
        if (fVar != null) {
            return fVar.mo18241b(str, inAppMessage, this.f24748c.mo18244b(str));
        }
        return 0;
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo18251e(@C0359n0 String str, @C0359n0 Callable<InAppMessage> callable) {
        C9137e eVar = this.f24747b;
        C9138f fVar = this.f24746a;
        if (eVar != null && fVar != null) {
            try {
                InAppMessage call = callable.call();
                if (eVar.mo18255b(str, call)) {
                    fVar.mo18240a(str, call, this.f24748c.mo18244b(str));
                    this.f24748c.mo18246d(str, false);
                }
            } catch (Exception e) {
                C36059m.m148411g(e, "Unable to prepare assets for schedule: %s", str);
            }
        }
    }

    /* renamed from: f */
    public void mo18252f(@C0363p0 C9137e eVar) {
        this.f24747b = eVar;
    }

    /* renamed from: g */
    public void mo18253g(@C0363p0 C9138f fVar) {
        this.f24746a = fVar;
    }

    @C0344h1
    public C9135d(@C0359n0 C9134c cVar) {
        this.f24748c = cVar;
    }
}
