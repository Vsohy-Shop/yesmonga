package androidx.room;

import androidx.annotation.C0376v0;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.d1 */
public final class C20292d1 implements C20481g, C20331k {
    @C12579k

    /* renamed from: a */
    public final C20481g f52367a;
    @C12579k

    /* renamed from: b */
    public final Executor f52368b;
    @C12579k

    /* renamed from: c */
    public final RoomDatabase.C20275f f52369c;

    public C20292d1(@C12579k C20481g gVar, @C12579k Executor executor, @C12579k RoomDatabase.C20275f fVar) {
        Intrinsics.checkNotNullParameter(gVar, "delegate");
        Intrinsics.checkNotNullParameter(executor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(fVar, "queryCallback");
        this.f52367a = gVar;
        this.f52368b = executor;
        this.f52369c = fVar;
    }

    @C12579k
    /* renamed from: Z2 */
    public C20466f mo18111Z2() {
        return new C20288c1(getDelegate().mo18111Z2(), this.f52368b, this.f52369c);
    }

    public void close() {
        this.f52367a.close();
    }

    @C12579k
    /* renamed from: d3 */
    public C20466f mo18117d3() {
        return new C20288c1(getDelegate().mo18117d3(), this.f52368b, this.f52369c);
    }

    @C12580l
    public String getDatabaseName() {
        return this.f52367a.getDatabaseName();
    }

    @C12579k
    public C20481g getDelegate() {
        return this.f52367a;
    }

    @C0376v0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f52367a.setWriteAheadLoggingEnabled(z);
    }
}
