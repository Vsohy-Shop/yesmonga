package com.urbanairship.permission;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.core.content.C17318d;
import androidx.core.util.C17970d;
import com.urbanairship.C36059m;

/* renamed from: com.urbanairship.permission.q */
public class C9441q implements C9425b {

    /* renamed from: a */
    public final String f25799a;

    public C9441q(@C0359n0 String str) {
        this.f25799a = str;
    }

    /* renamed from: a */
    public void mo19124a(@C0359n0 Context context, @C0359n0 C17970d<C9426c> dVar) {
        PermissionsActivity.m35427Z0(context, this.f25799a, dVar);
    }

    @C0359n0
    /* renamed from: b */
    public void mo19125b(@C0359n0 Context context, @C0359n0 C17970d<PermissionStatus> dVar) {
        try {
            if (C17318d.m79718a(context, this.f25799a) == 0) {
                dVar.accept(PermissionStatus.GRANTED);
            }
            dVar.accept(PermissionStatus.DENIED);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get permission status.", new Object[0]);
            dVar.accept(PermissionStatus.NOT_DETERMINED);
        }
    }
}
