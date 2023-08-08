package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15259l3;
import androidx.compose.p004ui.graphics.C15312s0;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.material.l */
public final class C7877l {
    @C12579k

    /* renamed from: a */
    public final C15231i3 f18872a;
    @C12579k

    /* renamed from: b */
    public final C15259l3 f18873b;
    @C12579k

    /* renamed from: c */
    public final C15231i3 f18874c;

    public C7877l() {
        this((C15231i3) null, (C15259l3) null, (C15231i3) null, 7, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final C15231i3 mo10868a() {
        return this.f18872a;
    }

    @C12579k
    /* renamed from: b */
    public final C15259l3 mo10869b() {
        return this.f18873b;
    }

    @C12579k
    /* renamed from: c */
    public final C15231i3 mo10870c() {
        return this.f18874c;
    }

    public C7877l(@C12579k C15231i3 i3Var, @C12579k C15259l3 l3Var, @C12579k C15231i3 i3Var2) {
        Intrinsics.checkNotNullParameter(i3Var, "checkPath");
        Intrinsics.checkNotNullParameter(l3Var, "pathMeasure");
        Intrinsics.checkNotNullParameter(i3Var2, "pathToDraw");
        this.f18872a = i3Var;
        this.f18873b = l3Var;
        this.f18874c = i3Var2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7877l(C15231i3 i3Var, C15259l3 l3Var, C15231i3 i3Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C15318t0.m66550a() : i3Var, (i & 2) != 0 ? C15312s0.m66539a() : l3Var, (i & 4) != 0 ? C15318t0.m66550a() : i3Var2);
    }
}
