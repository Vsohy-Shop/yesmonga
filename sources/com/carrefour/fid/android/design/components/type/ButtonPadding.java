package com.carrefour.fid.android.design.components.type;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/type/ButtonPadding;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ButtonPadding {
    LARGE(0),
    SMALL(1);
    
    @C12579k

    /* renamed from: a */
    public static final C37120a f92918a = null;
    private final int value;

    @C11363r0({"SMAP\nButtonPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonPadding.kt\ncom/carrefour/fid/android/design/components/type/ButtonPadding$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.type.ButtonPadding$a */
    public static final class C37120a {
        public /* synthetic */ C37120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ButtonPadding mo112732a(@C12580l Integer num) {
            ButtonPadding buttonPadding;
            ButtonPadding[] values = ButtonPadding.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    buttonPadding = null;
                    break;
                }
                buttonPadding = values[i];
                if (num != null && buttonPadding.mo112731q() == num.intValue()) {
                    break;
                }
                i++;
            }
            return buttonPadding == null ? ButtonPadding.LARGE : buttonPadding;
        }

        public C37120a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f92918a = new C37120a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ButtonPadding(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo112731q() {
        return this.value;
    }
}
