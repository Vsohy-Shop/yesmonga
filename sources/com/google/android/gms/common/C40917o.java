package com.google.android.gms.common;

import androidx.annotation.C0359n0;
import com.google.errorprone.annotations.C32489b;
import javax.annotation.Nullable;

@C32489b
/* renamed from: com.google.android.gms.common.o */
public class C40917o {

    /* renamed from: a */
    public final String f104094a;

    /* renamed from: b */
    public final boolean f104095b;
    @Nullable

    /* renamed from: c */
    public final String f104096c;
    @Nullable

    /* renamed from: d */
    public final Throwable f104097d;

    public C40917o(String str, int i, boolean z, @Nullable String str2, @Nullable Throwable th) {
        this.f104094a = str;
        this.f104095b = z;
        this.f104096c = str2;
        this.f104097d = th;
    }

    @C0359n0
    /* renamed from: a */
    public static C40917o m166370a(@C0359n0 String str, @C0359n0 String str2, @Nullable Throwable th) {
        return new C40917o(str, 1, false, str2, th);
    }

    @C0359n0
    /* renamed from: d */
    public static C40917o m166371d(@C0359n0 String str, int i) {
        return new C40917o(str, i, true, (String) null, (Throwable) null);
    }

    /* renamed from: b */
    public final void mo134607b() {
        if (!this.f104095b) {
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(this.f104096c));
            Throwable th = this.f104097d;
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    /* renamed from: c */
    public final boolean mo134608c() {
        return this.f104095b;
    }
}
