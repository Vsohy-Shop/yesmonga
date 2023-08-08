package com.carrefour.fid.android.domain.models.basket;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketType;", "", "", "type", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum BasketType {
    BASKET_V4_ADDITIONAL_ORDER("ADDITIONAL_ORDER"),
    BASKET_V4_DRIVE("DRIVE_CLCV"),
    BASKET_V4_EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
    BASKET_V4_MARKETPLACE("MARKETPLACE"),
    BASKET_V4_HOME_DELIVERY_NAL("HOME_DELIVERY_NAL"),
    NONE(new String());
    
    @C12579k

    /* renamed from: a */
    public static final C37966a f95520a = null;
    @C12579k
    private final String type;

    @C11363r0({"SMAP\nBasketType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketType.kt\ncom/carrefour/fid/android/domain/models/basket/BasketType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,31:1\n1282#2,2:32\n*S KotlinDebug\n*F\n+ 1 BasketType.kt\ncom/carrefour/fid/android/domain/models/basket/BasketType$Companion\n*L\n14#1:32,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketType$a */
    public static final class C37966a {
        public /* synthetic */ C37966a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final BasketType mo117009a(@C12580l String str) {
            BasketType basketType;
            BasketType[] values = BasketType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    basketType = null;
                    break;
                }
                basketType = values[i];
                if (Intrinsics.areEqual((Object) basketType.mo117008q(), (Object) str)) {
                    break;
                }
                i++;
            }
            if (basketType == null) {
                return BasketType.BASKET_V4_DRIVE;
            }
            return basketType;
        }

        public C37966a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f95520a = new C37966a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    BasketType(String str) {
        this.type = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo117008q() {
        return this.type;
    }
}
