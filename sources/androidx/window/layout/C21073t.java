package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.t */
public final class C21073t {
    @C12579k

    /* renamed from: a */
    public final List<C21045g> f54325a;

    @RestrictTo({RestrictTo.Scope.TESTS})
    public C21073t(@C12579k List<? extends C21045g> list) {
        Intrinsics.checkNotNullParameter(list, "displayFeatures");
        this.f54325a = list;
    }

    @C12579k
    /* renamed from: a */
    public final List<C21045g> mo63016a() {
        return this.f54325a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C21073t.class, (Object) obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f54325a, (Object) ((C21073t) obj).f54325a);
    }

    public int hashCode() {
        return this.f54325a.hashCode();
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(this.f54325a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (C11300l) null, 56, (Object) null);
    }
}
