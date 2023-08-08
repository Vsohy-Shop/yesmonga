package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.C0329d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.j */
public final class C19757j {
    @C0329d0

    /* renamed from: a */
    public final int f50570a;
    @C12580l

    /* renamed from: b */
    public C19761k0 f50571b;
    @C12580l

    /* renamed from: c */
    public Bundle f50572c;

    @C11315i
    public C19757j(@C0329d0 int i) {
        this(i, (C19761k0) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo58432a() {
        return this.f50572c;
    }

    /* renamed from: b */
    public final int mo58433b() {
        return this.f50570a;
    }

    @C12580l
    /* renamed from: c */
    public final C19761k0 mo58434c() {
        return this.f50571b;
    }

    /* renamed from: d */
    public final void mo58435d(@C12580l Bundle bundle) {
        this.f50572c = bundle;
    }

    /* renamed from: e */
    public final void mo58436e(@C12580l C19761k0 k0Var) {
        this.f50571b = k0Var;
    }

    @C11315i
    public C19757j(@C0329d0 int i, @C12580l C19761k0 k0Var) {
        this(i, k0Var, (Bundle) null, 4, (DefaultConstructorMarker) null);
    }

    @C11315i
    public C19757j(@C0329d0 int i, @C12580l C19761k0 k0Var, @C12580l Bundle bundle) {
        this.f50570a = i;
        this.f50571b = k0Var;
        this.f50572c = bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19757j(int i, C19761k0 k0Var, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : k0Var, (i2 & 4) != 0 ? null : bundle);
    }
}
