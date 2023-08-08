package com.carrefour.fid.android.core.type;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/InfoProductsReplacementType;", "", "", "title", "I", "r", "()I", "description", "q", "<init>", "(Ljava/lang/String;III)V", "a", "b", "c", "d", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum InfoProductsReplacementType {
    PreparedReplacement(R.string.order_replacement_in_list_title, R.string.order_replacement_prepared_in_list_description),
    BilledReplacement(R.string.order_replacement_in_list_title, R.string.order_replacement_billed_in_list_description),
    BilledReplacementOutDated(R.string.order_replacement_in_list_title, R.string.order_replacement_billed_outdated_in_list_description),
    Unknown(-1, -1);
    
    private final int description;
    private final int title;

    /* access modifiers changed from: public */
    InfoProductsReplacementType(@C0324b1 int i, @C0324b1 int i2) {
        this.title = i;
        this.description = i2;
    }

    /* renamed from: q */
    public final int mo108508q() {
        return this.description;
    }

    /* renamed from: r */
    public final int mo108509r() {
        return this.title;
    }
}
