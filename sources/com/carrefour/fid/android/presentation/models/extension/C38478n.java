package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductEcoScore;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.shared.extension.C28746b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/ProductModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 ProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/ProductModelKt\n*L\n28#1:56\n28#1:57,3\n31#1:60\n31#1:61,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.n */
public final class C38478n {
    @C12579k
    /* renamed from: a */
    public static final Product m159655a(@C12579k ProductModel productModel) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        Integer num2;
        String str7;
        List list;
        List list2;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(productModel, "<this>");
        String s = productModel.mo121889s();
        String str10 = "";
        if (s == null) {
            s = str10;
        }
        String b = Gtin.m157308b(s);
        ProductCategoryDomain q = productModel.mo121887q();
        String str11 = null;
        if (q != null) {
            str = q.mo116510h();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = str10;
        } else {
            str2 = str;
        }
        ProductCategoryDomain q2 = productModel.mo121887q();
        if (q2 != null) {
            str3 = q2.mo116513j();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = str10;
        } else {
            str4 = str3;
        }
        ProductCategoryDomain q3 = productModel.mo121887q();
        if (q3 != null) {
            num = Integer.valueOf(q3.mo116512i());
        } else {
            num = null;
        }
        int g = C28746b0.m119036g(num);
        ProductCategoryDomain q4 = productModel.mo121887q();
        if (q4 != null) {
            str5 = q4.mo116514k();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = str10;
        } else {
            str6 = str5;
        }
        String str12 = new String();
        CategoryType categoryType = CategoryType.RAYON;
        List E = CollectionsKt__CollectionsKt.m40441E();
        List E2 = CollectionsKt__CollectionsKt.m40441E();
        ProductCategoryDomain q5 = productModel.mo121887q();
        if (q5 != null) {
            num2 = Integer.valueOf(q5.mo116512i());
        } else {
            num2 = null;
        }
        Integer valueOf = Integer.valueOf(C28746b0.m119036g(num2));
        ProductCategoryDomain q6 = productModel.mo121887q();
        if (q6 != null) {
            str7 = q6.mo116513j();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str7 = str10;
        }
        ProductCategory productCategory = new ProductCategory(str2, str4, g, str6, str12, categoryType, E2, E, C10975r0.m41401k(C11078d1.m42659a(valueOf, str7)));
        List<OfferFlag> t = productModel.mo121890t();
        if (t != null) {
            Iterable<OfferFlag> iterable = t;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (OfferFlag name : iterable) {
                list.add(OfferFlag.valueOf(name.name()));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List<ProductPictureDomain> u = productModel.mo121892u();
        if (u != null) {
            Iterable<ProductPictureDomain> iterable2 = u;
            list2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (ProductPictureDomain productPictureDomain : iterable2) {
                list2.add(new ProductPicture(productPictureDomain.mo116585e(), productPictureDomain.getOrder()));
            }
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        ProductNutriScore.C38063a aVar = ProductNutriScore.f96151a;
        ProductNutriScore v = productModel.mo121893v();
        if (v != null) {
            str11 = v.mo118184q();
        }
        ProductNutriScore a = aVar.mo118185a(str11);
        String w = productModel.mo121894w();
        if (w == null) {
            str8 = str10;
        } else {
            str8 = w;
        }
        String x = productModel.mo121896x();
        if (x == null) {
            str9 = str10;
        } else {
            str9 = x;
        }
        String y = productModel.mo121897y();
        if (y == null) {
            y = str10;
        }
        String b2 = ProductReference.m157466b(y);
        String z = productModel.mo121898z();
        if (z != null) {
            str10 = z;
        }
        return new Product(b, productCategory, list, list2, a, str8, str9, b2, str10, "", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (ProductEcoScore) null, (String) null, CollectionsKt__CollectionsKt.m40441E(), (String) null, (List) null, (List) null, productModel.mo121867A(), productModel.mo121886p(), productModel.mo121888r(), 25427968, (DefaultConstructorMarker) null);
    }
}
