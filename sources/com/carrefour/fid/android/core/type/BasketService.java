package com.carrefour.fid.android.core.type;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/BasketService;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum BasketService {
    DELIVERY("HOME_DELIVERY"),
    DRIVE("PICKING_DRIVE"),
    UNKNOWN("");
    
    @C12579k

    /* renamed from: a */
    public static final C36350a f89828a = null;
    @C12580l
    private final String value;

    @C11363r0({"SMAP\nBasketServiceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketServiceType.kt\ncom/carrefour/fid/android/core/type/BasketService$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
    /* renamed from: com.carrefour.fid.android.core.type.BasketService$a */
    public static final class C36350a {
        public /* synthetic */ C36350a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final BasketService mo108475a(@C12580l String str) {
            BasketService basketService;
            BasketService[] values = BasketService.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    basketService = null;
                    break;
                }
                basketService = values[i];
                if (Intrinsics.areEqual((Object) basketService.mo108474q(), (Object) str)) {
                    break;
                }
                i++;
            }
            return basketService == null ? BasketService.UNKNOWN : basketService;
        }

        public C36350a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f89828a = new C36350a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    BasketService(String str) {
        this.value = str;
    }

    @C12580l
    /* renamed from: q */
    public final String mo108474q() {
        return this.value;
    }
}
