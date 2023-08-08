package com.carrefour.fid.android.design.components.type;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/type/TextAlignmentPosition;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "f", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum TextAlignmentPosition {
    GRAVITY(0),
    CENTER(1),
    VIEW_START(2),
    VIEW_END(3),
    UNKNOWN(-1);
    
    @C12579k

    /* renamed from: a */
    public static final C37127a f92951a = null;
    private final int value;

    @C11363r0({"SMAP\nTextAlignmentPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAlignmentPosition.kt\ncom/carrefour/fid/android/design/components/type/TextAlignmentPosition$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.type.TextAlignmentPosition$a */
    public static final class C37127a {
        public /* synthetic */ C37127a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final TextAlignmentPosition mo112746a(@C12580l Integer num) {
            TextAlignmentPosition textAlignmentPosition;
            boolean z;
            TextAlignmentPosition[] values = TextAlignmentPosition.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    textAlignmentPosition = null;
                    break;
                }
                textAlignmentPosition = values[i];
                int q = textAlignmentPosition.mo112745q();
                if (num != null && q == num.intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (textAlignmentPosition == null) {
                return TextAlignmentPosition.UNKNOWN;
            }
            return textAlignmentPosition;
        }

        public C37127a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f92951a = new C37127a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    TextAlignmentPosition(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo112745q() {
        return this.value;
    }
}
