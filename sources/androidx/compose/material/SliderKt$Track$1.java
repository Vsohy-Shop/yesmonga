package androidx.compose.material;

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
@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1189:1\n1477#2:1190\n1502#2,3:1191\n1505#2,3:1201\n1549#2:1205\n1620#2,3:1206\n361#3,7:1194\n215#4:1204\n216#4:1209\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n*L\n774#1:1190\n774#1:1191,3\n774#1:1201,3\n777#1:1205\n777#1:1206,3\n774#1:1194,7\n775#1:1204\n775#1:1209\n*E\n"})
public final class SliderKt$Track$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<C15240j2> $activeTickColor;
    final /* synthetic */ C8578k2<C15240j2> $activeTrackColor;
    final /* synthetic */ C8578k2<C15240j2> $inactiveTickColor;
    final /* synthetic */ C8578k2<C15240j2> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f, C8578k2<C15240j2> k2Var, float f2, float f3, float f4, C8578k2<C15240j2> k2Var2, List<Float> list, C8578k2<C15240j2> k2Var3, C8578k2<C15240j2> k2Var4) {
        super(1);
        this.$thumbPx = f;
        this.$inactiveTrackColor = k2Var;
        this.$trackStrokeWidth = f2;
        this.$positionFractionEnd = f3;
        this.$positionFractionStart = f4;
        this.$activeTrackColor = k2Var2;
        this.$tickFractions = list;
        this.$inactiveTickColor = k2Var3;
        this.$activeTickColor = k2Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        boolean z = eVar.getLayoutDirection() == LayoutDirection.Rtl;
        long a = C15096g.m64898a(this.$thumbPx, C15094f.m64882r(eVar.mo42717U()));
        long a2 = C15096g.m64898a(C15104m.m65023t(eVar.mo42718b()) - this.$thumbPx, C15094f.m64882r(eVar.mo42717U()));
        long j = z ? a2 : a;
        long j2 = z ? a : a2;
        long M = this.$inactiveTrackColor.getValue().mo42833M();
        float f = this.$trackStrokeWidth;
        C15244j4.C15245a aVar = C15244j4.f37564b;
        long j3 = j2;
        long j4 = j;
        C15187e.m65695K2(eVar, M, j, j2, f, aVar.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
        C15187e.m65695K2(eVar, this.$activeTrackColor.getValue().mo42833M(), C15096g.m64898a(C15094f.m64880p(j4) + ((C15094f.m64880p(j3) - C15094f.m64880p(j4)) * this.$positionFractionStart), C15094f.m64882r(eVar.mo42717U())), C15096g.m64898a(C15094f.m64880p(j4) + ((C15094f.m64880p(j3) - C15094f.m64880p(j4)) * this.$positionFractionEnd), C15094f.m64882r(eVar.mo42717U())), this.$trackStrokeWidth, aVar.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
        float f2 = this.$positionFractionEnd;
        float f3 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : this.$tickFractions) {
            float floatValue = ((Number) next).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f2 || floatValue < f3);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        C8578k2<C15240j2> k2Var = this.$inactiveTickColor;
        C8578k2<C15240j2> k2Var2 = this.$activeTickColor;
        float f4 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            Iterable<Number> iterable = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Number floatValue2 : iterable) {
                arrayList.add(C15094f.m64868d(C15096g.m64898a(C15094f.m64880p(C15096g.m64905h(j4, j3, floatValue2.floatValue())), C15094f.m64882r(eVar.mo42717U()))));
            }
            long j5 = j3;
            long j6 = j4;
            C15187e.m65693I4(eVar, arrayList, C15289p3.f37622b.mo42940b(), (booleanValue ? k2Var : k2Var2).getValue().mo42833M(), f4, C15244j4.f37564b.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
            j4 = j6;
            f4 = f4;
            j3 = j5;
        }
    }
}
