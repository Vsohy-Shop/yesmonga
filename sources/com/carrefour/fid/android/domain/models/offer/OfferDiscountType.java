package com.carrefour.fid.android.domain.models.offer;

import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import com.carrefour.fid.android.domain.C37479b;
import com.carrefour.fid.android.domain.models.category.C37993b;
import com.carrefour.fid.android.ecommerce.utils.C38217g;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "", "", "value", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "", "bgColorResId", "I", "q", "()I", "colorResId", "r", "iconResId", "w", "<init>", "(Ljava/lang/String;ILjava/lang/String;III)V", "a", "b", "c", "d", "e", "f", "g", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum OfferDiscountType {
    PROMO(C37993b.f95634a, r19, r20, 0, 8, (int) null),
    PF(C38217g.f96838b, r14, r15, 0, 8, (int) null),
    RD("RD", C37479b.C37483d.ds_specifics_loyalty_background, C37479b.C37483d.ds_primary_dark, C37479b.C37485f.ds_ic_diagonal_card_fid),
    RI("RI", r14, r15, 0, 8, (int) null),
    TA("TA", r14, r15, 0, 8, (int) null),
    BUNDLE("BUNDLE", 0, 0, 0, 14, (int) null);
    
    @C12579k

    /* renamed from: a */
    public static final C38058a f96009a = null;
    private final int bgColorResId;
    private final int colorResId;
    private final int iconResId;
    @C12579k
    private final String value;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.OfferDiscountType$a */
    public static final class C38058a {
        public /* synthetic */ C38058a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final OfferDiscountType mo118124a(@C12580l String str) {
            OfferDiscountType offerDiscountType;
            boolean z;
            OfferDiscountType[] values = OfferDiscountType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                offerDiscountType = null;
                if (i >= length) {
                    break;
                }
                OfferDiscountType offerDiscountType2 = values[i];
                if (str != null) {
                    z = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) offerDiscountType2.mo118123y(), false, 2, (Object) null);
                } else {
                    z = false;
                }
                if (z) {
                    offerDiscountType = offerDiscountType2;
                    break;
                }
                i++;
            }
            if (offerDiscountType == null) {
                return OfferDiscountType.TA;
            }
            return offerDiscountType;
        }

        public C38058a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f96009a = new C38058a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    OfferDiscountType(String str, @C0358n int i, @C0358n int i2, @C0375v int i3) {
        this.value = str;
        this.bgColorResId = i;
        this.colorResId = i2;
        this.iconResId = i3;
    }

    /* renamed from: q */
    public final int mo118120q() {
        return this.bgColorResId;
    }

    /* renamed from: r */
    public final int mo118121r() {
        return this.colorResId;
    }

    /* renamed from: w */
    public final int mo118122w() {
        return this.iconResId;
    }

    @C12579k
    /* renamed from: y */
    public final String mo118123y() {
        return this.value;
    }
}
