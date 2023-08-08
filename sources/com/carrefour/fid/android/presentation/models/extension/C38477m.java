package com.carrefour.fid.android.presentation.models.extension;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.core.type.DepartmentCategoryType;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase;
import com.carrefour.fid.android.domain.models.ProductListFilter;
import com.carrefour.fid.android.presentation.models.DepartmentHeaderModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.shared.p046io.DepartmentLevelThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.m */
public final class C38477m {
    /* renamed from: a */
    public static final String m159641a(ProductListSettingsModel productListSettingsModel) {
        String o;
        if (productListSettingsModel.mo121858w() == null) {
            DepartmentHeaderModel u = productListSettingsModel.mo121856u();
            if (u != null) {
                return u.mo121563o();
            }
            return null;
        }
        DepartmentHeaderModel v = productListSettingsModel.mo121857v();
        if (v != null && (o = v.mo121563o()) != null) {
            return o;
        }
        DepartmentHeaderModel u2 = productListSettingsModel.mo121856u();
        if (u2 != null) {
            return u2.mo121563o();
        }
        return null;
    }

    @C12580l
    /* renamed from: b */
    public static final String m159642b(@C12579k ProductListSettingsModel productListSettingsModel) {
        String o;
        Intrinsics.checkNotNullParameter(productListSettingsModel, "<this>");
        if (productListSettingsModel.mo121829E()) {
            return productListSettingsModel.mo121860x();
        }
        if (productListSettingsModel.mo121830F()) {
            return productListSettingsModel.mo121825A();
        }
        DepartmentHeaderModel w = productListSettingsModel.mo121858w();
        if (w != null && (o = w.mo121563o()) != null) {
            return o;
        }
        DepartmentHeaderModel v = productListSettingsModel.mo121857v();
        if (v != null) {
            return v.mo121563o();
        }
        DepartmentHeaderModel u = productListSettingsModel.mo121856u();
        if (u != null) {
            return u.mo121563o();
        }
        return null;
    }

    @C12579k
    /* renamed from: c */
    public static final String m159643c(@C12579k DepartmentHeaderModel departmentHeaderModel) {
        boolean z;
        Intrinsics.checkNotNullParameter(departmentHeaderModel, "<this>");
        if (departmentHeaderModel.mo121558j() == DepartmentCategoryType.DUPLICATE) {
            String l = departmentHeaderModel.mo121560l();
            if (l == null || l.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return departmentHeaderModel.mo121560l();
            }
        }
        return departmentHeaderModel.mo121562n().toString();
    }

