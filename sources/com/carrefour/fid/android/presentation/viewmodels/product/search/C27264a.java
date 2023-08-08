package com.carrefour.fid.android.presentation.viewmodels.product.search;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.appsflyer.AFInAppEventType;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.core.type.SearchType;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.models.extension.C38483r;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.shared.constant.C28532e1;
import com.carrefour.fid.android.shared.constant.C28613z;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.a */
public final class C27264a {

    /* renamed from: d */
    public static final int f66239d = 8;
    @C12579k

    /* renamed from: a */
    public final Context f66240a;
    @C12579k

    /* renamed from: b */
    public final C13783a f66241b;
    @C12579k

    /* renamed from: c */
    public final C13814a f66242c;

    @Inject
    public C27264a(@C10255b @C12579k Context context, @C12579k C13783a aVar, @C12579k C13814a aVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        this.f66240a = context;
        this.f66241b = aVar;
        this.f66242c = aVar2;
    }

    /* renamed from: a */
    public final void mo79293a() {
        C13783a.m58667i(this.f66241b, "mon-memo-course", C28532e1.f69105i, (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo79294b(@C12579k SearchType searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        C13783a.m58667i(this.f66241b, "search", "search", C10975r0.m41401k(C11078d1.m42659a("search_type", searchType.mo108594q())), false, false, false, 56, (Object) null);
    }

    /* renamed from: c */
    public final void mo79295c() {
        C13783a.m58668o(this.f66241b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", C28613z.C28621h.f70125b), C11078d1.m42659a(C28526d.f68906d, "search"), C11078d1.m42659a(C28526d.f68933j, C28531e0.f69089s), C11078d1.m42659a(C28526d.f68929i, "search")), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo79296d() {
        C13783a.m58668o(this.f66241b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "search"), C11078d1.m42659a(C28526d.f68906d, "search"), C11078d1.m42659a(C28526d.f68933j, C28532e1.f69105i), C11078d1.m42659a(C28526d.f68929i, "search")), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo79297e(int i) {
        C13783a.m58668o(this.f66241b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", C28532e1.f69105i), C11078d1.m42659a(C28526d.f68906d, "mon-memo-course"), C11078d1.m42659a(C28526d.f68933j, "voir-resultats-recherche-multiple"), C11078d1.m42659a(C28526d.f68929i, "mon-memo-course"), C11078d1.m42659a(C28526d.f68937k, String.valueOf(i))), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo79298f(@C12579k C38530v vVar) {
        Intrinsics.checkNotNullParameter(vVar, C28513a.f68684v);
        C13783a.m58668o(this.f66241b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", C28613z.C28621h.f70125b), C11078d1.m42659a(C28526d.f68906d, "search"), C11078d1.m42659a(C28526d.f68933j, C38483r.m159664a(vVar)), C11078d1.m42659a(C28526d.f68929i, "search"), C11078d1.m42659a(C28526d.f68937k, vVar.mo122184k())), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo79299g() {
        this.f66242c.mo32735i(this.f66240a, AFInAppEventType.SEARCH, C10975r0.m41401k(C11078d1.m42659a(AFInAppEventType.SEARCH, "Oui")));
    }

    /* renamed from: h */
    public final void mo79300h() {
        C13783a.m58668o(this.f66241b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "search"), C11078d1.m42659a("screen_name", C28613z.C28621h.f70125b), C11078d1.m42659a(C28526d.f68929i, "search"), C11078d1.m42659a(C28526d.f68933j, "affichage")), false, 2, (Object) null);
    }
}
