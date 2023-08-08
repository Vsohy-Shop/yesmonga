package com.carrefour.fid.android.product.presentation.models;

import androidx.annotation.C0375v;
import com.carrefour.fid.android.product.C27609f;
import com.google.zxing.client.android.C34651e;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/models/ProductEcoScore;", "", "", "value", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "", "resourceId", "I", "q", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ProductEcoScore {
    A("a", C27609f.C27617h.ds_pa_ecoscore_a_raw),
    B("b", C27609f.C27617h.ds_pa_ecoscore_b_raw),
    C("c", C27609f.C27617h.ds_pa_ecoscore_c_raw),
    D("d", C27609f.C27617h.ds_pa_ecoscore_d_raw),
    E(C34651e.f83829d, C27609f.C27617h.ds_pa_ecoscore_e_raw),
    DISABLED("disabled", C27609f.C27617h.ds_pa_ecoscore_disable_raw);
    
    @C12579k

    /* renamed from: a */
    public static final C27645a f67159a = null;
    private final int resourceId;
    @C12579k
    private final String value;

    /* renamed from: com.carrefour.fid.android.product.presentation.models.ProductEcoScore$a */
    public static final class C27645a {
        public /* synthetic */ C27645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final ProductEcoScore mo80319a(@C12580l String str) {
            ProductEcoScore productEcoScore = ProductEcoScore.A;
            if (C11622t.equals(productEcoScore.mo80318r(), str, true)) {
                return productEcoScore;
            }
            ProductEcoScore productEcoScore2 = ProductEcoScore.B;
            if (C11622t.equals(productEcoScore2.mo80318r(), str, true)) {
                return productEcoScore2;
            }
            ProductEcoScore productEcoScore3 = ProductEcoScore.C;
            if (C11622t.equals(productEcoScore3.mo80318r(), str, true)) {
                return productEcoScore3;
            }
            ProductEcoScore productEcoScore4 = ProductEcoScore.D;
            if (C11622t.equals(productEcoScore4.mo80318r(), str, true)) {
                return productEcoScore4;
            }
            ProductEcoScore productEcoScore5 = ProductEcoScore.E;
            if (C11622t.equals(productEcoScore5.mo80318r(), str, true)) {
                return productEcoScore5;
            }
            ProductEcoScore productEcoScore6 = ProductEcoScore.DISABLED;
            if (C11622t.equals(productEcoScore6.mo80318r(), str, true)) {
                return productEcoScore6;
            }
            return null;
        }

        public C27645a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f67159a = new C27645a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ProductEcoScore(String str, @C0375v int i) {
        this.value = str;
        this.resourceId = i;
    }

    /* renamed from: q */
    public final int mo80317q() {
        return this.resourceId;
    }

    @C12579k
    /* renamed from: r */
    public final String mo80318r() {
        return this.value;
    }
}
