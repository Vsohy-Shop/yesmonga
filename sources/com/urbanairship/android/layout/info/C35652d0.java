package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.android.layout.shape.C35870a;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.d0 */
public final class C35652d0 extends C35686t0 implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88120b;
    @C12579k

    /* renamed from: c */
    public final C35654b f88121c;

    /* renamed from: d */
    public final int f88122d;

    /* renamed from: com.urbanairship.android.layout.info.d0$a */
    public static final class C35653a {
        @C12579k

        /* renamed from: a */
        public final List<C35870a> f88123a;
        @C12580l

        /* renamed from: b */
        public final Image.Icon f88124b;

        public C35653a(@C12579k C9323b bVar) {
            C9322a<JsonValue> aVar;
            C9323b bVar2;
            C9323b bVar3 = bVar;
            Intrinsics.checkNotNullParameter(bVar3, "json");
            JsonValue k = bVar3.mo18812k("shapes");
            if (k != null) {
                Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
                Class<C9322a> cls = C9322a.class;
                C11494d d = C11342l0.m43547d(cls);
                Class<String> cls2 = String.class;
                Class<JsonValue> cls3 = JsonValue.class;
                Class<Integer> cls4 = Integer.class;
                Class<C9322a> cls5 = cls;
                Class<C9323b> cls6 = C9323b.class;
                if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls2))) {
                    String B = k.mo18750B();
                    if (B != null) {
                        aVar = (C9322a) B;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    aVar = (C9322a) Boolean.valueOf(k.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                    aVar = (C9322a) Long.valueOf(k.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                    aVar = (C9322a) Double.valueOf(k.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls4))) {
                    aVar = (C9322a) Integer.valueOf(k.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                    aVar = k.mo18784z();
                    if (aVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls6))) {
                    C9323b A = k.mo18749A();
                    if (A != null) {
                        aVar = (C9322a) A;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                    JsonValue q = k.mo17264q();
                    if (q != null) {
                        aVar = (C9322a) q;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonList");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "shapes" + '\'');
                }
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(aVar, 10));
                for (JsonValue E : aVar) {
                    arrayList.add(C35870a.m147950b(E.mo18752E()));
                }
                this.f88123a = arrayList;
                JsonValue k2 = bVar3.mo18812k("icon");
                Image.Icon icon = null;
                if (k2 == null) {
                    bVar2 = null;
                } else {
                    Intrinsics.checkNotNullExpressionValue(k2, "get(key) ?: return null");
                    C11494d d2 = C11342l0.m43547d(cls6);
                    if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls2))) {
                        String B2 = k2.mo18750B();
                        if (B2 != null) {
                            bVar2 = (C9323b) B2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                        }
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                        bVar2 = (C9323b) Boolean.valueOf(k2.mo18757c(false));
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Long.TYPE))) {
                        bVar2 = (C9323b) Long.valueOf(k2.mo18766i(0));
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Double.TYPE))) {
                        bVar2 = (C9323b) Double.valueOf(k2.mo18758d(0.0d));
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
                        bVar2 = (C9323b) Integer.valueOf(k2.mo18762f(0));
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                        C9322a z = k2.mo18784z();
                        if (z != null) {
                            bVar2 = (C9323b) z;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                        }
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls6))) {
                        bVar2 = k2.mo18749A();
                        if (bVar2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                        }
                    } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                        JsonValue q2 = k2.mo17264q();
                        if (q2 != null) {
                            bVar2 = (C9323b) q2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                        }
                    } else {
                        throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + "icon" + '\'');
                    }
                }
                this.f88124b = bVar2 != null ? Image.Icon.m147666c(bVar2) : icon;
                return;
            }
            throw new JsonException("Missing required field: '" + "shapes" + '\'');
        }

        @C12580l
        /* renamed from: a */
        public final Image.Icon mo106796a() {
            return this.f88124b;
        }

        @C12579k
        /* renamed from: b */
        public final List<C35870a> mo106797b() {
            return this.f88123a;
        }
    }

    /* renamed from: com.urbanairship.android.layout.info.d0$b */
    public static final class C35654b {
        @C12579k

        /* renamed from: a */
        public final C35653a f88125a;
        @C12579k

        /* renamed from: b */
        public final C35653a f88126b;

        /* JADX WARNING: Removed duplicated region for block: B:42:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C35654b(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                java.lang.String r2 = "json"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                r18.<init>()
                com.urbanairship.android.layout.info.d0$a r2 = new com.urbanairship.android.layout.info.d0$a
                java.lang.String r3 = "selected"
                com.urbanairship.json.JsonValue r4 = r1.mo18812k(r3)
                java.lang.String r5 = "Missing required field: '"
                if (r4 == 0) goto L_0x023d
                java.lang.String r7 = "get(key) ?: throw JsonEx… required field: '$key'\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
                java.lang.Class<com.urbanairship.json.b> r8 = com.urbanairship.json.C9323b.class
                kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r8)
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r10)
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
                java.lang.String r12 = "' for field '"
                java.lang.String r13 = "Invalid type '"
                java.lang.Class<com.urbanairship.json.JsonValue> r14 = com.urbanairship.json.JsonValue.class
                java.lang.Class<com.urbanairship.json.a> r15 = com.urbanairship.json.C9322a.class
                r16 = r7
                java.lang.Class<java.lang.Integer> r17 = java.lang.Integer.class
                r6 = 0
                java.lang.String r7 = "null cannot be cast to non-null type com.urbanairship.json.JsonMap"
                if (r11 == 0) goto L_0x004d
                java.lang.String r3 = r4.mo18750B()
                if (r3 == 0) goto L_0x0047
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
                goto L_0x0063
            L_0x0047:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r7)
                throw r1
            L_0x004d:
                java.lang.Class r11 = java.lang.Boolean.TYPE
                kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
                if (r11 == 0) goto L_0x0066
                boolean r3 = r4.mo18757c(r6)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            L_0x0063:
                r11 = r7
                goto L_0x00f3
            L_0x0066:
                java.lang.Class r11 = java.lang.Long.TYPE
                kotlin.reflect.d r11 = kotlin.jvm.internal.C11342l0.m43547d(r11)
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
                if (r11 == 0) goto L_0x0081
                r11 = r7
                r6 = 0
                long r3 = r4.mo18766i(r6)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
                goto L_0x00f3
            L_0x0081:
                r11 = r7
                java.lang.Class r6 = java.lang.Double.TYPE
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x009b
                r6 = 0
                double r3 = r4.mo18758d(r6)
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
                goto L_0x00f3
            L_0x009b:
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r17)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x00b1
                r6 = 0
                int r3 = r4.mo18762f(r6)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
                goto L_0x00f3
            L_0x00b1:
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r15)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x00ca
                com.urbanairship.json.a r3 = r4.mo18784z()
                if (r3 == 0) goto L_0x00c4
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
                goto L_0x00f3
            L_0x00c4:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x00ca:
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r8)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x00e1
                com.urbanairship.json.b r3 = r4.mo18749A()
                if (r3 == 0) goto L_0x00db
                goto L_0x00f3
            L_0x00db:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x00e1:
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r14)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x0219
                com.urbanairship.json.JsonValue r3 = r4.mo17264q()
                if (r3 == 0) goto L_0x0213
                com.urbanairship.json.b r3 = (com.urbanairship.json.C9323b) r3
            L_0x00f3:
                r2.<init>(r3)
                r0.f88125a = r2
                com.urbanairship.android.layout.info.d0$a r2 = new com.urbanairship.android.layout.info.d0$a
                java.lang.String r3 = "unselected"
                com.urbanairship.json.JsonValue r1 = r1.mo18812k(r3)
                if (r1 == 0) goto L_0x01f9
                r4 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r8)
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r10)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x0125
                java.lang.String r1 = r1.mo18750B()
                if (r1 == 0) goto L_0x011f
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
                goto L_0x01c9
            L_0x011f:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x0125:
                java.lang.Class r5 = java.lang.Boolean.TYPE
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x013e
                r5 = 0
                boolean r1 = r1.mo18757c(r5)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
                goto L_0x01c9
            L_0x013e:
                java.lang.Class r5 = java.lang.Long.TYPE
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x0158
                r5 = 0
                long r3 = r1.mo18766i(r5)
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
                goto L_0x01c9
            L_0x0158:
                java.lang.Class r5 = java.lang.Double.TYPE
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r5)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x0171
                r5 = 0
                double r3 = r1.mo18758d(r5)
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
                goto L_0x01c9
            L_0x0171:
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r17)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x0187
                r5 = 0
                int r1 = r1.mo18762f(r5)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
                goto L_0x01c9
            L_0x0187:
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r15)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x01a0
                com.urbanairship.json.a r1 = r1.mo18784z()
                if (r1 == 0) goto L_0x019a
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
                goto L_0x01c9
            L_0x019a:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x01a0:
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r8)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r5 == 0) goto L_0x01b7
                com.urbanairship.json.b r1 = r1.mo18749A()
                if (r1 == 0) goto L_0x01b1
                goto L_0x01c9
            L_0x01b1:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x01b7:
                kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r14)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r4 == 0) goto L_0x01d5
                com.urbanairship.json.JsonValue r1 = r1.mo17264q()
                if (r1 == 0) goto L_0x01cf
                com.urbanairship.json.b r1 = (com.urbanairship.json.C9323b) r1
            L_0x01c9:
                r2.<init>(r1)
                r0.f88126b = r2
                return
            L_0x01cf:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x01d5:
                com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                java.lang.String r4 = r8.getSimpleName()
                r2.append(r4)
                r2.append(r12)
                r2.append(r3)
                r4 = 39
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x01f9:
                r4 = 39
                com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0213:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r11)
                throw r1
            L_0x0219:
                com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                java.lang.String r4 = r8.getSimpleName()
                r2.append(r4)
                r2.append(r12)
                r2.append(r3)
                r4 = 39
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x023d:
                r4 = 39
                com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.info.C35652d0.C35654b.<init>(com.urbanairship.json.b):void");
        }

        @C12579k
        /* renamed from: a */
        public final C35653a mo106798a() {
            return this.f88125a;
        }

        @C12579k
        /* renamed from: b */
        public final C35653a mo106799b() {
            return this.f88126b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35652d0(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        C9323b bVar2;
        C35654b bVar3;
        Integer num;
        int i;
        Integer num2;
        C9323b bVar4 = bVar;
        Intrinsics.checkNotNullParameter(bVar4, "json");
        this.f88120b = C35691u0.m147171l(bVar);
        JsonValue k = bVar4.mo18812k("bindings");
        if (k != null) {
            Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
            Class<C9323b> cls = C9323b.class;
            C11494d d = C11342l0.m43547d(cls);
            Class<String> cls2 = String.class;
            Class<JsonValue> cls3 = JsonValue.class;
            Class<C9322a> cls4 = C9322a.class;
            Class<C9323b> cls5 = cls;
            Class<Integer> cls6 = Integer.class;
            if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls2))) {
                String B = k.mo18750B();
                if (B != null) {
                    bVar2 = (C9323b) B;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                bVar2 = (C9323b) Boolean.valueOf(k.mo18757c(false));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                bVar2 = (C9323b) Long.valueOf(k.mo18766i(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                bVar2 = (C9323b) Double.valueOf(k.mo18758d(0.0d));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls6))) {
                bVar2 = (C9323b) Integer.valueOf(k.mo18762f(0));
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls4))) {
                C9322a z = k.mo18784z();
                if (z != null) {
                    bVar2 = (C9323b) z;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls5))) {
                bVar2 = k.mo18749A();
                if (bVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls3))) {
                JsonValue q = k.mo17264q();
                if (q != null) {
                    bVar2 = (C9323b) q;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.urbanairship.json.JsonMap");
                }
            } else {
                throw new JsonException("Invalid type '" + cls5.getSimpleName() + "' for field '" + "bindings" + '\'');
            }
            bVar3 = new C35654b(bVar2);
            this.f88121c = bVar3;
            JsonValue k2 = bVar4.mo18812k("spacing");
            if (k2 == null) {
                num = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(k2, "get(key) ?: return null");
                C11494d d2 = C11342l0.m43547d(cls6);
                if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls2))) {
                    String B2 = k2.mo18750B();
                    if (B2 != null) {
                        num2 = (Integer) B2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    num2 = (Integer) Boolean.valueOf(k2.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Long.TYPE))) {
                    num2 = (Integer) Long.valueOf(k2.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(Double.TYPE))) {
                    num2 = (Integer) Double.valueOf(k2.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls6))) {
                    num2 = Integer.valueOf(k2.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls4))) {
                    C9322a z2 = k2.mo18784z();
                    if (z2 != null) {
                        num2 = (Integer) z2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls5))) {
                    C9323b A = k2.mo18749A();
                    if (A != null) {
                        num2 = (Integer) A;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else if (Intrinsics.areEqual((Object) d2, (Object) C11342l0.m43547d(cls3))) {
                    JsonValue q2 = k2.mo17264q();
                    if (q2 != null) {
                        num2 = (Integer) q2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls6.getSimpleName() + "' for field '" + "spacing" + '\'');
                }
                num = num2;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 4;
            }
            this.f88122d = i;
            return;
        }
        throw new JsonException("Missing required field: '" + "bindings" + '\'');
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88120b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88120b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88120b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88120b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88120b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88120b.mo106779i();
    }

    @C12579k
    /* renamed from: k */
    public final C35654b mo106794k() {
        return this.f88121c;
    }

    /* renamed from: l */
    public final int mo106795l() {
        return this.f88122d;
    }
}
