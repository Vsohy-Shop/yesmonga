package com.carrefour.fid.android.design.components.type;

import java.util.NoSuchElementException;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/type/ButtonType;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ButtonType {
    NORMAL(0),
    CHECKBOX(1);
    
    @C12579k

    /* renamed from: a */
    public static final C37122a f92927a = null;
    private final int value;

    @C11363r0({"SMAP\nButtonType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonType.kt\ncom/carrefour/fid/android/design/components/type/ButtonType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,10:1\n1109#2,2:11\n*S KotlinDebug\n*F\n+ 1 ButtonType.kt\ncom/carrefour/fid/android/design/components/type/ButtonType$Companion\n*L\n8#1:11,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.type.ButtonType$a */
    public static final class C37122a {
        public /* synthetic */ C37122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ButtonType mo112736a(int i) {
            boolean z;
            for (ButtonType buttonType : ButtonType.values()) {
                if (buttonType.mo112735q() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return buttonType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public C37122a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f92927a = new C37122a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ButtonType(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo112735q() {
        return this.value;
    }
}
