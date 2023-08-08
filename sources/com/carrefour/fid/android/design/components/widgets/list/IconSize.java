package com.carrefour.fid.android.design.components.widgets.list;

import androidx.annotation.C0364q;
import com.carrefour.fid.android.design.components.C36896b;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/IconSize;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "f", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum IconSize {
    XS(C36896b.C36903g.ds_component_list_item_image_xs),
    f93434c(C36896b.C36903g.ds_component_list_item_image_s),
    M(C36896b.C36903g.ds_component_list_item_image_m),
    f93436e(C36896b.C36903g.ds_component_list_item_image_l),
    XL(C36896b.C36903g.ds_component_list_item_image_xl);
    
    @C12579k

    /* renamed from: a */
    public static final C37258a f93432a = null;
    private final int value;

    @C11363r0({"SMAP\nListItemUIModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemUIModel.kt\ncom/carrefour/fid/android/design/components/widgets/list/IconSize$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.widgets.list.IconSize$a */
    public static final class C37258a {
        public /* synthetic */ C37258a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final IconSize mo113424a(int i) {
            IconSize iconSize;
            IconSize[] values = IconSize.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    iconSize = null;
                    break;
                }
                iconSize = values[i2];
                if (iconSize.mo113423q() == i) {
                    break;
                }
                i2++;
            }
            return iconSize == null ? IconSize.M : iconSize;
        }

        public C37258a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f93432a = new C37258a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    IconSize(@C0364q int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo113423q() {
        return this.value;
    }
}
