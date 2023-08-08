package com.carrefour.fid.android.presentation.viewmodels.order.online;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28554j1;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.i */
public final class C27004i {

    /* renamed from: b */
    public static final int f65690b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f65691a;

    @Inject
    public C27004i(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f65691a = aVar;
    }

    /* renamed from: a */
    public final void mo78418a() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "navigation-clic"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69458y)), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo78419b() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69457x)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo78420c() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", C28554j1.f69435b), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69446m)), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo78421d() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", C28554j1.f69440g), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "commencer-mes-courses")), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo78422e() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", C28554j1.f69440g), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "commander-a-nouveau")), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo78423f() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", C28554j1.f69440g), C11078d1.m42659a(C28526d.f68929i, C28554j1.f69440g), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69447n)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo78424g() {
        C13783a.m58667i(this.f65691a, "mon-compte", "mes-achats-en-ligne", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: h */
    public final void mo78425h() {
        C13783a.m58668o(this.f65691a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "erreur-affichage"), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69454u)), false, 2, (Object) null);
    }
}
