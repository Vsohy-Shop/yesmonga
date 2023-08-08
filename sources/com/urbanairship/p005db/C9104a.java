package com.urbanairship.p005db;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import com.urbanairship.C36059m;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.db.a */
public abstract class C9104a extends C20343b {
    public C9104a(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public void mo17636a(@C0359n0 C20466f fVar) {
        try {
            mo18109b(fVar);
            e = null;
        } catch (Exception e) {
            e = e;
            C36059m.m148407c(e, "Migration (%d to %d) failed!", Integer.valueOf(this.f52511a), Integer.valueOf(this.f52512b));
        }
        if (e != null) {
            C36059m.m148406b("Attempting to recover (%d to %d) migration!", Integer.valueOf(this.f52511a), Integer.valueOf(this.f52512b));
            mo18110c(fVar, e);
        }
    }

    /* renamed from: b */
    public abstract void mo18109b(@C0359n0 C20466f fVar);

    /* renamed from: c */
    public abstract void mo18110c(@C0359n0 C20466f fVar, @C0359n0 Exception exc);
}
