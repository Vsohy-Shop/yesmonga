package com.urbanairship.permission;

import com.urbanairship.C36062p;

/* renamed from: com.urbanairship.permission.f */
public final /* synthetic */ class C9429f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9439p f25764a;

    /* renamed from: b */
    public final /* synthetic */ C9425b f25765b;

    /* renamed from: c */
    public final /* synthetic */ Permission f25766c;

    /* renamed from: d */
    public final /* synthetic */ C36062p f25767d;

    public /* synthetic */ C9429f(C9439p pVar, C9425b bVar, Permission permission, C36062p pVar2) {
        this.f25764a = pVar;
        this.f25765b = bVar;
        this.f25766c = permission;
        this.f25767d = pVar2;
    }

    public final void run() {
        this.f25764a.m35450q(this.f25765b, this.f25766c, this.f25767d);
    }
}
