package com.urbanairship.channel;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36071u;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.util.C9669o0;

/* renamed from: com.urbanairship.channel.m */
public class C9033m extends C36040b {

    /* renamed from: f */
    public final C9074e f24352f;

    public C9033m(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9074e eVar) {
        super(context, uVar);
        this.f24352f = eVar;
    }

    @C0359n0
    /* renamed from: B */
    public C9022g mo17879B() {
        return this.f24352f.mo18029V();
    }

    @C0359n0
    @Deprecated
    /* renamed from: C */
    public C9060z mo17880C() {
        return this.f24352f.mo18031X();
    }

    @Deprecated
    /* renamed from: D */
    public void mo17881D() {
    }

    @C0363p0
    @Deprecated
    /* renamed from: E */
    public String mo17882E() {
        return this.f24352f.mo18037d0();
    }

    @Deprecated
    /* renamed from: F */
    public void mo17883F(@C0363p0 @C0386z0(max = 128) String str) {
        if (str != null) {
            str = str.trim();
        }
        if (C9669o0.m36224e(str)) {
            this.f24352f.mo18009D0();
        } else {
            this.f24352f.mo18045l0(str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 5;
    }
}
