package com.carrefour.fid.android.core.type;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/OrderCategoryType;", "", "", "title", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum OrderCategoryType {
    MISSING_PRODUCTS(R.string.order_missing_product_category),
    REPLACEMENT_PRODUCTS(R.string.order_replacement_product_category);
    
    private final int title;

    /* access modifiers changed from: public */
    OrderCategoryType(@C0324b1 int i) {
        this.title = i;
    }

    /* renamed from: q */
    public final int mo108569q() {
        return this.title;
    }
}
