package androidx.compose.runtime;

import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.runtime.a */
public abstract class C8403a<T> implements C8428d<T> {

    /* renamed from: d */
    public static final int f22757d = 8;

    /* renamed from: a */
    public final T f22758a;
    @C12579k

    /* renamed from: b */
    public final List<T> f22759b = new ArrayList();

    /* renamed from: c */
    public T f22760c;

    public C8403a(T t) {
        this.f22758a = t;
        this.f22760c = t;
    }

    /* renamed from: a */
    public T mo15321a() {
        return this.f22760c;
    }

    public final void clear() {
        this.f22759b.clear();
        mo15329p(this.f22758a);
        mo15327n();
    }

    /* renamed from: i */
    public void mo15323i(T t) {
        this.f22759b.add(mo15321a());
        mo15329p(t);
    }

    /* renamed from: k */
    public void mo15324k() {
        if (!this.f22759b.isEmpty()) {
            List<T> list = this.f22759b;
            mo15329p(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l */
    public final T mo15325l() {
        return this.f22758a;
    }

    /* renamed from: m */
    public final void mo15326m(@C12579k List<T> list, int i, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i > i2) {
            i4 = i2;
        } else {
            i4 = i2 - i3;
        }
        if (i3 != 1) {
            List<T> subList = list.subList(i, i3 + i);
            List T5 = CollectionsKt___CollectionsKt.m40572T5(subList);
            subList.clear();
            list.addAll(i4, T5);
        } else if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    /* renamed from: n */
    public abstract void mo15327n();

    /* renamed from: o */
    public final void mo15328o(@C12579k List<T> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    /* renamed from: p */
    public void mo15329p(T t) {
        this.f22760c = t;
    }
}
