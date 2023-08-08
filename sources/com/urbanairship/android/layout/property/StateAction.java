package com.urbanairship.android.layout.property;

import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class StateAction {
    @C12579k

    /* renamed from: b */
    public static final C35824b f88519b = new C35824b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final Type f88520a;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/urbanairship/android/layout/property/StateAction$Type;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum Type {
        CLEAR_STATE("clear"),
        SET_STATE("set"),
        SET_FORM_VALUE_STATE("set_form_value");
        
        @C12579k

        /* renamed from: a */
        public static final C35822a f88521a = null;
        @C12579k
        private final String value;

        /* renamed from: com.urbanairship.android.layout.property.StateAction$Type$a */
        public static final class C35822a {
            public /* synthetic */ C35822a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final Type mo107302a(@C12579k String str) {
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
                    if (Intrinsics.areEqual((Object) type.mo107301q(), (Object) str)) {
                        break;
                    }
                    i++;
                }
                if (type != null) {
                    return type;
                }
                throw new JsonException("Unknown StateAction type: '" + str + '\'');
            }

            public C35822a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            f88521a = new C35822a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.value = str;
        }

        @C12579k
        /* renamed from: q */
        public final String mo107301q() {
            return this.value;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.StateAction$a */
    public static final class C35823a extends StateAction {
        @C12579k

        /* renamed from: c */
        public static final C35823a f88526c = new C35823a();

        public C35823a() {
            super(Type.CLEAR_STATE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.StateAction$b */
    public static final class C35824b {

        /* renamed from: com.urbanairship.android.layout.property.StateAction$b$a */
        public /* synthetic */ class C35825a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                iArr[Type.CLEAR_STATE.ordinal()] = 1;
                iArr[Type.SET_STATE.ordinal()] = 2;
                iArr[Type.SET_FORM_VALUE_STATE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C35824b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:140:0x033d  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
        @org.jetbrains.annotations.C12579k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.urbanairship.android.layout.property.StateAction mo107303a(@org.jetbrains.annotations.C12579k com.urbanairship.json.C9323b r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "json"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                com.urbanairship.android.layout.property.StateAction$Type$a r1 = com.urbanairship.android.layout.property.StateAction.Type.f88521a
                java.lang.String r2 = "type"
                com.urbanairship.json.JsonValue r3 = r0.mo18812k(r2)
                java.lang.String r4 = "Missing required field: '"
                if (r3 == 0) goto L_0x036a
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
                java.lang.Class<com.urbanairship.json.a> r14 = com.urbanairship.json.C9322a.class
                r16 = r6
                java.lang.Class<java.lang.Integer> r17 = java.lang.Integer.class
                r15 = 0
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                if (r9 == 0) goto L_0x0048
                java.lang.String r2 = r3.mo18750B()
                if (r2 == 0) goto L_0x0042
            L_0x003f:
                r6 = r10
                goto L_0x00ed
            L_0x0042:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x0048:
                java.lang.Class r6 = java.lang.Boolean.TYPE
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x005f
                boolean r2 = r3.mo18757c(r15)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x003f
            L_0x005f:
                java.lang.Class r6 = java.lang.Long.TYPE
                kotlin.reflect.d r6 = kotlin.jvm.internal.C11342l0.m43547d(r6)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r6)
                if (r6 == 0) goto L_0x007a
                r6 = r10
                r9 = 0
                long r2 = r3.mo18766i(r9)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ed
            L_0x007a:
                r6 = r10
                java.lang.Class r9 = java.lang.Double.TYPE
                kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r9)
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
                if (r9 == 0) goto L_0x0094
                r9 = 0
                double r2 = r3.mo18758d(r9)
                java.lang.Double r2 = java.lang.Double.valueOf(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ed
            L_0x0094:
                kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r17)
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
                if (r9 == 0) goto L_0x00a9
                int r2 = r3.mo18762f(r15)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ed
            L_0x00a9:
                kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r14)
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
                if (r9 == 0) goto L_0x00c2
                com.urbanairship.json.a r2 = r3.mo18784z()
                if (r2 == 0) goto L_0x00bc
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ed
            L_0x00bc:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x00c2:
                kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r13)
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
                if (r9 == 0) goto L_0x00db
                com.urbanairship.json.b r2 = r3.mo18749A()
                if (r2 == 0) goto L_0x00d5
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ed
            L_0x00d5:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x00db:
                kotlin.reflect.d r9 = kotlin.jvm.internal.C11342l0.m43547d(r12)
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
                if (r8 == 0) goto L_0x0346
                com.urbanairship.json.JsonValue r2 = r3.mo17264q()
                if (r2 == 0) goto L_0x0340
                java.lang.String r2 = (java.lang.String) r2
            L_0x00ed:
                com.urbanairship.android.layout.property.StateAction$Type r1 = r1.mo107302a(r2)
                int[] r2 = com.urbanairship.android.layout.property.StateAction.C35824b.C35825a.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 1
                if (r1 == r2) goto L_0x033d
                r2 = 2
                java.lang.String r3 = "key"
                if (r1 == r2) goto L_0x0220
                r2 = 3
                if (r1 != r2) goto L_0x021a
                com.urbanairship.android.layout.property.StateAction$c r1 = new com.urbanairship.android.layout.property.StateAction$c
                com.urbanairship.json.JsonValue r0 = r0.mo18812k(r3)
                if (r0 == 0) goto L_0x0200
                r2 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r7)
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r7)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x012d
                java.lang.String r0 = r0.mo18750B()
                if (r0 == 0) goto L_0x0127
                goto L_0x01d1
            L_0x0127:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x012d:
                java.lang.Class r4 = java.lang.Boolean.TYPE
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x0145
                boolean r0 = r0.mo18757c(r15)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x01d1
            L_0x0145:
                java.lang.Class r4 = java.lang.Long.TYPE
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x015f
                r8 = 0
                long r2 = r0.mo18766i(r8)
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x01d1
            L_0x015f:
                java.lang.Class r4 = java.lang.Double.TYPE
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x0178
                r8 = 0
                double r2 = r0.mo18758d(r8)
                java.lang.Double r0 = java.lang.Double.valueOf(r2)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x01d1
            L_0x0178:
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r17)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x018d
                int r0 = r0.mo18762f(r15)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x01d1
            L_0x018d:
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r14)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x01a6
                com.urbanairship.json.a r0 = r0.mo18784z()
                if (r0 == 0) goto L_0x01a0
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x01d1
            L_0x01a0:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x01a6:
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r13)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x01bf
                com.urbanairship.json.b r0 = r0.mo18749A()
                if (r0 == 0) goto L_0x01b9
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x01d1
            L_0x01b9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x01bf:
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r12)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r2 == 0) goto L_0x01dc
                com.urbanairship.json.JsonValue r0 = r0.mo17264q()
                if (r0 == 0) goto L_0x01d6
                java.lang.String r0 = (java.lang.String) r0
            L_0x01d1:
                r1.<init>(r0)
                goto L_0x033f
            L_0x01d6:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x01dc:
                com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                java.lang.String r2 = r7.getSimpleName()
                r1.append(r2)
                r1.append(r6)
                r1.append(r3)
                r2 = 39
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0200:
                r2 = 39
                com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x021a:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L_0x0220:
                r2 = r16
                com.urbanairship.android.layout.property.StateAction$d r8 = new com.urbanairship.android.layout.property.StateAction$d
                com.urbanairship.json.JsonValue r9 = r0.mo18812k(r3)
                if (r9 == 0) goto L_0x0323
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
                kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r7)
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r7)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x0249
                java.lang.String r1 = r9.mo18750B()
                if (r1 == 0) goto L_0x0243
                goto L_0x02ee
            L_0x0243:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x0249:
                java.lang.Class r4 = java.lang.Boolean.TYPE
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x0261
                boolean r1 = r9.mo18757c(r15)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x02ee
            L_0x0261:
                java.lang.Class r4 = java.lang.Long.TYPE
                kotlin.reflect.d r4 = kotlin.jvm.internal.C11342l0.m43547d(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x027b
                r1 = 0
                long r1 = r9.mo18766i(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x02ee
            L_0x027b:
                r4 = r2
                java.lang.Class r1 = java.lang.Double.TYPE
                kotlin.reflect.d r1 = kotlin.jvm.internal.C11342l0.m43547d(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x0295
                r1 = 0
                double r1 = r9.mo18758d(r1)
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x02ee
            L_0x0295:
                kotlin.reflect.d r1 = kotlin.jvm.internal.C11342l0.m43547d(r17)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x02aa
                int r1 = r9.mo18762f(r15)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x02ee
            L_0x02aa:
                kotlin.reflect.d r1 = kotlin.jvm.internal.C11342l0.m43547d(r14)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x02c3
                com.urbanairship.json.a r1 = r9.mo18784z()
                if (r1 == 0) goto L_0x02bd
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x02ee
            L_0x02bd:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x02c3:
                kotlin.reflect.d r1 = kotlin.jvm.internal.C11342l0.m43547d(r13)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x02dc
                com.urbanairship.json.b r1 = r9.mo18749A()
                if (r1 == 0) goto L_0x02d6
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x02ee
            L_0x02d6:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x02dc:
                kotlin.reflect.d r1 = kotlin.jvm.internal.C11342l0.m43547d(r12)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
                if (r1 == 0) goto L_0x02ff
                com.urbanairship.json.JsonValue r1 = r9.mo17264q()
                if (r1 == 0) goto L_0x02f9
                java.lang.String r1 = (java.lang.String) r1
            L_0x02ee:
                java.lang.String r2 = "value"
                com.urbanairship.json.JsonValue r0 = r0.mo18812k(r2)
                r8.<init>(r1, r0)
                r1 = r8
                goto L_0x033f
            L_0x02f9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x02ff:
                com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                java.lang.String r2 = r7.getSimpleName()
                r1.append(r2)
                r1.append(r6)
                r1.append(r3)
                r2 = 39
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0323:
                r2 = 39
                com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x033d:
                com.urbanairship.android.layout.property.StateAction$a r1 = com.urbanairship.android.layout.property.StateAction.C35823a.f88526c
            L_0x033f:
                return r1
            L_0x0340:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r5)
                throw r0
            L_0x0346:
                com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                java.lang.String r3 = r7.getSimpleName()
                r1.append(r3)
                r1.append(r6)
                r1.append(r2)
                r3 = 39
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x036a:
                r3 = 39
                com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.property.StateAction.C35824b.mo107303a(com.urbanairship.json.b):com.urbanairship.android.layout.property.StateAction");
        }

        public C35824b() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.StateAction$c */
    public static final class C35826c extends StateAction {
        @C12579k

        /* renamed from: c */
        public final String f88527c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35826c(@C12579k String str) {
            super(Type.SET_FORM_VALUE_STATE, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "key");
            this.f88527c = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C35826c m147706d(C35826c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f88527c;
            }
            return cVar.mo107305c(str);
        }

        @C12579k
        /* renamed from: b */
        public final String mo107304b() {
            return this.f88527c;
        }

        @C12579k
        /* renamed from: c */
        public final C35826c mo107305c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            return new C35826c(str);
        }

        @C12579k
        /* renamed from: e */
        public final String mo107306e() {
            return this.f88527c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35826c) && Intrinsics.areEqual((Object) this.f88527c, (Object) ((C35826c) obj).f88527c);
        }

        public int hashCode() {
            return this.f88527c.hashCode();
        }

        @C12579k
        public String toString() {
            return "SetFormValue(key=" + this.f88527c + ')';
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.StateAction$d */
    public static final class C35827d extends StateAction {
        @C12579k

        /* renamed from: c */
        public final String f88528c;
        @C12580l

        /* renamed from: d */
        public final JsonValue f88529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35827d(@C12579k String str, @C12580l JsonValue jsonValue) {
            super(Type.SET_STATE, (DefaultConstructorMarker) null);
            boolean z;
            Intrinsics.checkNotNullParameter(str, "key");
            this.f88528c = str;
            this.f88529d = jsonValue;
            boolean z2 = true;
            if (jsonValue == null || !jsonValue.mo18776t()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (!((jsonValue == null || !jsonValue.mo18778u()) ? false : z2)) {
                    return;
                }
            }
            throw new JsonException("State value must be a String, Number, or Boolean!");
        }

        /* renamed from: e */
        public static /* synthetic */ C35827d m147710e(C35827d dVar, String str, JsonValue jsonValue, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f88528c;
            }
            if ((i & 2) != 0) {
                jsonValue = dVar.f88529d;
            }
            return dVar.mo107312d(str, jsonValue);
        }

        @C12579k
        /* renamed from: b */
        public final String mo107310b() {
            return this.f88528c;
        }

        @C12580l
        /* renamed from: c */
        public final JsonValue mo107311c() {
            return this.f88529d;
        }

        @C12579k
        /* renamed from: d */
        public final C35827d mo107312d(@C12579k String str, @C12580l JsonValue jsonValue) {
            Intrinsics.checkNotNullParameter(str, "key");
            return new C35827d(str, jsonValue);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35827d)) {
                return false;
            }
            C35827d dVar = (C35827d) obj;
            return Intrinsics.areEqual((Object) this.f88528c, (Object) dVar.f88528c) && Intrinsics.areEqual((Object) this.f88529d, (Object) dVar.f88529d);
        }

        @C12579k
        /* renamed from: f */
        public final String mo107314f() {
            return this.f88528c;
        }

        @C12580l
        /* renamed from: g */
        public final JsonValue mo107315g() {
            return this.f88529d;
        }

        public int hashCode() {
            int hashCode = this.f88528c.hashCode() * 31;
            JsonValue jsonValue = this.f88529d;
            return hashCode + (jsonValue == null ? 0 : jsonValue.hashCode());
        }

        @C12579k
        public String toString() {
            return "SetState(key=" + this.f88528c + ", value=" + this.f88529d + ')';
        }
    }

    public /* synthetic */ StateAction(Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    @C12579k
    /* renamed from: a */
    public final Type mo107300a() {
        return this.f88520a;
    }

    public StateAction(Type type) {
        this.f88520a = type;
    }
}
