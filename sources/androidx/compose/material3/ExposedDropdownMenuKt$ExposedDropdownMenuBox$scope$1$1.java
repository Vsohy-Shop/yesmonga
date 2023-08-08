package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1058:1\n135#2:1059\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1\n*L\n119#1:1059\n*E\n"})
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 implements ExposedDropdownMenuBoxScope {

    /* renamed from: a */
    public final /* synthetic */ boolean f19412a;

    /* renamed from: b */
    public final /* synthetic */ C11300l<Boolean, C11079d2> f19413b;

    /* renamed from: c */
    public final /* synthetic */ int f19414c;

    /* renamed from: d */
    public final /* synthetic */ FocusRequester f19415d;

    /* renamed from: e */
    public final /* synthetic */ C15695i1<C15588o> f19416e;

    /* renamed from: f */
    public final /* synthetic */ View f19417f;

    /* renamed from: g */
    public final /* synthetic */ int f19418g;

    /* renamed from: h */
    public final /* synthetic */ C8700z0<Integer> f19419h;

    /* renamed from: i */
    public final /* synthetic */ C8700z0<Integer> f19420i;

    /* renamed from: j */
    public final /* synthetic */ C16479d f19421j;

    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(boolean z, C11300l<? super Boolean, C11079d2> lVar, int i, FocusRequester focusRequester, C15695i1<C15588o> i1Var, View view, int i2, C8700z0<Integer> z0Var, C8700z0<Integer> z0Var2, C16479d dVar) {
        this.f19412a = z;
        this.f19413b = lVar;
        this.f19414c = i;
        this.f19415d = focusRequester;
        this.f19416e = i1Var;
        this.f19417f = view;
        this.f19418g = i2;
        this.f19419h = z0Var;
        this.f19420i = z0Var2;
        this.f19421j = dVar;
    }

    @C12579k
    /* renamed from: a */
    public C8767m mo11544a(@C12579k C8767m mVar, boolean z) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C16479d dVar = this.f19421j;
        C8700z0<Integer> z0Var = this.f19420i;
        C8700z0<Integer> z0Var2 = this.f19419h;
        C8767m q = SizeKt.m10117q(mVar, 0.0f, dVar.mo7416L(ExposedDropdownMenuKt.m25774d(z0Var)), 1, (Object) null);
        if (z) {
            return SizeKt.m10092H(q, dVar.mo7416L(ExposedDropdownMenuKt.m25772b(z0Var2)));
        }
        return q;
    }

    @C12579k
    /* renamed from: d */
    public C8767m mo11546d(@C12579k C8767m mVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new C8021xae1e15a0();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new C8024x44cc52d6(this.f19412a, this.f19413b, this.f19414c, this.f19415d, this.f19416e, this.f19417f, this.f19418g, this.f19419h, this.f19420i));
    }
}
