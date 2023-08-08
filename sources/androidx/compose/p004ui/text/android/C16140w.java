package androidx.compose.p004ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.p027os.C17772a;
import com.google.firebase.crashlytics.C32648f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(23)
/* renamed from: androidx.compose.ui.text.android.w */
public final class C16140w implements C16096l0 {
    @C12579k
    @C0373u
    /* renamed from: a */
    public StaticLayout mo46476a(@C12579k C16101n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, C32648f.f79206e);
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(n0Var.mo46519r(), n0Var.mo46518q(), n0Var.mo46506e(), n0Var.mo46516o(), n0Var.mo46522u());
        obtain.setTextDirection(n0Var.mo46520s());
        obtain.setAlignment(n0Var.mo46502a());
        obtain.setMaxLines(n0Var.mo46515n());
        obtain.setEllipsize(n0Var.mo46504c());
        obtain.setEllipsizedWidth(n0Var.mo46505d());
        obtain.setLineSpacing(n0Var.mo46513l(), n0Var.mo46514m());
        obtain.setIncludePad(n0Var.mo46508g());
        obtain.setBreakStrategy(n0Var.mo46503b());
        obtain.setHyphenationFrequency(n0Var.mo46507f());
        obtain.setIndents(n0Var.mo46510i(), n0Var.mo46517p());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C16144y.m72620a(obtain, n0Var.mo46509h());
        }
        if (i >= 28) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C16054a0.m72408a(obtain, n0Var.mo46521t());
        }
        if (i >= 33) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C16081i0.m72464b(obtain, n0Var.mo46511j(), n0Var.mo46512k());
        }
        StaticLayout build = obtain.build();
        Intrinsics.checkNotNullExpressionValue(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: b */
    public boolean mo46477b(@C12579k StaticLayout staticLayout, boolean z) {
        Intrinsics.checkNotNullParameter(staticLayout, "layout");
        if (C17772a.m81155k()) {
            return C16081i0.m72463a(staticLayout);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return z;
        }
        return false;
    }
}
