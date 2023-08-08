package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APIMProduct;
import com.carrefour.fid.android.data.entities.Product;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.i */
public final class C36452i {

    /* renamed from: a */
    public static final int f90112a = 2;

    /* renamed from: a */
    public static final boolean m149524a(@C12579k APIMProduct aPIMProduct) {
        Intrinsics.checkNotNullParameter(aPIMProduct, "<this>");
        Integer productType = aPIMProduct.getProductType();
        if (productType != null && productType.intValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m149525b(@C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        Integer productType = product.getProductType();
        if (productType != null && productType.intValue() == 2) {
            return true;
        }
        return false;
    }
}
