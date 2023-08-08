package com.carrefour.fid.android.presentation.viewmodels.order.refont;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28554j1;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.c */
public final class C27053c implements C27052b {

    /* renamed from: b */
    public static final int f65775b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f65776a;

    @Inject
    public C27053c(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f65776a = aVar;
    }

    /* renamed from: a */
    public void mo78562a(@C12580l OrderType orderType) {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "confirmer-annuler-commande"), C11078d1.m42659a(C28526d.f68937k, mo78577o(orderType))), false, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo78563b() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69458y)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public void mo78564c() {
        C13783a.m58668o(this.f65776a, C10977s0.m41446M(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "clic"), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69422A)), false, 2, (Object) null);
    }

    /* renamed from: d */
    public void mo78565d() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "commander-a-nouveau")), false, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo78566e() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68936j2), C11078d1.m42659a(C28526d.f68937k, "")), false, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo78567f() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69444k)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public void mo78568g() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "navigation-clic"), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69426E)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public void mo78569h() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69457x)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public void mo78570i(@C12580l OrderType orderType) {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68964q2), C11078d1.m42659a(C28526d.f68937k, mo78577o(orderType))), false, 2, (Object) null);
    }

    /* renamed from: j */
    public void mo78571j() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69443j)), false, 2, (Object) null);
    }

    /* renamed from: k */
    public void mo78572k() {
        C13783a.m58667i(this.f65776a, "mon-compte", "mes-commandes-error", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: l */
    public void mo78573l() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69447n)), false, 2, (Object) null);
    }

    /* renamed from: m */
    public void mo78574m() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "sortie-site")), false, 2, (Object) null);
    }

    /* renamed from: n */
    public void mo78575n() {
        C13783a.m58668o(this.f65776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "erreur-affichage"), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69454u)), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final String mo78577o(OrderType orderType) {
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Clcv.f70280e)) {
            return "clcv";
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Drive.f70282e)) {
            return "drive";
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.H1h3.f70286e)) {
            return "lex";
        }
        return C28526d.f68944l2;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f65776a, "mon-compte", "mes-achats-en-ligne", (Map) null, false, false, false, 60, (Object) null);
    }
}
