package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.android.internal.C10184a;
import dagger.hilt.android.qualifiers.C10255b;
import dagger.hilt.components.C10265a;

@C10159h
@C10267e({C10265a.class})
/* renamed from: dagger.hilt.android.internal.modules.c */
public final class C10240c {

    /* renamed from: a */
    public final Context f27953a;

    public C10240c(Context context) {
        this.f27953a = context;
    }

    @C10315i
    /* renamed from: a */
    public Application mo21684a() {
        return C10184a.m38402a(this.f27953a);
    }

    @C10255b
    @C10315i
    /* renamed from: b */
    public Context mo21685b() {
        return this.f27953a;
    }
}
