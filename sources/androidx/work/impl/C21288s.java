package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import androidx.work.impl.utils.C21342t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.s */
public final class C21288s extends C20343b {
    @C12579k

    /* renamed from: c */
    public final Context f54931c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21288s(@C12579k Context context, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(context, "mContext");
        this.f54931c = context;
    }

    /* renamed from: a */
    public void mo17636a(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        if (this.f52512b >= 10) {
            fVar.mo60766f1(C21342t.f55049b, new Object[]{C21342t.f55053f, 1});
            return;
        }
        this.f54931c.getSharedPreferences(C21342t.f55051d, 0).edit().putBoolean(C21342t.f55053f, true).apply();
    }

    @C12579k
    /* renamed from: b */
    public final Context mo63618b() {
        return this.f54931c;
    }
}
