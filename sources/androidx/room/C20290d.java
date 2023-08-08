package androidx.room;

import androidx.sqlite.p031db.C20481g;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.room.d */
public final class C20290d implements C20481g.C20487c {
    @C12579k

    /* renamed from: a */
    public final C20481g.C20487c f52364a;
    @C12579k

    /* renamed from: b */
    public final C20285c f52365b;

    public C20290d(@C12579k C20481g.C20487c cVar, @C12579k C20285c cVar2) {
        Intrinsics.checkNotNullParameter(cVar, "delegate");
        Intrinsics.checkNotNullParameter(cVar2, "autoCloser");
        this.f52364a = cVar;
        this.f52365b = cVar2;
    }

    @C12579k
    /* renamed from: b */
    public AutoClosingRoomOpenHelper mo18120a(@C12579k C20481g.C20484b bVar) {
        Intrinsics.checkNotNullParameter(bVar, BannerConfigurableFragment.f27258E0);
        return new AutoClosingRoomOpenHelper(this.f52364a.mo18120a(bVar), this.f52365b);
    }
}
