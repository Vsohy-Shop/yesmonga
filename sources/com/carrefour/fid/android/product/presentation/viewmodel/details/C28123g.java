package com.carrefour.fid.android.product.presentation.viewmodel.details;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.product.presentation.analytics.C27633c;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.g */
public final class C28123g {

    /* renamed from: b */
    public static final int f68114b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f68115a;

    @Inject
    public C28123g(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f68115a = aVar;
    }

    /* renamed from: a */
    public final void mo81736a(@C12579k C27633c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C28547h2.f69318f);
        C13783a aVar = this.f68115a;
        C13813h[] hVarArr = new C13813h[2];
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a("ecommerce_action", "add"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("product_EAN", cVar.mo80270t()), C11078d1.m42659a("product_cdBase", cVar.mo80266p()), C11078d1.m42659a(C28526d.f68907d0, cVar.mo80273v()), C11078d1.m42659a(C28526d.f68930i0, String.valueOf(cVar.mo80275x())));
        if (cVar.mo80269s() != null) {
            j0.put("product_promotionsType", cVar.mo80269s());
            j0.put("product_promotionsName", cVar.mo80268r());
        }
        String str = null;
        hVarArr[0] = new C13785c(C10977s0.m41430D0(j0), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_CART;
        float parseFloat = Float.parseFloat(cVar.mo80273v());
        String u = cVar.mo80272u();
        String t = cVar.mo80270t();
        String o = cVar.mo80265o();
        if (o == null) {
            o = "";
        }
        String str2 = o;
        float parseFloat2 = Float.parseFloat(cVar.mo80273v());
        Integer x = cVar.mo80275x();
        String w = cVar.mo80274w();
        if (C13786d.m58689b(firebaseEventKey)) {
            str = "undefined";
        }
        C13789a aVar2 = r12;
        C13789a aVar3 = new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(u, t, str2, 0, parseFloat2, x, 2, w, (String) null, str, 256, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: b */
    public final void mo81737b(@C12579k C27633c cVar) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(cVar, C28547h2.f69318f);
        C13783a aVar = this.f68115a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a("product_EAN", cVar.mo80270t());
        String p = cVar.mo80266p();
        if (p == null) {
            p = "";
        }
        pairArr[1] = C11078d1.m42659a("product_cdBase", p);
        String u = cVar.mo80272u();
        if (u == null) {
            u = "";
        }
        pairArr[2] = C11078d1.m42659a("product_name", u);
        pairArr[3] = C11078d1.m42659a("product_business", "2");
        String r = cVar.mo80268r();
        if (r == null) {
            r = "";
        }
        pairArr[4] = C11078d1.m42659a("product_promotionsName", r);
        String s = cVar.mo80269s();
        if (s == null) {
            s = "";
        }
        pairArr[5] = C11078d1.m42659a("product_promotionsType", s);
        C13783a.m58667i(aVar, "product-details", "fiche-produit", C10977s0.m41456W(pairArr), false, false, false, 56, (Object) null);
        C13783a aVar2 = this.f68115a;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM;
        float parseFloat = Float.parseFloat(cVar.mo80273v());
        String u2 = cVar.mo80272u();
        String t = cVar.mo80270t();
        String o = cVar.mo80265o();
        if (o == null) {
            str = "";
        } else {
            str = o;
        }
        float parseFloat2 = Float.parseFloat(cVar.mo80273v());
        String w = cVar.mo80274w();
        if (C13786d.m58689b(FirebaseEventKey.VIEW_ITEM_LIST)) {
            str2 = "undefined";
        } else {
            str2 = null;
        }
        hVarArr[0] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(u2, t, str, (Integer) null, parseFloat2, (Integer) null, 2, w, (String) null, str2, 296, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar2.mo32711n(hVarArr);
    }
}
