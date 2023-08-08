package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.info.t0 */
public abstract class C35686t0 implements C35682r0 {
    @C12579k

    /* renamed from: a */
    public static final C35687a f88201a = new C35687a((DefaultConstructorMarker) null);

    /* renamed from: com.urbanairship.android.layout.info.t0$a */
    public static final class C35687a {

        /* renamed from: com.urbanairship.android.layout.info.t0$a$a */
        public /* synthetic */ class C35688a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ViewType.values().length];
                iArr[ViewType.CONTAINER.ordinal()] = 1;
                iArr[ViewType.LINEAR_LAYOUT.ordinal()] = 2;
                iArr[ViewType.SCROLL_LAYOUT.ordinal()] = 3;
                iArr[ViewType.EMPTY_VIEW.ordinal()] = 4;
                iArr[ViewType.WEB_VIEW.ordinal()] = 5;
                iArr[ViewType.MEDIA.ordinal()] = 6;
                iArr[ViewType.LABEL.ordinal()] = 7;
                iArr[ViewType.LABEL_BUTTON.ordinal()] = 8;
                iArr[ViewType.IMAGE_BUTTON.ordinal()] = 9;
                iArr[ViewType.PAGER_CONTROLLER.ordinal()] = 10;
                iArr[ViewType.PAGER.ordinal()] = 11;
                iArr[ViewType.PAGER_INDICATOR.ordinal()] = 12;
                iArr[ViewType.FORM_CONTROLLER.ordinal()] = 13;
                iArr[ViewType.NPS_FORM_CONTROLLER.ordinal()] = 14;
                iArr[ViewType.CHECKBOX_CONTROLLER.ordinal()] = 15;
                iArr[ViewType.CHECKBOX.ordinal()] = 16;
                iArr[ViewType.TOGGLE.ordinal()] = 17;
                iArr[ViewType.RADIO_INPUT_CONTROLLER.ordinal()] = 18;
                iArr[ViewType.RADIO_INPUT.ordinal()] = 19;
                iArr[ViewType.TEXT_INPUT.ordinal()] = 20;
                iArr[ViewType.SCORE.ordinal()] = 21;
                iArr[ViewType.STATE_CONTROLLER.ordinal()] = 22;
                iArr[ViewType.UNKNOWN.ordinal()] = 23;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C35687a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C35686t0 mo106835a(@C12579k C9323b bVar) {
            String str;
            Intrinsics.checkNotNullParameter(bVar, "json");
            JsonValue k = bVar.mo18812k("type");
            if (k != null) {
                Intrinsics.checkNotNullExpressionValue(k, "get(key) ?: throw JsonEx… required field: '$key'\")");
                Class<String> cls = String.class;
                C11494d d = C11342l0.m43547d(cls);
                if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(cls))) {
                    str = k.mo18750B();
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Boolean.TYPE))) {
                    str = (String) Boolean.valueOf(k.mo18757c(false));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Long.TYPE))) {
                    str = (String) Long.valueOf(k.mo18766i(0));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Double.TYPE))) {
                    str = (String) Double.valueOf(k.mo18758d(0.0d));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(Integer.class))) {
                    str = (String) Integer.valueOf(k.mo18762f(0));
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9322a.class))) {
                    C9322a z = k.mo18784z();
                    if (z != null) {
                        str = (String) z;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(C9323b.class))) {
                    C9323b A = k.mo18749A();
                    if (A != null) {
                        str = (String) A;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (Intrinsics.areEqual((Object) d, (Object) C11342l0.m43547d(JsonValue.class))) {
                    JsonValue q = k.mo17264q();
                    if (q != null) {
                        str = (String) q;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new JsonException("Invalid type '" + cls.getSimpleName() + "' for field '" + "type" + '\'');
                }
                ViewType g = ViewType.m147723g(str);
                Intrinsics.checkNotNullExpressionValue(g, "from(json.requireField<String>(\"type\"))");
                switch (C35688a.$EnumSwitchMapping$0[g.ordinal()]) {
                    case 1:
                        return new C35665j(bVar);
                    case 2:
                        return new C35697y(bVar);
                    case 3:
                        return new C35670l0(bVar);
                    case 4:
                        return new C35673n(bVar);
                    case 5:
                        return new C35695w0(bVar);
                    case 6:
                        return new C35646a0(bVar);
                    case 7:
                        return new C35694w(bVar);
                    case 8:
                        return new C35692v(bVar);
                    case 9:
                        return new C35685t(bVar);
                    case 10:
                        return new C35650c0(bVar);
                    case 11:
                        return new C35656e0(bVar);
                    case 12:
                        return new C35652d0(bVar);
                    case 13:
                        return new C35677p(bVar);
                    case 14:
                        return new C35648b0(bVar);
                    case 15:
                        return new C35661h(bVar);
                    case 16:
                        return new C35663i(bVar);
                    case 17:
                        return new C35676o0(bVar);
                    case 18:
                        return new C35660g0(bVar);
                    case 19:
                        return new C35662h0(bVar);
                    case 20:
                        return new C35674n0(bVar);
                    case 21:
                        return new C35668k0(bVar);
                    case 22:
                        return new C35672m0(bVar);
                    case 23:
                        throw new JsonException("Unknown view type! '" + g + '\'');
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new JsonException("Missing required field: '" + "type" + '\'');
            }
        }

        public C35687a() {
        }
    }

    public /* synthetic */ C35686t0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    @C11384m
    /* renamed from: j */
    public static final C35686t0 m147156j(@C12579k C9323b bVar) {
        return f88201a.mo106835a(bVar);
    }

    public C35686t0() {
    }
}
