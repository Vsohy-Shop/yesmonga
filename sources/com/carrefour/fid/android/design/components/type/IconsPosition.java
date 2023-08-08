package com.carrefour.fid.android.design.components.type;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/type/IconsPosition;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum IconsPosition {
    LEFT(0),
    RIGHT(1),
    LEFT_RIGHT(2),
    UNKNOWN(-1);
    
    @C12579k

    /* renamed from: a */
    public static final C37124a f92936a = null;
    private final int value;

    @C11363r0({"SMAP\nIconsPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconsPosition.kt\ncom/carrefour/fid/android/design/components/type/IconsPosition$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.type.IconsPosition$a */
    public static final class C37124a {
        public /* synthetic */ C37124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final IconsPosition mo112740a(@C12580l Integer num) {
            IconsPosition iconsPosition;
            IconsPosition[] values = IconsPosition.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    iconsPosition = null;
                    break;
                }
                iconsPosition = values[i];
                if (num != null && iconsPosition.mo112739q() == num.intValue()) {
                    break;
                }
                i++;
            }
            return iconsPosition == null ? IconsPosition.UNKNOWN : iconsPosition;
        }

        public C37124a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f92936a = new C37124a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    IconsPosition(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo112739q() {
        return this.value;
    }
}
