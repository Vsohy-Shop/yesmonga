package com.carrefour.fid.android.data.entities.coupons;

import androidx.annotation.Keep;
import java.util.EnumSet;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@Keep
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/CouponType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "ECOUPON", "OMNICOUPON", "DIGIT", "CVU", "UNKNOWN", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CouponType {
    ECOUPON("ECOUPON"),
    OMNICOUPON("OMNICOUPON"),
    DIGIT("DIGIT"),
    CVU("CVU"),
    UNKNOWN("");
    
    @C12579k
    public static final C36422a Companion = null;
    /* access modifiers changed from: private */
    public static final EnumSet<CouponType> inStore = null;
    /* access modifiers changed from: private */
    public static final EnumSet<CouponType> online = null;
    @C12579k
    private final String type;

    /* renamed from: com.carrefour.fid.android.data.entities.coupons.CouponType$a */
    public static final class C36422a {
        public /* synthetic */ C36422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumSet<CouponType> mo110933a() {
            return CouponType.inStore;
        }

        /* renamed from: b */
        public final EnumSet<CouponType> mo110934b() {
            return CouponType.online;
        }

        public C36422a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        CouponType couponType;
        CouponType couponType2;
        CouponType couponType3;
        Companion = new C36422a((DefaultConstructorMarker) null);
        online = EnumSet.of(couponType2);
        inStore = EnumSet.of(couponType2, couponType, couponType3);
    }

    private CouponType(String str) {
        this.type = str;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }
}
