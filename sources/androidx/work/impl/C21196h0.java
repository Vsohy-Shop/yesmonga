package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import androidx.work.impl.utils.C21334n;
import androidx.work.impl.utils.C21342t;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.h0 */
public final class C21196h0 extends C20343b {
    @C12579k

    /* renamed from: c */
    public final Context f54709c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21196h0(@C12579k Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f54709c = context;
    }

    /* renamed from: a */
    public void mo17636a(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        fVar.mo60782s0(C21342t.f55050c);
        C21342t.m98461e(this.f54709c, fVar);
        C21334n.m98448c(this.f54709c, fVar);
    }
}
