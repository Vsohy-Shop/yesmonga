package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import com.carrefour.fid.android.domain.exceptions.BasketItemMaxQuantityReachedThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketThrowable;
import com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.models.extensions.C27657a;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27906t;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.s */
public final class C27905s {
    @C12579k
    /* renamed from: a */
    public static final C27906t m117073a(@C12580l Throwable th, @C12579k Context context) {
        Throwable th2;
        C27906t aVar;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (th instanceof BasketItemMaxQuantityReachedThrowable) {
            String string = context.getString(C27609f.C27627r.fec_basket_module_category_limit_excecced);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_category_limit_excecced)");
            return new C27906t.C27909c(string);
        }
        if (th instanceof CategoryLimitationExceededThrowable) {
            aVar = new C27906t.C27909c(C27657a.m116359a(((CategoryLimitationExceededThrowable) th).mo114268a(), context));
        } else if (th instanceof BasketItemQuantityExceededThrowable) {
            String string2 = context.getString(C27609f.C27627r.fec_basket_module_product_quantity_excecced);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…roduct_quantity_excecced)");
            return new C27906t.C27907a(string2);
        } else if (th instanceof BasketThrowable) {
            String string3 = context.getString(((BasketThrowable) th).mo114267a().mo114265q());
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(exception.error.resourceId)");
            aVar = new C27906t.C27907a(string3);
        } else if (th instanceof NetworkException) {
            C28935i iVar = C28935i.f70940a;
            NetworkException networkException = (NetworkException) th;
            String message = networkException.getMessage();
            Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
            Throwable cause = networkException.getCause();
            if (cause == null) {
                th2 = th;
            } else {
                th2 = cause;
            }
            C28935i.m119705e(iVar, message, th2, 0, 4, (Object) null);
            String string4 = context.getString(C27609f.C27627r.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…error_no_network_message)");
            return new C27906t.C27907a(string4);
        } else {
            String string5 = context.getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…server_not_responding_03)");
            return new C27906t.C27907a(string5);
        }
        return aVar;
    }

    @C12579k
    /* renamed from: b */
    public static final C27906t m117074b(boolean z, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (z) {
            str = context.getString(C27609f.C27627r.pdp_add_to_cart_lad_success);
        } else {
            str = context.getString(C27609f.C27627r.pdp_add_to_cart_success);
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (isHomeDeliveryNal) {…dd_to_cart_success)\n    }");
        return new C27906t.C27908b(str);
    }
}
