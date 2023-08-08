package com.urbanairship.permission;

import androidx.core.util.C17970d;

/* renamed from: com.urbanairship.permission.n */
public final /* synthetic */ class C9437n implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ C9439p f25784a;

    /* renamed from: b */
    public final /* synthetic */ Permission f25785b;

    public /* synthetic */ C9437n(C9439p pVar, Permission permission) {
        this.f25784a = pVar;
        this.f25785b = permission;
    }

    public final void accept(Object obj) {
        this.f25784a.m35456w(this.f25785b, (PermissionStatus) obj);
    }
}
