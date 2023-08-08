package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.internal.C8567o;
import com.google.maps.android.data.geojson.C33834i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.layout.j0 */
public final class C15577j0 {

    /* renamed from: d */
    public static final int f38730d = 8;
    @C12579k

    /* renamed from: a */
    public final C8767m f38731a;
    @C12579k

    /* renamed from: b */
    public final C15588o f38732b;
    @C12580l

    /* renamed from: c */
    public final Object f38733c;

    public C15577j0(@C12579k C8767m mVar, @C12579k C15588o oVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f38731a = mVar;
        this.f38732b = oVar;
        this.f38733c = obj;
    }

    @C12579k
    /* renamed from: a */
    public final C15588o mo44419a() {
        return this.f38732b;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo44420b() {
        return this.f38733c;
    }

    @C12579k
    /* renamed from: c */
    public final C8767m mo44421c() {
        return this.f38731a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15577j0(C8767m mVar, C15588o oVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, oVar, (i & 4) != 0 ? null : obj);
    }
}
