package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20466f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.c */
public final class C21135c extends RoomDatabase.C20271b {
    @C12579k

    /* renamed from: a */
    public static final C21135c f54582a = new C21135c();

    /* renamed from: c */
    public void mo60946c(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        super.mo60946c(fVar);
        fVar.mo60775j0();
        try {
            fVar.mo60782s0(mo63274e());
            fVar.mo60764e1();
        } finally {
            fVar.mo60784t1();
        }
    }

    /* renamed from: d */
    public final long mo63273d() {
        return System.currentTimeMillis() - C21369z.f55111c;
    }

    /* renamed from: e */
    public final String mo63274e() {
        return C21369z.f55109a + mo63273d() + C21369z.f55110b;
    }
}
