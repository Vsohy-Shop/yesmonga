package com.urbanairship.android.layout.property;

import com.urbanairship.json.JsonException;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class EventHandler {
    @C12579k

    /* renamed from: a */
    public final Type f88459a;
    @C12579k

    /* renamed from: b */
    public final List<StateAction> f88460b;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/urbanairship/android/layout/property/EventHandler$Type;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum Type {
        TAP("tap"),
        FORM_INPUT("form_input");
        
        @C12579k

        /* renamed from: a */
        public static final C35815a f88461a = null;
        @C12579k
        private final String value;

        /* renamed from: com.urbanairship.android.layout.property.EventHandler$Type$a */
        public static final class C35815a {
            public /* synthetic */ C35815a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final Type mo107270a(@C12579k String str) {
                Type type;
                Intrinsics.checkNotNullParameter(str, "value");
                Type[] values = Type.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        type = null;
                        break;
                    }
                    type = values[i];
                    if (Intrinsics.areEqual((Object) type.mo107269q(), (Object) str)) {
                        break;
                    }
                    i++;
                }
                if (type != null) {
                    return type;
                }
                throw new JsonException("Unknown EventHandler type: '" + str + '\'');
            }

            public C35815a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            f88461a = new C35815a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.value = str;
        }

        @C12579k
        /* renamed from: q */
        public final String mo107269q() {
            return this.value;
        }
    }

    public EventHandler(@C12579k Type type, @C12579k List<? extends StateAction> list) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(list, "actions");
        this.f88459a = type;
        this.f88460b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ EventHandler m147650d(EventHandler eventHandler, Type type, List<StateAction> list, int i, Object obj) {
        if ((i & 1) != 0) {
            type = eventHandler.f88459a;
        }
        if ((i & 2) != 0) {
            list = eventHandler.f88460b;
        }
        return eventHandler.mo107263c(type, list);
    }

    @C12579k
    /* renamed from: a */
    public final Type mo107261a() {
        return this.f88459a;
    }

    @C12579k
    /* renamed from: b */
    public final List<StateAction> mo107262b() {
        return this.f88460b;
    }

    @C12579k
    /* renamed from: c */
    public final EventHandler mo107263c(@C12579k Type type, @C12579k List<? extends StateAction> list) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(list, "actions");
        return new EventHandler(type, list);
    }

    @C12579k
    /* renamed from: e */
    public final List<StateAction> mo107264e() {
        return this.f88460b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventHandler)) {
            return false;
        }
        EventHandler eventHandler = (EventHandler) obj;
        return this.f88459a == eventHandler.f88459a && Intrinsics.areEqual((Object) this.f88460b, (Object) eventHandler.f88460b);
    }

    @C12579k
    /* renamed from: f */
    public final Type mo107266f() {
        return this.f88459a;
    }

    public int hashCode() {
        return (this.f88459a.hashCode() * 31) + this.f88460b.hashCode();
    }

    @C12579k
    public String toString() {
        return "EventHandler(type=" + this.f88459a + ", actions=" + this.f88460b + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EventHandler(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.urbanairship.android.layout.property.EventHandler$Type$a r1 = com.urbanairship.android.layout.property.EventHandler.Type.f88461a
            java.lang.String r2 = "type"
            com.urbanairship.json.JsonValue r3 = r0.mo18812k(r2)
            java.lang.String r4 = "Missing required field: '"
            if (r3 == 0) goto L_0x026a
            java.lang.String r6 = "get(key) ?: throw JsonEx… required field: '$key'\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            kotlin.reflect.d r8 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            java.lang.String r10 = "' for field '"
            java.lang.String r11 = "Invalid type '"
            java.lang.Class<com.urbanairship.json.JsonValue> r12 = com.urbanairship.json.JsonValue.class
            java.lang.Class<com.urbanairship.json.b> r13 = com.urbanairship.json.C9323b.class
            java.lang.Class<java.lang.Integer> r16 = java.lang.Integer.class
            r17 = r6
            r5 = 0
            java.lang.Class<com.urbanairship.json.a> r18 = com.urbanairship.json.C9322a.class
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.String"
            r15 = 0
            if (r9 == 0) goto L_0x0049
            java.lang.String r2 = r3.mo18750B()
            if (r2 == 0) goto L_0x0043
            goto L_0x00eb
        L_0x0043:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x0049:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0061
            boolean r2 = r3.mo18757c(r15)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00eb
        L_0x0061:
            java.lang.Class r9 = java.lang.Long.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0079
            long r2 = r3.mo18766i(r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00eb
        L_0x0079:
            java.lang.Class r9 = java.lang.Double.TYPE
            kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0092
            r5 = 0
            double r2 = r3.mo18758d(r5)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00eb
        L_0x0092:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00a7
            int r2 = r3.mo18762f(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00eb
        L_0x00a7:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r18)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00c0
            com.urbanairship.json.a r2 = r3.mo18784z()
            if (r2 == 0) goto L_0x00ba
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00eb
        L_0x00ba:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x00c0:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00d9
            com.urbanairship.json.b r2 = r3.mo18749A()
            if (r2 == 0) goto L_0x00d3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00eb
        L_0x00d3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x00d9:
            kotlin.reflect.d r5 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0244
            com.urbanairship.json.JsonValue r2 = r3.mo17264q()
            if (r2 == 0) goto L_0x023c
            java.lang.String r2 = (java.lang.String) r2
        L_0x00eb:
            com.urbanairship.android.layout.property.EventHandler$Type r1 = r1.mo107270a(r2)
            java.lang.String r2 = "state_actions"
            com.urbanairship.json.JsonValue r0 = r0.mo18812k(r2)
            if (r0 == 0) goto L_0x0220
            r3 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            kotlin.reflect.d r3 = kotlin.jvm.internal.C11342l0.m43547d(r18)
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            java.lang.String r5 = "null cannot be cast to non-null type com.urbanairship.json.JsonList"
            if (r4 == 0) goto L_0x011c
            java.lang.String r0 = r0.mo18750B()
            if (r0 == 0) goto L_0x0116
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
            goto L_0x01be
        L_0x0116:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x011c:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0134
            boolean r0 = r0.mo18757c(r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
            goto L_0x01be
        L_0x0134:
            java.lang.Class r4 = java.lang.Long.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x014e
            r6 = 0
            long r2 = r0.mo18766i(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
            goto L_0x01be
        L_0x014e:
            java.lang.Class r4 = java.lang.Double.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0167
            r6 = 0
            double r2 = r0.mo18758d(r6)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
            goto L_0x01be
        L_0x0167:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r16)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x017c
            int r0 = r0.mo18762f(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
            goto L_0x01be
        L_0x017c:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r18)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0193
            com.urbanairship.json.a r0 = r0.mo18784z()
            if (r0 == 0) goto L_0x018d
            goto L_0x01be
        L_0x018d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0193:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r13)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x01ac
            com.urbanairship.json.b r0 = r0.mo18749A()
            if (r0 == 0) goto L_0x01a6
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
            goto L_0x01be
        L_0x01a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x01ac:
            kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r12)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x01fa
            com.urbanairship.json.JsonValue r0 = r0.mo17264q()
            if (r0 == 0) goto L_0x01f2
            com.urbanairship.json.a r0 = (com.urbanairship.json.C9322a) r0
        L_0x01be:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x01cd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01ec
            java.lang.Object r3 = r0.next()
            com.urbanairship.json.JsonValue r3 = (com.urbanairship.json.JsonValue) r3
            com.urbanairship.android.layout.property.StateAction$b r4 = com.urbanairship.android.layout.property.StateAction.f88519b
            com.urbanairship.json.b r3 = r3.mo18749A()
            java.lang.String r5 = "it.optMap()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            com.urbanairship.android.layout.property.StateAction r3 = r4.mo107303a(r3)
            r2.add(r3)
            goto L_0x01cd
        L_0x01ec:
            r3 = r19
            r3.<init>(r1, r2)
            return
        L_0x01f2:
            r3 = r19
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x01fa:
            r3 = r19
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r4 = r18.getSimpleName()
            r1.append(r4)
            r1.append(r10)
            r1.append(r2)
            r5 = 39
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0220:
            r3 = r19
            r5 = 39
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x023c:
            r3 = r19
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r14)
            throw r0
        L_0x0244:
            r3 = r19
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r4 = r7.getSimpleName()
            r1.append(r4)
            r1.append(r10)
            r1.append(r2)
            r5 = 39
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r3 = r19
            r5 = 39
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.property.EventHandler.<init>(com.urbanairship.json.b):void");
    }
}
