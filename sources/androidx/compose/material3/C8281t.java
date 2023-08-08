package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15259l3;
import androidx.compose.p004ui.graphics.C15312s0;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.material3.t */
public final class C8281t {
    @C12579k

    /* renamed from: a */
    public final C15231i3 f20474a;
    @C12579k

    /* renamed from: b */
    public final C15259l3 f20475b;
    @C12579k

    /* renamed from: c */
    public final C15231i3 f20476c;

    public C8281t() {
        this((C15231i3) null, (C15259l3) null, (C15231i3) null, 7, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final C15231i3 mo13001a() {
        return this.f20474a;
    }

    @C12579k
    /* renamed from: b */
    public final C15259l3 mo13002b() {
        return this.f20475b;
    }

    @C12579k
    /* renamed from: c */
    public final C15231i3 mo13003c() {
        return this.f20476c;
    }

    public C8281t(@C12579k C15231i3 i3Var, @C12579k C15259l3 l3Var, @C12579k C15231i3 i3Var2) {
        Intrinsics.checkNotNullParameter(i3Var, "checkPath");
        Intrinsics.checkNotNullParameter(l3Var, "pathMeasure");
        Intrinsics.checkNotNullParameter(i3Var2, "pathToDraw");
        this.f20474a = i3Var;
        this.f20475b = l3Var;
        this.f20476c = i3Var2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8281t(C15231i3 i3Var, C15259l3 l3Var, C15231i3 i3Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C15318t0.m66550a() : i3Var, (i & 2) != 0 ? C15312s0.m66539a() : l3Var, (i & 4) != 0 ? C15318t0.m66550a() : i3Var2);
    }
}
