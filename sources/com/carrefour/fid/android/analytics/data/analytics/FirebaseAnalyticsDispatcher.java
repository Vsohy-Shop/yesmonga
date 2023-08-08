package com.carrefour.fid.android.analytics.data.analytics;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.FirebaseModelKt;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.C13811b;
import com.carrefour.fid.android.domain.interactors.account.C37519e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.C32648f;
import com.google.firebase.perf.C33314e;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFirebaseAnalyticsDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseAnalyticsDispatcher.kt\ncom/carrefour/fid/android/analytics/data/analytics/FirebaseAnalyticsDispatcher\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,230:1\n215#2:231\n216#2:244\n215#2:258\n216#2:264\n215#2,2:265\n1549#3:232\n1620#3,2:233\n1622#3:239\n1238#3,4:254\n1559#3:259\n1590#3,4:260\n37#4,2:235\n18#4:237\n37#4,2:240\n18#4:242\n26#5:238\n26#5:243\n540#6:245\n525#6,6:246\n457#6:252\n403#6:253\n*S KotlinDebug\n*F\n+ 1 FirebaseAnalyticsDispatcher.kt\ncom/carrefour/fid/android/analytics/data/analytics/FirebaseAnalyticsDispatcher\n*L\n154#1:231\n154#1:244\n184#1:258\n184#1:264\n222#1:265,2\n162#1:232\n162#1:233,2\n162#1:239\n183#1:254,4\n186#1:259\n186#1:260,4\n164#1:235,2\n164#1:237\n171#1:240,2\n171#1:242\n164#1:238\n171#1:243\n181#1:245\n181#1:246,6\n183#1:252\n183#1:253\n*E\n"})
public final class FirebaseAnalyticsDispatcher implements C28876b, C12074o0 {
    @C12579k

    /* renamed from: a */
    public final FirebaseAnalytics f33519a;
    @C12579k

    /* renamed from: b */
    public final C33314e f33520b;
    @C12579k

    /* renamed from: c */
    public final C37519e f33521c;
    @C12579k

    /* renamed from: d */
    public final C37823k f33522d;
    @C12579k

    /* renamed from: e */
    public final Context f33523e;
    @C12579k

    /* renamed from: f */
    public final CoroutineContext f33524f = C11768d1.m46781c();

