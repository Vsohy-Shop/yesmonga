package com.carrefour.fid.android.presentation.p035ui.home.services;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nHomeServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeServices.kt\ncom/carrefour/fid/android/presentation/ui/home/services/HomeServicesKt$ServiceComponentStateful$serviceList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1045#2:181\n1549#2:182\n1620#2,3:183\n*S KotlinDebug\n*F\n+ 1 HomeServices.kt\ncom/carrefour/fid/android/presentation/ui/home/services/HomeServicesKt$ServiceComponentStateful$serviceList$1$1\n*L\n42#1:181\n48#1:182\n48#1:183,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$serviceList$1$1 */
public final class HomeServicesKt$ServiceComponentStateful$serviceList$1$1 extends Lambda implements C11289a<List<? extends Pair<? extends Service, ? extends ActiveState>>> {
    final /* synthetic */ C8578k2<Map<Service, ActiveState>> $serviceAndActiveMap$delegate;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HomeServices.kt\ncom/carrefour/fid/android/presentation/ui/home/services/HomeServicesKt$ServiceComponentStateful$serviceList$1$1\n*L\n1#1,328:1\n43#2,4:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$serviceList$1$1$a */
    public static final class C24187a<T> implements Comparator {
        public final int compare(T t, T t2) {
            int i;
            Map.Entry entry = (Map.Entry) t;
            int i2 = -1;
            if (entry.getKey() instanceof Service.PhysicalStore) {
                i = 1;
            } else if (entry.getValue() instanceof ActiveState.ActiveData) {
                i = -1;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            Map.Entry entry2 = (Map.Entry) t2;
            if (entry2.getKey() instanceof Service.PhysicalStore) {
                i2 = 1;
            } else if (!(entry2.getValue() instanceof ActiveState.ActiveData)) {
                i2 = 0;
            }
            return C11006g.m42424l(valueOf, Integer.valueOf(i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeServicesKt$ServiceComponentStateful$serviceList$1$1(C8578k2<? extends Map<Service, ? extends ActiveState>> k2Var) {
        super(0);
        this.$serviceAndActiveMap$delegate = k2Var;
    }

    @C12579k
    public final List<Pair<Service, ActiveState>> invoke() {
        Iterable<Map.Entry> p5 = CollectionsKt___CollectionsKt.m40675p5(HomeServicesKt.m106532c(this.$serviceAndActiveMap$delegate).entrySet(), new C24187a());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(p5, 10));
        for (Map.Entry entry : p5) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
