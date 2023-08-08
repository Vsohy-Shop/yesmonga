package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20492k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class SharedSQLiteStatement {
    @C12579k

    /* renamed from: a */
    public final RoomDatabase f52323a;
    @C12579k

    /* renamed from: b */
    public final AtomicBoolean f52324b = new AtomicBoolean(false);
    @C12579k

    /* renamed from: c */
    public final C11677z f52325c = C10864b0.m38748c(new SharedSQLiteStatement$stmt$2(this));

    public SharedSQLiteStatement(@C12579k RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
        this.f52323a = roomDatabase;
    }

    @C12579k
    /* renamed from: b */
    public C20492k mo60958b() {
        mo60959c();
        return mo60962g(this.f52324b.compareAndSet(false, true));
    }

    /* renamed from: c */
    public void mo60959c() {
        this.f52323a.mo60903c();
    }

    /* renamed from: d */
    public final C20492k mo60960d() {
        return this.f52323a.mo60907h(mo17582e());
    }

    @C12579k
    /* renamed from: e */
    public abstract String mo17582e();

    /* renamed from: f */
    public final C20492k mo60961f() {
        return (C20492k) this.f52325c.getValue();
    }

    /* renamed from: g */
    public final C20492k mo60962g(boolean z) {
        if (z) {
            return mo60961f();
        }
        return mo60960d();
    }

    /* renamed from: h */
    public void mo60963h(@C12579k C20492k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "statement");
        if (kVar == mo60961f()) {
            this.f52324b.set(false);
        }
    }
}
