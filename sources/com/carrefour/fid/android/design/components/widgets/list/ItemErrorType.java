package com.carrefour.fid.android.design.components.widgets.list;

import androidx.annotation.C0358n;
import com.carrefour.fid.android.design.components.C36896b;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/ItemErrorType;", "", "", "value", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "colorResId", "I", "q", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;I)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ItemErrorType {
    WARNING(0, C36896b.C36902f.ds_orange),
    ERROR(1, C36896b.C36902f.ds_brand_red),
    UNKNOWN(-1, 17170445);
    
    @C12579k

    /* renamed from: a */
    public static final C37259a f93439a = null;
    private final int colorResId;
    @C12580l
    private final Integer value;

    @C11363r0({"SMAP\nListItemUIModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemUIModel.kt\ncom/carrefour/fid/android/design/components/widgets/list/ItemErrorType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.widgets.list.ItemErrorType$a */
    public static final class C37259a {
        public /* synthetic */ C37259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ItemErrorType mo113427a(@C12580l Integer num) {
            ItemErrorType itemErrorType;
            ItemErrorType[] values = ItemErrorType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    itemErrorType = null;
                    break;
                }
                itemErrorType = values[i];
                if (Intrinsics.areEqual((Object) itemErrorType.mo113426r(), (Object) num)) {
                    break;
                }
                i++;
            }
            return itemErrorType == null ? ItemErrorType.UNKNOWN : itemErrorType;
        }

        public C37259a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f93439a = new C37259a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ItemErrorType(Integer num, @C0358n int i) {
        this.value = num;
        this.colorResId = i;
    }

    /* renamed from: q */
    public final int mo113425q() {
        return this.colorResId;
    }

    @C12580l
    /* renamed from: r */
    public final Integer mo113426r() {
        return this.value;
    }
}
