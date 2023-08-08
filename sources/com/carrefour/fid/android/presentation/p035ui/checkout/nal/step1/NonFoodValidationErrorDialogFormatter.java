package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import android.content.Context;
import androidx.compose.p004ui.platform.C16007z3;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.C36984f;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.p046io.BasketCheckTotalAmountThrowable;
import com.carrefour.fid.android.shared.p046io.BasketContainsDigitalCardThrowable;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodValidationErrorDialogFormatter */
public final class NonFoodValidationErrorDialogFormatter {
    @C12579k

    /* renamed from: a */
    public final Context f59431a;

    public NonFoodValidationErrorDialogFormatter(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f59431a = context;
    }

    /* renamed from: b */
    public static /* synthetic */ C36984f m104694b(NonFoodValidationErrorDialogFormatter nonFoodValidationErrorDialogFormatter, Throwable th, C11289a aVar, double d, C16007z3 z3Var, C11300l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            d = 0.0d;
        }
        return nonFoodValidationErrorDialogFormatter.mo68894a(th, aVar, d, z3Var, lVar);
    }

    @C12579k
    /* renamed from: a */
    public final C36984f mo68894a(@C12579k Throwable th, @C12579k C11289a<C11079d2> aVar, double d, @C12579k C16007z3 z3Var, @C12579k C11300l<? super C23520c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(th, "error");
        Intrinsics.checkNotNullParameter(aVar, "closeDialog");
        Intrinsics.checkNotNullParameter(z3Var, "uriHandler");
        Intrinsics.checkNotNullParameter(lVar, "actioner");
        if (th instanceof BasketCheckTotalAmountThrowable) {
            String string = this.f59431a.getString(R.string.checkout_step_one_minimum_order_validation);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…minimum_order_validation)");
            String string2 = this.f59431a.getString(R.string.basket_delivery_amount_min_remaining, new Object[]{C28782t.m119105b(Double.valueOf(d))});
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(\n     …Euros()\n                )");
            String string3 = this.f59431a.getString(R.string.basket_nal_validation_error_cta_understood);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ion_error_cta_understood)");
            return new C36984f.C36985a(string, string2, string3, new NonFoodValidationErrorDialogFormatter$formatError$1(aVar));
        } else if (th instanceof BasketContainsDigitalCardThrowable) {
            String string4 = this.f59431a.getString(R.string.basket_nal_validation_digital_card_error_title);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…digital_card_error_title)");
            String string5 = this.f59431a.getString(R.string.basket_contains_digital_cards);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…t_contains_digital_cards)");
            String string6 = this.f59431a.getString(R.string.ok_uppercase);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.ok_uppercase)");
            String string7 = this.f59431a.getString(R.string.general_cancel);
            Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.general_cancel)");
            return new C36984f.C36986b(string4, string5, string6, string7, new NonFoodValidationErrorDialogFormatter$formatError$2(aVar, lVar, z3Var), new NonFoodValidationErrorDialogFormatter$formatError$3(aVar, lVar));
        } else {
            String string8 = this.f59431a.getString(R.string.basket_nal_validation_error_title);
            Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.stri…l_validation_error_title)");
            String string9 = this.f59431a.getString(R.string.basket_error_undefined);
            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.string.basket_error_undefined)");
            String string10 = this.f59431a.getString(R.string.ok_uppercase);
            Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.string.ok_uppercase)");
            return new C36984f.C36985a(string8, string9, string10, new NonFoodValidationErrorDialogFormatter$formatError$4(aVar));
        }
    }
}
