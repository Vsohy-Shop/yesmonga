package androidx.work.impl;

import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.i */
public final class C21197i extends C20343b {
    @C12579k

    /* renamed from: c */
    public static final C21197i f54710c = new C21197i();

    public C21197i() {
        super(1, 2);
    }

    /* renamed from: a */
    public void mo17636a(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        fVar.mo60782s0(C21101a0.f54462a);
        fVar.mo60782s0(C21101a0.f54463b);
        fVar.mo60782s0(C21101a0.f54465d);
        fVar.mo60782s0("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
