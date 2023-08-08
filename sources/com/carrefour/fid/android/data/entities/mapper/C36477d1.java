package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36176g;
import com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.d1 */
public final class C36477d1 extends C28486g<OfferProductModel, ShoppingListItemToAddRequest> {

    /* renamed from: b */
    public static final int f90169b = 0;

    @C12579k
    /* renamed from: d */
    public ShoppingListItemToAddRequest mo72340a(@C12579k OfferProductModel offerProductModel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(offerProductModel, "entity");
        ProductModel o0 = offerProductModel.mo121517o0();
        String str6 = null;
        if (o0 != null) {
            str = o0.mo121896x();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str3 = o02.mo121889s();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str6 = o03.mo121898z();
        }
        if (str6 == null) {
            str5 = "";
        } else {
            str5 = str6;
        }
        return new ShoppingListItemToAddRequest(C36176g.f89300e, str2, str4, "PRODUCT", str5, 1, new String());
    }
}
