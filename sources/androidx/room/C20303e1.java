package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20481g;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.room.e1 */
public final class C20303e1 implements C20481g.C20487c {
    @C12579k

    /* renamed from: a */
    public final C20481g.C20487c f52410a;
    @C12579k

    /* renamed from: b */
    public final Executor f52411b;
    @C12579k

    /* renamed from: c */
    public final RoomDatabase.C20275f f52412c;

    public C20303e1(@C12579k C20481g.C20487c cVar, @C12579k Executor executor, @C12579k RoomDatabase.C20275f fVar) {
        Intrinsics.checkNotNullParameter(cVar, "delegate");
        Intrinsics.checkNotNullParameter(executor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(fVar, "queryCallback");
        this.f52410a = cVar;
        this.f52411b = executor;
        this.f52412c = fVar;
    }

    @C12579k
    /* renamed from: a */
    public C20481g mo18120a(@C12579k C20481g.C20484b bVar) {
        Intrinsics.checkNotNullParameter(bVar, BannerConfigurableFragment.f27258E0);
        return new C20292d1(this.f52410a.mo18120a(bVar), this.f52411b, this.f52412c);
    }
}
