package androidx.datastore.preferences.core;

import androidx.datastore.core.C18577i;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.C18599b;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.datastore.preferences.core.d */
public final class C18607d implements C18577i<C18602a> {
    @C12579k

    /* renamed from: a */
    public static final C18607d f47465a = new C18607d();
    @C12579k

    /* renamed from: b */
    public static final String f47466b = "preferences_pb";

    /* renamed from: androidx.datastore.preferences.core.d$a */
    public /* synthetic */ class C18608a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C12580l
    /* renamed from: b */
    public Object mo31157b(@C12579k InputStream inputStream, @C12579k C11045c<? super C18602a> cVar) throws IOException, CorruptionException {
        PreferencesProto.C18590b a = C18599b.f47456a.mo53691a(inputStream);
        MutablePreferences c = C18605b.m84358c(new C18602a.C18604b[0]);
        Map<String, PreferencesProto.Value> P = a.mo53664P();
        Intrinsics.checkNotNullExpressionValue(P, "preferencesProto.preferencesMap");
        for (Map.Entry next : P.entrySet()) {
            String str = (String) next.getKey();
            PreferencesProto.Value value = (PreferencesProto.Value) next.getValue();
            C18607d dVar = f47465a;
            Intrinsics.checkNotNullExpressionValue(str, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            dVar.mo53726c(str, value, c);
        }
        return c.mo53718e();
    }

    /* renamed from: c */
    public final void mo53726c(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) {
        int i;
        PreferencesProto.Value.ValueCase i2 = value.mo53628i();
        if (i2 == null) {
            i = -1;
        } else {
            i = C18608a.$EnumSwitchMapping$0[i2.ordinal()];
        }
        switch (i) {
            case -1:
                throw new CorruptionException("Value case is null.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            case 1:
                mutablePreferences.mo53706o(C18606c.m84359a(str), Boolean.valueOf(value.mo53613F()));
                return;
            case 2:
                mutablePreferences.mo53706o(C18606c.m84361c(str), Float.valueOf(value.mo53629k()));
                return;
            case 3:
                mutablePreferences.mo53706o(C18606c.m84360b(str), Double.valueOf(value.mo53635u()));
                return;
            case 4:
                mutablePreferences.mo53706o(C18606c.m84362d(str), Integer.valueOf(value.mo53633s()));
                return;
            case 5:
                mutablePreferences.mo53706o(C18606c.m84363e(str), Long.valueOf(value.mo53611D()));
                return;
            case 6:
                C18602a.C18603a<String> f = C18606c.m84364f(str);
                String x = value.mo53638x();
                Intrinsics.checkNotNullExpressionValue(x, "value.string");
                mutablePreferences.mo53706o(f, x);
                return;
            case 7:
                C18602a.C18603a<Set<String>> g = C18606c.m84365g(str);
                List<String> L = value.mo53634t().mo53678L();
                Intrinsics.checkNotNullExpressionValue(L, "value.stringSet.stringsList");
                mutablePreferences.mo53706o(g, CollectionsKt___CollectionsKt.m40582V5(L));
                return;
            case 8:
                throw new CorruptionException("Value not set.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: d */
    public C18602a getDefaultValue() {
        return C18605b.m84357b();
    }

    @C12579k
    /* renamed from: e */
    public final String mo53728e() {
        return f47466b;
    }

    /* renamed from: f */
    public final PreferencesProto.Value mo53729f(Object obj) {
        if (obj instanceof Boolean) {
            GeneratedMessageLite o0 = PreferencesProto.Value.m84099F1().mo53652P0(((Boolean) obj).booleanValue()).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o0, "newBuilder().setBoolean(value).build()");
            return (PreferencesProto.Value) o0;
        } else if (obj instanceof Float) {
            GeneratedMessageLite o02 = PreferencesProto.Value.m84099F1().mo53654R0(((Number) obj).floatValue()).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o02, "newBuilder().setFloat(value).build()");
            return (PreferencesProto.Value) o02;
        } else if (obj instanceof Double) {
            GeneratedMessageLite o03 = PreferencesProto.Value.m84099F1().mo53653Q0(((Number) obj).doubleValue()).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o03, "newBuilder().setDouble(value).build()");
            return (PreferencesProto.Value) o03;
        } else if (obj instanceof Integer) {
            GeneratedMessageLite o04 = PreferencesProto.Value.m84099F1().mo53655S0(((Number) obj).intValue()).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o04, "newBuilder().setInteger(value).build()");
            return (PreferencesProto.Value) o04;
        } else if (obj instanceof Long) {
            GeneratedMessageLite o05 = PreferencesProto.Value.m84099F1().mo53656T0(((Number) obj).longValue()).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o05, "newBuilder().setLong(value).build()");
            return (PreferencesProto.Value) o05;
        } else if (obj instanceof String) {
            GeneratedMessageLite o06 = PreferencesProto.Value.m84099F1().mo53657U0((String) obj).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o06, "newBuilder().setString(value).build()");
            return (PreferencesProto.Value) o06;
        } else if (obj instanceof Set) {
            GeneratedMessageLite o07 = PreferencesProto.Value.m84099F1().mo53659W0(PreferencesProto.C18594d.m84258o1().mo53684E0((Set) obj)).mo54018g();
            Intrinsics.checkNotNullExpressionValue(o07, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (PreferencesProto.Value) o07;
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    @C12580l
    /* renamed from: g */
    public Object mo31156a(@C12579k C18602a aVar, @C12579k OutputStream outputStream, @C12579k C11045c<? super C11079d2> cVar) throws IOException, CorruptionException {
        Map<C18602a.C18603a<?>, Object> a = aVar.mo53692a();
        PreferencesProto.C18590b.C18591a i1 = PreferencesProto.C18590b.m84207i1();
        for (Map.Entry next : a.entrySet()) {
            i1.mo53672G0(((C18602a.C18603a) next.getKey()).mo53719a(), mo53729f(next.getValue()));
        }
        ((PreferencesProto.C18590b) i1.mo54018g()).writeTo(outputStream);
        return C11079d2.f28267a;
    }
}
