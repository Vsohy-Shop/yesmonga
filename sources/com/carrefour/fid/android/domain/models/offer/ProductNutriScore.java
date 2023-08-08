package com.carrefour.fid.android.domain.models.offer;

import com.google.zxing.client.android.C34651e;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/ProductNutriScore;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ProductNutriScore {
    A("a"),
    B("b"),
    C("c"),
    D("d"),
    E(C34651e.f83829d);
    
    @C12579k

    /* renamed from: a */
    public static final C38063a f96151a = null;
    @C12579k
    private final String value;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.ProductNutriScore$a */
    public static final class C38063a {
        public /* synthetic */ C38063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final ProductNutriScore mo118185a(@C12580l String str) {
            ProductNutriScore productNutriScore = ProductNutriScore.A;
            if (C11622t.equals(productNutriScore.mo118184q(), str, true)) {
                return productNutriScore;
            }
            ProductNutriScore productNutriScore2 = ProductNutriScore.B;
            if (C11622t.equals(productNutriScore2.mo118184q(), str, true)) {
                return productNutriScore2;
            }
            ProductNutriScore productNutriScore3 = ProductNutriScore.C;
            if (C11622t.equals(productNutriScore3.mo118184q(), str, true)) {
                return productNutriScore3;
            }
            ProductNutriScore productNutriScore4 = ProductNutriScore.D;
            if (C11622t.equals(productNutriScore4.mo118184q(), str, true)) {
                return productNutriScore4;
            }
            ProductNutriScore productNutriScore5 = ProductNutriScore.E;
            if (C11622t.equals(productNutriScore5.mo118184q(), str, true)) {
                return productNutriScore5;
            }
            return null;
        }

        public C38063a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f96151a = new C38063a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ProductNutriScore(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo118184q() {
        return this.value;
    }
}
