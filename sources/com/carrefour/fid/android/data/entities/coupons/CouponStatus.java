package com.carrefour.fid.android.data.entities.coupons;

import androidx.annotation.Keep;
import java.util.EnumSet;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Keep
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/CouponStatus;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "EMITTED", "LOADEDTOCARD", "INBASKET", "BURNT", "PRINTED", "EXPIRED", "UNLOADTOCARD", "UNKNOWN", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CouponStatus {
    EMITTED("EMITTED"),
    LOADEDTOCARD("LOADEDTOCARD"),
    INBASKET("INBASKET"),
    BURNT("BURNT"),
    PRINTED("PRINTED"),
    EXPIRED("EXPIRED"),
    UNLOADTOCARD("UNLOADTOCARD"),
    UNKNOWN("");
    
    @C12579k
    public static final C36421a Companion = null;
    /* access modifiers changed from: private */
    @C12579k
    public static final EnumSet<CouponStatus> available = null;
    /* access modifiers changed from: private */
    @C12579k
    public static final EnumSet<CouponStatus> burned = null;
    /* access modifiers changed from: private */
    @C12579k
    public static final EnumSet<CouponStatus> selected = null;
    @C12579k
    private final String type;

    /* renamed from: com.carrefour.fid.android.data.entities.coupons.CouponStatus$a */
    public static final class C36421a {
        public /* synthetic */ C36421a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final EnumSet<CouponStatus> mo110929a() {
            return CouponStatus.available;
        }

        @C12579k
        /* renamed from: b */
        public final EnumSet<CouponStatus> mo110930b() {
            return CouponStatus.burned;
        }

        @C12579k
        /* renamed from: c */
        public final EnumSet<CouponStatus> mo110931c() {
            return CouponStatus.selected;
        }

        public C36421a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        CouponStatus couponStatus;
        CouponStatus couponStatus2;
        CouponStatus couponStatus3;
        CouponStatus couponStatus4;
        CouponStatus couponStatus5;
        CouponStatus couponStatus6;
        Companion = new C36421a((DefaultConstructorMarker) null);
        EnumSet<CouponStatus> of = EnumSet.of(couponStatus, couponStatus2, couponStatus3, couponStatus6);
        Intrinsics.checkNotNullExpressionValue(of, "of(EMITTED, LOADEDTOCARD, INBASKET, UNLOADTOCARD)");
        available = of;
        EnumSet<CouponStatus> of2 = EnumSet.of(couponStatus2, couponStatus3);
        Intrinsics.checkNotNullExpressionValue(of2, "of(LOADEDTOCARD, INBASKET)");
        selected = of2;
        EnumSet<CouponStatus> of3 = EnumSet.of(couponStatus4, couponStatus5);
        Intrinsics.checkNotNullExpressionValue(of3, "of(BURNT, PRINTED)");
        burned = of3;
    }

    private CouponStatus(String str) {
        this.type = str;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }
}
