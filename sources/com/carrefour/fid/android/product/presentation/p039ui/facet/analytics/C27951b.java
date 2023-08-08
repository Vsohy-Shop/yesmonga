package com.carrefour.fid.android.product.presentation.p039ui.facet.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.presentation.C13821a;
import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.shared.constant.C28535f0;
import com.carrefour.fid.android.shared.constant.C28592s1;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFacetAnalyticsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetAnalyticsImpl.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/analytics/FacetAnalyticsImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1549#2:43\n1620#2,3:44\n*S KotlinDebug\n*F\n+ 1 FacetAnalyticsImpl.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/analytics/FacetAnalyticsImpl\n*L\n21#1:43\n21#1:44,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.analytics.b */
public final class C27951b implements C27950a {
    @C12579k

    /* renamed from: a */
    public final C13783a f67783a;
    @C12579k

    /* renamed from: b */
    public final String f67784b = C28592s1.f69854n;
    @C12579k

    /* renamed from: c */
    public final String f67785c = "product-list";
    @C12579k

    /* renamed from: d */
    public final String f67786d = C28592s1.f69854n;

    @Inject
    public C27951b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f67783a = aVar;
    }

    /* renamed from: a */
    public void mo81377a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sort");
        C13783a.m58668o(this.f67783a, C13821a.m58743a(this.f67784b, this.f67785c, this.f67786d, "appliquer-tri", str), false, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo81378b(@C12579k List<C38105d> list) {
        Intrinsics.checkNotNullParameter(list, "facets");
        C13783a aVar = this.f67783a;
        String str = this.f67784b;
        String str2 = this.f67785c;
        String str3 = this.f67786d;
        Iterable<C38105d> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C38105d e : iterable) {
            arrayList.add(e.mo118670e());
        }
        C13783a.m58668o(aVar, C13821a.m58743a(str, str2, str3, C28535f0.f69198e, CollectionsKt___CollectionsKt.m40639h3(arrayList, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null)), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f67783a, "product-list", C28592s1.f69854n, (Map) null, false, false, false, 60, (Object) null);
    }
}
