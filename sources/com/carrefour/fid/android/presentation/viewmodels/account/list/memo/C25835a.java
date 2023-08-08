package com.carrefour.fid.android.presentation.viewmodels.account.list.memo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.tracking.C28994a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.a */
public final class C25835a {

    /* renamed from: d */
    public static final int f63268d = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63269a;
    @C12579k

    /* renamed from: b */
    public final C28994a f63270b;

    /* renamed from: c */
    public boolean f63271c;

    @Inject
    public C25835a(@C12579k C13783a aVar, @C12579k C28994a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTrackingAdapter");
        this.f63269a = aVar;
        this.f63270b = aVar2;
    }

    /* renamed from: a */
    public final void mo75004a() {
        C13783a.m58667i(this.f63269a, "mon-memo-course", "erreur-affichage", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo75005b() {
        C13783a.m58667i(this.f63269a, "mon-memo-course", "ma-liste-memo", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: c */
    public final void mo75006c() {
        this.f63270b.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33412F, "Oui")));
    }

    /* renamed from: d */
    public final void mo75007d() {
        C13783a.m58668o(this.f63269a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "ma-liste-memo"), C11078d1.m42659a(C28526d.f68906d, "mon-memo-course"), C11078d1.m42659a(C28526d.f68933j, "ajouter-memo"), C11078d1.m42659a(C28526d.f68929i, C28515a1.f68704l)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo75008e() {
        C13783a.m58668o(this.f63269a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "ma-liste-memo"), C11078d1.m42659a(C28526d.f68906d, "mon-memo-course"), C11078d1.m42659a(C28526d.f68933j, "ajouter-1er-memo"), C11078d1.m42659a(C28526d.f68929i, C28515a1.f68704l)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo75009f() {
        C13783a.m58667i(this.f63269a, "mon-memo-course", "ma-liste-memo-vide", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: g */
    public final void mo75010g() {
        C13783a.m58668o(this.f63269a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "ma-liste-memo"), C11078d1.m42659a(C28526d.f68906d, "mon-memo-course"), C11078d1.m42659a(C28526d.f68933j, "mes-recommandations"), C11078d1.m42659a(C28526d.f68929i, C28515a1.f68704l)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo75011h() {
        C13783a.m58668o(this.f63269a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "ma-liste-memo"), C11078d1.m42659a(C28526d.f68906d, "mon-memo-course"), C11078d1.m42659a(C28526d.f68933j, "suppr-memo"), C11078d1.m42659a(C28526d.f68929i, C28515a1.f68704l)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo75012i() {
        C13783a.m58668o(this.f63269a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "ma-liste-memo-deconnecte"), C11078d1.m42659a(C28526d.f68906d, "mon-memo-course"), C11078d1.m42659a(C28526d.f68929i, C28515a1.f68704l), C11078d1.m42659a(C28526d.f68933j, "me-connecter")), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo75013j() {
        C13783a.m58667i(this.f63269a, "mon-memo-course", "ma-liste-memo-deconnecte", (Map) null, false, false, false, 60, (Object) null);
    }
}
