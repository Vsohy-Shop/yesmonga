package androidx.room;

import androidx.sqlite.p031db.C20481g;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.b2 */
public final class C20284b2 implements C20481g.C20487c {
    @C12580l

    /* renamed from: a */
    public final String f52341a;
    @C12580l

    /* renamed from: b */
    public final File f52342b;
    @C12580l

    /* renamed from: c */
    public final Callable<InputStream> f52343c;
    @C12579k

    /* renamed from: d */
    public final C20481g.C20487c f52344d;

    public C20284b2(@C12580l String str, @C12580l File file, @C12580l Callable<InputStream> callable, @C12579k C20481g.C20487c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "mDelegate");
        this.f52341a = str;
        this.f52342b = file;
        this.f52343c = callable;
        this.f52344d = cVar;
    }

    @C12579k
    /* renamed from: a */
    public C20481g mo18120a(@C12579k C20481g.C20484b bVar) {
        Intrinsics.checkNotNullParameter(bVar, BannerConfigurableFragment.f27258E0);
        return new C20279a2(bVar.f52800a, this.f52341a, this.f52342b, this.f52343c, bVar.f52802c.f52798a, this.f52344d.mo18120a(bVar));
    }
}
