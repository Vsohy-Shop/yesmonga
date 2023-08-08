package com.carrefour.fid.android.design.components.type;

import java.util.NoSuchElementException;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/type/ViewType;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ViewType {
    UNKNOWN(-1),
    TOP_VIEW(0),
    CONTENT(1);
    
    @C12579k

    /* renamed from: a */
    public static final C37128a f92958a = null;
    private final int value;

    @C11363r0({"SMAP\nViewType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewType.kt\ncom/carrefour/fid/android/design/components/type/ViewType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,13:1\n1109#2,2:14\n*S KotlinDebug\n*F\n+ 1 ViewType.kt\ncom/carrefour/fid/android/design/components/type/ViewType$Companion\n*L\n10#1:14,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.type.ViewType$a */
    public static final class C37128a {
        public /* synthetic */ C37128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ViewType mo112748a(int i) {
            boolean z;
            for (ViewType viewType : ViewType.values()) {
                if (viewType.mo112747q() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return viewType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public C37128a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f92958a = new C37128a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ViewType(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo112747q() {
        return this.value;
    }
}
