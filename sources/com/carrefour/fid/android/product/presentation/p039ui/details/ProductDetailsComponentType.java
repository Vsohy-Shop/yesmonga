package com.carrefour.fid.android.product.presentation.p039ui.details;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsComponentType;", "", "", "stringResId", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsComponentType */
public enum ProductDetailsComponentType {
    DESCRITPION(C27609f.C27627r.description),
    COMPOSITION(C27609f.C27627r.ingredients_composition),
    TRACEABILITY(C27609f.C27627r.traceabilitiy),
    ADVICE(C27609f.C27627r.advice_and_consumption),
    CHARACTERISTICS(C27609f.C27627r.product_characteristics);
    
    private final int stringResId;

    /* access modifiers changed from: public */
    ProductDetailsComponentType(@C0324b1 int i) {
        this.stringResId = i;
    }

    /* renamed from: q */
    public final int mo80551q() {
        return this.stringResId;
    }
}
