package com.carrefour.fid.android.design.components.type;

import java.util.NoSuchElementException;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/type/ProductButtonState;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ProductButtonState {
    NORMAL(0),
    PRESSED(1);
    
    @C12579k

    /* renamed from: a */
    public static final C37125a f92942a = null;
    private final int value;

    @C11363r0({"SMAP\nProductButtonState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductButtonState.kt\ncom/carrefour/fid/android/design/components/type/ProductButtonState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,10:1\n1109#2,2:11\n*S KotlinDebug\n*F\n+ 1 ProductButtonState.kt\ncom/carrefour/fid/android/design/components/type/ProductButtonState$Companion\n*L\n8#1:11,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.type.ProductButtonState$a */
    public static final class C37125a {
        public /* synthetic */ C37125a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ProductButtonState mo112742a(int i) {
            boolean z;
            for (ProductButtonState productButtonState : ProductButtonState.values()) {
                if (productButtonState.mo112741q() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return productButtonState;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public C37125a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f92942a = new C37125a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ProductButtonState(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo112741q() {
        return this.value;
    }
}
