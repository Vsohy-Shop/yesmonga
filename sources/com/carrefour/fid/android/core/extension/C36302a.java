package com.carrefour.fid.android.core.extension;

import android.webkit.URLUtil;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.urbanairship.iam.C9168d0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.core.extension.a */
public final class C36302a {
    @C12579k
    /* renamed from: a */
    public static final String m148943a(@C12580l ProductDomain productDomain, @C12579k String str) {
        List<ProductPictureDomain> u;
        ProductPictureDomain productPictureDomain;
        String e;
        Intrinsics.checkNotNullParameter(str, C9168d0.f24889w);
        if (productDomain == null || (u = productDomain.mo116547u()) == null || (productPictureDomain = (ProductPictureDomain) CollectionsKt___CollectionsKt.m40479B2(u)) == null || (e = productPictureDomain.mo116585e()) == null) {
            return "";
        }
        if (URLUtil.isValidUrl(e)) {
            int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) e, "/", e.length(), false, 4, (Object) null);
            return StringsKt__StringsKt.replaceRange(e, lastIndexOf$default, lastIndexOf$default, "/p_" + str).toString();
        }
        String c0 = StringKt.m118923c0(str);
        return C28547h2.f69317e + c0 + e;
    }
}
