package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n4513#2,5:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3392#1:3444,5\n*E\n"})
/* renamed from: androidx.compose.runtime.f1 */
public final class C8538f1 {
    @C12579k

    /* renamed from: a */
    public final List<Integer> f22975a;

    public C8538f1() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo16122a(int i) {
        if (!this.f22975a.isEmpty()) {
            if (this.f22975a.get(0).intValue() != i) {
                List<Integer> list = this.f22975a;
                if (list.get(list.size() - 1).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f22975a.size();
        this.f22975a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.f22975a.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.f22975a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.f22975a.set(size, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean mo16123b() {
        return this.f22975a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo16124c() {
        return !this.f22975a.isEmpty();
    }

    /* renamed from: d */
    public final int mo16125d() {
        return ((Number) CollectionsKt___CollectionsKt.m40706w2(this.f22975a)).intValue();
    }

    /* renamed from: e */
    public final int mo16126e() {
        boolean z;
        int intValue;
        if (this.f22975a.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = this.f22975a.get(0).intValue();
            while ((!this.f22975a.isEmpty()) && this.f22975a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f22975a;
                list.set(0, CollectionsKt___CollectionsKt.m40653k3(list));
                List<Integer> list2 = this.f22975a;
                list2.remove(list2.size() - 1);
                int size = this.f22975a.size();
                int size2 = this.f22975a.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = this.f22975a.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.f22975a.get(i3).intValue();
                    if (i2 < size && (intValue = this.f22975a.get(i2).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        this.f22975a.set(i, Integer.valueOf(intValue));
                        this.f22975a.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        this.f22975a.set(i, Integer.valueOf(intValue4));
                        this.f22975a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.m29774A("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: f */
    public final void mo16127f() {
        boolean z;
        int size = this.f22975a.size();
        int i = size / 2;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int i4 = i3 * 2;
            boolean z2 = true;
            if (this.f22975a.get(i2).intValue() >= this.f22975a.get(i4 - 1).intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i4 < size && this.f22975a.get(i2).intValue() < this.f22975a.get(i4).intValue()) {
                    z2 = false;
                }
                if (z2) {
                    i2 = i3;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public C8538f1(@C12579k List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f22975a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8538f1(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
