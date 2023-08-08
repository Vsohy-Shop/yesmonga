package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferNotification.kt\ncom/carrefour/fid/android/presentation/models/OfferNotificationMap\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n483#2,7:39\n1#3:46\n215#4,2:47\n*S KotlinDebug\n*F\n+ 1 OfferNotification.kt\ncom/carrefour/fid/android/presentation/models/OfferNotificationMap\n*L\n20#1:39,7\n34#1:47,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.p */
public final class C38524p {

    /* renamed from: c */
    public static final int f97654c = 8;

    /* renamed from: a */
    public final long f97655a;
    @C12579k

    /* renamed from: b */
    public final Map<OfferNotificationType, Pair<String, Long>> f97656b = new LinkedHashMap();

    public C38524p(long j) {
        this.f97655a = j;
    }

    /* renamed from: a */
    public final long mo122139a(@C12580l OfferNotificationType offerNotificationType, @C12579k String str) {
        Pair pair;
        Intrinsics.checkNotNullParameter(str, "ean");
        if (offerNotificationType == null) {
            return 0;
        }
        if (this.f97656b.containsKey(offerNotificationType)) {
            Map<OfferNotificationType, Pair<String, Long>> map = this.f97656b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                if (Intrinsics.areEqual(((Pair) next.getValue()).mo21849e(), (Object) str)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.m40721z2(linkedHashMap.entrySet());
            if (entry == null || (pair = (Pair) entry.getValue()) == null) {
                return 0;
            }
            return Long.max(0, this.f97655a - (System.currentTimeMillis() - ((Number) pair.mo21851f()).longValue()));
        }
        this.f97656b.put(offerNotificationType, new Pair(str, Long.valueOf(System.currentTimeMillis())));
        return this.f97655a;
    }

    /* renamed from: b */
    public final void mo122140b() {
        for (Map.Entry next : this.f97656b.entrySet()) {
            this.f97656b.put((OfferNotificationType) next.getKey(), new Pair(((Pair) next.getValue()).mo21849e(), -1L));
        }
    }
}
