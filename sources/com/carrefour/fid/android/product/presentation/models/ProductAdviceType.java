package com.carrefour.fid.android.product.presentation.models;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/models/ProductAdviceType;", "", "", "value", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "", "stringResId", "I", "q", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "b", "c", "d", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ProductAdviceType {
    WARNING_ADVICES("warning_advices", C27609f.C27627r.warning_advices),
    STORAGE_MODE("storage_mode", C27609f.C27627r.storage_mode),
    CONSUMER_ADVICE("consumer_advice", C27609f.C27627r.consumer_advice),
    SERVICE_CENTER_CONTACT("service_center_contact", C27609f.C27627r.service_center_contact);
    
    private final int stringResId;
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    ProductAdviceType(String str, @C0324b1 int i) {
        this.value = str;
        this.stringResId = i;
    }

    /* renamed from: q */
    public final int mo80299q() {
        return this.stringResId;
    }

    @C12579k
    /* renamed from: r */
    public final String mo80300r() {
        return this.value;
    }
}
