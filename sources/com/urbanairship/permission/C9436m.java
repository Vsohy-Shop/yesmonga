package com.urbanairship.permission;

import com.urbanairship.C36062p;

/* renamed from: com.urbanairship.permission.m */
public final /* synthetic */ class C9436m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9439p f25780a;

    /* renamed from: b */
    public final /* synthetic */ C9425b f25781b;

    /* renamed from: c */
    public final /* synthetic */ Permission f25782c;

    /* renamed from: d */
    public final /* synthetic */ C36062p f25783d;

    public /* synthetic */ C9436m(C9439p pVar, C9425b bVar, Permission permission, C36062p pVar2) {
        this.f25780a = pVar;
        this.f25781b = bVar;
        this.f25782c = permission;
        this.f25783d = pVar2;
    }

    public final void run() {
        this.f25780a.m35453t(this.f25781b, this.f25782c, this.f25783d);
    }
}