    /* renamed from: d */
    public static final Pair<String, String> m159644d(ProductListSettingsModel productListSettingsModel) {
        boolean z = false;
        if (productListSettingsModel.mo121858w() != null) {
            String m = productListSettingsModel.mo121858w().mo121561m();
            if (m == null || m.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            return C11078d1.m42659a(productListSettingsModel.mo121858w().mo121561m(), m159643c(productListSettingsModel.mo121858w()));
        } else if (productListSettingsModel.mo121857v() != null) {
            String m2 = productListSettingsModel.mo121857v().mo121561m();
            if (m2 == null || m2.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            return C11078d1.m42659a(productListSettingsModel.mo121857v().mo121561m(), m159643c(productListSettingsModel.mo121857v()));
        } else if (productListSettingsModel.mo121856u() != null) {
            String m3 = productListSettingsModel.mo121856u().mo121561m();
            if (m3 == null || m3.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            return C11078d1.m42659a(productListSettingsModel.mo121856u().mo121561m(), m159643c(productListSettingsModel.mo121856u()));
        } else {
            C28935i.m119704b(C28935i.f70940a, "No department for any level for " + productListSettingsModel, (Throwable) null, 0, 6, (Object) null);
            throw new DepartmentLevelThrowable();
        }
    }

    @C12579k
    /* renamed from: e */
    public static final String m159645e(@C12579k ProductListSettingsModel productListSettingsModel) {
        String str;
        String o;
        Intrinsics.checkNotNullParameter(productListSettingsModel, "<this>");
        DepartmentHeaderModel w = productListSettingsModel.mo121858w();
        if (w != null && (o = w.mo121563o()) != null) {
            return o;
        }
        DepartmentHeaderModel v = productListSettingsModel.mo121857v();
        if (v != null) {
            return v.mo121563o();
        }
        DepartmentHeaderModel u = productListSettingsModel.mo121856u();
        if (u != null) {
            str = u.mo121563o();
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @C12579k
    /* renamed from: f */
    public static final GetProductListUseCase.C37766a m159646f(@C12579k ProductListSettingsModel productListSettingsModel, boolean z, int i, @C12580l Integer num, @C12580l RequestType requestType, @C12580l RequestType requestType2) {
        boolean z2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(productListSettingsModel, "<this>");
        if (productListSettingsModel.mo121829E()) {
            C28935i.m119704b(C28935i.f70940a, "getProductsForPromo: group_8, productFrom=" + i2 + "\"", (Throwable) null, 0, 6, (Object) null);
            String h = m159648h(productListSettingsModel);
            String i3 = m159649i(productListSettingsModel);
            SortModel B = productListSettingsModel.mo121826B();
            if (B == null) {
                B = SortModel.f97547c.mo121952a();
            }
            return new GetProductListUseCase.C37766a(z, i, num, i3, h, (String) null, B, productListSettingsModel.mo121853s(), CollectionsKt__CollectionsKt.m40448L(ProductListFilter.SliceAvailable, ProductListFilter.Eligible), (Pair) null, requestType, requestType2, true, productListSettingsModel.mo121854t(), 544, (DefaultConstructorMarker) null);
        } else if (productListSettingsModel.mo121830F()) {
            C28935i.m119704b(C28935i.f70940a, "getProductsByText: " + productListSettingsModel.mo121825A() + ", productFrom=" + i2 + "\"", (Throwable) null, 0, 6, (Object) null);
            String A = productListSettingsModel.mo121825A();
            if (A == null) {
                A = "";
            }
            String str = A;
            SortModel B2 = productListSettingsModel.mo121826B();
            if (B2 == null) {
                B2 = SortModel.f97547c.mo121952a();
            }
            return new GetProductListUseCase.C37766a(z, i, num, (String) null, (String) null, str, B2, productListSettingsModel.mo121853s(), CollectionsKt__CollectionsKt.m40448L(ProductListFilter.SliceAvailable, ProductListFilter.Eligible), (Pair) null, requestType, requestType2, false, productListSettingsModel.mo121854t(), 536, (DefaultConstructorMarker) null);
        } else {
            String z3 = productListSettingsModel.mo121862z();
            if (z3 == null || z3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C28935i.m119704b(C28935i.f70940a, "getProductsByQueryId: " + productListSettingsModel.mo121862z() + ", productFrom=" + i2 + "\"", (Throwable) null, 0, 6, (Object) null);
                String z4 = productListSettingsModel.mo121862z();
                SortModel B3 = productListSettingsModel.mo121826B();
                if (B3 == null) {
                    B3 = SortModel.f97547c.mo121952a();
                }
                return new GetProductListUseCase.C37766a(z, i, num, z4, (String) null, (String) null, B3, productListSettingsModel.mo121853s(), CollectionsKt__CollectionsKt.m40448L(ProductListFilter.SliceAvailable, ProductListFilter.Eligible), (Pair) null, requestType, requestType2, false, productListSettingsModel.mo121854t(), 4656, (DefaultConstructorMarker) null);
            }
            C28935i.m119704b(C28935i.f70940a, "getProductsByFilter, productFrom=" + i2, (Throwable) null, 0, 6, (Object) null);
            SortModel B4 = productListSettingsModel.mo121826B();
            if (B4 == null) {
                B4 = SortModel.f97547c.mo121952a();
            }
            return new GetProductListUseCase.C37766a(z, i, num, (String) null, (String) null, (String) null, B4, productListSettingsModel.mo121853s(), CollectionsKt__CollectionsKt.m40448L(ProductListFilter.SliceAvailable, ProductListFilter.Eligible), m159644d(productListSettingsModel), requestType, requestType2, false, productListSettingsModel.mo121854t(), 56, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ GetProductListUseCase.C37766a m159647g(ProductListSettingsModel productListSettingsModel, boolean z, int i, Integer num, RequestType requestType, RequestType requestType2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            requestType = RequestType.NONE;
        }
        RequestType requestType3 = requestType;
        if ((i2 & 16) != 0) {
            requestType2 = RequestType.NONE;
        }
        return m159646f(productListSettingsModel, z, i, num2, requestType3, requestType2);
    }

    /* renamed from: h */
    public static final String m159648h(ProductListSettingsModel productListSettingsModel) {
        boolean z;
        String y = productListSettingsModel.mo121861y();
        if (y == null || y.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "group_8";
        }
        if (C11622t.startsWith$default(productListSettingsModel.mo121861y(), "group_", false, 2, (Object) null)) {
            return productListSettingsModel.mo121861y();
        }
        return null;
    }

    /* renamed from: i */
    public static final String m159649i(ProductListSettingsModel productListSettingsModel) {
        if (productListSettingsModel.mo121861y() != null && !C11622t.startsWith$default(productListSettingsModel.mo121861y(), "group_", false, 2, (Object) null)) {
            return productListSettingsModel.mo121861y();
        }
        return null;
    }

    /* renamed from: j */
    public static final boolean m159650j(@C12579k ProductListSettingsModel productListSettingsModel) {
        Intrinsics.checkNotNullParameter(productListSettingsModel, "<this>");
        if (productListSettingsModel.mo121826B() == null || Intrinsics.areEqual((Object) productListSettingsModel.mo121826B(), (Object) SortModel.f97547c.mo121952a())) {
            return false;
        }
        return true;
    }

    @C12580l
    /* renamed from: k */
    public static final String m159651k(@C12579k ProductListSettingsModel productListSettingsModel, @C12579k Context context, int i, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(productListSettingsModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (!productListSettingsModel.mo121830F() && !productListSettingsModel.mo121829E()) {
            String z3 = productListSettingsModel.mo121862z();
            if (z3 == null || z3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return m159641a(productListSettingsModel);
            }
        }
        if (z) {
            return "";
        }
        if (i <= 0) {
            return context.getString(R.string.search_result_empty);
        }
        return context.getResources().getQuantityString(R.plurals.search_result, i, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: l */
    public static /* synthetic */ String m159652l(ProductListSettingsModel productListSettingsModel, Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m159651k(productListSettingsModel, context, i, z);
    }

    @C12580l
    /* renamed from: m */
    public static final String m159653m(@C12579k ProductListSettingsModel productListSettingsModel, int i, boolean z) {
        Intrinsics.checkNotNullParameter(productListSettingsModel, "<this>");
        if (i < 0 || productListSettingsModel.mo121830F() || productListSettingsModel.mo121829E() || z) {
            return m159642b(productListSettingsModel);
        }
        String b = m159642b(productListSettingsModel);
        if (b == null) {
            return null;
        }
        return b + C36306e.f89637a + i + ")";
    }

    /* renamed from: n */
    public static /* synthetic */ String m159654n(ProductListSettingsModel productListSettingsModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m159653m(productListSettingsModel, i, z);
    }
}
