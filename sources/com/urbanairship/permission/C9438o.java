package com.urbanairship.permission;

import androidx.core.util.C17970d;
import com.urbanairship.C36062p;

/* renamed from: com.urbanairship.permission.o */
public final /* synthetic */ class C9438o implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ C9439p f25786a;

    /* renamed from: b */
    public final /* synthetic */ Permission f25787b;

    /* renamed from: c */
    public final /* synthetic */ C36062p f25788c;

    /* renamed from: d */
    public final /* synthetic */ C9425b f25789d;

    public /* synthetic */ C9438o(C9439p pVar, Permission permission, C36062p pVar2, C9425b bVar) {
        this.f25786a = pVar;
        this.f25787b = permission;
        this.f25788c = pVar2;
        this.f25789d = bVar;
    }

    public final void accept(Object obj) {
        this.f25786a.m35449p(this.f25787b, this.f25788c, this.f25789d, (PermissionStatus) obj);
    }
}
