package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.p046io.NoCouponToUpdateException;
import com.carrefour.fid.android.shared.p046io.NoFidCardException;
import com.carrefour.fid.android.shared.p046io.UpdateCouponFromDetailsException;
import com.carrefour.fid.android.shared.p046io.UpdatingCouponsException;
import com.urbanairship.iam.events.C9175a;
import java.util.StringJoiner;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.b */
public final class C23842b {

    /* renamed from: a */
    public static final int f59954a = 1;

    /* renamed from: b */
    public static final int f59955b = 2;

    @C12579k
    /* renamed from: a */
    public static final Pair<String, String> m105566a(@C12579k Context context, boolean z, boolean z2, boolean z3, boolean z4, @C12580l Throwable th) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        int i = 1;
        if (th != null) {
            if (!(th instanceof UpdateCouponFromDetailsException)) {
                i = Intrinsics.areEqual((Object) th, (Object) UpdatingCouponsException.f70564a);
            }
            if (i != 0) {
                return new Pair<>(context.getString(R.string.coupon_update_from_details_failed_title), context.getString(R.string.coupon_add_coupons_body_error));
            }
            if (th instanceof NoFidCardException) {
                return new Pair<>(context.getString(R.string.coupon_update_from_details_failed_title), context.getString(R.string.loyalty_message_no_card_fid));
            }
            if (th instanceof NoCouponToUpdateException) {
                return new Pair<>(context.getString(R.string.coupon_update_from_details_failed_title), context.getString(R.string.no_coupon_to_update));
            }
            if (z2) {
                return new Pair<>(context.getString(R.string.coupon_add_coupons_title_error), context.getString(R.string.coupon_add_coupons_body_error));
            }
            return new Pair<>(context.getString(R.string.coupon_remove_coupons_title_error), context.getString(R.string.coupon_add_coupons_body_error));
        }
        if (z3) {
            i = 2;
        }
        String quantityString = context.getResources().getQuantityString(R.plurals.coupon_update_title, i);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…n_update_title, quantity)");
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add(context.getResources().getQuantityString(R.plurals.coupon_update_text_your_coupon, i));
        if (z) {
            stringJoiner.add(context.getResources().getQuantityString(R.plurals.coupon_update_status, i));
            if (!z3) {
                if (z2) {
                    stringJoiner.add(context.getString(R.string.coupon_single_activation));
                } else {
                    stringJoiner.add(context.getString(R.string.coupon_single_deactivation));
                }
            }
        } else if (z2) {
            stringJoiner.add(context.getResources().getQuantityString(R.plurals.coupon_update_successfully, i));
        } else {
            if (z4) {
                stringJoiner.add(context.getString(R.string.coupon_modifiable));
            }
            stringJoiner.add(context.getResources().getQuantityString(R.plurals.coupon_has_been_updated_successfully, i));
        }
        return new Pair<>(quantityString, stringJoiner.toString());
    }
}
