package com.carrefour.fid.android.core.type;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/BasketPromoErrorType;", "", "", "code", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "", "message", "I", "r", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum BasketPromoErrorType {
    BasketDiscountCode("FAILURE_CASE_DISCOUNT_CODE", R.string.checkout_code_promo_failure_case_discount_code),
    BasketDiscountAlreadyUsed("FAILURE_CASE_ALREADY_USED", R.string.checkout_code_promo_error_already_used),
    BasketDiscountStore("FAILURE_CASE_DISCOUNT_STORE", R.string.checkout_code_promo_error_discount_store),
    BasketDiscountAmount("FAILURE_CASE_DISCOUNT_AMOUNT", R.string.checkout_code_promo_error_discount_amount),
    BasketDiscountCustomerNew("FAILURE_CASE_DISCOUNT_CUSTOMER_NEW", R.string.checkout_code_promo_failure_case_discount_customer_new),
    BasketDiscountCustomerSegment("FAILURE_CASE_DISCOUNT_CUSTOMER_SEGMENT", R.string.checkout_code_promo_error_discount_customer_segment),
    BasketDiscountCustomer("FAILURE_CASE_DISCOUNT_CUSTOMER", R.string.checkout_code_promo_failure_case_discount_customer),
    BasketDiscountDate("FAILURE_CASE_DISCOUNT_DATE", R.string.checkout_code_promo_error_discount_date),
    BasketDiscountError("FAILURE_CASE_DISCOUNT_ERROR", R.string.checkout_code_promo_failure_case_discount_error),
    BasketDiscountSlot("FAILURE_CASE_DISCOUNT_SLOT", R.string.slot_not_found_code_promo_error),
    BasketDiscountWrongSlot("FAILURE_CASE_DISCOUNT_WRONG_SLOT", R.string.wrong_slot_code_promo_error);
    
    @C12579k

    /* renamed from: a */
    public static final C36349a f89816a = null;
    @C12579k
    private final String code;
    private final int message;

    @C11363r0({"SMAP\nBasketPromoErrorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketPromoErrorType.kt\ncom/carrefour/fid/android/core/type/BasketPromoErrorType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
    /* renamed from: com.carrefour.fid.android.core.type.BasketPromoErrorType$a */
    public static final class C36349a {
        public /* synthetic */ C36349a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final BasketPromoErrorType mo108473a(@C12579k String str) {
            BasketPromoErrorType basketPromoErrorType;
            Intrinsics.checkNotNullParameter(str, "code");
            BasketPromoErrorType[] values = BasketPromoErrorType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    basketPromoErrorType = null;
                    break;
                }
                basketPromoErrorType = values[i];
                if (Intrinsics.areEqual((Object) basketPromoErrorType.mo108471q(), (Object) str)) {
                    break;
                }
                i++;
            }
            if (basketPromoErrorType == null) {
                return BasketPromoErrorType.BasketDiscountCode;
            }
            return basketPromoErrorType;
        }

        public C36349a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f89816a = new C36349a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    BasketPromoErrorType(String str, @C0324b1 int i) {
        this.code = str;
        this.message = i;
    }

    @C12579k
    /* renamed from: q */
    public final String mo108471q() {
        return this.code;
    }

    /* renamed from: r */
    public final int mo108472r() {
        return this.message;
    }
}
