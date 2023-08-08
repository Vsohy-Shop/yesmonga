package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.extension.C28762j0;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductListSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListSource.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSourceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n766#2:79\n857#2,2:80\n*S KotlinDebug\n*F\n+ 1 ProductListSource.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSourceKt\n*L\n76#1:79\n76#1:80,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.e */
public final class C28206e {
    /* renamed from: a */
    public static final List<String> m118085a(ProductCategory productCategory) {
        ArrayList arrayList;
        String W;
        List split$default;
        String s = productCategory.mo117299s();
        if (s == null || (W = StringKt.m118914W(s, 1)) == null || (split$default = StringsKt__StringsKt.split$default((CharSequence) W, new String[]{"/"}, false, 0, 6, (Object) null)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object next : split$default) {
                if (!C11622t.isBlank((String) next)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: b */
    public static final ProductListParam m118086b(@C12579k ProductListSource productListSource, @C12579k C38162k kVar) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(productListSource, "<this>");
        Intrinsics.checkNotNullParameter(kVar, "serviceSelection");
        String str4 = null;
        if (productListSource instanceof ProductListSource.Department) {
            String a = C28762j0.m119068a(kVar);
            ProductListSource.Department department = (ProductListSource.Department) productListSource;
            String n = department.mo82059d().mo117294n();
            List<String> a2 = m118085a(department.mo82059d());
            List<String> r = department.mo82059d().mo117298r();
            StoreService f = kVar.mo119354f();
            if (f != null) {
                str3 = f.mo119167K();
            } else {
                str3 = null;
            }
            StoreService f2 = kVar.mo119354f();
            if (f2 != null) {
                str4 = f2.mo119164H();
            }
            return new ProductListParam.Department(a, n, a2, r, str3, str4);
        } else if (productListSource instanceof ProductListSource.Promo) {
            String a3 = C28762j0.m119068a(kVar);
            StoreService f3 = kVar.mo119354f();
            if (f3 != null) {
                str2 = f3.mo119167K();
            } else {
                str2 = null;
            }
            StoreService f4 = kVar.mo119354f();
            if (f4 != null) {
                str4 = f4.mo119164H();
            }
            return new ProductListParam.Promo(a3, str2, str4);
        } else if (productListSource instanceof ProductListSource.Search) {
            String a4 = C28762j0.m119068a(kVar);
            String d = ((ProductListSource.Search) productListSource).mo82101d();
            StoreService f5 = kVar.mo119354f();
            if (f5 != null) {
                str = f5.mo119167K();
            } else {
                str = null;
            }
            StoreService f6 = kVar.mo119354f();
            if (f6 != null) {
                str4 = f6.mo119164H();
            }
            return new ProductListParam.Search(a4, d, str, str4, (DefaultConstructorMarker) null);
        } else if (productListSource instanceof ProductListSource.Query) {
            return new ProductListParam.Query(C28762j0.m119068a(kVar), ((ProductListSource.Query) productListSource).mo82089d());
        } else {
            if (productListSource instanceof ProductListSource.MixingBottomSheet) {
                return new ProductListParam.Gtins(C28762j0.m119068a(kVar), ((ProductListSource.MixingBottomSheet) productListSource).mo82071d(), false, 4, (DefaultConstructorMarker) null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
