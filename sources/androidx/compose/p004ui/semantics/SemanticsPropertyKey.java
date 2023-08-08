package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey */
public final class SemanticsPropertyKey<T> {

    /* renamed from: c */
    public static final int f39765c = 0;
    @C12579k

    /* renamed from: a */
    public final String f39766a;
    @C12579k

    /* renamed from: b */
    public final C11304p<T, T, T> f39767b;

    public SemanticsPropertyKey(@C12579k String str, @C12579k C11304p<? super T, ? super T, ? extends T> pVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(pVar, "mergePolicy");
        this.f39766a = str;
        this.f39767b = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11304p<T, T, T> mo46082a() {
        return this.f39767b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo46083b() {
        return this.f39766a;
    }

    /* renamed from: c */
    public final T mo46084c(@C12579k C16044q qVar, @C12579k C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(qVar, "thisRef");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return SemanticsPropertiesKt.m72009d1();
    }

    @C12580l
    /* renamed from: d */
    public final T mo46085d(@C12580l T t, T t2) {
        return this.f39767b.invoke(t, t2);
    }

    /* renamed from: e */
    public final void mo46086e(@C12579k C16044q qVar, @C12579k C11510n<?> nVar, T t) {
        Intrinsics.checkNotNullParameter(qVar, "thisRef");
        Intrinsics.checkNotNullParameter(nVar, "property");
        qVar.mo46157e(this, t);
    }

    @C12579k
    public String toString() {
        return "SemanticsPropertyKey: " + this.f39766a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsPropertyKey(String str, C11304p pVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C160221.f39768f : pVar);
    }
}
