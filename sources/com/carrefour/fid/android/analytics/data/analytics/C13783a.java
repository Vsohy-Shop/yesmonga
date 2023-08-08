package com.carrefour.fid.android.analytics.data.analytics;

import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.FirebaseModelKt;
import com.carrefour.fid.android.analytics.utils.C13822a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.C28951s;
import com.carrefour.fid.android.tracking.C28995b;
import com.google.firebase.crashlytics.internal.analytics.C32659d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11363r0({"SMAP\nAnalyticGlobalDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticGlobalDispatcher.kt\ncom/carrefour/fid/android/analytics/data/analytics/AnalyticGlobalDispatcher\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,304:1\n13579#2:305\n13580#2:308\n1855#3,2:306\n1238#3,4:311\n1238#3,4:331\n1238#3,4:351\n1238#3,4:372\n442#4:309\n392#4:310\n467#4,7:315\n483#4,7:322\n442#4:329\n392#4:330\n467#4,7:335\n483#4,7:342\n442#4:349\n392#4:350\n467#4,7:356\n483#4,7:363\n442#4:370\n392#4:371\n1#5:355\n1#5:386\n1#5:401\n135#6,9:376\n215#6:385\n216#6:387\n144#6:388\n135#6,9:391\n215#6:400\n216#6:402\n144#6:403\n37#7,2:389\n37#7,2:404\n*S KotlinDebug\n*F\n+ 1 AnalyticGlobalDispatcher.kt\ncom/carrefour/fid/android/analytics/data/analytics/AnalyticGlobalDispatcher\n*L\n77#1:305\n77#1:308\n86#1:306,2\n127#1:311,4\n165#1:331,4\n185#1:351,4\n209#1:372,4\n127#1:309\n127#1:310\n163#1:315,7\n164#1:322,7\n165#1:329\n165#1:330\n183#1:335,7\n184#1:342,7\n185#1:349\n185#1:350\n207#1:356,7\n208#1:363,7\n209#1:370\n209#1:371\n262#1:386\n289#1:401\n262#1:376,9\n262#1:385\n262#1:387\n262#1:388\n289#1:391,9\n289#1:400\n289#1:402\n289#1:403\n272#1:389,2\n299#1:404,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.a */
public final class C13783a {
    @C12579k

    /* renamed from: a */
    public final FirebaseAnalyticsDispatcher f33543a;
    @C12579k

    /* renamed from: b */
    public final C28995b f33544b;
    @C12580l

    /* renamed from: c */
    public String f33545c;
    @C12579k

    /* renamed from: d */
    public ArrayList<String> f33546d = new ArrayList<>();

    @Inject
    public C13783a(@C12579k FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, @C12579k C28995b bVar) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsDispatcher, "firebaseAnalyticsDispatcher");
        Intrinsics.checkNotNullParameter(bVar, "usabillaEventDispatcher");
        this.f33543a = firebaseAnalyticsDispatcher;
        this.f33544b = bVar;
    }

    /* renamed from: g */
    public static /* synthetic */ void m58666g(C13783a aVar, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.mo32705f(map, z);
    }

    /* renamed from: i */
    public static /* synthetic */ void m58667i(C13783a aVar, String str, String str2, Map map, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 4) != 0) {
            map = C10977s0.m41492z();
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 16) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 32) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        aVar.mo32706h(str, str2, map2, z4, z5, z6);
    }

    /* renamed from: o */
    public static /* synthetic */ void m58668o(C13783a aVar, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.mo32710m(map, z);
    }

    /* renamed from: q */
    public static /* synthetic */ void m58669q(C13783a aVar, Map map, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.mo32712p(map, z, str);
    }

    /* renamed from: a */
    public final void mo32700a() {
        mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69573g, "0")));
        mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69572f, "0")));
    }

    /* renamed from: b */
    public final Map<String, String> mo32701b() {
        C13822a.C13823a aVar = C13822a.f33725a;
        String[] strArr = {C28951s.f70969f, C28951s.f70970g, C28951s.f70971h, C28951s.f70972i, "gclid", "dclid"};
        String str = this.f33545c;
        if (str == null) {
            str = "";
        }
        Map<String, String> a = aVar.mo32745a(strArr, str);
        this.f33545c = null;
        return a;
    }

    /* renamed from: c */
    public final void mo32702c(String str, String str2) {
        Map<String, String> b = mo32701b();
        if (!b.isEmpty()) {
            mo32703d(str, str2, b);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        if (r5.equals(r6) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        if (r5.equals(r6) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        if (r5 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        r7 = kotlin.C11078d1.m42659a(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r7 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r3.add(r7);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32703d(java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r8 = this;
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r0 = r8.f33543a
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r1 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.UTM_APP_OPEN
            kotlin.jvm.internal.s0 r2 = new kotlin.jvm.internal.s0
            r3 = 3
            r2.<init>(r3)
            java.lang.String r3 = "event_category"
            java.lang.String r4 = "deeplink"
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r3, r4)
            r2.mo22855a(r3)
            java.lang.String r3 = "event_action"
            java.lang.String r4 = "app_open"
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r3, r4)
            r2.mo22855a(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x002d:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r11.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r5.hashCode()
            r7 = 0
            switch(r6) {
                case -1539894552: goto L_0x0086;
                case -64687999: goto L_0x007a;
                case 95408552: goto L_0x006f;
                case 98179115: goto L_0x0066;
                case 1889642278: goto L_0x005a;
                case 2071166924: goto L_0x004e;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0092
        L_0x004e:
            java.lang.String r6 = "utm_source"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0057
            goto L_0x0092
        L_0x0057:
            java.lang.String r5 = "source"
            goto L_0x0093
        L_0x005a:
            java.lang.String r6 = "utm_medium"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0063
            goto L_0x0092
        L_0x0063:
            java.lang.String r5 = "medium"
            goto L_0x0093
        L_0x0066:
            java.lang.String r6 = "gclid"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0078
            goto L_0x0092
        L_0x006f:
            java.lang.String r6 = "dclid"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0078
            goto L_0x0092
        L_0x0078:
            r5 = r6
            goto L_0x0093
        L_0x007a:
            java.lang.String r6 = "utm_campaign"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0083
            goto L_0x0092
        L_0x0083:
            java.lang.String r5 = "campaign"
            goto L_0x0093
        L_0x0086:
            java.lang.String r6 = "utm_content"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            java.lang.String r5 = "content"
            goto L_0x0093
        L_0x0092:
            r5 = r7
        L_0x0093:
            if (r5 == 0) goto L_0x0099
            kotlin.Pair r7 = kotlin.C11078d1.m42659a(r5, r4)
        L_0x0099:
            if (r7 == 0) goto L_0x002d
            r3.add(r7)
            goto L_0x002d
        L_0x009f:
            r11 = 0
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            java.lang.Object[] r11 = r3.toArray(r11)
            r2.mo22856b(r11)
            int r11 = r2.mo22857c()
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            java.lang.Object[] r11 = r2.mo22858d(r11)
            kotlin.Pair[] r11 = (kotlin.Pair[]) r11
            java.util.Map r4 = kotlin.collections.C10977s0.m41456W(r11)
            r5 = 0
            r6 = 16
            r7 = 0
            r2 = r9
            r3 = r10
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher.m58652p(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.C13783a.mo32703d(java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (r6.equals(r7) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r6.equals(r7) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r6 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r8 = kotlin.C11078d1.m42659a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (r8 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r4.add(r8);
     */
    @kotlin.C11395k(message = "This method is deprecated, please use sendDeeplinkEventToFirebase")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32704e(java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r0 = r9.f33543a
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r1 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.UTM_APP_OPEN
            java.lang.String r2 = "screen_template"
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0011
            r2 = r3
        L_0x0011:
            java.lang.String r4 = "screen_name"
            java.lang.Object r10 = r10.get(r4)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            kotlin.jvm.internal.s0 r10 = new kotlin.jvm.internal.s0
            r4 = 3
            r10.<init>(r4)
            java.lang.String r4 = "event_category"
            java.lang.String r5 = "deeplink"
            kotlin.Pair r4 = kotlin.C11078d1.m42659a(r4, r5)
            r10.mo22855a(r4)
            java.lang.String r4 = "event_action"
            java.lang.String r5 = "app_open"
            kotlin.Pair r4 = kotlin.C11078d1.m42659a(r4, r5)
            r10.mo22855a(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0046:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r11.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r6.hashCode()
            r8 = 0
            switch(r7) {
                case -1539894552: goto L_0x009f;
                case -64687999: goto L_0x0093;
                case 95408552: goto L_0x0088;
                case 98179115: goto L_0x007f;
                case 1889642278: goto L_0x0073;
                case 2071166924: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x00ab
        L_0x0067:
            java.lang.String r7 = "utm_source"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0070
            goto L_0x00ab
        L_0x0070:
            java.lang.String r6 = "source"
            goto L_0x00ac
        L_0x0073:
            java.lang.String r7 = "utm_medium"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x007c
            goto L_0x00ab
        L_0x007c:
            java.lang.String r6 = "medium"
            goto L_0x00ac
        L_0x007f:
            java.lang.String r7 = "gclid"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0091
            goto L_0x00ab
        L_0x0088:
            java.lang.String r7 = "dclid"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0091
            goto L_0x00ab
        L_0x0091:
            r6 = r7
            goto L_0x00ac
        L_0x0093:
            java.lang.String r7 = "utm_campaign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009c
            goto L_0x00ab
        L_0x009c:
            java.lang.String r6 = "campaign"
            goto L_0x00ac
        L_0x009f:
            java.lang.String r7 = "utm_content"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            java.lang.String r6 = "content"
            goto L_0x00ac
        L_0x00ab:
            r6 = r8
        L_0x00ac:
            if (r6 == 0) goto L_0x00b2
            kotlin.Pair r8 = kotlin.C11078d1.m42659a(r6, r5)
        L_0x00b2:
            if (r8 == 0) goto L_0x0046
            r4.add(r8)
            goto L_0x0046
        L_0x00b8:
            r11 = 0
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            java.lang.Object[] r11 = r4.toArray(r11)
            r10.mo22856b(r11)
            int r11 = r10.mo22857c()
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            java.lang.Object[] r10 = r10.mo22858d(r11)
            kotlin.Pair[] r10 = (kotlin.Pair[]) r10
            java.util.Map r4 = kotlin.collections.C10977s0.m41456W(r10)
            r5 = 0
            r6 = 16
            r7 = 0
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher.m58652p(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.C13783a.mo32704e(java.util.Map, java.util.Map):void");
    }

    /* renamed from: f */
    public final void mo32705f(@C12579k Map<String, String> map, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(map, C32659d.f79228c);
        if (!Intrinsics.areEqual((Object) "event", (Object) map.get(C28526d.f68891a))) {
            return;
        }
        if (!map.containsKey("ecommerce_action") || z) {
            ArrayList<String> arrayList = this.f33546d;
            String str2 = "";
            if (CollectionsKt__CollectionsKt.m40443G(arrayList) >= 0) {
                str = arrayList.get(0);
            } else {
                str = str2;
            }
            String str3 = str;
            ArrayList<String> arrayList2 = this.f33546d;
            if (1 <= CollectionsKt__CollectionsKt.m40443G(arrayList2)) {
                str2 = arrayList2.get(1);
            }
            String str4 = str2;
            if (str3 == null || C11622t.isBlank(str3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (str4 == null || C11622t.isBlank(str4)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher = this.f33543a;
                    FirebaseEventKey firebaseEventKey = FirebaseEventKey.INTERACTION;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry next : map.entrySet()) {
                        String str5 = (String) next.getKey();
                        if (Intrinsics.areEqual((Object) str5, (Object) C28526d.f68906d) || Intrinsics.areEqual((Object) str5, (Object) "screen_name")) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            linkedHashMap.put(next.getKey(), next.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((String) entry.getValue()) != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        Object value = entry2.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                        linkedHashMap3.put(key, value);
                    }
                    FirebaseAnalyticsDispatcher.m58652p(firebaseAnalyticsDispatcher, firebaseEventKey, str3, str4, FirebaseModelKt.m58700b(linkedHashMap3), (String) null, 16, (Object) null);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo32706h(@C12579k String str, @C12579k String str2, @C12579k Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        Object obj;
        Intrinsics.checkNotNullParameter(str, "screenClass");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(map, "screenParameters");
        if (z) {
            str3 = StringKt.m118908Q(str2);
        } else {
            str3 = str2;
        }
        if (z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    str4 = (String) value;
                } else {
                    str4 = null;
                }
                if (str4 == null || (obj = StringKt.m118908Q(str4)) == null) {
                    obj = entry.getValue();
                }
                linkedHashMap.put(key, obj);
            }
            map = linkedHashMap;
        }
        Map<String, Object> b = FirebaseModelKt.m58700b(map);
        ArrayList<String> r = CollectionsKt__CollectionsKt.m40463r(str, str2);
        if (!Intrinsics.areEqual((Object) r, (Object) this.f33546d) || z3) {
            this.f33546d = r;
            this.f33544b.mo67287b(str2);
            mo32702c(str, str2);
            this.f33543a.mo32695t(str, str3, b);
            return;
        }
        C28935i iVar = C28935i.f70940a;
        C28935i.m119706i(iVar, "Ignoring duplicated screenview event: " + r, (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: j */
    public final void mo32707j(boolean z) {
        if (!z) {
            mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69572f, "0")));
        }
    }

    /* renamed from: k */
    public final void mo32708k(@C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "permanentValuesMap");
        this.f33543a.mo32696u(map);
    }

    /* renamed from: l */
    public final void mo32709l(@C12580l String str) {
        this.f33545c = str;
    }

    /* renamed from: m */
    public final void mo32710m(@C12579k Map<String, String> map, boolean z) {
        FirebaseEventKey firebaseEventKey;
        boolean z2;
        Intrinsics.checkNotNullParameter(map, C32659d.f79228c);
        if (!map.containsKey("ecommerce_action") || z) {
            FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher = this.f33543a;
            if (!map.containsKey(C28526d.f68891a) || !map.containsValue("event")) {
                firebaseEventKey = FirebaseEventKey.SCREEN_VIEW;
            } else {
                firebaseEventKey = FirebaseEventKey.INTERACTION;
            }
            FirebaseEventKey firebaseEventKey2 = firebaseEventKey;
            String str = map.get(C28526d.f68906d);
            if (str == null) {
                str = "";
            }
            String str2 = map.get("screen_name");
            if (str2 == null) {
                str2 = "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                boolean z3 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                if (Intrinsics.areEqual((Object) str3, (Object) C28526d.f68906d) || Intrinsics.areEqual((Object) str3, (Object) "screen_name")) {
                    z3 = false;
                }
                if (z3) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                linkedHashMap3.put(key, value);
            }
            FirebaseAnalyticsDispatcher.m58652p(firebaseAnalyticsDispatcher, firebaseEventKey2, str, str2, FirebaseModelKt.m58700b(linkedHashMap3), (String) null, 16, (Object) null);
        }
    }

    /* renamed from: n */
    public final void mo32711n(@C12579k C13813h... hVarArr) {
        Intrinsics.checkNotNullParameter(hVarArr, "senders");
        for (C13785c cVar : hVarArr) {
            if (cVar instanceof C13785c) {
                C13785c cVar2 = cVar;
                mo32710m(cVar2.mo32715b(), cVar2.mo32714a());
            } else if (cVar instanceof C13812g) {
                C13812g gVar = (C13812g) cVar;
                FirebaseAnalyticsDispatcher.m58652p(this.f33543a, gVar.mo32727a(), gVar.mo32729c(), gVar.mo32730d(), gVar.mo32728b().mo32723a(), (String) null, 16, (Object) null);
            } else if (cVar instanceof C13788f) {
                C13788f fVar = (C13788f) cVar;
                for (FirebaseEventKey p : fVar.mo32717a()) {
                    FirebaseAnalyticsDispatcher.m58652p(this.f33543a, p, fVar.mo32719c(), fVar.mo32720d(), fVar.mo32718b().mo32723a(), (String) null, 16, (Object) null);
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo32712p(@C12579k Map<String, String> map, boolean z, @C12579k String str) {
        boolean z2;
        Intrinsics.checkNotNullParameter(map, C32659d.f79228c);
        Intrinsics.checkNotNullParameter(str, "customEventName");
        if (!map.containsKey("ecommerce_action") || z) {
            FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher = this.f33543a;
            String str2 = map.get(C28526d.f68906d);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = map.get("screen_name");
            if (str3 == null) {
                str3 = "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                boolean z3 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str4 = (String) next.getKey();
                if (Intrinsics.areEqual((Object) str4, (Object) C28526d.f68906d) || Intrinsics.areEqual((Object) str4, (Object) "screen_name")) {
                    z3 = false;
                }
                if (z3) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                linkedHashMap3.put(key, value);
            }
            FirebaseAnalyticsDispatcher.m58652p(firebaseAnalyticsDispatcher, (FirebaseEventKey) null, str2, str3, FirebaseModelKt.m58700b(linkedHashMap3), str, 1, (Object) null);
        }
    }
}
