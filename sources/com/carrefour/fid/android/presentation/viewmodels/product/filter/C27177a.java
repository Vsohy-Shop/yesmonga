package com.carrefour.fid.android.presentation.viewmodels.product.filter;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.models.extension.C38482q;
import com.carrefour.fid.android.presentation.models.extension.FacetModelKt;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28535f0;
import com.carrefour.fid.android.shared.constant.C28592s1;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.filter.a */
public final class C27177a {

    /* renamed from: c */
    public static final int f66076c = 8;
    @C12579k

    /* renamed from: a */
    public final Context f66077a;
    @C12579k

    /* renamed from: b */
    public final C13783a f66078b;

    @Inject
    public C27177a(@C10255b @C12579k Context context, @C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f66077a = context;
        this.f66078b = aVar;
    }

    /* renamed from: a */
    public final void mo79000a(@C12579k List<FacetModel> list) {
        Intrinsics.checkNotNullParameter(list, "facets");
        C13783a.m58668o(this.f66078b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", C28592s1.f69854n), C11078d1.m42659a(C28526d.f68906d, "product-list"), C11078d1.m42659a(C28526d.f68933j, C28535f0.f69198e), C11078d1.m42659a(C28526d.f68929i, C28592s1.f69854n), C11078d1.m42659a(C28526d.f68937k, FacetModelKt.m159548b(list))), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo79001b(@C12579k SortModel sortModel) {
        Intrinsics.checkNotNullParameter(sortModel, "sort");
        C13783a.m58668o(this.f66078b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", C28592s1.f69854n), C11078d1.m42659a(C28526d.f68906d, "product-list"), C11078d1.m42659a(C28526d.f68933j, "appliquer-tri"), C11078d1.m42659a(C28526d.f68929i, C28592s1.f69854n), C11078d1.m42659a(C28526d.f68937k, C38482q.m159663a(sortModel, this.f66077a))), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo79002c() {
        C13783a.m58667i(this.f66078b, "product-list", C28592s1.f69854n, (Map) null, false, false, false, 60, (Object) null);
    }
}
