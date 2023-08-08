package com.urbanairship.push;

import androidx.core.util.C17970d;
import com.urbanairship.permission.PermissionStatus;

/* renamed from: com.urbanairship.push.l */
public final /* synthetic */ class C9495l implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ C9537t f25922a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f25923b;

    public /* synthetic */ C9495l(C9537t tVar, Runnable runnable) {
        this.f25922a = tVar;
        this.f25923b = runnable;
    }

    public final void accept(Object obj) {
        this.f25922a.m35763s0(this.f25923b, (PermissionStatus) obj);
    }
}
