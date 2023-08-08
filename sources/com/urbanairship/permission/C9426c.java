package com.urbanairship.permission;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.permission.c */
public class C9426c {

    /* renamed from: a */
    public PermissionStatus f25760a;

    /* renamed from: b */
    public final boolean f25761b;

    @C0344h1
    public C9426c(@C0359n0 PermissionStatus permissionStatus, boolean z) {
        this.f25760a = permissionStatus;
        this.f25761b = z;
    }

    @C0359n0
    /* renamed from: a */
    public static C9426c m35434a(boolean z) {
        return new C9426c(PermissionStatus.DENIED, z);
    }

    @C0359n0
    /* renamed from: c */
    public static C9426c m35435c() {
        return new C9426c(PermissionStatus.GRANTED, false);
    }

    @C0359n0
    /* renamed from: e */
    public static C9426c m35436e() {
        return new C9426c(PermissionStatus.NOT_DETERMINED, false);
    }

    @C0359n0
    /* renamed from: b */
    public PermissionStatus mo19126b() {
        return this.f25760a;
    }

    /* renamed from: d */
    public boolean mo19127d() {
        return this.f25761b;
    }

    public String toString() {
        return "PermissionRequestResult{permissionStatus=" + this.f25760a + ", isSilentlyDenied=" + this.f25761b + C12361b.f30259j;
    }
}
