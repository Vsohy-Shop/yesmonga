package com.carrefour.fid.android.core.type;

import androidx.annotation.C0375v;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyCardType;", "", "", "value", "I", "w", "()I", "primaryDrawableId", "q", "secondaryDrawableId", "r", "<init>", "(Ljava/lang/String;IIII)V", "a", "b", "c", "d", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum LoyaltyCardType {
    PASS(0, R.drawable.ds_gr_double_pass_card, R.drawable.ic_loyalty_pass_home_page),
    FID(1, R.drawable.loyalty_fid, R.drawable.ic_loyalty_fid_home_page),
    NOT_EXIST(-1, 0, 0, 6, (int) null);
    
    @C12579k

    /* renamed from: a */
    public static final C36362a f89888a = null;
    private final int primaryDrawableId;
    private final int secondaryDrawableId;
    private final int value;

    /* renamed from: com.carrefour.fid.android.core.type.LoyaltyCardType$a */
    public static final class C36362a {
        public /* synthetic */ C36362a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final LoyaltyCardType mo108568a(int i) {
            if (i == 0) {
                return LoyaltyCardType.PASS;
            }
            if (i != 1) {
                return LoyaltyCardType.NOT_EXIST;
            }
            return LoyaltyCardType.FID;
        }

        public C36362a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f89888a = new C36362a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    LoyaltyCardType(int i, @C0375v int i2, @C0375v int i3) {
        this.value = i;
        this.primaryDrawableId = i2;
        this.secondaryDrawableId = i3;
    }

    /* renamed from: q */
    public final int mo108565q() {
        return this.primaryDrawableId;
    }

    /* renamed from: r */
    public final int mo108566r() {
        return this.secondaryDrawableId;
    }

    /* renamed from: w */
    public final int mo108567w() {
        return this.value;
    }
}
