package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreOpeningsItem$2 */
public final class PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreOpeningsItem$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ String $day;
    final /* synthetic */ boolean $isPass;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ String $openings;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreOpeningsItem$2(C8767m mVar, long j, String str, String str2, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$backgroundColor = j;
        this.$day = str;
        this.$openings = str2;
        this.$isPass = z;
        this.$isSelected = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreInfoOpeningsComponentKt.m109612i(this.$modifier, this.$backgroundColor, this.$day, this.$openings, this.$isPass, this.$isSelected, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
