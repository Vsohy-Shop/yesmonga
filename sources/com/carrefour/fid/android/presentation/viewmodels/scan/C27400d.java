package com.carrefour.fid.android.presentation.viewmodels.scan;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.d */
public final class C27400d {

    /* renamed from: c */
    public static final int f66477c = 8;
    @C12579k

    /* renamed from: a */
    public final Context f66478a;
    @C12579k

    /* renamed from: b */
    public final C13783a f66479b;

    @Inject
    public C27400d(@C10255b @C12579k Context context, @C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f66478a = context;
        this.f66479b = aVar;
    }

    /* renamed from: a */
    public final void mo79694a() {
        C13783a.m58667i(this.f66479b, "scan-produit", "scan-produit", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo79695b() {
        C13783a.m58668o(this.f66479b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "scan-produit"), C11078d1.m42659a(C28526d.f68906d, "scan-produit"), C11078d1.m42659a(C28526d.f68929i, "scan-produit"), C11078d1.m42659a(C28526d.f68933j, "scan-produit|echec"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68889Z1)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo79696c() {
        C13783a.m58668o(this.f66479b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "scan-produit"), C11078d1.m42659a(C28526d.f68906d, "scan-produit"), C11078d1.m42659a(C28526d.f68929i, "scan-produit"), C11078d1.m42659a(C28526d.f68933j, "scan-produit|echec"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68894a2)), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo79697d() {
        C13783a.m58668o(this.f66479b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "scan-produit"), C11078d1.m42659a(C28526d.f68906d, "scan-produit"), C11078d1.m42659a(C28526d.f68929i, "scan-produit"), C11078d1.m42659a(C28526d.f68933j, "scan-produit|succes")), false, 2, (Object) null);
    }
}
