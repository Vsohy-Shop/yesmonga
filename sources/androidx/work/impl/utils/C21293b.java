package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.work.impl.utils.b */
public final class C21293b {
    @C12579k

    /* renamed from: a */
    public static final C21293b f54951a = new C21293b();

    @C12579k
    @C0373u
    /* renamed from: a */
    public final String mo63628a() {
        String a = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(a, "getProcessName()");
        return a;
    }
}
