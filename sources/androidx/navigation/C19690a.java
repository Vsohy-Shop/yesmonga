package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.a */
public final class C19690a implements C19693b0 {

    /* renamed from: a */
    public final int f50482a;
    @C12579k

    /* renamed from: b */
    public final Bundle f50483b = new Bundle();

    public C19690a(int i) {
        this.f50482a = i;
    }

    /* renamed from: c */
    public static /* synthetic */ C19690a m91666c(C19690a aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.getActionId();
        }
        return aVar.mo58327b(i);
    }

    /* renamed from: a */
    public final int mo58326a() {
        return getActionId();
    }

    @C12579k
    /* renamed from: b */
    public final C19690a mo58327b(int i) {
        return new C19690a(i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C19690a.class, (Object) obj.getClass())) {
            return false;
        }
        if (getActionId() == ((C19690a) obj).getActionId()) {
            return true;
        }
        return false;
    }

    public int getActionId() {
        return this.f50482a;
    }

    @C12579k
    public Bundle getArguments() {
        return this.f50483b;
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    @C12579k
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
