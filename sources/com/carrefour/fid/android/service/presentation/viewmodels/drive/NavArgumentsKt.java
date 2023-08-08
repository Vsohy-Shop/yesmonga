package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import androidx.lifecycle.C19456p0;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000XT¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00038À\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo22516d2 = {"", "ANABEL_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/p0;", "getAnabel", "(Landroidx/lifecycle/p0;)Ljava/lang/String;", "anabel", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
public final class NavArgumentsKt {
    @C12579k
    public static final String ANABEL_KEY = "anabel";

    @C12579k
    public static final String getAnabel(@C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Object h = p0Var.mo57648h(ANABEL_KEY);
        Intrinsics.checkNotNull(h);
        return (String) h;
    }
}
