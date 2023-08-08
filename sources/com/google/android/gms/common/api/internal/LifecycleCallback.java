package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@C40473a
public class LifecycleCallback {
    @C40473a
    @C0359n0

    /* renamed from: a */
    public final C40587m f103291a;

    @C40473a
    public LifecycleCallback(@C0359n0 C40587m mVar) {
        this.f103291a = mVar;
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static C40587m m164865c(@C0359n0 Activity activity) {
        return m164867e(new C40582l(activity));
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public static C40587m m164866d(@C0359n0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static C40587m m164867e(@C0359n0 C40582l lVar) {
        if (lVar.mo133979d()) {
            return C40575j4.m165197K0(lVar.mo133977b());
        }
        if (lVar.mo133978c()) {
            return C40563h4.m165078c(lVar.mo133976a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C40587m getChimeraLifecycleFragmentImpl(C40582l lVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @C40473a
    @C0353k0
    /* renamed from: a */
    public void mo133801a(@C0359n0 String str, @C0359n0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0359n0 String[] strArr) {
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public Activity mo133802b() {
        Activity l0 = this.f103291a.mo133929l0();
        C40843u.m166202l(l0);
        return l0;
    }

    @C40473a
    @C0353k0
    /* renamed from: f */
    public void mo133803f(int i, int i2, @C0359n0 Intent intent) {
    }

    @C40473a
    @C0353k0
    /* renamed from: g */
    public void mo133804g(@C0363p0 Bundle bundle) {
    }

    @C40473a
    @C0353k0
    /* renamed from: h */
    public void mo133805h() {
    }

    @C40473a
    @C0353k0
    /* renamed from: i */
    public void mo133806i() {
    }

    @C40473a
    @C0353k0
    /* renamed from: j */
    public void mo133807j(@C0359n0 Bundle bundle) {
    }

    @C40473a
    @C0353k0
    /* renamed from: k */
    public void mo133808k() {
    }

    @C40473a
    @C0353k0
    /* renamed from: l */
    public void mo87750l() {
    }
}
