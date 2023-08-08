package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15289p3;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8578k2;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1508:1\n10843#2:1509\n11093#2,3:1510\n11096#2,3:1520\n361#3,7:1513\n215#4:1523\n216#4:1528\n1549#5:1524\n1620#5,3:1525\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n*L\n1055#1:1509\n1055#1:1510,3\n1055#1:1520,3\n1055#1:1513,7\n1058#1:1523\n1058#1:1528\n1060#1:1524\n1060#1:1525,3\n*E\n"})
public final class SliderDefaults$Track$1$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<C15240j2> $activeTickColor;
    final /* synthetic */ C8578k2<C15240j2> $activeTrackColor;
    final /* synthetic */ C8578k2<C15240j2> $inactiveTickColor;
    final /* synthetic */ C8578k2<C15240j2> $inactiveTrackColor;
    final /* synthetic */ C8264p2 $sliderPositions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(C8578k2<C15240j2> k2Var, C8264p2 p2Var, C8578k2<C15240j2> k2Var2, C8578k2<C15240j2> k2Var3, C8578k2<C15240j2> k2Var4) {
        super(1);
        this.$inactiveTrackColor = k2Var;
        this.$sliderPositions = p2Var;
        this.$activeTrackColor = k2Var2;
        this.$inactiveTickColor = k2Var3;
        this.$activeTickColor = k2Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$Canvas");
        boolean z = eVar.getLayoutDirection() == LayoutDirection.Rtl;
        long a = C15096g.m64898a(0.0f, C15094f.m64882r(eVar.mo42717U()));
        long a2 = C15096g.m64898a(C15104m.m65023t(eVar.mo42718b()), C15094f.m64882r(eVar.mo42717U()));
        long j = z ? a2 : a;
        long j2 = z ? a : a2;
        float g5 = eVar2.mo7425g5(SliderKt.f19673f);
        float g52 = eVar2.mo7425g5(SliderKt.m26196P());
        long M = this.$inactiveTrackColor.getValue().mo42833M();
        C15244j4.C15245a aVar = C15244j4.f37564b;
        float f = g52;
        long j3 = j2;
        long j4 = j;
        C15187e.m65695K2(eVar, M, j, j2, f, aVar.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
        C15187e.m65695K2(eVar, this.$activeTrackColor.getValue().mo42833M(), C15096g.m64898a(C15094f.m64880p(j4) + ((C15094f.m64880p(j3) - C15094f.m64880p(j4)) * this.$sliderPositions.mo12902a().getStart().floatValue()), C15094f.m64882r(eVar.mo42717U())), C15096g.m64898a(C15094f.m64880p(j4) + ((C15094f.m64880p(j3) - C15094f.m64880p(j4)) * this.$sliderPositions.mo12902a().mo23013q().floatValue()), C15094f.m64882r(eVar.mo42717U())), f, aVar.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
        float[] b = this.$sliderPositions.mo12903b();
        C8264p2 p2Var = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = b.length;
        for (int i = 0; i < length; i++) {
            float f2 = b[i];
            Boolean valueOf = Boolean.valueOf(f2 > p2Var.mo12902a().mo23013q().floatValue() || f2 < p2Var.mo12902a().getStart().floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f2));
        }
        C8578k2<C15240j2> k2Var = this.$inactiveTickColor;
        C8578k2<C15240j2> k2Var2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            Iterable<Number> iterable = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(C15094f.m64868d(C15096g.m64898a(C15094f.m64880p(C15096g.m64905h(j4, j3, floatValue.floatValue())), C15094f.m64882r(eVar.mo42717U()))));
            }
            long j5 = j4;
            long j6 = j3;
            C15187e.m65693I4(eVar, arrayList, C15289p3.f37622b.mo42940b(), (booleanValue ? k2Var : k2Var2).getValue().mo42833M(), g5, C15244j4.f37564b.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
            j3 = j6;
            j4 = j5;
        }
    }
}