    /* renamed from: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$a */
    public /* synthetic */ class C13782a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey[] r0 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r1 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.SCREEN_VIEW     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r1 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.INTERACTION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher.C13782a.<clinit>():void");
        }
    }

    @Inject
    public FirebaseAnalyticsDispatcher(@C12579k FirebaseAnalytics firebaseAnalytics, @C12579k C33314e eVar, @C12579k C37519e eVar2, @C12579k C37823k kVar, @C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "analytics");
        Intrinsics.checkNotNullParameter(eVar, "performance");
        Intrinsics.checkNotNullParameter(eVar2, "isUserLoggedInUseCase");
        Intrinsics.checkNotNullParameter(kVar, "serviceSelectionUseCase");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f33519a = firebaseAnalytics;
        this.f33520b = eVar;
        this.f33521c = eVar2;
        this.f33522d = kVar;
        this.f33523e = context;
    }

    /* renamed from: p */
    public static /* synthetic */ void m58652p(FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, FirebaseEventKey firebaseEventKey, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            firebaseEventKey = FirebaseEventKey.INTERACTION;
        }
        FirebaseEventKey firebaseEventKey2 = firebaseEventKey;
        if ((i & 16) != 0) {
            str3 = null;
        }
        firebaseAnalyticsDispatcher.mo32691o(firebaseEventKey2, str, str2, map, str3);
    }

    /* renamed from: a */
    public void mo32686a() {
        this.f33519a.mo94634e(true);
        this.f33520b.mo96407j(true);
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.FIREBASE_ANALYTICS.mo83424q();
    }

    /* renamed from: e */
    public void mo32688e() {
        this.f33519a.mo94634e(false);
        this.f33520b.mo96407j(false);
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28876b.C28877a.m119433a(this, context);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f33524f;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo32690n(java.util.Map<java.lang.String, ? extends java.lang.Object> r9) {
        /*
            r8 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x000d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00d4
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L_0x000d
        L_0x002d:
            boolean r3 = r1 instanceof java.lang.Float
            if (r3 == 0) goto L_0x003b
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.putFloat(r2, r1)
            goto L_0x000d
        L_0x003b:
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0049
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
            goto L_0x000d
        L_0x0049:
            boolean r3 = r1 instanceof java.util.List
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x00a3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r1, r6)
            r3.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x0060:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0099
            java.lang.Object r6 = r1.next()
            boolean r7 = r6 instanceof java.util.Map
            if (r7 == 0) goto L_0x0071
            java.util.Map r6 = (java.util.Map) r6
            goto L_0x0072
        L_0x0071:
            r6 = r5
        L_0x0072:
            if (r6 == 0) goto L_0x0085
            java.util.List r6 = kotlin.collections.C10983u0.m41513J1(r6)
            if (r6 == 0) goto L_0x0085
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.Pair[] r7 = new kotlin.Pair[r4]
            java.lang.Object[] r6 = r6.toArray(r7)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            goto L_0x0086
        L_0x0085:
            r6 = r5
        L_0x0086:
            if (r6 != 0) goto L_0x008a
            kotlin.Pair[] r6 = new kotlin.Pair[r4]
        L_0x008a:
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            android.os.Bundle r6 = androidx.core.p027os.C17779d.m81164b(r6)
            r3.add(r6)
            goto L_0x0060
        L_0x0099:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.putParcelableArrayList(r2, r1)
            goto L_0x000d
        L_0x00a3:
            boolean r3 = r1 instanceof java.util.Map
            if (r3 == 0) goto L_0x000d
            if (r3 == 0) goto L_0x00ac
            java.util.Map r1 = (java.util.Map) r1
            goto L_0x00ad
        L_0x00ac:
            r1 = r5
        L_0x00ad:
            if (r1 == 0) goto L_0x00c0
            java.util.List r1 = kotlin.collections.C10983u0.m41513J1(r1)
            if (r1 == 0) goto L_0x00c0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.Pair[] r3 = new kotlin.Pair[r4]
            java.lang.Object[] r1 = r1.toArray(r3)
            r5 = r1
            kotlin.Pair[] r5 = (kotlin.Pair[]) r5
        L_0x00c0:
            if (r5 != 0) goto L_0x00c4
            kotlin.Pair[] r5 = new kotlin.Pair[r4]
        L_0x00c4:
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            kotlin.Pair[] r1 = (kotlin.Pair[]) r1
            android.os.Bundle r1 = androidx.core.p027os.C17779d.m81164b(r1)
            r0.putBundle(r2, r1)
            goto L_0x000d
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher.mo32690n(java.util.Map):android.os.Bundle");
    }

    /* renamed from: o */
    public final void mo32691o(@C12579k FirebaseEventKey firebaseEventKey, @C12579k String str, @C12579k String str2, @C12579k Map<String, ? extends Object> map, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(firebaseEventKey, "event");
        Intrinsics.checkNotNullParameter(str, "screenClass");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(map, C32648f.f79206e);
        C11723c2 unused = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new FirebaseAnalyticsDispatcher$fireEvent$1(mo32690n(map), this, str3, firebaseEventKey, str, str2, (C11045c<? super FirebaseAnalyticsDispatcher$fireEvent$1>) null), 3, (Object) null);
    }

    /* renamed from: q */
    public final String mo32692q(Map<String, ? extends Object> map, FirebaseEventKey firebaseEventKey) {
        StringBuilder sb = new StringBuilder();
        sb.append("📈-------FirebaseAnalytics-------📈");
        sb.append("\n");
        int i = C13782a.$EnumSwitchMapping$0[firebaseEventKey.ordinal()];
        if (i == 1) {
            sb.append(" 📱 SCREENVIEW");
        } else if (i == 2) {
            sb.append(" 👇 INTERACTION");
        }
        sb.append("\n");
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            sb.append(" " + ((String) next.getKey()) + " = " + value);
            sb.append("\n");
        }
        sb.append("📉-------------------------------📉");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32693r(com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r5, kotlin.coroutines.C11045c<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserLogin$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserLogin$1 r0 = (com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserLogin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserLogin$1 r0 = new com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserLogin$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.account.e r5 = r5.f33521c
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r6 = kotlin.Result.m38709i(r5)
            if (r6 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher.mo32693r(com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32694s(kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserStoreIDM$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserStoreIDM$1 r0 = (com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserStoreIDM$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserStoreIDM$1 r0 = new com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$getUserStoreIDM$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f33522d
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r5 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 == 0) goto L_0x0061
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
            if (r5 == 0) goto L_0x0061
            java.lang.String r5 = r5.mo119167K()
            if (r5 == 0) goto L_0x0061
            java.lang.String r1 = com.carrefour.fid.android.shared.extension.StringKt.m118908Q(r5)
        L_0x0061:
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = ""
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher.mo32694s(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t */
    public final void mo32695t(@C12579k String str, @C12579k String str2, @C12579k Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "screenClass");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(map, "screenParameters");
        C11723c2 unused = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1(str, str2, map, this, (C11045c<? super FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1>) null), 3, (Object) null);
    }

    /* renamed from: u */
    public final void mo32696u(@C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "properties");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!C13786d.f33552b.contains(next.getKey())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Map<String, String> c = FirebaseModelKt.m58701c(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(c.size()));
        for (Map.Entry entry : c.entrySet()) {
            linkedHashMap2.put((String) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            if (Intrinsics.areEqual((Object) str, (Object) C28564m1.f69570d)) {
                Iterable chunked = StringsKt___StringsKt.chunked(str2, 25);
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(chunked, 10));
                int i = 0;
                for (Object next2 : chunked) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    FirebaseAnalytics firebaseAnalytics = this.f33519a;
                    C11368t0 t0Var = C11368t0.f28504a;
                    String format = String.format(C13811b.f33677b, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    firebaseAnalytics.mo94640j(format, (String) next2);
                    arrayList.add(C11079d2.f28267a);
                    i = i2;
                }
                this.f33519a.mo94639i(str2);
            } else {
                this.f33519a.mo94640j(str, str2);
            }
        }
    }
}
