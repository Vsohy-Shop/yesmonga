package com.google.accompanist.placeholder;

import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt\n*L\n1#1,170:1\n114#2,7:171\n*E\n"})
/* renamed from: com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ long $color$inlined;
    final /* synthetic */ C15037b $highlight$inlined;
    final /* synthetic */ C15218g4 $shape$inlined;
    final /* synthetic */ boolean $visible$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1(boolean z, long j, C15037b bVar, C15218g4 g4Var) {
        super(1);
        this.$visible$inlined = z;
        this.$color$inlined = j;
        this.$highlight$inlined = bVar;
        this.$shape$inlined = g4Var;
    }

    /* renamed from: a */
    public final void mo42034a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("placeholder");
        v0Var.mo45974e(Boolean.valueOf(this.$visible$inlined));
        v0Var.mo45971b().mo45707c("visible", Boolean.valueOf(this.$visible$inlined));
        v0Var.mo45971b().mo45707c("color", C15240j2.m66071n(this.$color$inlined));
        v0Var.mo45971b().mo45707c("highlight", this.$highlight$inlined);
        v0Var.mo45971b().mo45707c("shape", this.$shape$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo42034a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
